package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Airtime extends AndroidActions {
    AndroidDriver driver;


    public Airtime(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //locators
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Airtime\"]")
    private WebElement AirtimeClick;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favourites\")")
    private WebElement favouritesHeading;

    //checking for airtime banner
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"TOP UP\")")
    private WebElement topUpButton;

//check for airtime heading

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(6)")
    private WebElement backButtonClick;

    @AndroidFindBy(accessibility = "NEW")
    private WebElement newButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pay\")")
    private WebElement payHeading;

    @AndroidFindBy(accessibility = "AT Airtime")
    private WebElement ATAirtimeCard;


    @AndroidFindBy(accessibility = "Glo Airtime")
    private WebElement GloAirtimeCard;

    @AndroidFindBy(accessibility = "MTN Airtime")
    private WebElement MTNAirtimeCard;

    @AndroidFindBy(accessibility = "Telecel Airtime")
    private WebElement TelecelAirtimeCard;

    //AT screen
    @AndroidFindBy(accessibility = "AT Airtime")
    private WebElement ATAirtimeCardClick;

    @AndroidFindBy(accessibility = "AT Airtime")
    private WebElement ATAirtimeHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"No internet? Dial *713# to buy Airtime & Data offline\")")
    private WebElement offlineMessageCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement UseMyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterATNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumberCheck;

    @AndroidFindBy(accessibility = "NEXT")
    private WebElement NextButtonClick;

    @AndroidFindBy(accessibility = "AT Airtime")
    private WebElement ATHeading;

    @AndroidFindBy(accessibility = "Edit")
    private WebElement editButtonClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumberVerification;

//click on next button

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Maximum Amount\")")
    private WebElement maxAmtchk;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"GHS 100.00\"]")
    private WebElement maxAmtValue;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    //@AndroidFindBy(xpath = "//android.widget.EditText")
    private WebElement airtimeAmountEnter;

    //MTN SCREEN
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pay\")")
    private WebElement payButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0542410123\")")
    private WebElement MTNAccountNumberVerification;

    @AndroidFindBy(accessibility = "MTN Airtime")
    private WebElement MTNAirtimeCardClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterNumber;

    @AndroidFindBy(accessibility = "MTN Airtime")
    private WebElement MTNAirtimeHeading;

    @AndroidFindBy(accessibility = "MTN Airtime")
    private WebElement MTNHeading;

    //Telecel
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0200045664\")")
    private WebElement TelecelAccountNumberVerification;

    @AndroidFindBy(accessibility = "Telecel Airtime")
    private WebElement TelecelAirtimeCardClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement TelecelenterNumber;

    @AndroidFindBy(accessibility = "Telecel Airtime")
    private WebElement TelecelAirtimeHeading;

    @AndroidFindBy(accessibility = "Telecel Airtime")
    private WebElement TelecelHeading;


    public void setAirtimeClick() {
        AirtimeClick.click();
    }

    public void setFavouritesHeading() {
        boolean headingCheck = favouritesHeading.isDisplayed();
        assertTrue(headingCheck, "The heading for Airtime first screen should be Favourites");
    }

    public void setTopUpButton() {
        topUpButton.click();
    }

    //check for AT airtime heading

    public void setBackButtonClick() {
        backButtonClick.click();
    }

    public void setNewButton() {
        newButton.click();
    }

    public void setPayHeading() {
        boolean PayHeading = payHeading.isDisplayed();
        assertTrue(PayHeading, "Should display Pay as heading");
    }

    public void setATAirtimeCard() {
        boolean ATCard = ATAirtimeCard.isDisplayed();
        assertTrue(ATCard, "AT Airtime Card should be visible");
    }


    public void setGloAirtimeCard() {
        boolean GloCard = GloAirtimeCard.isDisplayed();
        assertTrue(GloCard, "Glo card should be visible");
    }

    public void setMTNAirtimeCard() {
        boolean mtn = MTNAirtimeCard.isDisplayed();
        assertTrue(mtn, "MTN card should be visible");
    }

    public void setTelecelAirtimeCard() {
        boolean telecelCard = TelecelAirtimeCard.isDisplayed();
        assertTrue(telecelCard, "Telecel card should be visible");
    }

    //AT screen
    public void setATAirtimeCardClick() {
        ATAirtimeCardClick.click();
    }

    public void setATAirtimeHeading() {
        String ATHeading = ATAirtimeHeading.getTagName();
        assertEquals(ATHeading, "AT Airtime should be visible");
    }

    public void setOfflineMessageCheck() {
        boolean offmsg = offlineMessageCheck.isDisplayed();
        assertTrue(offmsg, "Offline message 'No internet? Dial *713# to buy Airtime & Data offline' should be visible");
    }

    public void setUseMyNumberCheck() {
        UseMyNumberCheck.click();
    }

    public void setEnterATNumber() {
        enterATNumber.sendKeys("0270760250");
    }

    public void setNextButtonClick() {
        NextButtonClick.click();
    }

    public void setATHeading() {
        String atHeading = ATHeading.getTagName();
        assertEquals(atHeading, "AT Airtime", "AT Airtime heading should be visible");
    }


    public void setEditButtonClick() {
        editButtonClick.click();
    }

    public void setAccountNumberVerification() {
        String accNumber = AccountNumberVerification.getText();
        assertEquals(accNumber, "233539938805");
    }

    public void setMaxAmtchk() {
        String amtchk = maxAmtchk.getTagName();
        assertEquals(amtchk, "Maximum Amount");
    }

    public void setMaxAmtValue() {
        String maxval = maxAmtValue.getTagName();

    }

    public void setAirtimeAmountEnter() {
        airtimeAmountEnter.click();
        airtimeAmountEnter.sendKeys("1");
    }

    //MTN SCREEN

    public void setPayButton() {
        payButton.click();
    }

    public void setMTNAirtimeCardClick() {
        MTNAirtimeCardClick.click();
    }

    public void setMTNAccountNumberVerification() {
        String accNumber = MTNAccountNumberVerification.getText();
        assertEquals(accNumber, "0542410123");
    }

    public void setEnterNumber() {
        enterNumber.sendKeys("0542410123");
    }

    public void setMTNAirtimeHeading() {
        String MTNHeading = MTNAirtimeHeading.getTagName();
        assertEquals(MTNHeading, "MTN Airtime should be visible");
    }


    public void setMTNHeading() {
        String mtnHeading = MTNHeading.getTagName();
        assertEquals(mtnHeading, "MTN Airtime", "MTN Airtime heading should be visible");
    }

    //Telecel

    public void setTelecelAirtimeCardClick() {
        TelecelAirtimeCardClick.click();
    }

    public void setTelecelAccountNumberVerification() {
        String accNumber = TelecelAccountNumberVerification.getText();
        assertEquals(accNumber, "0200045664");
    }

    public void setTelecelEnterNumber() {
        enterNumber.sendKeys("0200045664");
    }

    public void setTelecelAirtimeHeading() {
        String TelecelHeading = TelecelAirtimeHeading.getTagName();
        assertEquals(TelecelHeading, "Telecel Airtime should be visible");
    }


    public void setTelecelHeading() {
        String telecelHeading = TelecelHeading.getTagName();
        assertEquals(telecelHeading, "Telecel Airtime", "Telecel Airtime heading should be visible");
    }

}
