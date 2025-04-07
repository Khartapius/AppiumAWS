package com.Hubtel.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;

import static io.appium.java_client.AppiumBy.accessibilityId;

public class AppiumUtils {

    AppiumDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public AppiumDriverLocalService service;


    public AppiumDriverLocalService startAppiumServer(String ipaddress, int port) {

        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js")).withIPAddress(ipaddress)
                .usingPort(port).build();
        service.start();

        return service;
    }

    //the ele = locator of the element,description = desc cont, Element_to_appear is the name of the element we're waiting for
    public void waitForElementToAppear(WebElement ele, String Element_to_appear) {

        wait.until(ExpectedConditions.attributeContains((ele), "description", Element_to_appear));

    }

    //wait till element is clickable
    public void waitForElementToBeClickable(String accessbilityIdName, AppiumDriver driver) {
        wait.until(ExpectedConditions.elementToBeClickable(accessibilityId(accessbilityIdName))).click();

    }

    //visit listeners for further setup

    //this will add image in the report
    public String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException {
        File source = driver.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
        //1. capture and place in folder //2. extent report pick file and attach to report
    }


    //to capture image in Baase64 use this


//    public String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException {
//        return driver.getScreenshotAs(OutputType.BASE64);
//    }

}
