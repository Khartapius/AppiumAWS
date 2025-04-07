package com.Hubtel.Car_Insurance;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Car_Insurance extends AndroidBaseTest {


    @Test
    public void Car_Insurance() throws InterruptedException {

//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();
//        SoftAssert softAssert = new SoftAssert();
        reusecodes UnifiedCheckout = new reusecodes(driver);

        Listeners.logTestStart("🔎Car Insurance Test Start");

        Thread.sleep(5000);
        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform horizontal swipe on hubtel products");
        Thread.sleep(2000);
        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform swipe");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car Insurance\")")).isDisplayed(),
                "🧪Car Insurance card should be visible on the Home screen");

        Listeners.executeStep(() -> carInsurance.setCarInsuranceCard(),
                "👆Tapping on Car Insurance card on hubtel home screen");

        Listeners.executeStep(() -> carInsurance.setStickerQRScan(),
                "🧪QR code image should be visible on insurance home screen");

        Listeners.executeStep(() -> carInsurance.setIncompleteBanner(),
                "🧪The incomplete image banner should be visible on the incomplete sticker on the insurance home screen");

        Listeners.executeStep(() -> carInsurance.setGetStickerButton(),
                "🧪Get Sticker button should be enabled on insurance home screen");

        Listeners.executeStep(() -> carInsurance.setCarInsuranceHeading(),
                "🧪Car Insurance heading should be visible on insurance home screen");

        Listeners.executeStep(() -> carInsurance.QRClick(),
                "👆Tapping on QR code sticker on insurance home screen");

        Listeners.executeStep(() -> carInsurance.setDeleteButton(),
                "🧪The delete button should be enabled on the insurance sticker details screen");

        Listeners.executeStep(() -> carInsurance.setCarInsuranceHeading(),
                "🧪Car Insurance heading should be visisble on insurance sticker details screen");

        Listeners.executeStep(() -> carInsurance.setSelectPolicyButton(),
                "🧪Select Policy button should be enabled on insurance sticker details screen");

        Listeners.executeStep(() -> carInsurance.setRenewLaterButton(),
                "🧪Renew Later button should be enabled on insurance sticker details screen");



        Listeners.executeStep(() -> carInsurance.setSelectPolicyButtonClick(),
                "👆Tapping on Select Policy button on insurance sticker details screen");
        Thread.sleep(1000);
        Listeners.executeStep(() -> carInsurance.setCarInsuranceHeading(),
                "🧪Car Insurance heading should be visible on select policy screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select duration and cover type\")")).isDisplayed(),
                "🧪Sub heading 'Select duration and cover type' should be visible on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyOnly(),
                "🧪The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyFireTheft(),
                "🧪The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setComprehensive(),
                "🧪The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months selected\")")).click(),
                "👆Tapping on select duration ");
        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select duration\")")).click(),
                "🧪Heading 'Select duration' should be visible on set duration pop-up ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1 month\")")).isEnabled(),
                "🧪'1 month’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).isEnabled(),
                "🧪'3 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).isEnabled(),
                "🧪'6 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months\")")).isEnabled(),
                "🧪'12 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆Tapping on close button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months selected\")")).click(),
                "👆Tapping on select duration ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1 month\")")).click(),
                "👆 Tapping on 1 month policy ");
        Thread.sleep(1000);

        Listeners.executeStep(() -> carInsurance.setThirdPartyOnlyOneMonth(),
                "🧪The heading, price, and content description on the Third Party Only for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyFireTheftOneMonth(),
                "🧪The heading, price, and content description on the Third Party Fire and Theft for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setComprehensiveOneMonth(),
                "🧪The heading, price, and content description on Comprehensive for One Month card should match the expected values on select policy screen");

//        Listeners.executeStep(() -> carInsurance.setComprehensiveOneMonthClick(),
//                "👆 Tapping on Comprehensive plan for One Month card ");

        //3 months

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1 month selected\")")).click(),
                "👆 Tapping on 1 month policy ");
        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).click(),
                "👆 Tapping on '3 months’ option on set duration pop-up list. ");


        Listeners.executeStep(() -> carInsurance.setThirdPartyOnlyThreeMonth(),
                "🧪The heading, price, and content description on the Third Party Only for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyFireTheftThreeMonth(),
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setComprehensiveThreeMonth(),
                "🧪The heading, price, and content description on Comprehensive for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months selected\")")).click(),
                "👆 Tapping on '3 months ’ option on set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).click(),
                "👆 Tapping on '6 months’ option on set duration pop-up list");

        //6 month
        Listeners.executeStep(() -> carInsurance.setThirdPartyOnlySixMonth(),
                "🧪The heading, price, and content description on the Third Party Only for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyFireTheftSixMonth(),
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setComprehensiveSixMonth(),
                "🧪The heading, price, and content description on Comprehensive for Six Month card should match the expected values on select policy screen");
        
        Listeners.executeStep(() -> carInsurance.setComprehensiveSixMonthClick(),
                "👆Tapping on Comprehensive for Six Month card  on select policy screen");


        Listeners.logTestStart("📜Unified Checkout Test");

        UnifiedCheckout.checkout();

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tapping ok button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tapping ok button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GET A STICKER\")")).click(),
                "👆 Tapping on GET A STICKER ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Registration Number/DV\")")).isDisplayed(),
                "🧪The heading 'Registration Number/DV' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("as607n"),
                "🧪Entering car number on Registration Number/DV screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Private purposes\")")).click(),
                "👆 Tapping on 'I use this car for drop-down' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Private purposes\")")).click(),
                "🧪 'Select use of car' heading  should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Private purposes\")")).click(),
                "🧪 'Select use of car' heading  should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Private purposes\")")).isEnabled(),
                "🧪 'Private purposes' should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ride Hailing (Uber/Bolt/Yango)\")")).isEnabled(),
                "🧪 'Ride Hailing (Uber/Bolt/Yango)' should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Commercial purposes (Taxi)\")")).isEnabled(),
                "🧪 'Commercial purposes (Taxi)' should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Commercial purposes (Trotro)\")")).isEnabled(),
                "🧪 'Commercial purposes (Trotro)' should be visible on 'I use this car for drop-down list' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).click(),
                "👆 Tapping on 'Insurance status of this car' drop-down ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).isDisplayed(),
                "🧪'Car has no insurance or has expired' should be visible on 'Insurance status of this car' drop-down list");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car insurance is still active\")")).isDisplayed(),
                "🧪'Car insurance is still active' should be visible on 'Insurance status of this car' drop-down list");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, I don't have insurance\")")).click(),
                "👆 Tapping on Yes, I don't have insurance ");

        Listeners.executeStep(() -> carInsurance.validateNumberPlate(),
                "🧪Car number plate should be correctly formatted (last alphabet should be capitalized) ");

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click(),
//                "👆Tap on cancel button on 'Chassis Number/VIN' Screen");
//
//        Listeners.executeStep(() ->carInsurance.ClickByLoc("//android.view.View[@content-desc=\"You will not lose progress! Come back anytime to continue right where you left off\n" +
//                        "Okay\"]",487,471),
//                "👆Tap on 'You will not lose progress!' banner ");
    }

}
