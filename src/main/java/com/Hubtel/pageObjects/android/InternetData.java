package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;


import static org.testng.Assert.*;


public class InternetData extends AndroidActions {
    AndroidDriver driver;
    SoftAssert softAssert = new SoftAssert();


    public InternetData(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"MTN\")")
    private WebElement InternetDataClick;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favourites\")")
    private WebElement favouritesHeading;

    @AndroidFindBy(accessibility = "NEW")
    private WebElement newButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pay\")")
    private WebElement payHeading;


    @AndroidFindBy(accessibility = "AT Data")
    private WebElement ATDataCard;


    @AndroidFindBy(accessibility = "CloudGhana Internet")
    private WebElement CloudGhanaCard;


    @AndroidFindBy(accessibility = "Glo Data")
    private WebElement GloDataCard;

    @AndroidFindBy(accessibility = "MTN Data")
    private WebElement MTNDataCard;

    @AndroidFindBy(accessibility = "Telecel Broadband")
    private WebElement TelecelBroadbandCard;

    @AndroidFindBy(accessibility = "Telecel Data")
    private WebElement TelecelDataCard;

    @AndroidFindBy(accessibility = "Telecel Postpaid Bills")
    private WebElement TelecelPostpaidBillsCard;

    //AT screen

    @AndroidFindBy(accessibility = "AT Data")
    private WebElement ATDataHeading;

    @AndroidFindBy(accessibility = "AT Data")
    private WebElement ATDataCardClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement UseMyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterATNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumberCheck;


    @AndroidFindBy(accessibility = "NEXT")
    private WebElement NextButtonClick;

    @AndroidFindBy(accessibility = "AT Data")
    private WebElement ATHeading;

    @AndroidFindBy(accessibility = "Edit")
    private WebElement editButton;

    @AndroidFindBy(accessibility = "Edit")
    private WebElement editButtonClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumber;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"45MB (GHS 1)\n" +
            "GHS\n" +
            "1.0\"]")
    private WebElement dataPlanClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Joshua Broni\n" +
            "0270760250\n" +
            "Hide details\n" +
            "Amount\n" +
            "GHS 1.00\n" +
            "Total\n" +
            "GHS 1.00\")")
    private WebElement ATDataAmountCharge;


    //MTN Internet data
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Pay\"]")
    private WebElement payButtonClick;

    @AndroidFindBy(accessibility = "MTN Data")
    private WebElement MTNDataClick;

    @AndroidFindBy(accessibility = "MTN Data")
    private WebElement MTNDataHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterMTNNumber;

    @AndroidFindBy(accessibility = "NEXT")
    private WebElement MTNNextButtonClick;

    @AndroidFindBy(accessibility = "MTN Data")
    private WebElement MTNHeading;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"17.79MB (GHs 0.5)\n" +
            "GHS\n" +
            "0.5\"]")
    private WebElement MTNdataPlanClick;


    //Telecel Internet Data

    @AndroidFindBy(accessibility = "Telecel Data")
    private WebElement TelecelDataClick;

    @AndroidFindBy(accessibility = "Telecel Data")
    private WebElement TelecelDataHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterTelecelNumber;

    @AndroidFindBy(accessibility = "NEXT")
    private WebElement TelecelNextButtonClick;

    @AndroidFindBy(accessibility = "Telecel Data")
    private WebElement TelecelHeading;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"No Expiry - 20MB (GHs 0.5)\n" +
            "GHS\n" +
            "0.5\"]")
    private WebElement TeleceldataPlanClick;


    public void setInternetDataClick() {
        InternetDataClick.click();
    }

    public void setFavouritesHeading() {
        boolean headingCheck = favouritesHeading.isDisplayed();
        assertTrue(headingCheck, "The heading for internet data first screen should be Favourites");
    }

    public void setNewButton() {
        newButton.click();
    }

    public void setPayHeading() {
        boolean PayHeading = payHeading.isDisplayed();
        assertTrue(PayHeading, "Should display Pay as heading");
    }

    public void setATDataCard() {
        boolean ATCard = ATDataCard.isDisplayed();
        assertTrue(ATCard, "AT Data Card should be visible");
    }

    public void setEnterATNumber() {
        enterATNumber.sendKeys("0270760250");
    }


    public void setCloudGhanaCard() {
        boolean Cloudgh = CloudGhanaCard.isDisplayed();
        assertTrue(Cloudgh, "Cloud Ghana card should be visible");

    }

    public void setGloDataCard() {
        boolean GloCard = GloDataCard.isDisplayed();
        assertTrue(GloCard);
    }

    public void setMTNDataCard() {
        boolean mtn = MTNDataCard.isDisplayed();
        assertTrue(mtn);
    }

    public void setTelecelBroadbandCard() {
        boolean telecelBroadband = TelecelBroadbandCard.isDisplayed();
        assertTrue(telecelBroadband);
    }

    public void setTelecelDataCard() {
        boolean telecelCard = TelecelDataCard.isDisplayed();
        assertTrue(telecelCard);
    }

    public void setTelecelPostpaidBillsCard() {
        String TelecelPostPaid = TelecelPostpaidBillsCard.getTagName();
        assertEquals(TelecelPostPaid, "Telecel Postpaid Bills");
        System.out.println("The tag name is " + TelecelPostPaid);
    }


    public void setATDataHeading() {
        String ATHeading = ATDataHeading.getTagName();
        assertEquals(ATHeading, "AT Data");
    }

    public void setATDataCardClick() {
        ATDataCardClick.click();
    }

    public void setUseMyNumberCheck() {
        UseMyNumberCheck.click();
    }

    public void setNextButtonClick() {
        NextButtonClick.click();
    }

    public void setATHeading() {
        String atHeading = ATHeading.getTagName();
        assertEquals(atHeading, "AT Data", "AT Data heading should be visible");
    }

    public void setEditButton() {
        assertTrue(editButton.isEnabled());

    }

    public void setEditButtonClick() {
        editButtonClick.click();
    }

    public void setAccountNumber() {
        String accNumber = AccountNumber.getText();
        assertEquals(accNumber, "233539938805");
    }

    public void setDataPlanClick() {
        dataPlanClick.click();
    }

    public void setATDataAmountCharge() {
        boolean ATDataCharge = ATDataAmountCharge.isDisplayed();
        assertTrue(ATDataCharge);
    }


    //mtn

    public void setPayButtonClick() {
        payButtonClick.click();
    }

    public void setMTNDataClick() {
        MTNDataClick.click();
    }

    public void setEnterMTNNumber() {
        enterMTNNumber.sendKeys("0542410123");
    }

    public void setMTNNextButtonClick() {
        MTNNextButtonClick.click();
    }

    public void setMTNHeading() {
        boolean mtnHeading = MTNHeading.isDisplayed();
        assertTrue(mtnHeading);
    }

    public void setMTNdataPlanClick() {
        MTNdataPlanClick.click();
    }


    //Telecel Data internet

    public void setTelecelDataClick() {
        TelecelDataClick.click();
    }

    public void setTelecelDataHeading() {
        String TelecelHeading = TelecelDataHeading.getTagName();
        assertEquals(TelecelHeading, "Telecel Data");
    }

    public void setEnterTelecelNumber() {
        enterTelecelNumber.sendKeys("0200045664");
    }

    public void setTelecelNextButtonClick() {
        TelecelNextButtonClick.click();
    }

    public void setTelecelHeading() {
        String TelecelHeading = TelecelDataHeading.getTagName();
        assertEquals(TelecelHeading, "Telecel Data");
    }

    public void setTeleceldataPlanClick() {
        TeleceldataPlanClick.click();
    }

}
