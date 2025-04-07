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

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class profile extends AndroidActions {
AndroidDriver driver;
    public profile(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"OKAY, ADD NOW\")")
    private WebElement OKAYADD;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement numberField;

    @AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"Vodafone\"]")
    private WebElement voda;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"CONTINUE\")")
    private WebElement continueButton;
@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Okay\")")
private WebElement OkayButton;

@AndroidFindBy(uiAutomator = "//android.view.View[@content-desc=\"MTN\"]")
private WebElement mtn;

@AndroidFindBy(xpath = "//android.view.View[@index=1]")
private List<WebElement> card;

@AndroidFindBy(xpath = "//android.view.View[@index=0]")
private List <WebElement> keyDetails;

    public void scroll() {
((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 0, "top", 0, "width", 346, "height",771,
                "direction", "down",
                "percent", 1.0
        ));

    }

    public void imageClick() {
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 176,
                "y", 1589
        ));

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 131,
                "y", 819
        ));

    }
public void selectButton(){
        try{
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
            WebElement select = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.documentsui:id/action_menu_select\"]")));
      if(select.isDisplayed()){
          select.click();
      }
        }catch (NoSuchElementException | TimeoutException e){

        }

}

    LocalDate currentDate = LocalDate.now();

    // Get the day of the week
    DayOfWeek dayOfWeek = currentDate.getDayOfWeek();


    int dayOfMonth = currentDate.getDayOfMonth();

    String currentName = "QA Test_"+dayOfWeek;

public void preferredName(){
    WebElement prefName = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=4]"));
    prefName.click();
    prefName.clear();
    prefName.sendKeys("");
prefName.sendKeys(currentName);

}

String currentEmail = "joshuabroni"+dayOfMonth +"@gmail.com";
public void email(){
    WebElement emailField = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=6]"));
    emailField.click();
    emailField.clear();
    emailField.sendKeys("");
    emailField.sendKeys(currentEmail);

}

String checkname =  "QA Test_"+dayOfWeek;
public void checkName(){

   String prefName = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=4]")).getAttribute("text");
    Assert.assertEquals(prefName,checkname,"🧪The preferred name should be the current day appended to ‘QA Test’.");
}

    String checkCurrentEmail = "joshuabroni"+dayOfMonth +"@gmail.com";
public void checkEmail(){
   String emailField = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=6]")).getAttribute("text");
   Assert.assertEquals(emailField,checkCurrentEmail,"🧪 Verifying if the day of the month has been added to the email address (joshuabroni@gmail.com).");
}



    public void swipeToAccountCard() {

//        boolean cardVisible = false;
//
//        while (!cardVisible) {
//            try {
//                WebElement swipeToAcc = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GHS 0.00\n" +
//                        "Current Balance\")"));
//
//                ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//                        "elementId", ((RemoteWebElement) swipeToAcc).getId(),
//                        "direction", "left",
//                        "percent", 0.8
//                ));
//
//                if (driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index=1]")).isDisplayed()) {
//                    deleteCard();
//                }
//
//                cardVisible = driver.findElement(AppiumBy.xpath("//android.view.View[@index=1]")).isDisplayed();
//            } catch (NoSuchElementException | TimeoutException e) {
//                System.out.println("Element not found or swipe failed, retrying...");
//            }
//        }

        //new swipe
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 536, "top", 627, "width", 0, "height", 0,
                "direction", "right",
                "percent", 1.0
        ));
    }

    public void deleteCard() {

        WebElement deleteButton = driver.findElement(
                AppiumBy.androidUIAutomator("new UiSelector().description(\"Delete this wallet\")")
        );
        deleteButton.click();

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"DELETE\")")).click();

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 544,
                "y", 1344
        ));
    }

    public void mobileMoneyClick() {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        try {
            WebElement momoClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mobile Money\n" +
                    "Link your mobile money to pay for anything\")"));
            if (momoClick.isDisplayed()) {
                momoClick.click();
            }
        } catch (NoSuchElementException e) {
            try {
                WebElement fallbackMomoClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Mobile Money\n" +
                        "NOT DONE\n" +
                        "Link your mobile money to pay for anything\")"));
                fallbackMomoClick.click();
            } catch (NoSuchElementException ex) {
                System.out.println("Neither Mobile Money option is available.");
            }
        }
    }


    public void swipeToAddWallet(){
        WebElement swipeToAcc = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GHS 0.00\n" +
                "Current Balance\")"));

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) swipeToAcc).getId(),
                "direction", "left",
                "percent", 0.8
        ));
    }
    public void swipeFromSecondElement(){
        WebElement swipeToAcc = card.get(1);

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) swipeToAcc).getId(),
                "direction", "left",
                "percent", 0.8
        ));
    }

