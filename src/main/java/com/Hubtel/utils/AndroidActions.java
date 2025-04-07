package com.Hubtel.utils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class AndroidActions extends AppiumUtils {
    AndroidDriver driver;

    public AndroidActions(AndroidDriver driver)
    {

        this.driver = driver;
    }

    public void CorOrdinateClick(int x, int y) {
        x = 0;
        y = 0;
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }

    //the default value for speed is 5000 * displayDensity
    //percentage =1
    public void swipeByElementAction(WebElement element , String direction,int speed,double percentage) {

        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) element).getId(),
                "direction", direction,
                "percent", percentage,
                "speed",speed
        ));

    }


    public void scrollToEndAction() {
        boolean canScrollMore;

        do {
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", "down",
                    "percent", 3.0
            ));
        } while (canScrollMore);
    }


    public void homebuttonpress() {
        driver.pressKey(new KeyEvent().withKey(AndroidKey.HOME));
    }

    public void SearchButton() {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    public void scrollToElementUi() {
        int index = 0;
        String className = "className";

        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().className(\"" + className + "\").index(" + index + "))"));
    }

    public void searchkey() {
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    public void textClick() {
        String Text = "";
        WebElement ok = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, \"" + Text + "\")]"));
        Point point = ok.getLocation();
        int x = point.getX();
        int y = point.getY();

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));

    }

    public void scroll(int width, int height,int left,int top,String direction) {
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", left, "top", top, "width", width, "height", height,
                "direction", direction,
                "percent", 1.0
        ));

    }

    //index and content description
    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
    private List<WebElement> name;

    public void DescAndIndex() {


        int index = 0;
        for (WebElement element : name) {
            String contentDesc = element.getAttribute("contentDescription");
            System.out.println("Index: " + index + ", Content Description: " + contentDesc);
            index++;
        }


    }
    public void ClickByLoc(String Containerxpath, int x, int y) {


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

    public void scrollToElement(String UiText,int width1, int height1,int width2, int height2){
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        boolean scroll =true;
        while(scroll){

            try{
             wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\""+UiText+"\")")));
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

    public void swipeUntilElementVisible() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.90); // Starting from the right
        int endX = (int) (size.width * 0.20); // Ending at the left
        int startY = (int) (size.height * 0.23); // Y-coordinate towards the top
        int endY = startY; // Ending Y-coordinate remains the same for a horizontal swipe

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

            // Create the swipe action
            Sequence swipe = new Sequence(finger, 1)
                    .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            // Perform the swipe
            driver.perform(Collections.singletonList(swipe));

    }
}
