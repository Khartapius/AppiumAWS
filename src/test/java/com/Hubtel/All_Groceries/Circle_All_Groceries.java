package com.Hubtel.All_Groceries;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import com.Hubtel.TestUtils.reusecodes;

import java.time.Duration;


public class Circle_All_Groceries extends AndroidBaseTest {

    @Test
    public void Circle_All_Groceries() throws InterruptedException {
       reusecodes location = new reusecodes(driver);
        reusecodes UnifiedCheckout = new reusecodes(driver);

        Thread.sleep(3000);
        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");

        location.setLocation("circle","Circle VIP Station\n" +
                "Ring Road West, Accra, Ghana");

        Thread.sleep(2000);

        Listeners.logTestStart("🔎Verify if 'Items From Shop' is visible on Hubtel home screen");

        Listeners.executeStep(() ->allMeals.scrollToElement("Items from shops",0,0,549,1474),
                "📜 Scroll to 'Items from shop' tab on hubtel home screen");

        Listeners.executeStep(() -> allMeals.itemsFromShopSelect(),
                "📜Randomly select one item from 'Items from shop' section on the home screen");

Thread.sleep(1000);


        Listeners.executeStep(() ->allMeals.shopCheck(),
                "🧪The name of the shop selected from the home screen should be visible");
        Thread.sleep(1000);

        Listeners.logTestStart("🔎Verify the price consistency of products listed under the 'Items from shop' section.");

        Listeners.executeStep(() ->circleAllGroceries.setAllProduct(),
                "📜Select an item and check if it’s available for delivery to the selected location, then check for price consistency");

        Listeners.logTestStart("🔎Verify Quick Add Button On selected item Screen");
        Thread.sleep(2000);

        Listeners.executeStep(() ->circleAllGroceries.priceCompare(),
                "🧪The item’s price should match the price displayed on the ‘View Order’ button.");

        Listeners.logTestStart("🔎Verify Increase Quantity Button for Quick Add button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).click(),
                "👆Tap on increase button on the selected item");

        Listeners.executeStep(() ->circleAllGroceries.increaseItemConfirm(),
                "🧪The price of the selected item should double when the increase button is tapped");

        Listeners.logTestStart("🔎Verify Decrease Quantity Button for Quick Add button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on decrease button on the selected item");

        Listeners.executeStep(() ->circleAllGroceries.decreaseItemConfirm(),
                "🧪The price of the selected item should decrease when the decrease button is tapped");

        Listeners.logTestStart("🔎Verify View Order Functionalities");


        Listeners.executeStep(() ->melcom.AddButtonFunc(),
                "👆Tap on the Add button on the searched item");

        Listeners.executeStep(() ->melcom.viewOrderClick(),
                "👆Tap on View Order button");

        Listeners.executeStep(() ->allMeals.closedShop(),
                "👆If shop is closed,tap of SCHEDULE DELIVERY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")).isDisplayed(),
                "🧪'Confirm Order' heading should be visible on Order screen ");

        Thread.sleep(1000);

        Listeners.executeStep(() ->circleAllGroceries.priceOnViewOrderScreen(),
                "🧪The price on the Order Screen should match the price of the item selected");

        Listeners.executeStep(() ->circleAllGroceries.orderTotalPriceAllGroceries(),
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

        Listeners.logTestStart("🔎Verify the Checkout Feature");
        //Checking for checkout feature
        UnifiedCheckout.checkout();

        Listeners.logTestStart("🔎Verify Item Deletion from the Cart");

        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");



    }

    @Test
    public void Pharmacy() throws InterruptedException {
        reusecodes location = new reusecodes(driver);

        reusecodes UnifiedCheckout = new reusecodes(driver);
        Thread.sleep(5000);

        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");

        location.setLocation("circle","Circle VIP Station\n" +
                "Ring Road West, Accra, Ghana");

        Listeners.logTestStart("🔎Verify the presence of Pharmacy shop on Home screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")).click(),
//                "👆Tap on Search button on home screen");

        Listeners.executeStep(() -> melcom.scrollToElement("Bedita Pharmacy",250,900,503,1827),
                "📜Scroll to Bedita Pharmacy tab on hubtel home screen");

        Listeners.logTestStart("🔎Verify the functionality of Pharmacy shop");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Bedita Pharmacy\")")).click(),
                "👆Tap on 'Bedita Pharmacy' ");

        Thread.sleep(2000);
//        Listeners.executeStep(() ->circleAllGroceries.closedPharmacy(),
//                "👆Tap on 'SCHEDULE FOR LATER' button if pharmacy is closed ");

        Listeners.executeStep(() ->circleAllGroceries.setFirstDrug(),
                "📜Obtaining the name of the first drug.");

        Listeners.logTestStart("🔎Verify search functionality for drugs");

        Listeners.executeStep(() ->circleAllGroceries.drugSearch(),
                "📜Performing search with the drug obtained from the second pharmacy");

        Listeners.executeStep(() -> homePage.enterKey(),
                "📜Press search key on the keyboard");

        Listeners.executeStep(() ->circleAllGroceries.pharmacyCheck(),
                "🧪The drug searched for should be visible in the pharmacy ");

        Thread.sleep(2000);
        Listeners.executeStep(() ->circleAllGroceries.setFirstSearchPharmacy(),
                "👆Tap on the searched drug in the pharmacy");

        Listeners.executeStep(() ->circleAllGroceries.DrugPrice(),
                "🧪Searched drug name and price should be visible on drug details screen");



        Listeners.logTestStart("🔎Verify Quick Add Button On selected item Screen");
        Thread.sleep(2000);


        Listeners.executeStep(() ->circleAllGroceries.priceComparePharmacy(),
                "🧪The item’s price should match the price displayed on the ‘View Order’ button.");

        Listeners.logTestStart("🔎Verify Increase Quantity Button for Quick Add button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).click(),
                "👆Tap on increase button on the selected item");

        Listeners.executeStep(() ->circleAllGroceries.increaseItemConfirmPharmacy(),
                "🧪The price of the selected item should double when the increase button is tapped");

        Listeners.logTestStart("🔎Verify Decrease Quantity Button for Quick Add button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on decrease button on the selected item");

        Listeners.executeStep(() ->circleAllGroceries.decreaseItemConfirmPharm(),
                "🧪The price of the selected item should decrease when the decrease button is tapped");

        Listeners.logTestStart("🔎Verify View Order Functionalities");


        Listeners.executeStep(() ->melcom.AddButtonFunc(),
                "👆Tap on the Add button on the searched item");

        Listeners.executeStep(() ->melcom.viewOrderClick(),
                "👆Tap on View Order button");

        Listeners.executeStep(() ->melcom.closedShop(),
                "👆If shop is closed,tap of SCHEDULE DELIVERY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")).isDisplayed(),
                "🧪'Confirm Order' heading should be visible on Order screen ");

        Thread.sleep(1000);

        Listeners.executeStep(() ->circleAllGroceries.priceOnViewOrderScreenPharm(),
                "🧪The price on the Order Screen should match the price of the item selected");

        Listeners.executeStep(() ->circleAllGroceries.orderTotalPricePharm(),
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
