package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.beust.ah.A;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.replaceAll;

public class Events_Tickets extends AndroidActions {
    AndroidDriver driver;

    public Events_Tickets(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Event Tickets\")")
    private WebElement eventTicketClick;

    @AndroidFindBy(xpath = ("//android.widget.ImageView[@index=0]"))
    private List<WebElement> secondEventSelect;

    @AndroidFindBy(xpath = ("//android.view.View[@index=0]"))
    private List<WebElement> secondEventPriceSelect;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Event Details\")")
    private WebElement eventDetailsHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Ticket Information\")")
    private WebElement ticketInfo;

    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
    private List<WebElement> eventDetailsMsg;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"About\")")
    private WebElement aboutHeading;

    @AndroidFindBy(xpath = "//android.view.View[@index=0]")
    private List<WebElement> tickNum;

    @AndroidFindBy(xpath = "//android.widget.Button[@index=2]")
    private WebElement eventCheckOutPrice;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@index=0]")
    private List <WebElement> decreaseButton;

    public void setEventTicketClick() {
        eventTicketClick.click();
    }

    String ticketDetailsFinal;
    String ticketDetails1;

    public void getTicketDetailsSecItem() {
        //2
        ticketDetails1 = secondEventSelect.get(2).getAttribute("contentDescription");
        ticketDetailsFinal = ticketDetails1.trim().toLowerCase().replaceAll("\\s+", " ").replaceAll("[^a-z0-9 ]", "");

        System.out.println("This is wrong details " + ticketDetails1);
    }

    String eventPrice;

    public void setSecondEventPriceSelect() {
        eventPrice = secondEventPriceSelect.get(8).getAttribute("content-desc");
System.out.println("This is the price of the second item " +  eventPrice);
    }

    public void setSecondItemSelect() {
        secondEventSelect.get(2).click();
    }

    public void setAboutHeading() {
        Assert.assertTrue(aboutHeading.isDisplayed(), "🧪 Heading 'About' should be visible on Event Ticket Home Screen");
    }

    public void setEventDetailsHeading() {
        Assert.assertTrue(eventDetailsHeading.isDisplayed(), "🧪 'Event Details' heading should be visible ");
    }

    private String DetailMsg;
    String DetailMsgFinal;

    public void setEventDetailsMsg() {
        DetailMsg = eventDetailsMsg.get(8).getAttribute("contentDescription");
        DetailMsgFinal = DetailMsg.trim().toLowerCase().replaceAll("\\s+", " ").replaceAll("[^a-z0-9 ]", "");
    }

    public void eventDetailsCheck() {
        String[] TicketDetails = ticketDetailsFinal.split(" ");
        String[] DetailsMsg = DetailMsgFinal.split(" ");

        List<String> matchingParts = new ArrayList<>();
        for (String ticketpart : TicketDetails) {
            for (String msgPart : DetailsMsg) {
                if (msgPart.equals(ticketpart)) {
                    matchingParts.add(ticketpart); // Collect matching parts
                    break;
                }
            }
        }

        System.out.println("Matching parts: " + matchingParts);
        Assert.assertFalse(matchingParts.isEmpty(), "🧪 Checking if the message showing on the event dashboard can be found in event details text");
    }


    public void setTicketInfo() {
        Assert.assertTrue(ticketInfo.isDisplayed(), "🧪Heading 'Ticket Information' should be visible on event details screen");
    }

    public void plusIconClick() {


        WebElement container = driver.findElements(AppiumBy.xpath("//android.widget.ImageView[@index=0]")).get(1);

// Step 2: Get the size and position of the container
        int containerWidth = container.getSize().getWidth();
        int containerHeight = container.getSize().getHeight();
        Point containerPosition = container.getLocation();

// Step 3: Calculate the coordinates for the desired position

        //the position of x and y starts from the left corner of the container
        //the code below shifts the x position from top left to top right corner
        //the -72 move the position from the border right corner to the container inside
        int xCoordinate = containerPosition.getX() + containerWidth - 72;

        int yOffset = 78; // Adjust this value to move down from the top right corner
        int yCoordinate = containerPosition.getY() + yOffset;

// Step 4: Perform the tap action using W3C Actions
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), xCoordinate, yCoordinate))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));

    }

