package com.Hubtel.SMS_and_Money;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class SMS_FileUpload_Method extends AndroidBaseTest {

    @Test
    public void SMS_fileUpload() throws InterruptedException {
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

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Add mobile numbers from excel\")")).click(),
                "👆Tapping on 'Add mobile numbers from excel' to upload contacts from excel file");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload Excel File\")")).isDisplayed(),
                "🧪Heading 'Upload Excel File' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Download a sample Excel file\")")).isEnabled(),
                "🧪 Text 'Download a sample Excel file' should be enabled on upload excel file screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select File\")")).click(),
                "👆Tapping on 'Select File' on upload excel file screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"official_contacts.xlsx\")")).click(),
                "📜 Selecting excel contacts from the phone storage");
Thread.sleep(2000);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload\")")).click(),
                "👆Tapping on Upload button on upload excel file screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Below are the records from your excel file.\")")).isDisplayed(),
                "🧪 After uploading excel file description 'Below are the records from your excel file' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload Excel File\")")).isDisplayed(),
                "🧪Heading 'Upload Excel File' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Which column has your phone numbers?\")")).isDisplayed(),
                "🧪Description 'Which column has your phone numbers?' should be visible");

        //Below

       //checking for clear button functionality
        Thread.sleep(2000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Clear Data\")")).click(),
                "👆Tapping on clear data button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Delete\")")).click(),
                "Tapping on delete button on clear data pop-up");


        Listeners.executeStep(() -> smsManual.DisableUploadButton(),
                "🧪 After clearing the excel file upload button should be disable");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select File\")")).click(),
                "👆Tapping on 'Select File' on upload excel file screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"official_contacts.xlsx\")")).click(),
                "📜 Selecting excel contacts from the phone storage");
        Thread.sleep(2000);

        //Above

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Title\").instance(1)")).click(),
                "👆Tapping on the column that enables users to select phone numbers." );

        Listeners.executeStep(() ->smsManual.mobileNumberTap() ,
                "👆Tapping on ‘Mobile Number’ from the select contact modal.");
        Thread.sleep(2000);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Continue\")")).click(),
               "👆Tapping on continue button on Upload Excel File screen ");

        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("QA TEST_FileUpload"),
                "📜Entering 'QA TEST_FileUpload' as group name for the message ");

        Listeners.executeStep(() -> smsManual.setUploadIcon(),
                "👆Tapping on image upload icon");
Thread.sleep(2000);
        Listeners.executeStep(() -> smsManual.setSelctImage4(),
                "📜 Select hubtel logo from the device ");

        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.hubtel.hcb:id/menu_crop\")")).click(),
                "👆Tapping on crop button");
        Thread.sleep(2000);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONTINUE\")")).click(),
                "👆Tapping on continue button on Upload Excel File screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Messages\")")).isDisplayed(),
                "🧪 Heading 'Messages' should be visible on enter message screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("This is QA Test fileUpload method"),
                "📜 Entering 'This is QA Test fileUpload method' in message text field");
        Thread.sleep(2000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\")")).click(),
                "👆Tapping on continue button on enter message screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SMS Summary\")")),
                "🧪 Heading 'SMS Summary' should be visible on SMS Summary screen ");

        Listeners.executeStep(() -> smsManual.MessageCheckfile(),
                "🧪 The message entered should match the one displayed on the review screen.");

        Listeners.executeStep(() -> smsManual.setSendersNumb(),
                "🧪 Senders number should be the same as the account number");

        Listeners.executeStep(() -> smsManual.smsAmount(),
                "🧪 Charges for the SMS should be greater than 0");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"PAY\")")).click(),
                "👆Tapping on PAY button");

        Listeners.executeStep(() -> smsManual.smsCheckoutHeading(),
                "🧪Heading 'Payment for SMS' should be visible on checkout screen");

        //Checking for checkout feature
        UnifiedCheckout.checkout();
    }
}
