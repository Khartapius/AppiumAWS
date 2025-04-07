package com.Hubtel.Car_Insurance;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;



public class carInsuranceNewSticker extends AndroidBaseTest {


    @Test
    public void carInsurance_NewSticker() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();

        Thread.sleep(5000);
        Listeners.logTestStart("🔎 (01) Verify the presence of Car Insurance card on hubtel home screen");

        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform horizontal swipe on hubtel products");
        Thread.sleep(1000);
        Listeners.executeStep(() ->homePage.swipeUntilElementVisible(),
                "📜Perform swipe");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car Insurance\")")).isDisplayed(),
                "🧪Car Insurance card should be visible on the Home screen");

        Listeners.executeStep(() -> carInsurance.setCarInsuranceCard(),
                "👆Tapping on Car Insurance card on hubtel home screen");

        Listeners.logTestStart("🔎 (02) Verify the creation of the new car insurance sticker feature");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GET A STICKER\")")).click(),
                "👆 Tapping on GET A STICKER ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Registration Number/DV\")")).isDisplayed(),
                "🧪The heading 'Registration Number/DV' should be visible ");

        Listeners.logTestStart("🔎(03) Verify the presence of 'I use this car for' options");

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

        Listeners.logTestStart("🔎(04) Verify the presence of 'Insurance status of this car' options ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).click(),
                "👆 Tapping on 'Insurance status of this car' drop-down ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).isDisplayed(),
                "🧪'Car has no insurance or has expired' should be visible on 'Insurance status of this car' drop-down list");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car insurance is still active\")")).isDisplayed(),
                "🧪'Car insurance is still active' should be visible on 'Insurance status of this car' drop-down list");

        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");

        Listeners.logTestStart("🔎(05) Verify the functionality of text field for entering car registration number");
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("HB 123-23"),
                "📜Entering car number on Registration Number/DV screen");

//Test all option of "I use this car for"
        //Testing Ride Hailing
        Listeners.logTestStart("🔎(23) Verify the price and description for 1 month for Ride Hailing (Uber/Bolt/Yango)");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=2]")).click(),
                "👆Tap on 'I use this car for' drop down list ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ride Hailing (Uber/Bolt/Yango)\")")).click(),
                "👆Tap on 'Ride Hailing (Uber/Bolt/Yango)' on 'I use this car for drop-down list' ");

//    //    steps to select policy screen

        UnifiedCheckout.stepsToPolicyScreen();
        UnifiedCheckout.rideHailingPriceCheck();

//End

        //Testing commercial purpose
        Listeners.logTestStart("🔎(23) Verify the price and description for 1 month for 'commercial purpose(Taxi)' ");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=2]")).click(),
                "👆Tap on 'I use this car for' drop down list");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Commercial purposes (Taxi)\")")).click(),
                "👆Tap on 'Commercial purposes (Taxi)' on 'I use this car for drop-down list'");

         UnifiedCheckout.stepsToPolicyScreen();
         UnifiedCheckout.taxiPriceCheck();

         //End

        //Testing Commercial Purpose(Trotro)

        Listeners.executeStep(() ->driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=2]")).click(),
                "👆Tap on 'I use this car for' drop down list ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Commercial purposes (Trotro)\")")).click(),
                "👆Tap on 'Commercial purposes (Trotro)' on 'I use this car for drop-down list'");
        UnifiedCheckout.stepsToPolicyScreen();
        UnifiedCheckout.trotroPriceCheck();

        //Testing for private purpose
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.logTestStart("🔎(27) Verify the presence of 'No, I have insurance' options ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"No, I have insurance\")")).click(),
                "👆 Tapping on No, I have insurance ");

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, I don't have insurance\")")).click(),
//                "👆 Tapping on 'No, I have insurance' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).isDisplayed(),
                "🧪Text 'Car has no insurance or has expired' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car insurance is still active\")")).isDisplayed(),
                "🧪Text 'Car insurance is still active' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.logTestStart("🔎(28) Verify the functionality of 'I don't have insurance' feature  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, I don't have insurance\")")).click(),
                "👆 Tapping on Yes, I don't have insurance on 'Are you sure your car is not insured?' screen  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Chassis Number/VIN\")")).isDisplayed(),
                "🧪Heading 'Chassis Number/VIN' should be visible ");

        Listeners.logTestStart("🔎(29) Verify the functionality of 'Where do I find my Chassis number/VIN?' feature  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Where do I find my Chassis number/VIN? \")")).click(),
                "👆 Tapping on 'Where do I find my Chassis number/VIN?' button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).isDisplayed(),
                "🧪Where to find chassis number on the car image should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"A VIN/Chassis contains 17 characters.\")")).isDisplayed(),
                "🧪Description of chassis number  should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");
        //Thread.sleep(1000);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.EditText")).click(),
                "👆Tapping on chassis number on 'Chassis Number/VIN' screen  ");

        Listeners.logTestStart("🔎(30) Verify the functionality of  'Enter your chassis number' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("7ACTBRSALGHB12323"),
                "📜Entering chassis number on 'Chassis Number/VIN' screen  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");
