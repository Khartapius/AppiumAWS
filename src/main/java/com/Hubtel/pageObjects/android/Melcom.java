package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Melcom extends AndroidActions {
    AndroidDriver driver;
    public Melcom(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(10)")
    private WebElement melcomSection;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=1]")
            private List <WebElement> melcomFeatureShop;

@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView")
        private WebElement featuredAddButton;

@AndroidFindBy(xpath = "//android.widget.ImageView[@index=1]")
        private List <WebElement> featuredShopTap;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ScrollView\")")
        private WebElement addCartElement;

@AndroidFindBy(xpath = "//*[contains(@content-desc, 'View Order')]")
        private WebElement priceOnViewOrderBCard;

@AndroidFindBy(xpath = "//android.view.View[@index=1]")
        private List <WebElement> OrderPriceConfirm;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\")")
        private WebElement horizontalScroll;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
        private WebElement categoryList;
@AndroidFindBy(xpath = "//*[contains(@content-desc, \"Subtotal\")]")
        private WebElement totalItemPrice;
@AndroidFindBy(uiAutomator = "new UiSelector().description(\"SCHEDULE DELIVERY\")")
        private WebElement closeShop;

    String ranElementName;
    String melcomBranchName;

    public void setMelcomSection(){
        WebElement getAllMelcomCont = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Melcom Plus - Kaneshie\")"));
     // int totalItems =   melcomSection.findElements(AppiumBy.className("android.widget.ImageView")).size();
        int totalItems =   getAllMelcomCont.findElements(AppiumBy.className("android.widget.ImageView")).size();
      System.out.println("This is the total number of items under Melcom " + totalItems );
       // Assert.assertEquals(totalItems,14,"🧪Verifying if the total number of items under Melcom is up to 14.");
    }
    public void melcomClick(){
        melcomBranchName = driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=1]")).get(0).getAttribute("contentDescription").split("\\n")[0];

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 457,
                "y", 457
        ));

    }

    public void swipeUntilElementVisible() {
     // WebElement swipe = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Dairy, Deli & Egg\")"));
        WebElement swipe =horizontalScroll.findElement(AppiumBy.xpath("//android.view.View[@index=1]"));
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) swipe).getId(),
                "direction", "left",
                "percent", 1.0
        ));
    }
public void melcomBeverageVerify(){
  WebElement beverage =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Beverages & Non-Alcoholic\")"));
        Assert.assertTrue(beverage.isDisplayed(),"🧪'Beverages & Non-Alcoholic' Section should be visible on melcom scroll tab");
}
    String thirdItemName;
public void melcomElementTap(){
  WebElement melcomThirdElement =   melcomSection.findElements(AppiumBy.className("android.widget.ImageView")).get(2);
  thirdItemName =  melcomThirdElement.getAttribute("contentDescription");
  melcomThirdElement.click();
}

public void verifyItemSelected(){
    String itemHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@index=1]")).getAttribute("contentDescription");
    Assert.assertEquals(itemHeading,thirdItemName,"🧪The item selected from the Hubtel home screen should match the heading on the category screen.");
}


public void selectRandomEle(){

 try{
     List  <WebElement> allMelcomElement = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ScrollView\")")).findElements(AppiumBy.className("android.widget.ScrollView"));

     if(!allMelcomElement.isEmpty()){
         Random random = new Random();
         int melcomRandom = random.nextInt(allMelcomElement.size());
      WebElement   ranSelectedElement = allMelcomElement.get(melcomRandom);
         ranSelectedElement.findElement(AppiumBy.className("android.widget.ImageView")).click();

     }

 }catch (NoSuchElementException e){

 }
}

//public void elementClick(){
//    ranSelectedElement.click();
//    System.out.println("This is the item price " + ranElementName);
//}

public void itemDetailVerification(){
    String elementDetailMelcomName = driver.findElements(AppiumBy.xpath("//android.view.View[@index=1]")).get(0).getAttribute("contentDescription");
  Assert.assertEquals(melcomBranchName,elementDetailMelcomName,"🧪The Melcom branch name on the selected element detail screen should match the branch name previously displayed on the Hubtel home screen.");
}

