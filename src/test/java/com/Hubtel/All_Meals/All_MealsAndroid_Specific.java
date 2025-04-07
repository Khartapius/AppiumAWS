package com.Hubtel.All_Meals;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class All_MealsAndroid_Specific extends AndroidBaseTest {

    @Test
public void All_Meals() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);

        Thread.sleep(2000);
        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");

            UnifiedCheckout.setLocation("Kokomlemle","Kokomlemle\n" +
                    "Accra, Ghana");


            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")).click(),
                    "👆Tapping on Search button icon  on All Meals home screen task bar");
        Thread.sleep(1000);
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Melcom\")")).isDisplayed(),
                "🧪Melcom section should be visible of the search home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).click(),
                "👆Tapping on search text field ");


            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).sendKeys("Mashke Smoothie"),
                    "📜Entering 'Mashke Smoothie' in the search text field");

            Listeners.executeStep(() -> homePage.enterKey(),
                    "📜Press search key on the keyboard");

Thread.sleep(3000);

            Listeners.executeStep(() ->allMeals.AduaneClick(),
                    " 📜Select 'Mashke Smoothie'  from the meal search results, regardless of whether the store is open or closed.");

        Listeners.executeStep(() -> driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Mashke Smoothie\")")).get(0).isDisplayed(),
                "🧪Searched meal 'Mashke Smoothie' should be visible on the meal home screen ");

        Listeners.executeStep(() ->driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(1).click(),
                "📜Selecting the first meal from the meal options on Mashke Smoothie screen");

        Listeners.executeStep(() ->allMeals.scheduleTap(),
                "👆If shop is closed,tap of SCHEDULE DELIVERY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Mashke Smoothie\")")).isDisplayed(),
                "🧪'Mashke Smoothie' should be visible on the screen for selecting required options ");

        Listeners.executeStep(() ->driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(2).click(),
                "📜Selecting the first item from the required options on Mashke Smoothie screen");

        Listeners.executeStep(() ->allMeals.scroll(512,1479,0,0,"down"),
                "📜Perform scroll to Add note section");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).click(),
                "👆Tap on Add note text field");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")")).sendKeys("This is QA Test"),
                "📜Entering 'This is Qa Test' in Add note section");

            Listeners.executeStep(() -> allMeals.AddButtonTap(),
                    "👆Tap on 'ADD TO ORDER' button");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"View Order\")")).click(),
                    "👆Tap on view order button");
//when store is closed


        Listeners.executeStep(() ->allMeals.closedShop(),
                "👆If shop is closed,tap of SCHEDULE DELIVERY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")).isDisplayed(),
                "🧪'Confirm Order' heading should be visible on Order screen ");

        Thread.sleep(1000);
//
//        Listeners.executeStep(() ->allMeals.subTotalShow(),
//                "📜Perform scroll if subtotal section is not visible on Order Screen");

        Listeners.executeStep(() ->allMeals.priceOnViewOrderScreen(),
                "🧪The price on the Order Screen should match the price of the item selected");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"This is QA Test\")")).isDisplayed(),
                "🧪Additional note added previously should be visible on Order Screen");

        Listeners.executeStep(() ->allMeals.orderTotalPrice(),
                "🧪The sum of the delivery fee and the subtotal should equal the total amount.");

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
Thread.sleep(1000);
        Listeners.logTestStart("🔎Verify the Checkout Feature");
        //Checking for checkout feature
        UnifiedCheckout.checkout();

        Listeners.logTestStart("🔎Verify Item Deletion from the Cart");

        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");

    }


}
