package com.Hubtel.Login;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import com.Hubtel.pageObjects.android.Home_Screen;
import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login extends AndroidBaseTest {

    @Test
    public void login() throws InterruptedException {

        reusecodes location =new reusecodes(driver);

        Listeners.logTestStart("🔎Check the location feature");

        location.setLocation("Circle","Circle VIP Station\n" +
                "Ring Road West, Accra, Ghana");

Thread.sleep(1000);

Listeners.logTestStart("🔎Check the availability of all Hubtel product cards");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"MTN\")")).isDisplayed(),
                "🧪MTN card should be visible on Guest View screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Telecel\")")).isDisplayed(),
                "🧪Telecel card should be visible on Guest View screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"AirtelTigo\")")).isDisplayed(),
                "🧪AirtelTigo card should be visible on Guest View screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"ECG\")")).isDisplayed(),
                "🧪ECG card should be visible on Guest View screen");
Thread.sleep(1000);
        Listeners.executeStep(() ->homePage.swipeByElementAction(driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=2]")).get(0),"left",4055,1.0),
                "📜Perform swipe");

        Thread.sleep(500);

        Listeners.logTestStart("🔎Verify that the search functionality returns accurate and relevant results when a query is entered");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")).click(),
                "👆Tap on the search button located on the task bar of the guest view screen to initiate a search.");

        Listeners.executeStep(() -> homePage.setsearchFieldClick(),
                "👆Tap on search text area");

        Listeners.executeStep(() -> homePage.setSearchFieldText(),
                "📜 Entering 'mtn' in the search text area on the home page");

        Listeners.executeStep(() -> homePage.enterKey(),
                "📜Press search key on the keyboard");

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

Listeners.logTestStart("🔎Verify the Favorites button feature.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Favorites\")")).click(),
                "👆Tap on favorite button located on the bottom navigation bar of the guest view screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Log In\")")).isDisplayed(),
                "🧪Heading 'Log In' should be visible on Log In modal");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Enter your mobile number to continue\")")).isDisplayed(),
                "🧪Description 'Enter your mobile number to continue' should be visible on Log In modal");

        Listeners.executeStep(() ->homePage.ClickByLoc("//android.view.View[@content-desc=\"CANCEL\"]",124,79),
                "👆Close the Log In modal by tapping on the cancel button");

        Listeners.logTestStart("🔎Verify the Purchases button feature.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Purchases\")")).click(),
                "👆Tap on Purchases button located on the bottom navigation bar of the guest view screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Log In\")")).isDisplayed(),
                    "🧪Heading 'Log In' should be visible on Log In modal");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Enter your mobile number to continue\")")).isDisplayed(),
                    "🧪Description 'Enter your mobile number to continue' should be visible on Log In modal");

            Listeners.executeStep(() ->  homePage.ClickByLoc("//android.view.View[@content-desc=\"CANCEL\"]",124,79),
                    "👆Close the Log In modal by tapping on the cancel button");

            Listeners.logTestStart("🔎Verifying Login Functionality");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Home\")")).click(),
                "👆Tap on home button on the navigation bar");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on user profile logo on the Log In screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).sendKeys("0539938805"),
                "📜Enter phone number for log in");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONTINUE\")")).click(),
                "👆Tap on continue button on the log in modal");

        reusecodes login = new reusecodes(driver);
        Listeners.logTestStart("Login into Hubtel home screen");
        login.login();
    }
}
