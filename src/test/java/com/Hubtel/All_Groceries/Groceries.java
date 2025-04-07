package com.Hubtel.All_Groceries;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;
import com.Hubtel.TestUtils.reusecodes;

public class Groceries extends AndroidBaseTest {


    @Test
    public void All_Groceries() throws InterruptedException {
reusecodes location = new reusecodes(driver);
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=4]")).click(),
//                "👆Tapping on 'Your delivery location is set to' on hubtel home screen ");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select a different location\")")).click(),
//                "👆Tapping on 'select different location'on set location pop-up screen");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).sendKeys("Kubekrom"),
//                "📜Entering 'Kubekrom' on Add a delivery location screen ");
//
//        Listeners.executeStep(() -> homePage.enterKey(),
//                "📜Press search key on the keyboard");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Kubekrom\n" +
//                        "Ghana\")")).click(),
//                "👆Tapping on 'Kubekrom Ghana' from location search results drop list ");

        location.setLocation("circle","Circle VIP Station\n" +
                "Ring Road West, Accra, Ghana");

        Thread.sleep(2000);

        Listeners.executeStep(() ->allMeals.scrollToQCTab(),
                "📜 Scroll to All Meals and Groceries tab on hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(17)")).click(),
                "👆Tapping on All Groceries on hubtel home screen ");
Thread.sleep(2000);
        Listeners.executeStep(() ->allGroceries.productCardSelect(),
                "📜Tapping on product card and  verifying if the correct card was selected");

        Listeners.executeStep(() ->allGroceries.prodNameConfirm(),
                "🧪The name of the clicked product card should match the name on the product details screen");

        Listeners.executeStep(() ->allGroceries.setAllProduct(),
                "📜Selecting a product name from the list of products.");

        Listeners.executeStep(() ->allGroceries.searchCheck(),
                "📜Searching for the item obtained from the product list");

        Listeners.executeStep(() -> homePage.enterKey(),
                "📜Press search key on the keyboard");
Thread.sleep(3000);

        Listeners.executeStep(() ->allGroceries.setFirstItem(),
                "🧪 The first name in the search results should match the item searched.");

        Listeners.executeStep(() ->allGroceries.itemClick(),
                "👆Tapping on the first item on the search list");

        Listeners.executeStep(() ->allGroceries.itemMainScreenCheck(),
                "🧪The name of the item selected from the search list should match the heading on the item’s details screen.");

        Listeners.executeStep(() ->driver.findElement(AppiumBy.xpath("//android.widget.Button[@index=2]")).click(),
                "👆Tapping on 'ADD TO ORDER' on the selected product home screen ");
    }
}
