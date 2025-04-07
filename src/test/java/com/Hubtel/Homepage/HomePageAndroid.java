package com.Hubtel.Homepage;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.xml.stream.Location;

import io.appium.java_client.AppiumDriver;
public class HomePageAndroid extends AndroidBaseTest {
    @Test
    public void Home_Page() throws InterruptedException {

reusecodes location =new reusecodes(driver);
        reusecodes sendmoney = new reusecodes(driver);

            Listeners.logTestStart("🔎Check the location feature");

location.setLocation("Pokuase","Pokuase Overhead Accra side\n" +
        "Accra - Kumasi Road, Ghana");

            Thread.sleep(1000);

            Listeners.logTestStart("🔎Check the availability of all Hubtel product cards");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN\")")).isDisplayed(),
                    "🧪MTN card should be visible on the Home screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel\")")).isDisplayed(),
                    "🧪Telecel card should be visible on the Home screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo\")")).isDisplayed(),
                    "🧪AirtelTigo card should be visible on the Home screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"ECG\")")).isDisplayed(),
                    "🧪ECG card should be visible on the Home screen");
            Thread.sleep(1000);
            Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                    "📜Perform horizontal swipe on hubtel products");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ghana Water\")")).isDisplayed(),
                "🧪Ghana Water card should be visible on the Home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car Insurance\")")).isDisplayed(),
//                "🧪Car Insurance card should be visible on the Home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SportyBet\")")).isDisplayed(),
                "🧪SportyBet  card should be visible on the Home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"DSTV\")")).isDisplayed(),
                "🧪DSTV card should be visible on the Home screen");

        Thread.sleep(1000);
        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform swipe");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GOTV\")")).isDisplayed(),
                "🧪GOTV card should be visible on the Home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"StarTimes TV\")")).isDisplayed(),
                "🧪StarTimes TV card should be visible on the Home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car Insurance\")")).isDisplayed(),
                "🧪Car Insurance card should be visible on the Home screen");

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Paid Polls\")")).isDisplayed(),
//                "🧪Paid Polls card should be visible on the Home screen");

        Thread.sleep(1000);
        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform swipe");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send to Bank\")")).isDisplayed(),
                "🧪Send to Bank card should be visible on the Home screen");

Listeners.logTestStart("🔎Check for the presence of the Send Money options");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Quick and Easy Transfers\n" +
                        "Send money, instantly and safely\")")).isDisplayed(),
                "🧪Description 'Quick and Easy Transfers Send money, instantly and safely' for send money should be visible");

        Listeners.logTestStart("🔎Check for Send to Bank functionality");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(13)")).click(),
                "👆Tap on expand button for Send to Bank");
Thread.sleep(1000);
        sendmoney.sendMoneyOptions();

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back button on Send Money screen");



        Listeners.logTestStart("🔎Check for Send Momo functionality");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Send Momo\n" +
                        "Tab 2 of 2\")")).click(),
                "👆Tap on Send Momo tab on the home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(13)")).click(),
                "👆Tap on expand button for Send Momo");
        Thread.sleep(1000);
        sendmoney.sendMoneyOptions();

        Listeners.logTestStart("🔎Check for presence of Merchant options ");

        Listeners.executeStep(() ->homePage.scrollToElement("Pay GHQR Merchant",425,1720,425,1720),
                "📜Scroll to Merchant on Send Money screen");

        Listeners.executeStep(() -> homePage.setAramexShipments(),
                "🧪 'Aramex Shipment' should be visible under Merchants Tab");

        Listeners.executeStep(() -> homePage.setMerchantHubtel(),
                "🧪 'Business on Hubtel' should be visible under Merchants Tab");

        Listeners.executeStep(() -> homePage.setPayGHQR(),
                "🧪 'Pay GHQR' should be visible under Merchants Tab");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NCG - Berekuso Cathedral\")")).isDisplayed(),
                "🧪 'NCG - Berekuso Cathedral' should be visible under Merchants Tab");




        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back button on Send Money screen");

        Listeners.executeStep(() -> homePage.scrollToSendMoneyTab(),
                "📜 Scroll to Utility Bills tab on hubtel home screen");

        Listeners.logTestStart("🔎Check for the presence of Utility Bills products");

                Listeners.executeStep(() -> homePage.setDSTV(),
                "🧪 'DSTV' should be visible under Pay your bills tab on hubtel home screen");

        Listeners.executeStep(() -> homePage.setGhanaWater(),
                "🧪 'Ghana Water' should be visible under Pay your bills tab on hubtel home screen");

        Listeners.executeStep(() -> homePage.setGotvPay(),
                "🧪 'Gotv' should be visible under Pay your bills tab on hubtel home screen");

        Listeners.executeStep(() -> homePage.setStarTimesPay(),
                "🧪 'StarTimes' should be visible under Pay your bills tab on hubtel home screen");

        Listeners.executeStep(() -> homePage.setECG(),
                "🧪 'ECG' should be visible under Pay your bills tab on hubtel home screen");

        Listeners.logTestStart("🔎Verify that the search functionality returns accurate and relevant results when a query is entered");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")).click(),
                "👆Tap on the search button located on the task bar of the guest view screen to initiate a search.");

        Listeners.executeStep(() -> homePage.setsearchFieldClick(),
                "👆Tap on search text area");

        Listeners.executeStep(() -> homePage.setSearchFieldText(),
                "📜 Entering 'mtn' in the search text area on the home page");

        Listeners.executeStep(() -> homePage.enterKey(),
                "📜Press search key on the keyboard");
Thread.sleep(500);
        Listeners.executeStep(() -> homePage.setMTNMobileMoney(),
                "🧪'MTN Mobile Money' should be within mtn search list");

        Listeners.executeStep(() -> homePage.setMTNAirtime(),
                "🧪'MTN Airtime' should be within mtn search list");

        Listeners.executeStep(() -> homePage.setMTNData(),
                "🧪'MTN Data' should be within mtn search list");

        Listeners.executeStep(() -> homePage.setClearButton(),
                "👆Tap on clear button within search field");

        Listeners.executeStep(() ->homePage.setSearchFieldVisible(),
                "🧪Verify that the search field is cleared after tapping the clear button.");

    }

}
