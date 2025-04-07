package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DecimalFormat;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class All_Meals extends AndroidActions {
AndroidDriver driver;

    public All_Meals(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=3]")
    private WebElement fifth_Promo_Element;

    @AndroidFindBy(xpath = "//android.view.View[@index=1]")
    private List<WebElement> getHeading;

@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Popular meals\"]")
private WebElement PopularTabElements;


@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(12)")
private WebElement mealOptions;

@AndroidFindBy(xpath = "//android.widget.ImageView[@index=3]")
private WebElement elementUnderLocal;

@AndroidFindBy(xpath = "//android.widget.ImageView[@index=3]")
private List <WebElement> elementUnderPromo;

@AndroidFindBy(xpath = "//android.view.View[@index=1]")
private List <WebElement> changeLocation;

@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(5)")
private WebElement diffLocation;

@AndroidFindBy(xpath = "//android.view.View[@index=2]")
private List <WebElement> restaurantName;

@AndroidFindBy(xpath = "//android.view.View[@index=4]")
private WebElement initialMealPrice;

@AndroidFindBy(xpath = "//android.view.View[@index=1]")
private List <WebElement> yourOrder;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"SCHEDULE DELIVERY\")")
    private WebElement closeShop;

    @AndroidFindBy(xpath = "//*[contains(@content-desc, \"Subtotal\")]")
    private WebElement totalItemPrice;

    @AndroidFindBy(xpath = "//*[contains(@content-desc,\"Items\")]")
    private WebElement itemFromShop;

    public void scrollToQCTab() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(descriptionContains(\"Popular meals\"));"));
    }
    String  Restaurant_Name;
    String fifth_elementName;
    public void setFifth_Promo_Element(){
        fifth_elementName = fifth_Promo_Element.getAttribute("contentDescription");
System.out.println("This is the main name" + fifth_elementName);
    }

    String  MealName;
public void setPopularMealSelect(){

   List <WebElement> allElements = PopularTabElements.findElements(By.className("android.widget.ImageView"));

    try{
        if(!allElements.isEmpty()){
            Random random = new Random();
            int randomIndex = random.nextInt(allElements.size());
            WebElement randomElement = allElements.get(randomIndex);
            System.out.println("Selected Index: " + randomIndex);
         MealName = randomElement.getAttribute("contentDescription").split("\\n")[0];
          System.out.println("This is the name of the meal: " + MealName);
            randomElement.click();

        }
    }catch(NoSuchElementException | TimeoutException e){

    }

}

   String MealOptionName;
    public void setMealOptionsSelect(){

        List <WebElement> mealOptionsSelect = mealOptions.findElements(By.className("android.view.View"));

        try{
            if(!mealOptionsSelect.isEmpty()){
                Random random = new Random();
                int randomIndex = random.nextInt(mealOptionsSelect.size());
                WebElement randomElement = mealOptionsSelect.get(randomIndex);
                System.out.println("Selected Index: " + randomIndex);
                MealOptionName = randomElement.getAttribute("contentDescription").split("\\n")[0];
                System.out.println("This is the name of the meal: " +   MealOptionName);
                randomElement.click();

            }
        }catch(NoSuchElementException | TimeoutException e){

        }

    }

    public void performActions() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        while (true) {
            try {


                try {
                    WebElement orderScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")));
                    if(orderScreen.isDisplayed()){
                        break;
                    }
                }catch (NoSuchElementException | TimeoutException ignore){

                }
                // Check if the "Required" element is visible
                WebElement requiredElement = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, 'Required')]"));

                // Perform the first tap action
                //driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(2).click();
                requiredElement.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(0).click();
                // Perform the second tap action
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"ADD GHS\")")).click();

                // Check if the "View Order" element is visible
                WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"View Order\")")));

                if (viewOrder.isDisplayed()) {
                    viewOrder.click();
                    break; // Break the loop when "View Order" is found and clicked
                }
            } catch (NoSuchElementException e) {
                System.out.println("Element not found: " + e.getMessage());
                break;
            } catch (TimeoutException e) {
                System.out.println("Timeout waiting for element: " + e.getMessage());
                performActions2();
            }
        }
    }

    public void performActions2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        while (true) {
            try {
                WebElement orderScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Order\")")));

                try {

                    if(orderScreen.isDisplayed()){
                        break;
                    }
                }catch (NoSuchElementException | TimeoutException ignore){

                }
                // Check if the "Required" element is visible
                //WebElement requiredElement = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, 'Required')]"));
                WebElement requiredElement = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Required\")")).get(1);
                // Perform the first tap action
                //driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(2).click();
                requiredElement.findElements(AppiumBy.className("android.widget.ImageView")).get(0).click();
                // Perform the second tap action
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"ADD GHS\")")).click();

                // Check if the "View Order" element is visible
                WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"View Order\")")));

                if (viewOrder.isDisplayed()) {
                    viewOrder.click();
                    break; // Break the loop when "View Order" is found and clicked
                }
            } catch (NoSuchElementException e) {
                System.out.println("Element not found: " + e.getMessage());

            } catch (TimeoutException e) {
                System.out.println("Timeout waiting for element: " + e.getMessage());
break;
            }
        }
    }



