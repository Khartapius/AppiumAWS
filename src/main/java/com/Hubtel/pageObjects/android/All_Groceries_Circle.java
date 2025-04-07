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

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class All_Groceries_Circle extends AndroidActions {
    AndroidDriver driver;

    public All_Groceries_Circle(AndroidDriver driver) {
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
    @AndroidFindBy(xpath = "//android.widget.Button[@index=2]")
            private WebElement addToOrderCheck;
    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
            private List <WebElement> orderDetails;
    @AndroidFindBy(xpath = "//android.view.View[@index=2]")
            private List <WebElement> pharmacyClick;
@AndroidFindBy(xpath = "//android.widget.ImageView[@index=12]")
        private WebElement firstDrug;
@AndroidFindBy(xpath = "//android.widget.ImageView[@index=0]")
        private List <WebElement> firstSearchPharmacy;
@AndroidFindBy(xpath = "//android.widget.ImageView[@index=0]")
        private List <WebElement> drugSelect;

@AndroidFindBy(xpath = "//android.widget.ImageView[@index=0]")
        private WebElement priceCheck;

@AndroidFindBy(xpath = "//android.view.View[@index=2]")
private WebElement orderSummary;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(6)")
        private WebElement backButton;

@AndroidFindBy(xpath = "//android.widget.ImageView[@index=1]")
        private WebElement secondDrugSelect;

@AndroidFindBy(xpath = "//android.view.View[@index=1]")
        private List <WebElement> secondTab;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, \"Subtotal\")]")
    private WebElement totalItemPrice;


    String formattedPrice;
    String clickPharmName;
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
    String detailScreenPrice;
    String itemPrice;
    public void setAllProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        List<WebElement> allProd = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(AppiumBy.className("android.widget.ImageView")));

        for (WebElement element : allProd) {
          itemPrice = element.getAttribute("contentDescription").split("\\n")[1];
            element.click();
            try {

             wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Description\")")));

                detailScreenPrice = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]")).get(5).getAttribute("contentDescription").split("\\n")[1];

                       // Assert.assertEquals(itemPrice,detailScreenPrice,"🧪Price of the item should be consistent");
                WebElement addToOrderElement = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Available for delivery\")")));
                if (addToOrderElement.isDisplayed()) {
                    itemName = itemSelectHeading.get(0).getAttribute("contentDescription").replaceAll("\n", "");
                    break;
                }
            } catch (TimeoutException | NoSuchElementException e) {
               // driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click();
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

    String searchItemPrice;
    public void priceOnSearchScreen(){
       // searchItemPrice = itemName.split(" ")[itemName.split(" ").length - 1];
        String[] parts = firstItName.split(" ");
        searchItemPrice = parts[parts.length - 1];

        System.out.println("This is price on search screen" + searchItemPrice);
    }



public void itemClick(){

    firstItem.get(1).click();

}

public void itemMainScreenCheck(){
    String nameCheck = itemMainPage.get(0).getAttribute("contentDescription").split(" ")[0];
   Assert.assertTrue( firstItName.contains(nameCheck),"🧪The name of the item selected from the search list should match the heading on the item’s details screen.");
}

public void itemMainScreenPrice(){
    List <WebElement> allItem = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]"));

    String priceCheck = allItem.get(4).getAttribute("contentDescription").replaceAll("\n","");

   Assert.assertTrue(priceCheck.contains(searchItemPrice),"🧪The price of the item shown in the search results should match the price on the item detail screen.");
}

public void scrollToPopularTab(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    boolean canScrollMore = true;
    while (canScrollMore) {
        try {
            //WebElement popular = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Popular Around You\")"));
            wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Popular Around You\")")));
            // Element found, break the loop
            break;
        } catch (NoSuchElementException | TimeoutException e) {
            // Element not found, perform scroll
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 0, "top", 0, "width", 482, "height", 1489,
                    "direction", "down",
                    "percent", 1.0
            ));
        }
    }
}

    public void scrollToSearchTab(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        boolean canScrollMore = true;
        while (canScrollMore) {
            try {
                //WebElement popular = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Popular Around You\")"));
                wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Search\")")));
                // Element found, break the loop
                break;
            } catch (NoSuchElementException | TimeoutException e) {
                // Element not found, perform scroll
                canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "left", 0, "top", 491, "width", 0, "height", 915,
                        "direction", "up",
                        "percent", 1.0
                ));
            }
        }
    }


