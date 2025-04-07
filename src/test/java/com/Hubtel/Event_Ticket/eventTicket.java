package com.Hubtel.Event_Ticket;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class eventTicket extends AndroidBaseTest {

    @Test
    public void EventTicket() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();

        Listeners.executeStep(() -> eventTicket.setEventTicketClick(),
                "👆Tapping on event ticket card on the Hubtel home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Events\")")).isDisplayed(),
                "🧪Heading 'Events' should be visible ");

        Thread.sleep(5000);

        Listeners.executeStep(() -> eventTicket.getTicketDetailsSecItem(),
                "📜Getting details of the second event on  Event Ticket home screen");

        Listeners.executeStep(() -> eventTicket.setSecondEventPriceSelect(),
                "📜Getting price of the second event on  Event Ticket home screen");

        Listeners.executeStep(() -> eventTicket.setSecondItemSelect(),
                "👆Tapping on second Event ticket on Event Ticket Screen");
        Thread.sleep(3000);
        Listeners.executeStep(() -> eventTicket.setEventDetailsHeading(),
                "🧪 'Event Details' heading should be visible ");

        Listeners.executeStep(() -> eventTicket.setEventDetailsMsg(),
                "📜 Storing event detail message");

        Listeners.executeStep(() -> eventTicket.eventDetailsCheck(),
                "🧪 Checking if the message showing on the event dashboard can be found in event details text");

        Listeners.executeStep(() -> eventTicket.setTicketInfo(),
                "🧪 Heading 'Ticket' should be visible on Event Ticket Home Screen");


        Listeners.executeStep(() -> eventTicket.setAboutHeading(),
                "🧪 Heading 'About' should be visible on Event Ticket Home Screen");

        Thread.sleep(1000);
        Listeners.executeStep(() -> eventTicket.plusIconClick(),
                "👆Tapping the increase icon to raise the number of tickets on the event details screen");

        Listeners.executeStep(() -> eventTicket.EventDetailsAmount(),
                "📜 Storing the amount on the event details screen");


        Listeners.executeStep(() -> eventTicket.setTickNum(),
                "📜 Getting number of tickets and price ");

        Listeners.executeStep(() -> eventTicket.ticketNumberCheckOne(),
                "📜 Getting number of tickets and price for one ticket");

        Listeners.executeStep(() -> eventTicket.secondIncreaseButtonClick(),
                "👆Tapping the increase icon to raise the number of tickets on the event details screen to two");

        Listeners.executeStep(() -> eventTicket.increaseTicket(),
                "🧪 Verifying the price of two tickets");


        Listeners.executeStep(() -> eventTicket.verifyingIncreaseTicket(),
                "🧪When the number of tickets increases, the price should also increase.");

        Listeners.executeStep(() ->eventTicket.setDecreaseButton(),
                "👆Tapping on decrease button on event details screen");
        Thread.sleep(1000);
        Listeners.executeStep(() ->eventTicket.verifyPriceDecrease(),
                "🧪When the price of the ticket is decreased, the total price of the ticket should also decrease");

        Listeners.executeStep(() -> eventTicket.plusIconClick(),
                "👆Tapping the increase icon to raise the number of tickets on the event details screen to two");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"BUY TICKETS\")")).click(),
                "👆Tapping on BUY TICKETS button on event details screen");
        Thread.sleep(2000);

        Listeners.executeStep(() -> eventTicket.setEventCheckOutPrice(),
                "🧪 The price of the tickets on the checkout screen should be higher than the standard ticket price. ");

        //Checking for checkout feature
        UnifiedCheckout.checkout();
    }
}
