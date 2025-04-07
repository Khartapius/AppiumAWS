package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.time.Duration;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class Home_Screen extends AndroidActions {

    AndroidDriver driver;

    // WebDriver driver = new AndroidDriver();

    public Home_Screen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement hubtelHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement searchFieldClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\")")
    private WebElement searchFieldText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search Hubtel\")")
    private WebElement SearchHubtel;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\")")
    private WebElement clearButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search for anything on Hubtel\")")
    private WebElement SearchForAnything;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"MTN Mobile Money\")")
    private WebElement MTNMobileMoney;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"MTN Airtime\")")
    private WebElement MTNAirtime;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"MTN Fibre Data\")")
    private WebElement MTNFibreData;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"MTN Data\")")
    private WebElement MTNData;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(6)")
    private WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Send Money\")")
    private WebElement sendMoneyCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Airtime\")")
    private WebElement AirtimeCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Internet Data\")")
    private WebElement internetDataCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Utility Bills\")")
    private WebElement utilityBillsCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Car Insurance\")")
    private WebElement carInsuranceCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Event Tickets\")")
    private WebElement eventTicketsCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Bet Top up\")")
    private WebElement betTopUpCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Paid Polls\")")
    private WebElement paidPollsCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"SMS & Money\")")
    private WebElement SMSMoney;

    //setting location
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=4]")
    private WebElement setLocation;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Select a different location\")")
    private WebElement selectDiffLoc;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement enterLoc;

    //press search key
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pokuase Overhead Accra side\n" +
            "Accra - Kumasi Road, Ghana\")")
    private WebElement pokuaseClick;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"GOtv\n" +
            "PAY\")")
    private WebElement Gotv;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Send Momo\n" +
            "Tab 1 of 3\")")
    private WebElement sendMomoTab;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Send To Bank\n" +
            "Tab 2 of 3\")")
    private WebElement sendToBank;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pay Merchants\n" +
            "Tab 3 of 3\")")
    private WebElement payMerchant;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Aramex Shipments\")")
    private WebElement aramexShipments;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Business on Hubtel\")")
    private WebElement merchantHubtel;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pay GHQR Merchant\")")
    private WebElement payGHQR;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
    private WebElement DSTV;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    private WebElement GhanaWater;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(13)")
    private WebElement GotvPay;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(14)")
    private WebElement StarTimesPay;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(11)")
    private WebElement ECG;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Popular Tab 1 of 4\")")
    private WebElement popularTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Local Tab 2 of 4\")")
    private WebElement localTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Groceries Tab 3 of 4\")")
    private WebElement groceriesTab;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Promos Tab 4 of 4\")")
    private WebElement promosTab;

    public void setHubtelHeading() {

        assertTrue(hubtelHeading.isDisplayed(), "🧪 Heading 'Hubtel' should be visible on the Home screen");
    }

    public void setsearchFieldClick() {
        searchFieldClick.click();
    }
    public void setSearchFieldVisible(){
        searchFieldClick.isDisplayed();
    }

    public void setSearchFieldText() {
       // searchFieldText.click();
        searchFieldText.sendKeys("mtn");
    }

    //press enter using keyboard
    public void enterKey() {
        //driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void setClearButton() {
        clearButton.click();
    }

    public void setSearchForAnything() {
        assertTrue(SearchForAnything.isDisplayed(), "🧪 Text 'Search for anything on Hubtel' should be visible");
    }

    public void setSearchHubtel() {
        assertTrue(SearchHubtel.isDisplayed(), "🧪 Heading 'Search Hubtel' should be visible");
    }

