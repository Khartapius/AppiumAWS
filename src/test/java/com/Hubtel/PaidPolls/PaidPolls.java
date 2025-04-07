package com.Hubtel.PaidPolls;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class PaidPolls extends AndroidBaseTest {

    @Test
    public void paidPolls() throws InterruptedException {
        reusecodes UnifiedCheckout = new reusecodes(driver);
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();

        Listeners.executeStep(() -> paidPoll.setPaidPollClick(),
                "👆Tapping on Paid Poll card on hubtel home screen");

        Listeners.executeStep(() -> paidPoll.setPaidPollHeading(),
                "🧪Paid Poll heading should be visible on Paid Poll home screen");

        Listeners.executeStep(() ->paidPoll.selectRandomElement(),
                "📜Randomly select one paid poll element and store it name.");

        Listeners.executeStep(() ->paidPoll.paidPollCompare(),
                "🧪The name of the paid poll selected should match the description on that paid poll details screen");

        Listeners.executeStep(() ->paidPoll.continueSession(),
                "📜 If continue session is visible, tap on 'NO' button ");

        Listeners.executeStep(() ->paidPoll.paidPollCompare(),
                "🧪The name of the paid poll selected should match the description on that paid poll details screen");

        Listeners.executeStep(() ->paidPoll.selectCategory(),
                "📜If select category is visible select the first option");

        Listeners.executeStep(() ->paidPoll.paidPollCompare(),
                "🧪The name of the paid poll selected should match the description on that paid poll details screen");

        Listeners.executeStep(() ->paidPoll.selectNominee(),
                "📜Select first option on select Nominee screen ");


        Listeners.executeStep(() ->paidPoll.notNominee(),
                "📜If this error message 'Error Sorry, not a nominee Okay' is visible,tap on back button and select different paid poll");

        Listeners.executeStep(() ->paidPoll.paidPollCompare(),
                "🧪The name of the paid poll selected should match the description on that paid poll details screen");

        Listeners.executeStep(() ->paidPoll.setSelectHundredVotes(),
                "📜Selecting 100 votes option on select number of votes screen ");

        Listeners.executeStep(() ->paidPoll.paidPollCompare(),
                "🧪The name of the paid poll selected should match the description on that paid poll details screen");

        Listeners.executeStep(() ->paidPoll.tapConfirmButton(),
                "👆Tapping on confirm button on voting summary screen");
        Thread.sleep(2000);

        //Checking for checkout feature
        Listeners.logTestStart("📜Unified Checkout Test");

        UnifiedCheckout.checkout();
    }
}