public void secondIncreaseButtonClick(){

    driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)")).click();
}


    String amt;

    public void EventDetailsAmount() {

       // List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]"));
        List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.view.View[@index=2]"));

// Get the last element from the list
       // WebElement lastElement = elements.get(elements.size() - 1);

        WebElement lastElement = elements.get(1);

        amt = lastElement.getAttribute("contentDescription");
        System.out.println("this is the amount" + amt);
    }

    public void ticketCompare() {
        Assert.assertTrue(amt.contains(eventPrice), "🧪 The price on the event ticket home screen should match the price on the ticket details screen.");
    }

    String result;

    public void setTickNum() {
        //getting price on the buy ticket banner
        String ticket = tickNum.get(4).getAttribute("contentDescription");
        result = ticket.replaceAll("[a-zA-Z\\s]", "");
        System.out.println("ticket info " + result);

//        int index = 0;
//        for (WebElement element : tickNum) {
//            String contentDesc = element.getAttribute("contentDescription");
//            System.out.println("Index: " + index + ", Content Description: " + contentDesc);
//            index++;
//        }


    }

    String originalPrice;

    public void ticketNumberCheckOne() {
        originalPrice = amt.replaceAll("[a-zA-Z\\s]", "").replaceAll(",", "");

        String OriginalPriceOne = ("(1)" + originalPrice);
        System.out.println("This is the original price first" + OriginalPriceOne);
        System.out.println("This is the original price " + result);
       // Assert.assertEquals(result, OriginalPriceOne, "🧪 Amount showing on the ticket should be the same as the amount for the event");
    }

    String formattedTotal;
    String ActualTicketPrice;
    public void increaseTicket() {
        ActualTicketPrice = result.replaceAll(",", "").replaceAll("\\(1\\)", "");


        double actualTicket = Double.parseDouble(ActualTicketPrice);
        double Original = Double.parseDouble(originalPrice);

        double total = (actualTicket + Original);
        formattedTotal = String.format("%.2f", total);


        System.out.println("This is the price of two ticket" + formattedTotal);
        //System.out.println("This is the price of two ticket" + originalPrice);

    }

    public void verifyingIncreaseTicket() {
        String ticketIncrease2 = tickNum.get(4).getAttribute("contentDescription");
        result = ticketIncrease2.replaceAll("[a-zA-Z\\s,]", "").replaceAll("\\(2\\)", "");
        System.out.println("ticket info " + result);
        Assert.assertEquals(result, formattedTotal, "🧪When the number of tickets increases, the price should also increase.");
    }

    public void setDecreaseButton(){
decreaseButton.get(1).click();
    }
    String  resultDecrease;
public void verifyPriceDecrease(){
    String ticketIncrease2 = tickNum.get(4).getAttribute("contentDescription");
    resultDecrease = ticketIncrease2.replaceAll("[a-zA-Z\\s,]", "").replaceAll("\\(1\\)", "");
        System.out.println("This is the actual price " +ActualTicketPrice);
    System.out.println("This is the decrease price " +result);
Assert.assertEquals( resultDecrease,ActualTicketPrice,"🧪When the price of the ticket is decreased, the total price of the ticket should also decrease");
}

    public void setEventCheckOutPrice() {
String checkOutPrice = eventCheckOutPrice.getAttribute("contentDescription").replaceAll("[A-Z,]","");

double prevPrice =Double.parseDouble(resultDecrease);
double checkPrice = Double.parseDouble(checkOutPrice);
        System.out.println("This is the checkout price " + checkPrice);
        System.out.println("This is the prev price " + prevPrice);


Assert.assertTrue(checkPrice>= prevPrice,"🧪 The price of the tickets on the checkout screen should be higher than the standard ticket price.");
    }

}
