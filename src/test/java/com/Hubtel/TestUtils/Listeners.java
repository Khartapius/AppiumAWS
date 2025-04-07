package com.Hubtel.TestUtils;

import com.Hubtel.utils.AppiumUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import java.util.Arrays;
import java.util.Objects;


public class Listeners extends AppiumUtils implements ITestListener {


    static ExtentTest test;
    ExtentReports extent = ExtentReporter.getReporterObject();
    AppiumDriver driver;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());


        ITestListener.super.onTestStart(result);

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {

        // TODO Auto-generated method stub
        //test.fail(result.getMethod().getMethodName());
        test.fail(result.getThrowable().toString());


        try {
            driver = (AppiumDriver) result.getTestClass().getRealClass().getField("driver")
                    .get(result.getInstance());


        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            //visit Appium utils for further setup

            //to add fail image into the repo use this one
            test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName());

            //to capture fail image in base64 use this
            //test.addScreenCaptureFromBase64String(getScreenshotPath(result.getMethod().getMethodName(), driver), result.getMethod().getMethodName() + " fail image");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onFinish(ITestContext context) {
        if (Objects.nonNull(extent)) {
            extent.flush();
        }
        try {
            Desktop.getDesktop().browse(new File("reports/index.html").toURI());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ITestListener.super.onFinish(context);

    }

    public static void logTestStep(String stepDescription) {
        if (test != null) {
            test.log(Status.PASS, stepDescription);
        }

    }

    public static void logTestStepFail(String stepDescription) {
        if (test != null) {
            test.log(Status.FAIL, stepDescription);
        }

    }


    public static void executeStep(Runnable step, String successMessage) {
        try {
            step.run();
            Listeners.logTestStep(successMessage);
        } catch (Exception e2) {
            test.fail(successMessage);
            throw e2;
        }
    }


    public static void logTestStart(String stepDescription) {
        if (test != null) {
            test.log(Status.INFO, stepDescription);
        }

    }

}