//enter mtn again


    public void setMTNMobileMoney() {
        assertTrue(MTNMobileMoney.isDisplayed(), "🧪'MTN Mobile Money' should be within mtn search list");
    }

    public void setMTNAirtime() {
        assertTrue(MTNAirtime.isDisplayed(), "🧪'MTN Airtime' should be within mtn search list");
    }

    public void setMTNFibreData() {
        assertTrue(MTNFibreData.isDisplayed(), "🧪'MTN Fibre' should be within mtn search list");
    }

    public void setMTNData() {
        assertTrue(MTNData.isDisplayed(), "🧪'MTN Data' should be within mtn search list");
    }

    public void setBackButton() {
        backButton.click();
    }

    public void setSendMoneyCard() {
        sendMoneyCard.isDisplayed();
    }

    public void setAirtimeCard() {
        AirtimeCard.isDisplayed();
    }

    public void setInternetDataCard() {
        internetDataCard.isDisplayed();
    }

    public void setUtilityBillsCard() {
        utilityBillsCard.isDisplayed();
    }


    public void setCarInsuranceCard() {
        carInsuranceCard.isDisplayed();
    }

    public void setEventTicketsCard() {
        eventTicketsCard.isDisplayed();
    }

    public void setBetTopUpCard() {
        betTopUpCard.isDisplayed();
    }

    public void setPaidPollsCard() {
        betTopUpCard.isDisplayed();
    }

    public void setSMSMoney() {
        SMSMoney.isDisplayed();
    }

    public void setSetLocation() {
        setLocation.click();
    }

    public void setSelectDiffLoc() {
        selectDiffLoc.click();
    }

    public void setEnterLoc() {
        enterLoc.sendKeys("Pokuase");
    }
    //enter key

    public void setPokuaseClick() {
        pokuaseClick.click();
    }


    public void scrollToSendMoneyTab() {

        Dimension size = driver.manage().window().getSize();
        int startX = size.getWidth() / 2;
        int startY = size.getHeight() / 2;
        int endX = startX;
        int endY = (int) (size.getHeight() * 0.01);
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 1)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(sequence));

    }


    public void setSendMomoTab() {
        sendMomoTab.click();
    }

    public void setSendToBank() {
        sendToBank.click();
    }

    public void setPayMerchant() {
        payMerchant.click();
    }


    public void setAramexShipments() {
        assertTrue(aramexShipments.isDisplayed(), "🧪 'Aramex Shipment' should be visible under  Merchants Tab ");
    }


    public void setMerchantHubtel() {
        assertTrue(merchantHubtel.isDisplayed(), "🧪 'Merchant Hubtel' should be visible under Merchants Tab ");

    }

    public void setPayGHQR() {
        assertTrue(payGHQR.isDisplayed(), "🧪 'Pay GHQR' should be visible under Merchants Tab ");

    }

    public void scrollToPayBillsTab() {
//        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
//                "left", 0, "top", 0, "width", 499, "height", 903,
//                "direction", "down",
//                "percent", 1.0
//        ));




    }

    public void setDSTV() {
        assertTrue(DSTV.isDisplayed(), "🧪 'DSTV' should be visible under Pay your bills tab on hubtel home screen");
    }

    public void setGhanaWater() {
        assertTrue(GhanaWater.isDisplayed(), "🧪 'Ghana Water' should be visible under Pay your bills tab on hubtel home screen");
    }

    public void setGotvPay() {
        assertTrue(GotvPay.isDisplayed(), "🧪 'Gotv' should be visible under Pay your bills tab on hubtel home screen");
    }

    public void setStarTimesPay() {
        assertTrue(StarTimesPay.isDisplayed(), "🧪 'Star Times' should be visible under Pay your bills tab on hubtel home screen");
    }

    public void setECG() {
        assertTrue( ECG.isDisplayed(), "🧪 ' ECG' should be visible under Pay your bills tab on hubtel home screen");
    }



    public void setPopularTab() {
        popularTab.isDisplayed();
    }

    public void setLocalTab() {
        localTab.isDisplayed();
    }

    public void setGroceriesTab() {
        groceriesTab.isDisplayed();
    }

    public void setPromosTab() {
        promosTab.isDisplayed();
    }

}