public void addWallet(String number){
driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
OKAYADD.click();
numberField.click();
numberField.sendKeys(number);

    driver.executeScript("mobile: clickGesture", ImmutableMap.of(
            "x", 408,
            "y", 771
    ));
//voda.click();
continueButton.click();
OkayButton.click();
}

    public void addWalletmtn(String number){
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click();
        OKAYADD.click();
        numberField.click();
        numberField.sendKeys(number);
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 120,
                "y", 788
        ));
       // mtn.click();
        continueButton.click();
        OkayButton.click();
    }

    public void enterPin(){
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1\")")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"2\")")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3\")")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"4\")")).click();
    }

    public void textClick() {
        String Text = "Reset PIN";
        WebElement ok = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"" + Text + "\")]"));
        Point point = ok.getLocation();
        int x = point.getX();
        int y = point.getY();

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }

    public void SecurityPIN(){
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        try {

            WebElement SecurityPinNotDone =wait.until(ExpectedConditions.visibilityOfElementLocated((AppiumBy.androidUIAutomator("new UiSelector().description(\"Optional Security PIN\n" +
                    "NOT DONE\n" +
                    "Secure your Hubtel Balance transactions by approving each one with your own secret code or pin\")"))));

            if (SecurityPinNotDone.isDisplayed()) {
                SecurityPinNotDone.click();
            }
        } catch (TimeoutException e) {
            try {
                WebElement SecurityPinDone = wait.until(ExpectedConditions.visibilityOfElementLocated((AppiumBy.androidUIAutomator("new UiSelector().description(\"Optional Security PIN\n" +
                        "Secure your Hubtel Balance transactions by approving each one with your own secret code or pin\")"))));

                SecurityPinDone.click();
            } catch (TimeoutException ex) {
                System.out.println("Neither Optional Security PIN option is available.");
            }
        }

    }


    public void createPIN(){
       // driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).click();
    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("1");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)")).sendKeys("2");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).sendKeys("3");
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)")).sendKeys("4");
    }

    public void resetPIN(){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 140,
                "y", 478
        ));
    }

    public void programmableKeys(){
try {
    WebElement programmableKeysNotDone = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Programmable Keys\n" +
            "NOT DONE\n" +
            "Share your key with a Developer to connect your account to other systems to receive money and send SMS.\")"));
    if(programmableKeysNotDone.isDisplayed()){
        programmableKeysNotDone.click();
    }

}catch(NoSuchElementException e){
    try{
        WebElement programmableKeysDone = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Programmable Keys\n" +
                "Share your key with a Developer to connect your account to other systems to receive money and send SMS.\")"));
        programmableKeysDone.click();
    }catch(NoSuchElementException ex){
        System.out.println("Neither Programmable Keys option is available.");
    }


        }

    }

    public void chooseNickname(){
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 986,
                "y", 392
        ));
    }

    public void OkayClick(){

    driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", 544,
                "y", 1344
        ));
    }
public void createAPIKeys(){

    try{
        WebElement createPin = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CREATE API KEYS\")"));
        if(createPin.isDisplayed()) {
            createPin.click();
        }
        }catch(NoSuchElementException e){
try{
WebElement RequestAPI = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"REQUEST NEW API KEY\")"));
RequestAPI.click();
}catch (NoSuchElementException ex){
    System.out.println("Neither 'CREATE API KEYS' or 'REQUEST NEW API KEY' option is available.");
}
            }



    }



    String APIKEY;
    public void KeyDetails() {
      APIKEY = keyDetails.get(9).getAttribute("contentDescription");
       System.out.println(APIKEY);
    }

    public void APIDetailsCheck(){
        Assert.assertTrue(APIKEY.contains("TESTQA"),"API Details should contain Senders NickName 'TESTQA' ");
    }

    public void DateCompare(){
        LocalDate date = LocalDate.of(2024, 9, 18);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("This is the date" + formattedDate);  // Output: 18 Sep 2024
        Assert.assertTrue(APIKEY.contains(formattedDate),"🧪API Details should contain current date");
    }

public void clientSecretCheck(){
    keyDetails.get(9).click();
}
public void clientSecret(){
  String clientsecret =   driver.findElement(AppiumBy.xpath("//android.view.View[@index=5]")).getAttribute("contentDescription");
  Assert.assertTrue(clientsecret != null && !clientsecret.isEmpty(),"🧪Verifying if clientsecret is not null or empty");
}
public void skipClick(){
        try{
WebElement skip = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Skip\")"));
skip.click();
        }catch(NoSuchElementException e){
            System.out.println("No skip button is available");
        }
}

public void backButtonClick(){
        try{
            WebElement backButton = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\")"));
            if(backButton.isDisplayed()){
                backButton.click();
            }
        }catch (NoSuchElementException e){
            System.out.println("There is no back button");
        }
}

public void deleteHeading(){
        String DeleteHeading = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Delete API Key?\")")).getAttribute("contentDescription");

        Assert.assertEquals(DeleteHeading,"Delete API Key?","🧪 Heading on the delete modal should be 'Delete API Keys' ");
}

public void uploadProfile(){
        WebElement upload =driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload from Gallery\")"));
    String imagepath = System.getProperty("user.dir") + "//reports//login.png";
    upload.sendKeys(imagepath);
}

//    public void uploadProfile() throws IOException {
//        // Push the file to the device (in a directory accessible by the app)
//        String imagePath = System.getProperty("user.dir") + "//reports//login.png";
//        driver.pushFile("/sdcard/DCIM/login.png", new File(imagePath));
//
//        // Now find the element to open gallery and trigger upload
//        WebElement upload = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload from Gallery\")"));
//        upload.click();
//
//    }

    public void dialerReturn(){
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }
    public void ClickByLocReset(String Containerxpath, int x, int y) {


        WebElement container = driver.findElement(AppiumBy.xpath(Containerxpath));

// Step 2: Get the size and position of the container
        int containerWidth = container.getSize().getWidth();
        int containerHeight = container.getSize().getHeight();
        Point containerPosition = container.getLocation();

// Step 3: Calculate the coordinates for the desired position

        //the position of x and y starts from the left corner of the container
        //the code below shifts the x position from top left to top right corner
        //the -72 move the position from the border right corner to the container inside
        int xCoordinate = containerPosition.getX() + containerWidth - x;

        int yOffset = y; // Adjust this value to move down from the top right corner
        int yCoordinate = containerPosition.getY() + yOffset;

// Step 4: Perform the tap action using W3C Actions
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), xCoordinate, yCoordinate))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));

    }


}
