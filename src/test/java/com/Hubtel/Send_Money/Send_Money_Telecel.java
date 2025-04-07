package com.Hubtel.Send_Money;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class Send_Money_Telecel extends AndroidBaseTest {

    @Test
    public void Send_Money() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);

     //Telecel Screen


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel\")")).click(),
                "👆Tap on Telecel card on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel Services\")")).isDisplayed(),
                "🧪Heading 'Telecel Services' should be visible on Telecel Services");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send to Telecel Cash\")")).click(),
                "👆Tap on Send to Telecel Cash card on Telecel Services Screen");

        Listeners.executeStep(() -> sendMoney.setTelecelContactEnter(),
                "📜Entering Telecel number(0200045664)");

        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                "👆Tap on next button");

        Listeners.executeStep(() ->sendMoney.allowHubtelAccessLoc(),
                "📜Select 'WHILE USING THE APP' if this pop up 'Allow Hubtel to access this device's location?' is available ");

        Listeners.executeStep(() -> sendMoney.setTelecelMoneyHeading(),
                "🧪Telecel Cash heading should be visible");


        Listeners.executeStep(() -> sendMoney.setEditButtonClick(),
                "👆Tap on Edit button");


        Listeners.executeStep(() -> sendMoney.setTelecelAccountNumberCheck(),
                "🧪Account number should be 0200045664");


        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                "👆Tap on next button");


        Listeners.executeStep(() -> sendMoney.setSelectReasonDropDown(),
                "👆Tap on Select Reason DropDown  button");


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
                "👆Tap on Close button");

        Listeners.executeStep(() -> sendMoney.setTypeRef(),
                "📜Entering Schools Fees in Type a Reference textbox ");

        Listeners.executeStep(() -> sendMoney.setTelecelSendAmount(),
                "📜Entering of the amount to send");

        Listeners.executeStep(() -> sendMoney.setNextButtonClick(),
                "👆Tap on next button");

        UnifiedCheckout.MlWarning();


    }
}
