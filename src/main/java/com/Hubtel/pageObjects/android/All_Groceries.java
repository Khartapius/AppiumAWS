package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;

public class All_Groceries extends AndroidActions {
    AndroidDriver driver;

    public All_Groceries(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
    private List<WebElement> allGroceriesProduct;

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
    private List <WebElement> elementHeading;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=4]")
    private List <WebElement> productCard;

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
            private List <WebElement> prodDetails;
    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
            private List <WebElement> itemSelectHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search\")")
            private WebElement searchbar;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\")")
            private WebElement search2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=0]")
            private List <WebElement> firstItem;

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
            private List <WebElement> itemMainPage;

    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
            private List <WebElement> allProduct;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"ADD TO ORDER\")")
            private WebElement addToOrder;

String prodName;
    String prodDetail;
public void productCardSelect(){
  prodName = productCard.get(0).getAttribute("contentDescription");
            productCard.get(0).click();
 prodDetail = prodDetails.get(0).getAttribute("contentDescription");
}

public void prodNameConfirm(){
    Assert.assertEquals(prodDetail,prodName,"🧪The name of the clicked product card should match the name on the product details screen ");
}

    String itemName;

    public void setAllProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        List<WebElement> allProd = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.className("android.widget.ImageView")));

        for (WebElement element : allProd) {
            element.click();
            try {
                WebElement addToOrderElement = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"ADD TO ORDER\")")));
                if (addToOrderElement.isDisplayed()) {
                    itemName = itemSelectHeading.get(0).getAttribute("contentDescription").replaceAll("\n", "");
                    driver.navigate().back();
                    driver.navigate().back();
                    break;
                }
            } catch (TimeoutException | NoSuchElementException e) {
                driver.navigate().back();
            }
        }
    }


    public void searchCheck(){
searchbar.click();
search2.sendKeys(itemName);

}
    String firstItName;
public void setFirstItem(){
   firstItName = firstItem.get(1).getAttribute("contentDescription").replaceAll("\n","");
    String itemNameFinal = itemName.split(" ")[0];
    Assert.assertTrue( firstItName.contains( itemNameFinal),"🧪 The first name in the search results should match the item searched.");
}
public void itemClick(){
    firstItem.get(1).click();
}

public void itemMainScreenCheck(){
    String nameCheck = itemMainPage.get(0).getAttribute("contentDescription").split(" ")[0];
   Assert.assertTrue( firstItName.contains(nameCheck),"🧪The name of the item selected from the search list should match the heading on the item’s details screen.");
}



}
