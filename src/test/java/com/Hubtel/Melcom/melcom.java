package com.Hubtel.Melcom;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class melcom extends AndroidBaseTest {

    @Test
    public void Melcom() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
        reusecodes location = new reusecodes(driver);

        Listeners.logTestStart("🔎Verify Melcom Homepage Collections");
        Thread.sleep(5000);
        Listeners.executeStep(() ->circleAllGroceries.viewOrderDeleteAfterCheckoutpharm(),
                "📜Clear the cart if an item is pending in the cart.");

        Listeners.executeStep(() ->circleAllGroceries.clearOrder(),
                "👆Tap on clear Order is that pop up is visible");

        location.setLocation("circle","Circle VIP Station\n" +
                "Ring Road West, Accra, Ghana");

        Thread.sleep(2000);

        Listeners.executeStep(() -> melcom.scrollToElement("Melcom Plus - Kaneshie",503,1827,503,1827),
                "📜Scroll to Melcom tab on hubtel home screen");


        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Melcom Plus - Kaneshie\")")).isDisplayed(),
                "🧪Melcom section should be beneath the 'All Groceries and All Meals card' with Melcom branch name");
Thread.sleep(1000);
        Listeners.executeStep(() ->melcom.setMelcomSection(),
                "🧪Verifying if the total number of items under Melcom is up to 14");

Listeners.logTestStart("🔎Verify Clicking on the Header of Melcom Homepage Collections Open Melcom Shop");

        Listeners.executeStep(() ->melcom.melcomClick(),
                "👆Tapping on Melcom section beneath  'All Groceries and All Meals card'");

        Listeners.executeStep(() ->melcom.scheduleOrder(),
                "👆Tap on 'YES. SCHEDULE MY ORDER' button if visible on melcom home screen");


        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Melcom Plus - Kaneshie\")")).isDisplayed(),
                "🧪Melcom branch name should be visible on Melcom Home Screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Otublohum Street, North Industrial Area, Kaneshie\")")).isDisplayed(),
                "🧪Land mark to melcom should be visible");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(4)")).isEnabled(),
                "🧪Back button should be visible on Melcom home screen");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).isEnabled(),
                "🧪Search button should be visible on Melcom home screen");
Thread.sleep(4000);
//        Listeners.executeStep(() ->melcom.swipeUntilElementVisible(),
//                "🧪Swipe to the last element");
        Listeners.executeStep(() ->melcom.scroll(540,1039,0,0,"down"),
                "📜Scroll to view all product categories button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on hamburger menu on melcom screen to view all product categories");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Baby Care\")")).isDisplayed(),
                "🧪'Baby Care' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Fruits & Vegetables\")")).isDisplayed(),
                "🧪'Fruits & Vegetables' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Meat, Seafood & Others\")")).isDisplayed(),
                "🧪'Meat, Seafood & Others' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Dairy, Deli & Egg\")")).isDisplayed(),
                "🧪'Dairy, Deli & Egg' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Personal Care\")")).isDisplayed(),
                "🧪'Personal Care' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Snacks\")")).isDisplayed(),
                "🧪'Snacks' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Alcohol\")")).isDisplayed(),
                "🧪'Alcohol' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Ice Creams\")")).isDisplayed(),
                "🧪'Ice Creams' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Bakery\")")).isDisplayed(),
                "🧪'Bakery' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Oils & Sauces\")")).isDisplayed(),
                "🧪'Oils & Sauces' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Household\")")).isDisplayed(),
                "🧪'Household' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Food Cupboard\")")).isDisplayed(),
                "🧪'Food Cupboard' should be visible on all products categories screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Beverages & Non-Alcoholic\")")).isDisplayed(),
                "🧪'Beverages & Non-Alcoholic' should be visible on all products categories screen");

        Listeners.executeStep(() ->melcom.selectRandomElement(),
                "📜Randomly select one element under all products categories screen");

Thread.sleep(1000);
        Listeners.logTestStart("🔎Verify Quick Add button on Melcom screen ");

        Listeners.executeStep(() ->melcom.quickAddFirst(),
                "👆Tap on the Add button on selected category screen");

        Listeners.executeStep(() ->melcom.viewOrderDesc(),
                "🧪The item’s price should match the price displayed on the ‘View Order’ button.");


        Listeners.logTestStart("🔎Verify Delete Button for Quick Add button");

        Listeners.executeStep(() ->melcom.deleteButton(),
                "👆Tap on delete button on the selected item");

Thread.sleep(2000);

        Listeners.executeStep(() ->melcom.locationPop(),
                "👆Tap on the banner indicating location differences, if available.");

Listeners.logTestStart("🔎Check Search functionalities On Featured Shop Screen");

//        Listeners.executeStep(() ->allMeals.scrollToQCTab(),
//                "📜 Scroll down till different elements load");
//Thread.sleep(1000);
        Listeners.executeStep(() ->melcom.AddButtonCheck(),
                "📜This is the desc of the element selected");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on Search button on Melcom Featured home screen");

        Listeners.executeStep(() ->melcom.searchItem(),
                "📜Search using the selected item");
        Thread.sleep(1000);
        Listeners.executeStep(() ->  driver.pressKey(new KeyEvent().withKey(AndroidKey.ENTER)),
                "👆Tap on search button");
        Thread.sleep(2000);
        Listeners.executeStep(() ->melcom.searchItemVisibility(),
                "🧪Searched item should be visible");

        Listeners.executeStep(() ->melcom.tapSearchedItem(),
                "👆Tap on searched item");

        Listeners.logTestStart("🔎Verify Quick Add Button On selected item Screen");
Thread.sleep(2000);
        Listeners.executeStep(() ->melcom.searchItemVisibilityDetail(),
                "🧪The selected item's name and price should match the description previously shown in the search results.");

//        Listeners.executeStep(() ->melcom.AddButtonFunc(),
//                "👆Tap on the Add button on the searched item");

        Listeners.executeStep(() ->melcom.priceCompare(),
                "🧪The item’s price should match the price displayed on the ‘View Order’ button.");

    Listeners.logTestStart("🔎Verify Increase Quantity Button for Quick Add button");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).click(),
                    "👆Tap on increase button on the selected item");

            Listeners.executeStep(() ->melcom.increaseItemConfirm(),
                    "🧪The price of the selected item should double when the increase button is tapped");

            Listeners.logTestStart("🔎Verify Decrease Quantity Button for Quick Add button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on decrease button on the selected item");

        Listeners.executeStep(() ->melcom.decreaseItemConfirm(),
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

        Listeners.executeStep(() ->melcom.priceOnViewOrderScreen(),
                "🧪The price on the Order Screen should match the price of the item selected");

        Listeners.executeStep(() ->melcom.orderTotalPrice(),
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
