package com.Hubtel.ADB;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class InternetDataAndroid extends AndroidBaseTest {


    @Test

    public void Internet_Data() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();

        Listeners.logTestStart("🔎AT Internet Data Test");

                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo\")")).click(),
                "👆Tap on AirtelTigo card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo Services\")")).isDisplayed(),
                "🧪Heading 'AirtelTigo Services' should be visible on AirtelTigo Services");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Data\")")).click(),
                "👆Tap on Data card on AirtelTigo Services Screen");

        Listeners.executeStep(() -> internetData.setEnterATNumber(),
                "📜Entering AT number");

        Listeners.executeStep(() -> internetData.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> internetData.setATHeading(),
                "🧪AT Data heading should be visible");

        Listeners.executeStep(() -> internetData.setEditButton(),
                "🧪Edit button should be enabled");

        Listeners.executeStep(() -> internetData.setEditButtonClick(),
                "👆Tap on Edit button");


        Listeners.executeStep(() -> internetData.setEnterATNumber(),
                "📜Entering AT number 233270760250");


        Listeners.executeStep(() -> internetData.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> internetData.setATHeading(),
                "🧪AT Data heading should be visible");

        Listeners.executeStep(() -> internetData.setDataPlanClick(),
                "📜Selecting 45mb(GHS 1) AT Internet data plan");

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"View details\").instance(1)")).click(),
//                "👆Tap on view details button on checkout screen");
//
//        Listeners.executeStep(() -> internetData.setATDataAmountCharge(),
//                "🧪Should check for sender's name and the amount charged for the data plan");



        //Checking for checkout feature

        UnifiedCheckout.checkout();
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on purchases screen");
        //MTN Internet Data
        Listeners.logTestStart("🔎MTN Internet Data Test");


        Listeners.executeStep(() -> internetData.setInternetDataClick(),
                "👆Tap on MTN card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Data\")")).click(),
                "👆Tap on Data card on MTN Services Screen");

        Listeners.executeStep(() -> internetData.setEnterMTNNumber(),
                "📜Entering MTN number to purchase Internet Data(0542410123) ");

        Listeners.executeStep(() -> internetData.setMTNNextButtonClick(),
                "👆Tap on Next button");

        Listeners.executeStep(() -> internetData.setMTNHeading(),
                "🧪Check for the presence of the heading MTN Data");

        Listeners.executeStep(() -> internetData.setMTNdataPlanClick(),
                "👆Select MTN 17.79mb(GHs 0.5) data plan ");

        //checking checkout feature
        UnifiedCheckout.checkout();

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on purchases screen");

        //Telecel Internet Data
        Listeners.logTestStart("🔎Telecel Internet Data Test");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel\")")).click(),
                "👆Tap on Telecel card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Data\")")).click(),
                "👆Tap on Data card on telecel Services Screen");

        Listeners.executeStep(() -> internetData.setEnterTelecelNumber(),
                "📜Entering Telecel number to purchase Internet Data(0200045664) ");

        Listeners.executeStep(() -> internetData.setTelecelNextButtonClick(),
                "👆Tap on Next button");

        Listeners.executeStep(() -> internetData.setTelecelHeading(),
                "🧪Check for the presence of the heading Telecel Data");

        Listeners.executeStep(() -> internetData.setTeleceldataPlanClick(),
                "👆Select Telecel 20mb(GHs 0.5) data plan ");

        //checking checkout feature
        UnifiedCheckout.checkout();

    }


}