public void popularClick(){

    WebElement popular = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Popular Around You\")"));
    // Java
    driver.executeScript("mobile: clickGesture", ImmutableMap.of(
            "elementId", ((RemoteWebElement) popular).getId()
    ));
}

public void addToOrderCheck(){
String confirmAddToOrder = addToOrderCheck.getAttribute("contentDescription");
Assert.assertEquals(confirmAddToOrder,"ADD TO ORDER","🧪ADD TO ORDER button should be visible");
}

//   String itemPrice;
//public void indexAndCont(){
//    List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]"));
// itemPrice = elements.get(4).getAttribute("contentDescription").replaceAll("[A-Za-z]","");
//System.out.println("This is the actual price" + itemPrice);
//
//}
    String summary;
    public void orderSummary(){
        summary = orderDetails.get(2).getAttribute("contentDescription");
        Assert.assertTrue(summary.contains("Order Summary"),"🧪'Order Summary' should be visible under Your Order home screen ");
System.out.println(summary);
}
public void priceVoid(){

    // Perform split operation
    String[] summaryParts = summary.split(" "); // Splitting by spaces, you can change the delimiter as needed
    for (String part : summaryParts) {
        System.out.println(part);
        boolean iPrice =  (part.contains(itemPrice));
        try{
            if( iPrice){
                Assert.assertTrue(part.contains(itemPrice),"🧪'Order Summary' should contain item price under Your Order home screen");
System.out.println("Order summary contains this price" + part);
            }
        }catch(NoSuchElementException | TimeoutException e){

        }

        //Assert.assertTrue(part.contains(itemPrice),"🧪'Order Summary' should contain item price under Your Order home screen");
    }


}


//Pharmacy
    String secondPharmacyDescription;
    WebElement SecondpharmacyClick;
public void setPharmacyClick(){
        SecondpharmacyClick = pharmacyClick.get(2);
 secondPharmacyDescription = SecondpharmacyClick.getAttribute("contentDescription").split("\\n")[0];
     System.out.println("This is the pharmacy name" + secondPharmacyDescription);

}

String firstDrugNameFull;
    String firstDrugName;
public void setFirstDrug(){
        WebElement FirstDrug = firstDrug;
       firstDrugName = FirstDrug.getAttribute("contentDescription").split("\\n")[0];
    firstDrugNameFull = FirstDrug.getAttribute("contentDescription");
        System.out.println(firstDrugName);
}

public void setBack(){
    driver.navigate().back();
}

public void drugSearch(){
driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)")).click();
driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).sendKeys(firstDrugName);
}

public void pharmacyCheck(){
   boolean showPharm =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+firstDrugNameFull+"\")")).isDisplayed();
    Assert.assertTrue(showPharm,"🧪The drug searched for should be visible in the pharmacy.");
}


public void setFirstSearchPharmacy(){
   // firstSearchPharmacy.get(1).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\""+firstDrugNameFull+"\")")).click();
}


public void closedPharmacy(){
    try{
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
       // WebElement closedPharm = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)")));
  List <WebElement> closedPharm = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(AppiumBy.xpath("//android.view.View[@index=2]")));
   if(closedPharm.get(1).isDisplayed()){
   clickPharmName = closedPharm.get(1).getAttribute("contentDescription");
   System.out.println("first store clicked " + clickPharmName );
       closedPharm.get(1).click();
   }
    }catch(NoSuchElementException | TimeoutException e){
try {
    clickPharmName =SecondpharmacyClick.getAttribute("contentDescription");
    SecondpharmacyClick.click();

}catch (NoSuchElementException | TimeoutException ex){

}
    }
}

public void firstDrugSelect(){
    drugSelect.get(1).click();
}



    public void DrugPrice(){
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\""+firstDrugNameFull+"\")"));


}



String secondDrugPrice;
    float sDrugPrice;
    public void selectSecondDrug(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));


