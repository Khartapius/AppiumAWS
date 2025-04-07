package com.Hubtel.ADB;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class AirtimeAndroid extends AndroidBaseTest {

    @Test
    public void Airtime() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();


        //AT SCREEN
        Listeners.logTestStart("🔎AT Airtime Test");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo\")")).click(),
                    "👆Tap on AirtelTigo card on hubtel home screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo Services\")")).isDisplayed(),
                    "🧪Heading 'AirtelTigo Services' should be visible on AirtelTigo Services screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Airtime\")")).click(),
                    "👆Tap on Airtime card on AirtelTigo Services Screen");

        Listeners.executeStep(() -> airtime.setEnterATNumber(),
                "📜Enter AT number 233270760250");

        Listeners.executeStep(() -> airtime.setOfflineMessageCheck(),
                "🧪Offline message 'No internet? Dial *713# to buy Airtime & Data offline' should be visible");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> airtime.setATHeading(),
                "🧪Should check for the presence of AT Airtime heading");

        Listeners.executeStep(() -> airtime.setATHeading(),
                "🧪Should check for the presence of AT Airtime heading");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");


        Listeners.executeStep(() -> airtime.setATHeading(),
                "🧪AT Airtime heading should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtchk(),
                "🧪'Maximum Amount' airtime to buy should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtValue(),
                "🧪'Maximum Amount Value(GHS100)' airtime to buy should be visible");

        Thread.sleep(2000);
        Listeners.executeStep(() -> airtime.setAirtimeAmountEnter(),
                "📜Enter GHS1 Airtime to buy");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        //Checking for checkout feature
        Listeners.logTestStart("🔎Unified Checkout Test");

        UnifiedCheckout.checkout();

        //MTN SCREEN
        Listeners.logTestStart("🔎MTN Airtime Test");
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on purchases screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN\")")).click(),
                "👆Tap on MTN card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN Services\")")).isDisplayed(),
                "🧪Heading 'MTN Services' should be visible on MTN Services screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Airtime\")")).click(),
                "👆Tap on Airtime card on MTN Services Screen");

        Listeners.executeStep(() -> airtime.setEnterNumber(),
                "📜Enter phone number for MTN airtime");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> airtime.setOfflineMessageCheck(),
                "🧪Offline message 'No internet? Dial *713# to buy Airtime & Data offline' should be visible");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> airtime.setMTNHeading(),
                "🧪Should check for the presence of MTN Airtime heading");


        Listeners.executeStep(() -> airtime.setEditButtonClick(),
                "👆Tap on Edit button");

        Listeners.executeStep(() -> airtime.setMTNHeading(),
                "🧪Should check for the presence of MTN Airtime heading");

        Listeners.executeStep(() -> airtime.setMTNAccountNumberVerification(),
                "🧪Account number should be 0542410123");


        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");


        Listeners.executeStep(() -> airtime.setMTNHeading(),
                "🧪MTN Airtime heading should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtchk(),
                "🧪'Maximum Amount' airtime to buy should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtValue(),
                " 🧪'Maximum Amount Value(GHS100)' airtime to buy should be visible");

        Listeners.executeStep(() -> airtime.setAirtimeAmountEnter(),
                "📜Enter GHS1 Airtime to buy");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        UnifiedCheckout.checkout();

        //TELECEL TEST

        Listeners.logTestStart("🔎Telecel Airtime Test");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on purchases screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel\")")).click(),
                "👆Tap on Telecel card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel Services\")")).isDisplayed(),
                "🧪Heading 'Telecel Services' should be visible on Telecel Services");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Airtime\")")).click(),
                "👆Tap on Airtime card on Telecel Services Screen");

        Listeners.executeStep(() -> airtime.setTelecelEnterNumber(),
               "Entering of phone number for Telecel airtime");

        Listeners.executeStep(() -> airtime.setOfflineMessageCheck(),
                "🧪Offline message 'No internet? Dial *713# to buy Airtime & Data offline' should be visible");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() -> airtime.setTelecelHeading(),
                "🧪Should check for the presence of Telecel Airtime heading");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");


        Listeners.executeStep(() -> airtime.setTelecelHeading(),
                "🧪Telecel Airtime heading should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtchk(),
                "🧪'Maximum Amount' airtime to buy should be visible");

        Listeners.executeStep(() -> airtime.setMaxAmtValue(),
                "🧪'Maximum Amount Value(GHS100)' airtime to buy should be visible");

        Thread.sleep(2000);
        Listeners.executeStep(() -> airtime.setAirtimeAmountEnter(),
                "📜Enter GHS1 Airtime to buy");

        Listeners.executeStep(() -> airtime.setNextButtonClick(),
                "👆Tap on next button");
        UnifiedCheckout.checkout();

    }
}