public void SelectedMealName(){
   driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+MealName+"\")")).isDisplayed();
}

    String localname;
public void setElementUnderLocal(){
    localname = elementUnderLocal.getAttribute("contentDescription");
        elementUnderLocal.click();
}



    String promoElement;
public void elementUnderPromo(){
    promoElement = elementUnderPromo.get(0).getAttribute("contentDescription");
    elementUnderPromo.get(0).click();
}


    public void scrollToRecentBuys() {
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 0, "top", 0, "width", 557, "height", 705,
                "direction", "down",
                "percent", 1.0
        ));

    }

    public void swipeRecentBuysElements() {
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "startX", 532, "startY", 969,
                "endX", 532, "endY", 969,
                "direction", "left",
                "percent", 0.75
        ));
    }

    String resOriginalName;

    String iniPrice;
public void setInitialMealPrice(){
    iniPrice = initialMealPrice.getAttribute("contentDescription").replaceAll("[a-zA-Z\\s]", "");
    System.out.println("This is the initial price" + iniPrice);

}


    //String resOriginalName;
    public void AduaneClick() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        //selectRandomRestaurant();
        try {
            WebElement kenkeyClick = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mashke Smoothie\")")));
          resOriginalName  = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mashke Smoothie\")")).getAttribute("contentDescription");
            kenkeyClick.click();
        } catch (TimeoutException e) {
            try {
                WebElement kenkeyclose = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mashke Smoothie\n" +
                        "Closed. Schedule for later\")")));
                kenkeyclose.click();
            } catch (TimeoutException ex) {
                System.out.print("Element not found");
            }
        }
    }


    String  orderContent;
public void yourOrder(){
   orderContent =  yourOrder.get(2).getAttribute("contentDescription");
System.out.println( orderContent);
}

public void requiredMealSelect() {
//Testing Mashke Smoothie
driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=1]")).get(1).click();

}




    public void scrollToPopularMeals(int width1, int height1,int width2, int height2){
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        boolean scroll =true;
        while(scroll){

            try{
                wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[@content-desc=\"Popular meals\"]")));
                ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "left", 0, "top", 0, "width", width1, "height", height1,
                        "direction", "down",
                        "percent", 1.0
                ));
                break;

            }catch (NoSuchElementException | TimeoutException e){
                scroll = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                        "left", 0, "top", 0, "width", width2, "height", height2,
                        "direction", "down",
                        "percent", 1.0
                ));
            }

        }


    }


//    public void viewOrderDelete(){
//       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
//        try{
//// WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"View Order\")")));
//            WebElement confirmOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'confirm')]")));
//            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
//            WebElement ResUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Restaurant unavailable')]")));
//            WebElement itemUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Item(s) unavailable')]")));
//            if(viewOrder .isDisplayed()){
//                viewOrder.click();
//                if(ResUnavailable.isDisplayed() || itemUnavailable.isDisplayed()){
//                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
//                }else{
//                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
//                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();
//                }
//            }
//
//        }catch (org.openqa.selenium.NoSuchElementException | TimeoutException ignore){
//
//        }
//    }


    public void viewOrderDelete() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try {
            WebElement confirmOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'confirm')]")));
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
            WebElement resUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Restaurant unavailable')]")));
            WebElement itemUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Item(s) unavailable')]")));

            if (viewOrder.isDisplayed()) {
                driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")).click();
                //viewOrder.click();
                if (resUnavailable.isDisplayed() || itemUnavailable.isDisplayed()) {
                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
                } else {
                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();
                }
            }
        } catch (org.openqa.selenium.NoSuchElementException | TimeoutException e) {
            System.out.println("Element not found or timeout: " + e.getMessage());
        }
    }

    public void PurchaseCheck(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        try{
            WebElement confirmOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'confirm')]")));
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
            WebElement resUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Restaurant unavailable')]")));
            WebElement itemUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'Item(s) unavailable')]")));

            if(viewOrder.isDisplayed()){
                viewOrder.click();

                  // driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\\\"android.widget.ImageView\\\").instance(0)"))).click();
//driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=2]")).get(1).click();
                    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();


            }
        }catch (org.openqa.selenium.NoSuchElementException | TimeoutException ignore){
            //driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();
        }
    }

    public void restaurantUnavailable(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
        try{
            WebElement viewOrder = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, 'View Order')]")));
            WebElement resUnavailable = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Restaurant unavailable\")")));
            if(viewOrder.isDisplayed()){
                viewOrder.click();
                if(resUnavailable.isDisplayed()){
driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CLEAR CART\")")).click();

                }
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, Delete\")")).click();
            }
        }catch (org.openqa.selenium.NoSuchElementException | TimeoutException ignore){

        }
    }

    public void closedShop(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));

        try{
            WebElement scheduleDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"SCHEDULE DELIVERY\")")));
           // if(scheduleDelivery.isDisplayed()){
                closeShop.click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Tomorrow\")")).click();
                driver.findElements(AppiumBy.xpath("//android.view.View[@index=1]")).get(1).click();
                driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CONFIRM\")")).click();
          //  }

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException ignore){

        }

    }

    public void scheduleTap(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));

        try{
            WebElement scheduleDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"YES. SCHEDULE MY ORDER\")")));
            if(scheduleDelivery.isDisplayed()){
                scheduleDelivery.click();
            }

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException ignore){

        }

    }
    String itemPrice;
    public void AddButtonTap(){
itemPrice =  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"ADD GHS\")")).getAttribute("contentDescription").replaceAll("[A-Z]","").replaceAll("\\s","");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"ADD GHS\")")).click();
    }