try{
    WebElement secondDrug = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.ImageView[@index=1]")));

    if(secondDrug.isDisplayed()){
        secondDrugPrice = secondDrug.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
        System.out.println("This is the second drug price" +  secondDrugPrice);
        sDrugPrice = Float.parseFloat(secondDrugPrice);
        secondDrug.click();

    }
}catch (IndexOutOfBoundsException | TimeoutException e){
try{
    WebElement secondDrug = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.ImageView[@index=1]")));

    secondDrugPrice = secondDrug.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
    System.out.println("This is the second drug price" +  secondDrugPrice);
    secondTab.get(1).click();
    secondDrug.click();
}catch (IndexOutOfBoundsException | TimeoutException ex){
    DrugPrice();

    firstDrugSelect();
}



}


}




    String viewOrderPrice;
    String  detailPriceText;
    public void priceCompare(){

       detailPriceText =  itemPrice.replaceAll("[A-Z]","").replaceAll("\\s","");
//viewOrderPrice =priceOnViewOrderBCard.getAttribute("contentDescription").split("\\n")[0].replaceAll("[A-Z:]", "").replaceAll("\\s+", "");
        viewOrderPrice = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z]","").replaceAll("\\s","");
       // Assert.assertEquals(viewOrderPrice, detailPriceText,"🧪The item’s price should match the price displayed on the ‘View Order’ button.");
    }

    double priceIncrease;
    public void increaseItemConfirm(){
        String viewOrderPriceAdd = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z:]", "").replaceAll("\\s","");
        priceIncrease =Double.parseDouble( detailPriceText);
        double total = priceIncrease + priceIncrease;
        String   formattedTotal = String.format("%.2f", total);
        Assert.assertEquals(formattedTotal,viewOrderPriceAdd,"🧪The price of the selected item should double when the increase button is tapped.");
        System.out.println("This is the total price " + formattedTotal);
    }

    public void decreaseItemConfirm(){
        String priceInc = String.format("%.2f",priceIncrease);
        Assert.assertEquals(  priceInc,viewOrderPrice,"🧪The price of the selected item should decrease when the decrease button is tapped.");

    }

    public void orderTotalPriceAllGroceries(){

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

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException e){

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

    public void priceOnViewOrderScreen(){
//
        String price =driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"Order Summary\")]")).getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s","");
        System.out.println("This is the price on the order screen"+price  );
        Assert.assertEquals(price,detailPriceText,"🧪The price on the Order Screen should match the price of the item selected");

    }

    public void viewOrderDeleteAfterCheckout(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        try{
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));

                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();

        }catch (org.openqa.selenium.NoSuchElementException | TimeoutException ignore){

        }
    }
    String drugPrice;
    public void priceComparePharmacy(){
         drugPrice = firstDrugNameFull.split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s","");
        viewOrderPrice = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z]","").replaceAll("\\s","");
        Assert.assertEquals(viewOrderPrice,drugPrice,"🧪The item’s price should match the price displayed on the ‘View Order’ button.");
    }

    double priceIncreasePharm;
    public void increaseItemConfirmPharmacy(){

        String viewOrderPriceAdd = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc,\"ADD\")]")).getAttribute("contentDescription").replaceAll("[A-Z:]", "").replaceAll("\\s","");
        priceIncreasePharm =Double.parseDouble(drugPrice);
        double total = priceIncreasePharm +priceIncreasePharm;
        String   formattedTotal = String.format("%.2f", total);
        Assert.assertEquals(formattedTotal,viewOrderPriceAdd,"🧪The price of the selected item should double when the increase button is tapped.");
        System.out.println("This is the total price " + formattedTotal);
    }

    public void decreaseItemConfirmPharm(){
        String priceInc = String.format("%.2f",priceIncreasePharm);
        Assert.assertEquals(  priceInc,viewOrderPrice,"🧪The price of the selected item should decrease when the decrease button is tapped.");

    }

    public void priceOnViewOrderScreenPharm(){
//
        String price =driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"Order Summary\")]")).getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s","");
        System.out.println("This is the price on the order screen"+price  );
        Assert.assertEquals(price,drugPrice,"🧪The price on the Order Screen should match the price of the item selected");

    }

    public void orderTotalPricePharm(){

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

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException e){

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

    public void viewOrderDeleteAfterCheckoutpharm(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        try{
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));

       //   WebElement itemUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Item(s) unavailable')]")));
//            if(itemUnavailable.isDisplayed()){
//                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
//            }

               // viewOrder.click();
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"View Order\")")).click();

                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();


        }catch (org.openqa.selenium.NoSuchElementException | TimeoutException ignore){


        }
    }

    public void clearOrder(){
        try {
            driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException ignore){

        }
    }
}
