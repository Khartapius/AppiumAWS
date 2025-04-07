package com.Hubtel.Send_Money;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Send_MoneyAndroid extends AndroidBaseTest {

    @Test
    public void Send_Money() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();


        //AT SCREEN


        Listeners.logTestStart("🔎AT Money Test");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo\")")).click(),
                "👆Tap on AirtelTigo card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo Services\")")).isDisplayed(),
                "🧪Heading 'AirtelTigo Services' should be visible on AirtelTigo Services screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send to AT Money\")")).click(),
                "👆Tap on Send to AT Money card on AirtelTigo Services Screen");

        Listeners.executeStep(() -> sendMoney.setATContactEnter(),
                "📜Entering Tigo number(0270760250)");

        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                " 👆Tapping on next button");

        Listeners.executeStep(() ->sendMoney.allowHubtelAccessLoc(),
                "📜Select 'WHILE USING THE APP' if this pop up 'Allow Hubtel to access this device's location?' is available ");

        Listeners.executeStep(() -> sendMoney.setATMoneyHeading(),
                "🧪AT Money heading should be visible");


        Listeners.executeStep(() -> sendMoney.setEditButtonClick(),
                " 👆Tapping on Edit button");


//        Listeners.executeStep(() -> sendMoney.setAccountNumber(),
//                "Account number should be 0270760250");


        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                " 👆Tapping on next button");


        Listeners.executeStep(() -> sendMoney.setSelectReasonDropDown(),
                " 👆Tapping on Select Reason DropDown  button");


        Listeners.executeStep(() -> sendMoney.setEatingOutCheck(),
                "🧪Eating Out icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setShoppingCheck(),
                "🧪Shopping icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setPersonalCareCheck(),
                "🧪Personal Care icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setPersonalCareCheck(),
                "🧪Personal Care icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setEntertainmentCheck(),
                "🧪Entertainment icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setEntertainmentCheck(),
                "🧪Entertainment icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setBillsCheck(),
                "🧪Bills icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setSchoolFeesCheck(),
                "🧪School Fees icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setReligiousTithe_Dues(),
                "🧪Religious Tithe/Dues icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setTransportCheck(),
                "🧪Transport icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setFamilyCheck(),
                "🧪Family icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setGiftsCheck(),
                "🧪Gifts icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setOtherCheck(),
                "🧪Other icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setCloseClick(),
                " 👆Tapping on Close button");

        Listeners.executeStep(() -> sendMoney.setTypeRef(),
                "📜Entering Schools Fees in Type a Reference textbox ");

        Listeners.executeStep(() -> sendMoney.setATSendAmount(),
                "📜Entering 1 as Send Amount for AT Money");

        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                " 👆Tapping on next button");

        //Checking for checkout feature
        UnifiedCheckout.checkout();

        //MTN SCREEN

        Listeners.logTestStart("🔎MTN Mobile Money Test");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on purchases screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN\")")).click(),
                "👆Tap on MTN card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN Services\")")).isDisplayed(),
                "🧪Heading 'MTN Services' should be visible on MTN Services screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send to MTN MoMo\")")).click(),
                "👆Tap on Send to MTN MoMo card on MTN Services Screen");


        Listeners.executeStep(() -> sendMoney.setMTNHeadingCheck(),
                "🧪MTN Mobile Money Heading Should be Visible");

        Listeners.executeStep(() -> sendMoney.setMTNMobileMoneyNumberCheck(),
                "🧪The MTN Mobile Money Number subheading should be visible.");

//        Listeners.executeStep(() -> sendMoney.setMTNContactEnter(),
//                "Entering MTN number(0542410123)");
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"My Number\n" +
                        "233539938805\")")).click(),
                " 👆Tap on account card on 'Enter Mobile Money' screen ");

        Listeners.executeStep(() -> sendMoney.setMTNMoneyHeading(),
                "🧪MTN Mobile Money heading should be visible");

        Listeners.executeStep(() -> sendMoney.setEditButtonClick(),
                " 👆Tapping on Edit button");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"My Number\n" +
                        "233539938805\")")).isDisplayed(),
                "🧪Account card should be visible on 'Enter Mobile Money' screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"My Number\n" +
                        "233539938805\")")).click(),
                " 👆Tap on account card on 'Enter Mobile Money' screen ");


        Listeners.executeStep(() -> sendMoney.setSelectReasonDropDown(),
                " 👆Tapping on Select Reason DropDown  button");


        Listeners.executeStep(() -> sendMoney.setEatingOutCheck(),
                "🧪Eating Out icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setShoppingCheck(),
                "🧪Shopping icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setPersonalCareCheck(),
                "🧪Personal Care icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setPersonalCareCheck(),
                "🧪Personal Care icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setEntertainmentCheck(),
                "🧪Entertainment icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setEntertainmentCheck(),
                "🧪Entertainment icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setBillsCheck(),
                "🧪Bills icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setSchoolFeesCheck(),
                "🧪School Fees icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setReligiousTithe_Dues(),
                "🧪Religious Tithe/Dues icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setTransportCheck(),
                "🧪Transport icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setFamilyCheck(),
                "🧪Family icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setGiftsCheck(),
                "🧪Gifts icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setOtherCheck(),
                "🧪Other icon Should be Visible");

        Listeners.executeStep(() -> sendMoney.setCloseClick(),
                " 👆Tapping on Close button");

        Listeners.executeStep(() -> sendMoney.setTypeRef(),
                "📜Entering Schools Fees in Type a Reference textbox ");

        Listeners.executeStep(() -> sendMoney.setMTNSendAmount(),
                "📜Entering of the amount to send");

        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                " 👆Tapping on next button");

        //Checking for checkout feature
        UnifiedCheckout.checkout();

    }
}
