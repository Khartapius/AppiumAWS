package com.Hubtel.Utility_Bills;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class utilityBills extends AndroidBaseTest {

    @Test
    public void UtilityBills() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Utility Bills\")")).click(),
//                "👆Tapping on Utility Bills on hubtel home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Favourites\")")).isDisplayed(),
//                "🧪 Heading Favourites should be visible on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).isEnabled(),
//                "🧪'Home' icon should be visible on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Favourites\")")).isEnabled(),
//                "🧪'Favourites' icon should be visible on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Pay\")")).isEnabled(),
//                "🧪'Pay' icon should be visible on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"History\")")).isEnabled(),
//                "🧪'History' icon should be visible on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEW BILL\")")).click(),
//                "👆Tapping on 'NEW BILL' button on Utility Bill home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Pay\")")).isDisplayed(),
//                "🧪 Heading 'Pay' should be visible on utility products screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"DSTV\")")).isDisplayed(),
//                "🧪 DSTV should be included in the list of utility products");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"ECG\")")).isDisplayed(),
//                "🧪 ECG should be included in the list of utility products");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ghana Water\")")).isDisplayed(),
//                "🧪 Ghana Water should be included in the list of utility products");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GOtv\")")).isDisplayed(),
//                "🧪 GOtv should be included in the list of utility products");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"StarTimes TV\")")).isDisplayed(),
//                "🧪 StarTimes TV should be included in the list of utility products");



        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"ECG\")")).click(),
                "👆Tap on ECG card from the products list option.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Electricity Company of Ghana\")")).isDisplayed(),
                "🧪Heading 'Electricity Company of Ghana' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SOSU ATSU MICHEAL\n" +
                        "P161152412\")")).click(),
                "👆Tap on 'SOSO ATSU MICHEAL' prepaid card");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"ECG\")")),
                "🧪Heading 'ECG' should be visible");

        Listeners.executeStep(() -> utilityBills.setMeterName(),
                "🧪Meter name should be 'SOSU ATSU MICHEAL'");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("1"),
                "📜Enter ‘1’ for ECG payment");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆Tapping on NEXT button");

        Listeners.executeStep(() ->utilityBills.setMeterName_amount(),
                "🧪 Verifying the meter name and the purchase amount for ECG.");

        //Checking for checkout feature
        UnifiedCheckout.checkout();
    }
}
