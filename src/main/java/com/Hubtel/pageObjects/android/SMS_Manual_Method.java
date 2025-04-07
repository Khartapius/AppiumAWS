package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SMS_Manual_Method extends AndroidActions {
    AndroidDriver driver;


    public SMS_Manual_Method(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
    private List<WebElement> uploadIcon;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index = 1]")
    private List<WebElement> selctImage;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=1]")
    private List<WebElement> selctImage2;

    @AndroidFindBy(id = "com.android.documentsui:id/icon_thumb")
    private WebElement selctImage3;

    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
    private List<WebElement> msgEntered;

    @AndroidFindBy(xpath = "//android.view.View[@index = 1]")
    private List<WebElement> sendersNumb;

    public void setUploadIcon() {
        uploadIcon.get(2).click();
    }

    public void setSelctImage() {
        selctImage.get(1).click();
    }

    public void setSelctImage2() {
        selctImage2.get(0).click();
    }

    public void setSelctImage3() {
        selctImage3.click();
    }

    public void setSelctImage4() {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 214,
                "y", 713
        ));

    }

    String msg = "This is QA Test";

    public void MessageCheck() {
        String messageCheck = msgEntered.get(7).getAttribute("contentDescription");
        Assert.assertEquals(messageCheck, msg, "🧪 The message entered should match the one displayed on the review screen.");
    }

    public void setSendersNumb() {
        String sender = sendersNumb.get(2).getAttribute("contentDescription").replaceAll("[a-zA-Z\\W]", "");

        Assert.assertEquals(sender, "233539938805", "🧪 Senders number should be the same as the account number");

    }

    public void smsAmount() {
        double smsCharge = Double.parseDouble(driver.findElement(AppiumBy.xpath("//android.view.View[@index = 9]")).getAttribute("contentDescription"));
        Assert.assertTrue(smsCharge > 0, "🧪 Charges for the SMS should be greater than 0");
    }

    public void smsCheckoutHeading() {
        boolean SMS_Checkout_Heading = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, 'Payment for SMS')]")).isDisplayed();
        Assert.assertTrue(SMS_Checkout_Heading, " 🧪Heading 'Payment for SMS' should be visible on checkout screen");

    }

    //file upload

    public void mobileNumberTap(){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 177,
                "y", 1724
        ));
    }
    public void excelRecord(){
 boolean excelCheck = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Below are the records from your excel file.\")")).isDisplayed();

   Assert.assertFalse(excelCheck,"🧪 After clearing the excel file the description 'Below are the records from your excel file' shouldn't be visible");
    }

    public void DisableUploadButton(){
        boolean upload = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload\")")).isEnabled();

        Assert.assertFalse(upload,"🧪 After clearing the excel file upload button should be disable");
    }

    String msgfile = "This is QA Test fileUpload method";

    public void MessageCheckfile() {
        String messageCheck = msgEntered.get(7).getAttribute("contentDescription");
        Assert.assertEquals(messageCheck, msgfile, "🧪 The message entered should match the one displayed on the review screen.");
    }

}