public void locationPop(){
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
    try{
        WebElement popUp = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Your current location seems a bit far from your delivery location.\n" +
                "Dismiss\")")));

        if(popUp.isDisplayed()){
            popUp.click();
        }
    }catch (NoSuchElementException | TimeoutException ignore){

    }
}
    String featuredShopDesc;
public void melcomFeaturedShop(){

  featuredShopDesc = melcomFeatureShop.get(1).getAttribute("contentDescription");
    String featuredShopName = featuredShopDesc.split("\\n")[0];

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));

    try{

WebElement featuredStoreClose = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"Closed \uD81A\uDDF9 Opens 9:00 AM today\n" +
        "SCHEDULE FOR LATER\"]")));
if(featuredStoreClose.isDisplayed()){
    System.out.println("The shop is closed");
}


    }catch (TimeoutException | NoSuchElementException e){
        Assert.assertTrue(featuredShopName.matches("Featured Shop"),"🧪'Featured Shop' section should be visible on All Groceries Home Page");
System.out.println("Store is not closed " );
    }
}

public void melcomBranchName(){
    String branchName = featuredShopDesc.split("\\n")[1];

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
    try{
        WebElement featuredStoreClose = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"Closed \uD81A\uDDF9 Opens 9:00 AM today\n" +
                "SCHEDULE FOR LATER\"]")));
        if(featuredStoreClose.isDisplayed()){
            System.out.println("The shop is closed");
        }

    }catch (TimeoutException | NoSuchElementException e){
        Assert.assertEquals(branchName,melcomBranchName,"🧪Verify Melcom Branch name on All Groceries Home Screen");
    }
}

public void addButtonFeaturedShop(){

}

public void scheduleOrder(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
    try{
        WebElement schedule = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"YES. SCHEDULE MY ORDER\")")));
        if( schedule.isDisplayed()){
schedule.click();
        }
    }catch(NoSuchElementException |TimeoutException ignore){

    }

}

public void setFeaturedAddButton(){
    List <WebElement> addButton = featuredAddButton.findElements(AppiumBy.className("android.widget.ImageView"));
    if(!addButton.isEmpty()){
        //select random element
        Random random = new Random();
        int itemSelect = random.nextInt(addButton.size());
        WebElement elementSelect = addButton.get(itemSelect);
     Assert.assertTrue(elementSelect.findElement(AppiumBy.className("android.widget.Button")).isDisplayed());
    }
}

public void setFeaturedShopTap(){

    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
    try{
        WebElement featuredStoreClose = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"Closed \uD81A\uDDF9 Opens 9:00 AM today\n" +
                "SCHEDULE FOR LATER\"]")));
        if(featuredStoreClose.isDisplayed()){
            featuredStoreClose.click();
        }

    }catch (TimeoutException | NoSuchElementException e){
        featuredShopTap.get(1).click();
    }

}
    String addCartElementSelectDesc;
String  addCartElementSelectPrice;
String  addCartElementSelectDescFull;
    String contentDesc;
    String addCartElementSelectPriceGHS;
public void AddButtonCheck(){
WebElement addCartElementSelect = addCartElement.findElements(AppiumBy.className("android.widget.ImageView")).get(2);

 addCartElementSelectDesc = addCartElementSelect.getAttribute("contentDescription").split("\\n")[0];
  contentDesc =addCartElementSelect.getAttribute("contentDescription");
 addCartElementSelectPrice = addCartElementSelect.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s+", "");
    addCartElementSelectPriceGHS = addCartElementSelect.getAttribute("contentDescription").split("\\n")[1];
System.out.println("This is the contentdesc : " + contentDesc);
System.out.println("This is the Price : " +  addCartElementSelectPrice);

}
    double priceIncrease;
