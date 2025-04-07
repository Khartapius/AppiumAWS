package com.Hubtel.SMS_and_Money;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class SMS_Manual_Method extends AndroidBaseTest {

    @Test
    public void SMS_Manual() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SMS & Money\")")).click(),
                "👆 Tapping on SMS & Money card on Hubtel home screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Sent\")")).isDisplayed(),
                "🧪 Heading 'Sent' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Never forget to send important messages on time\")")).isDisplayed(),
                "🧪 Text 'Never forget to send important messages on time' should be visible on SMS home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).isEnabled(),
                "🧪 Home button icon should be enabled on SMS home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Sent\")")).isEnabled(),
                "🧪 Sent button icon should be enabled on SMS home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Scheduled\")")).isEnabled(),
                "Scheduled button icon should be enabled on SMS home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SEND A MESSAGE\")")).click(),
                "👆Tapping on 'SEND A MESSAGE' button on SMS home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,'Select Contacts')]")).isDisplayed(),
                "🧪 Heading 'Select Contacts' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Joshua Broni\n" +
                        "0542410123\")")).click(),
                "📜 Selecting Joshua Broni from the contacts list");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONTINUE\")")).click(),
                "👆Tapping on 'CONTINUE' button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,'Select Contacts')]")).isDisplayed(),
                "🧪 Heading 'Select Contacts' should be visible");

        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("QA TEST"),
                "📜Entering 'QA TEST' as group name for the message ");
        Thread.sleep(2000);

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")),
//                "👆 Tapping on image upload icon");

        Listeners.executeStep(() -> smsManual.setUploadIcon(),
                "👆Tapping on image upload icon");

        Thread.sleep(2000);

        Listeners.executeStep(() -> smsManual.setSelctImage4(),
                "📜 Select hubtel logo from the device ");

        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.hubtel.hcb:id/menu_crop\")")).click(),
                "👆Tapping on crop button");
        Thread.sleep(2000);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Number of contacts : 1\")")).isDisplayed(),
                "🧪 Verifying the number of contacts selected");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONTINUE\")")).click(),
                "👆Tapping on continue button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Messages\")")).isDisplayed(),
                "🧪 Heading 'Messages' should be visible on enter message screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send SMS to a group of your contacts instantly with Hubtel. You can send money, request payment, and even see who has paid or withdrawn\")")),
                "🧪The description of SMS functions should be visible.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("This is QA Test"),
                "📜 Entering 'This is QA Test' in message text field");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\")")).click(),
                "👆Tapping on continue button on enter message screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SMS Summary\")")),
                "🧪 Heading 'SMS Summary' should be visible on SMS Summary screen ");

        Listeners.executeStep(() -> smsManual.MessageCheck(),
                "🧪 The message entered should match the one displayed on the review screen.");

        Listeners.executeStep(() -> smsManual.setSendersNumb(),
                "🧪 Senders number should be the same as the account number");

        Listeners.executeStep(() -> smsManual.smsAmount(),
                "🧪 Charges for the SMS should be greater than 0");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"PAY\")")).click(),
                "👆Tapping on PAY button");

        Thread.sleep(1000);

        Listeners.executeStep(() -> smsManual.smsCheckoutHeading(),
                "🧪Heading 'Payment for SMS' should be visible on checkout screen");

        //Checking for checkout feature
        UnifiedCheckout.checkout();
    }

}
