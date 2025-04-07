package com.Hubtel.All_Meals;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class All_MealsAndroid extends AndroidBaseTest {

    @Test
public void All_Meals() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);


//            UnifiedCheckout.setLocation("Kokomlele","Kokomlemle\n" +
//                    "Accra, Ghana");
Thread.sleep(3000);
        Listeners.executeStep(() ->allMeals.viewOrderDelete(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->allMeals.scrollToPopularMeals(0,0,508,1548),
                "📜Scroll to All Meals and Groceries tab on hubtel home screen");


            Listeners.executeStep(() ->allMeals.setPopularMealSelect(),
                    "📜Select one meal at Popular meals");
//        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Fufu\")")).click(),
//                "Tap on fufu");

        Listeners.executeStep(() ->allMeals.SelectedMealName(),
                "🧪Selected meal name should be visible");
        Thread.sleep(2000);
        Listeners.executeStep(() ->allMeals.setMealOptionsSelect(),
                "📜Randomly select a meal from selected meal options");
Thread.sleep(1000);
        Listeners.executeStep(() ->allMeals.performActions(),
                "📜Selecting all required options under selected meal");



        Thread.sleep(3000);


//            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")).click(),
//                    "👆Tapping on Search button icon  on All Meals home screen task bar");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).click(),
//                "👆Tapping on search text field ");
//
//            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).sendKeys("Mashke Smoothie"),
//                    "📜Entering 'Kenkey' in the search text field");
//
//            Listeners.executeStep(() -> homePage.enterKey(),
//                    "📜Press search key on the keyboard");
//
//Thread.sleep(3000);
//
////            Listeners.executeStep(() ->allMeals.AduaneClick(),
////                    " 📜Randomly select restaurant from the meal search results, regardless of whether the store is open or closed.");
////
//        Listeners.executeStep(() ->allMeals.AduaneClick(),
//                " 📜 Select 'Mashke Smoothie' restaurant from the meal search results, regardless of whether the store is open or closed.");

//when store is closed


        Listeners.executeStep(() ->allMeals.closedShop(),
                "👆If shop is closed,tap of SCHEDULE DELIVERY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")).isDisplayed(),
                "🧪'Confirm Order' heading should be visible on Order screen ");

        Thread.sleep(1000);

//        Listeners.executeStep(() ->melcom.priceOnViewOrderScreen(),
//                "🧪The price on the Order Screen should match the price of the item selected");

//        Listeners.executeStep(() ->melcom.orderTotalPrice(),
//                "🧪The sum of the delivery fee and the subtotal should equal the total amount.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Deliver later\")")).click(),
                "👆Tap on Deliver Later Button on 'Confirm Order' Screen");

        Listeners.logTestStart("🔎 Verify Delivery Feature ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"When do you want your order delivered?\")")).isDisplayed(),
                "🧪Heading 'When do you want your order delivered?' should be visible ");

        //scheduling Delivery

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Tomorrow\")")).click(),
                "👆Tapping on 'Tomorrow' on when to deliver time frame screen ");

        Listeners.executeStep(() ->driver.findElements(AppiumBy.xpath("//android.view.View[@index=1]")).get(1).click(),
                "👆Tapping on the second option under 'Tomorrow' on when to deliver time frame screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONFIRM\")")).click(),
                "👆Tapping on 'Confirm' button ");

        Thread.sleep(1000);
        Listeners.executeStep(() ->melcom.scroll(500,905,0,0,"down"),
                "📜Scroll down");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"LOOKS GOOD\")")).click(),
                "👆Tap on LOOKS GOOD button on Confirm Order screen");

        Listeners.logTestStart("🔎Verify the Checkout Feature");
        //Checking for checkout feature
        UnifiedCheckout.checkout();

        Listeners.logTestStart("🔎Verify Item Deletion from the Cart");

        Listeners.executeStep(() ->melcom.viewOrderDeleteAfterCheckout(),
                "📜Clear the cart if an item is pending in the cart.");

    }


}