public void increaseItemConfirm(){

String viewOrderPriceAdd = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z:]", "").replaceAll("\\s","");
    priceIncrease =Double.parseDouble(addCartElementSelectPrice);
    double total = priceIncrease + priceIncrease;
 String   formattedTotal = String.format("%.2f", total);
 Assert.assertEquals(formattedTotal,viewOrderPriceAdd,"🧪The price of the selected item should double when the increase button is tapped.");
 System.out.println("This is the total price " + formattedTotal);
}

public void decreaseItemConfirm(){
    String priceInc = String.format("%.2f",priceIncrease);
    Assert.assertEquals(  priceInc,viewOrderPrice,"🧪The price of the selected item should decrease when the decrease button is tapped.");

}
    String convertWord;
public void searchItem(){
   convertWord = addCartElementSelectDesc.toUpperCase();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).sendKeys(convertWord);
}

    WebElement itemCheck;
public void searchItemVisibility(){
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
    String contentDesUpper = contentDesc.toUpperCase();

try{
   // itemCheck = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+contentDesUpper+"\")"));
    itemCheck =  wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\""+contentDesUpper+"\")")));
    Assert.assertTrue(itemCheck.isDisplayed(),"🧪Searched item should be visible ");
}catch (NoSuchElementException | TimeoutException e){
    itemCheck = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+contentDesc+"\")"));
    Assert.assertTrue(itemCheck.isDisplayed(),"🧪Searched item should be visible ");
}
}

    public void searchItemVisibilityDetail(){
      String contDesc = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]")).get(5).getAttribute("contentDescription").split("\\n")[0];
        //itemCheck = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+contentDesc+"\")"));
        System.out.println("This is the final desc " + contDesc);
        //Assert.assertEquals(addCartElementSelectDesc,contDesc,"🧪Searched item should be visible ");
    }

public void tapSearchedItem(){
    itemCheck.click();
}

public void AddButtonFunc(){
   // itemCheck.findElement(AppiumBy.className("android.widget.Button")).click();
    driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).click();
}

    String viewOrderPrice;
    public void priceCompare(){
        String removeText = addCartElementSelectPriceGHS.replaceAll("[A-Z]","").replaceAll("\\s","");
//viewOrderPrice =priceOnViewOrderBCard.getAttribute("contentDescription").split("\\n")[0].replaceAll("[A-Z:]", "").replaceAll("\\s+", "");
viewOrderPrice = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z]","").replaceAll("\\s","");
    Assert.assertEquals(viewOrderPrice,removeText,"🧪The item’s price should match the price displayed on the ‘View Order’ button.");
}

public void viewOrderClick(){
    priceOnViewOrderBCard.click();
}

public void priceOnViewOrderScreen(){
//
     String price =driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"Order Summary\")]")).getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s","");
System.out.println("This is the price on the order screen"+price  );
   Assert.assertEquals(price,addCartElementSelectPrice,"🧪The price on the Order Screen should match the price of the item selected");

}

public void roundUpCheck(){

}