//
//        Listeners.executeStep(() -> carInsurance.setCarInsuranceHeading(),
//                "🧪Car Insurance heading should be visible on car details screen");

        Listeners.logTestStart("🔎(31) Verify the presence of Car Insurance sticker details");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"EIC\")")),
                "🧪Heading EIC should be visible");

        Listeners.executeStep(() -> carInsurance.carDetails(),
                "Obtaining the value for engine capacity ");

        Listeners.executeStep(() -> carInsurance.setCarNumber(),
                "🧪 Car registration number should be HB 123-23 on the insurance sticker");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NO, THIS IS NOT MY CAR\")")).click(),
                "👆 Tapping on NO, THIS IS NOT MY CAR ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit Details\")")).isEnabled(),
                "🧪 Edit Details button should be enabled");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit Chassis / Vin\")")).isEnabled(),
                "🧪 Edit Chassis / Vin button should be enabled");


        Listeners.executeStep(() -> carInsurance.chassisCorOrdinateClick(),
                "📜 Existing from edit chassis pop-up");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"YES, THIS IS MY CAR\")")).click(),
                "👆 Tapping on YES, THIS IS MY CAR ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.accessibilityId("HB 123-23\n2018 TOYOTA COROLLA\n7ACTBRSALGHB12323")).isDisplayed(),
                "🧪 Car registration number and details should be visible");

        Listeners.logTestStart("🔎(32) Verify the functionality of  'cost of car' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).click(),
                "👆Tapping on the cost of the car text field   ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).sendKeys("80000"),
                "📜Entering the cost of the car");

        Listeners.logTestStart("🔎(33) Verify the functionality of  'Colour of car' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).click(),
                "👆Tapping on color of the car text field  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).sendKeys("Blue"),
                "📜Entering color of the car  ");

//        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.EditText[4]")).sendKeys("Blue"),
//                "📜Entering color of the car  ");

        Listeners.executeStep(() -> carInsurance.setSelectPolicyButtonClick(),
                "👆Tapping on Select Policy button ");

        //selecting policy
        Listeners.logTestStart("🔎(34) Verify the functionality of 'Duration and cover type' feature");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months selected\")")).click(),
                "👆Tapping on select duration ");
        Thread.sleep(1000);
        Listeners.logTestStart("🔎(35) Verify the presence of all duration types");

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
        Thread.sleep(2000);

        Listeners.logTestStart("🔎(36) Verify the price and description for 1 month duration");

        Listeners.executeStep(() -> carInsurance.setThirdPartyOnlyOneMonth(),
                "🧪The heading, price, and content description on the Third Party Only for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setThirdPartyFireTheftOneMonth(),
                "🧪The heading, price, and content description on the Third Party Fire and Theft for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> carInsurance.setComprehensiveOneMonth(),
                "🧪The heading, price, and content description on Comprehensive for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Comprehensive\nGHS 483.81\nCovers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")).click(),
                "👆 Tapping on Comprehensive plan for One Month card ");





        Listeners.logTestStart("📜Unified Checkout Test");
        UnifiedCheckout.checkout();

        Thread.sleep(2000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).click(),
                "👆 Tapping on close button select policy screen ");

        Listeners.executeStep(() -> carInsurance.okTap(),
                "👆 Tapping on Okay button on close insurance modal on select policy screen ");
        Thread.sleep(2000);

        Listeners.executeStep(() -> carInsurance.newSticker(),
                "👆 Tapping on the newly created sticker ");

//        Listeners.executeStep(() -> carInsurance.engineCapacityCheck(),
//                "🧪 The engine capacity should be 1.8 liters, as previously stated on the car details screen.");

    }


}