public void subTotalShow(){
//        try{
//            WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(2));
//        WebElement orderSummary = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc, \"Order Summary\")]")));
//           if(orderSummary.isDisplayed()){
//              System.out.println("Subtotal is visible");
//           }else{
               ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                       "left", 0, "top", 0, "width", 565, "height", 1573,
                       "direction", "down",
                       "percent", 1.0
               ));
//           }
//
//        }catch(NoSuchElementException  | TimeoutException e){
//
//        }
}


    public void priceOnViewOrderScreen(){
//
        String price =driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"Order Summary\")]")).getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","").replaceAll("\\s","");
        System.out.println("This is the price on the order screen"+price  );
        Assert.assertEquals(price,itemPrice,"🧪The price on the Order Screen should match the price of the item selected");

    }

    public void orderTotalPrice(){

        try{
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1));
            WebElement increaseDelivery = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[contains(@content-desc,\"Increase in delivery fee due to high demand\")]")));

            if(increaseDelivery.isDisplayed()){
                String  subtotal  =totalItemPrice.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
                String  deliveryFees  =totalItemPrice.getAttribute("contentDescription").split("\\n")[6].replaceAll("[A-Z]","");
                String  Total  =totalItemPrice.getAttribute("contentDescription").split("\\n")[8].replaceAll("[A-Z]","");
                String  serviceCharge  =totalItemPrice.getAttribute("contentDescription").split("\\n")[3].replaceAll("[A-Z]","");
                System.out.println("This is the deliveryFees: " +deliveryFees);
                System.out.println("This is the subtotal: " +subtotal);
                System.out.println("This is the Total: " +Total);
                //Add
                // Convert strings to doubles
                double doubleSubtotal = Double.parseDouble(subtotal);
                double doubleDeliveryFees = Double.parseDouble(deliveryFees);
                double doubleServiceCharge = Double.parseDouble(serviceCharge);

                // Add the double values
                double total = doubleSubtotal + doubleDeliveryFees + doubleServiceCharge;
                // Format the result to two decimal places
                DecimalFormat df = new DecimalFormat("#.00");
                String formattedTotal = df.format( total);

                //Assert.assertEquals(formattedTotal,Total,"🧪");
                // Print the result
                System.out.println("Total price when delivery,service fee and subtotal is added: " + formattedTotal);


            }

        }catch(org.openqa.selenium.NoSuchElementException | TimeoutException e){

            String  subtotal  =totalItemPrice.getAttribute("contentDescription").split("\\n")[1].replaceAll("[A-Z]","");
            String  deliveryFees  =totalItemPrice.getAttribute("contentDescription").split("\\n")[5].replaceAll("[A-Z]","");
            String  Total  =totalItemPrice.getAttribute("contentDescription").split("\\n")[7].replaceAll("[A-Z]","");
            String  serviceCharge  =totalItemPrice.getAttribute("contentDescription").split("\\n")[3].replaceAll("[A-Z]","");
            System.out.println("This is the deliveryFees: " +deliveryFees);
            System.out.println("This is the subtotal: " +subtotal);
            System.out.println("This is the Total: " +Total);
            System.out.println("This is the service charge: " +serviceCharge);
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

    String ItemName;
    public void itemsFromShopSelect(){
        List <WebElement> allElements = itemFromShop.findElements(By.className("android.widget.ImageView"));

        try{
            if(!allElements.isEmpty()){
                Random random = new Random();
                int randomIndex = random.nextInt(allElements.size());
                WebElement randomElement = allElements.get(randomIndex);
                System.out.println("Selected Index: " + randomIndex);
                ItemName = randomElement.getAttribute("contentDescription").split("\\n")[0];
                System.out.println("This is the name of the meal: " +  ItemName);
                randomElement.click();

            }
        }catch(NoSuchElementException | TimeoutException e){

        }
    }
    public void shopCheck(){
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+ItemName+"\")")).isDisplayed();
    }


}