public void orderTotalPrice(){

      try{
          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
          WebElement increaseDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc,\"Increase in delivery fee due to high demand\")]")));

          if(increaseDelivery.isDisplayed()){
              String  subtotal  =totalItemPrice.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
              String  deliveryFees  =totalItemPrice.getAttribute("contentDescription").split("\\n")[4].replaceAll("[A-Z]","");
              String  Total  =totalItemPrice.getAttribute("contentDescription").split("\\n")[6].replaceAll("[A-Z]","");
              System.out.println("This is the deliveryFees: " +deliveryFees);
              System.out.println("This is the subtotal: " +subtotal);
              System.out.println("This is the Total: " +Total);
              //Add
              // Convert strings to doubles
              double doubleSubtotal = Double.parseDouble(subtotal);
              double doubleDeliveryFees = Double.parseDouble(deliveryFees);

              // Add the double values
              double total = doubleSubtotal + doubleDeliveryFees;
              // Format the result to two decimal places
              DecimalFormat df = new DecimalFormat("#.00");
              String formattedTotal = df.format( total);

              //Assert.assertEquals(formattedTotal,Total,"🧪");
              // Print the result
              System.out.println("Total price when delivery and subtotal is added: " + formattedTotal);


          }

      }catch(NoSuchElementException | TimeoutException e){

          String  subtotal  =totalItemPrice.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
          String  deliveryFees  =totalItemPrice.getAttribute("contentDescription").split("\\n")[3].replaceAll("[A-Z]","");
          String  Total  =totalItemPrice.getAttribute("contentDescription").split("\\n")[5].replaceAll("[A-Z]","");
          System.out.println("This is the deliveryFees: " +deliveryFees);
          System.out.println("This is the subtotal: " +subtotal);
          System.out.println("This is the Total: " +Total);
          //Add
          // Convert strings to doubles
          double doubleSubtotal = Double.parseDouble(subtotal);
          double doubleDeliveryFees = Double.parseDouble(deliveryFees);

          // Add the double values
          double total = doubleSubtotal + doubleDeliveryFees;
          // Format the result to two decimal places
          DecimalFormat df = new DecimalFormat("#.00");
          String formattedTotal = df.format( total);

          //Assert.assertEquals(formattedTotal,Total,"🧪");
          // Print the result
          System.out.println("Total price when delivery and subtotal is added: " + formattedTotal);

      }

}

public void closedShop(){
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));

try{
WebElement scheduleDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"SCHEDULE DELIVERY\")")));
if(scheduleDelivery.isDisplayed()){
    closeShop.click();
driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Tomorrow\")")).click();
    driver.findElements(AppiumBy.xpath("//android.view.View[@index=1]")).get(1).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONFIRM\")")).click();
}

}catch(NoSuchElementException | TimeoutException ignore){

}

}

    public void secondElementDelete(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));

        try{
            WebElement emptyOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"You don't have any orders at this time\")")));
            emptyOrder.isDisplayed();
        }catch (NoSuchElementException | TimeoutException e){
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Remove\")")).click();
        }
    }


    public void selectRandomElement(){
 List<WebElement> productsCategory = categoryList.findElements(AppiumBy.className("android.view.View"));
        try{
            if(!productsCategory.isEmpty()){
                Random random = new Random();
                int randomIndex = random.nextInt(productsCategory.size());
                WebElement randomElement = productsCategory.get(randomIndex);
                System.out.println("Selected Index: " + randomIndex);
                randomElement.click();

            }
        }catch(java.util.NoSuchElementException | TimeoutException e){

        }
    }

//first quick Add button check
String  contDescPrice;
    WebElement selectedEle;
    public void quickAddFirst(){
       selectedEle = driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=1]")).get(0);
 contDescPrice = driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=1]")).get(0).getAttribute("contentDescription").split("\\n")[1];
        selectedEle.findElement(AppiumBy.className("android.widget.Button")).click();
    }

    public void viewOrderDesc(){
String price = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=6]")).getAttribute("contentDescription").split("\\n")[2];
Assert.assertEquals(price,contDescPrice,"🧪Price on the selected item should match the price on the view order banner");
    }

    public void deleteButton(){
        selectedEle.findElements(AppiumBy.className("android.widget.ImageView")).get(1).click();
    }
    public void viewOrderCheck(){
        WebElement viewOrder =  driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=6]"));
        Assert.assertFalse(viewOrder.isDisplayed(),"🧪View order button shouldn't be visible after deleting the order");
    }

    public void viewOrderDelete(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        try{
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
            if(viewOrder.isDisplayed()){
                viewOrder.click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
            }
        }catch (NoSuchElementException | TimeoutException ignore){

        }
    }

    public void viewOrderDeleteAfterCheckout(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        try{
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
            WebElement itemUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Item(s) unavailable')]")));
            if(itemUnavailable.isDisplayed()){
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
            }
            if(viewOrder.isDisplayed()){
                viewOrder.click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();
            }
        }catch (NoSuchElementException | TimeoutException ignore){

        }
    }

}
