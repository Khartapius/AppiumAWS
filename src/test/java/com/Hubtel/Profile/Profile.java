package com.Hubtel.Profile;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;

public class Profile extends AndroidBaseTest {

    @Test
    public void Profile() throws InterruptedException {

        Listeners.logTestStart("🔎Verify the functionality of User Profile");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)")).click(),
                "👆Tap on Profile icon on hubtel home screen");

            Listeners.logTestStart("🔎Check the availability of the account details");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Profile\")")).isDisplayed(),
                "🧪 Heading 'Profile' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Joshua  Broni\n" +
                        "233539938805\n" +
                        "\")")).isDisplayed(),
                "🧪 Account name and contact should be visible on account screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Pay Small Small\")")).isDisplayed(),
                "🧪'Pay Small Small' option should be visible on account screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Get Help\")")).isDisplayed(),
                    "🧪 'Get Help' option should be visible on Profile screen ");

            Listeners.logTestStart("🔎Check the functionality of 'Hubtel Balance'");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Hubtel Balance\")")).click(),
                    "👆Tap on Hubtel balance option on profile screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Hubtel Balance Statement\")")).isDisplayed(),
                    "🧪 'Hubtel Balance Statement' should be visible on Transaction screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"No transactions found\")")).isDisplayed(),
                    "🧪'No transactions found' should be visible on Transaction screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                    "👆Tap on back button on Transaction screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Get Help\")")).click(),
                    "👆Tap on 'Get Help' option on Profile screen ");

            Listeners.logTestStart("🔎Check the functionality of 'Get Help'");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Get Help\")")).isDisplayed(),
                    "🧪 Heading 'Get Help' should be visible on Get Help screen ");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"How to reach Hubtel\")")).isDisplayed(),
                    "🧪 Sub heading 'How to reach Hubtel' should be visible on Get Help screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Call for help\")")).click(),
                    "👆Tap on call for help option on Get help screen");

            Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"0307000576\")")).isDisplayed(),
                    "🧪Help line '0307000576' should be visible on the device dialer screen ");

            Listeners.executeStep(() ->profile.dialerReturn(),
                    "👆Tap the back button on the device dialer screen to return to the Hubtel app.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back navigation button on 'Get Help' screen ");
Thread.sleep(1000);

            Listeners.logTestStart("🔎Check the functionality of 'Settings'");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Settings\")")).click(),
                "👆Tap on settings on Profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Profile\")")).isDisplayed(),
                "🧪Heading 'Profile' should be visible on profile screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Personal Details\")")).isDisplayed(),
                "🧪'Personal Details' option should be available on profile screen");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Government ID\n" +
                        "A valid government-issued ID card is required to verify your account\")")).isDisplayed(),
                "🧪'Government ID' option should be visible on profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SMS Sender Name\n" +
                        "Link your mobile money to pay for anything\")")).isDisplayed(),
                "🧪'SMS Sender Name' option should be visible on profile screen");

        Listeners.executeStep(() -> profile.scroll(),
                "📜 Scrolling to optional security pin option ");

            Listeners.logTestStart("🔎Check the functionality of 'Personal Details'");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Personal Details\n" +
                        "Your preferred name and email adds some shine to your account\")")).click(),
                "👆Tap on 'Personal Details' on profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Update Profile\")")).isDisplayed(),
                "🧪'Update Profile' heading should be visible on Personal Details home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"JOSHUA  BRONI\")")).isDisplayed(),
                "🧪 Account name should be visible on Personal Details home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"233539938805\")")).isDisplayed(),
                "🧪 Account number should be visible on Personal Details home screen");

Thread.sleep(2000);
        Listeners.logTestStart("🔎Check for editing of account details (name and email) functionality");

        Listeners.executeStep(() -> profile.preferredName(),
                "📜Adding current day to QA Test as the preferred name");

        Listeners.executeStep(() -> profile.email(),
                "📜Adding day of month to email address (joshuabroni@gmail.com)");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SAVE\")")).click(),
                "👆Tap on save button on profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Are you sure you want to change your details?\")")).isDisplayed(),
                "🧪 Pop-up 'new UiSelector().description(\"Are you sure you want to change your details?\")' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, continue\")")).click(),
                "👆Tap on 'Yes, continue' button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Account profile updated successfully\")")).isDisplayed(),
                "🧪Success message 'Account profile updated successfully' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OKAY\")")).click(),
                "👆Tap on 'OKAY' button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Personal Details\n" +
                        "Your preferred name and email adds some shine to your account\")")).click(),
                "👆Tap on 'Personal Details' on profile screen");

        Listeners.logTestStart("🔎Verify the newly edited account details (name and email).");

        Listeners.executeStep(() -> profile.checkName(),
                "🧪The preferred name should be the current day appended to ‘QA Test’.");

        Listeners.executeStep(() -> profile.checkEmail(),
                "🧪Verifying if the day of the month has been added to the email address (joshuabroni@gmail.com).");

        Listeners.logTestStart("🔎Check the functionality for editing the profile image.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"EDIT\")")).click(),
                "👆Tap on 'EDIT' button on Personal Details home screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Upload from Gallery\")")).click(),
                "📜Selecting 'Upload from Gallery' from how to upload photo options");

        Listeners.executeStep(() -> profile.imageClick(),
                "📜Selecting hubtel image from phone gallery");

            Listeners.executeStep(() ->profile.selectButton(),
                    "👆Tap on select button if its visible on phone storage");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click(),
                "👆Tap on crop button image edit screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SAVE\")")).click(),
                "👆Tap on save button on profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Are you sure you want to change your details?\")")).isDisplayed(),
                "🧪 Pop-up 'new UiSelector().description(\"Are you sure you want to change your details?\")' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, continue\")")).click(),
                "👆Tap on 'Yes, continue' button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Account profile updated successfully\")")).isDisplayed(),
                "🧪Success message 'Account profile updated successfully' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OKAY\")")).click(),
                "👆Tap on 'OKAY' button");

//Government ID
        Listeners.logTestStart("🔎Check the functionality of the Government ID feature.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Government ID\n" +
                        "A valid government-issued ID card is required to verify your account\")")).click(),
                "👆Tap on 'Government ID' option  on profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Your Account has been verified successfully!\")")).isDisplayed(),
                "🧪Message heading 'Your Account has been verified successfully!' should be visible on Government ID screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"JOSHUA  BRONI\")")).isDisplayed(),
                "🧪 Name on the Ghana card should be 'JOSHUA BRONI' on GOVERNMENT ID screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"GHA-723584879-1\")")),
                "🧪 Personal ID Number on the Ghana card should be 'GHA-723584879-1' on GOVERNMENT ID screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Okay\")")).click(),
                "👆Tap on Okay button on GOVERNMENT ID screen");

        Listeners.logTestStart("🔎Check the functionality of the Mobile Money feature.");

        Listeners.executeStep(() ->profile.mobileMoneyClick(),
                "👆Tap on 'Mobile Money' option on profile screen");
Thread.sleep(2000);
        Listeners.executeStep(() -> profile.swipeToAccountCard(),
                "📜Swipe to next card and delete");

Thread.sleep(5000);

//        Listeners.executeStep(() -> profile.swipeToAccountCard(),
//                "📜Swipe to next card and delete ");
//
//        Listeners.executeStep(() ->profile.swipeToAddWallet(),
//                "📜Swipe to Add card");
//
//        Listeners.executeStep(() -> profile.addWallet("0200045664"),
//                "📜 Adding Telecel cash card");
//
//        Listeners.executeStep(() ->profile.swipeToAddWallet(),
//                "📜Swipe to Add card");
Thread.sleep(2000);
//        Listeners.executeStep(() ->profile.swipeFromSecondElement(),
//                "📜Swipe to Add card");
//
//        Listeners.executeStep(() -> profile.addWalletmtn("0539938805"),
//                "📜 Adding MTN cash card");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back button on Mobile Money screen");

        Listeners.logTestStart("🔎Check the availability of 'SMS Sender Name'.");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"SMS Sender Name\n" +
                        "Link your mobile money to pay for anything\")")).click(),
                "👆Tap on 'SMS Sender Name' on Profile screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Sender Nicknames\")")).isDisplayed(),
                "🧪Heading 'Sender Nicknames' should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"TESTQA\n" +
                        "Approved\")")).isDisplayed(),
                "🧪 Approved Senders name 'TESTQA' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back button on Sender Nicknames screen");


        //Programmable Keys
        Listeners.logTestStart("🔎Check the functionality of the Government ID feature.");

        Listeners.executeStep(() ->profile.programmableKeys(),
                "👆Tap on Programmable Keys option on Profile screen");

        Listeners.executeStep(() ->profile.skipClick(),
                "👆Tap on Skip button if available on Programmable Keys home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Programmable Keys\")")).isDisplayed(),
                "🧪Heading 'Programmable Keys' should be visible on Create API screen");

        Listeners.logTestStart("🔎Check the functionality of 'CREATE API KEYS' feature.");

        Listeners.executeStep(() ->profile.createAPIKeys(),
                "👆Tap on 'CREATE API KEYS' or 'REQUEST NEW API KEY' on Create API screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Request Api Keys\")")).isDisplayed(),
                "🧪 Heading 'Request Api Keys'  should be visible");

        Listeners.executeStep(() ->profile.chooseNickname(),
                "👆Tap on 'Choose Sender Nickname' drop down button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Sender NickName\")")).isDisplayed(),
                "🧪Heading 'Select Sender NickName' should be visible on Select Sender NickName modal ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"TESTQA\")")).click(),
                "👆Selecting 'TESTQA' from Senders NickName options");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"REQUEST API KEY\")")).click(),
                "👆Tap on 'REQUEST API KEY' button on Request Api Keys screen ");

            Listeners.executeStep(() ->profile.ClickByLoc("//*[contains(@content-desc,\"Okay\")]",361,471),
                    "👆Tap on Okay button");

        Listeners.executeStep(() ->profile.KeyDetails(),
                "Getting API Details");

        Listeners.executeStep(() ->profile.APIDetailsCheck(),
                "🧪API Details should contain Senders NickName 'TESTQA' ");

        Listeners.logTestStart("🔎Verify the details of the generated API keys.");

        Listeners.executeStep(() ->profile.clientSecretCheck(),
                "👆Tap on Programmable key details generated");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Details\")")).click(),
                "👆Tap on 'Details' from Programmable key details modal");

        Listeners.executeStep(() ->profile.clientSecret(),
                "🧪Verifying if clientsecret is not null or empty");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CANCEL\")")).click(),
                "👆Tap on cancel button");

        Listeners.logTestStart("🔎Check for the delete feature for the generated API keys.");

        Listeners.executeStep(() ->profile.clientSecretCheck(),
                "👆Tap on Programmable key details generated");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Delete\")")).click(),
                "👆Tap on Delete button");

        Listeners.executeStep(() ->profile.deleteHeading(),
                "🧪 Heading on the delete modal should be 'Delete API Keys'");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"DELETE\")")).click(),
                "👆Tap on Delete button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Okay\")")).click(),
                "👆Tap on Okay button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"CREATE API KEYS\")")).isDisplayed(),
                "🧪'CREATE API KEYS' button should be visible on Programmable key home screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"REQUEST NEW API KEY\")")).isDisplayed(),
                "🧪'REQUEST NEW API KEY' button should be visible on Programmable key home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(6)")).click(),
                "👆Tap on back button on Programmable key home screen");

        Listeners.executeStep(() ->profile.backButtonClick(),
                "👆Tap on back button if available on Programmable key landing screen ");
Thread.sleep(2000);



 //       Optional Security PIN section

        Listeners.logTestStart("🔎Check for Optional Security PIN feature ");

        Listeners.executeStep(() ->profile.SecurityPIN(),
                "👆Tap on Optional Security PIN");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Settings\")")).isDisplayed(),
                "🧪Heading 'Settings' should be visible on Optional Security PIN home screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Reset PIN\n" +
                        "For security reasons, all your debit/credit accounts will be removed. You would have to sign in again and set a new pin\")")).isDisplayed(),
                "🧪'RESET PIN' and instructions to reset pin should be visible on optional security pin home screen");
//Set PIN-new user
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Set PIN\")")).click(),
                "👆Tap on Set PIN button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Keep your account secure\")")).click(),
                "🧪'Keep your account secure' should be visible on enter PIN screen ");

        Listeners.executeStep(() ->profile.createPIN(),
                "📜Entering PIN '1234' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm Your Pin\")")).isDisplayed(),
                "🧪'Confirm Your Pin' screen should be visible");

        Listeners.executeStep(() ->profile.createPIN(),
                "📜Confirming PIN '1234' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OKAY\")")).click(),
                "👆Tap on OKAY button");


////changing PIN
        Listeners.logTestStart("🔎Check for Optional Security PIN feature ");

        Listeners.executeStep(() ->profile.SecurityPIN(),
                "👆Tap on Optional Security PIN");

        Listeners.logTestStart("🔎Check for Change PIN feature for 'Optional Security PIN'");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Change PIN\")")).click(),
                "👆Tap on 'Change PIN' button on optional security pin home screen ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Please enter your old PIN\")")).isDisplayed(),
                "🧪'Please enter your old PIN' sub heading should be visible on change PIN screen ");

        Listeners.executeStep(() ->profile.enterPin(),
                "📜Entering old PIN");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Please enter your new PIN\")")).isDisplayed(),
                "🧪'Please enter your new PIN' sub heading should be visible on change PIN screen ");

        Listeners.executeStep(() ->profile.enterPin(),
                "📜Entering new PIN");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Please confirm new PIN\")")).isDisplayed(),
                " 🧪'Please confirm new PIN' sub heading should be visible on change PIN screen");

        Listeners.executeStep(() ->profile.enterPin(),
                "📜Confirming new PIN");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Pin Changed Successfully\")")).isDisplayed(),
                " 'Pin Changed Successfully' confirmation pop-up should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OKAY\")")).click(),
                "👆Tap on OKAY button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Optional Security PIN\n" +
                        "Secure your Hubtel Balance transactions by approving each one with your own secret code or pin\")")).click(),
                "👆Tap on Optional Security PIN");
////Resetting PIN
        Listeners.logTestStart("🔎Check for Reset PIN feature for 'Optional Security PIN'");

        Listeners.executeStep(() ->profile.ClickByLocReset("//*[contains(@content-desc,\"Reset PIN\")]",942,10),
                "👆Tap on Reset PIN button");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Reset\")")).click(),
                "👆Tap on Reset button on Reset PIN pop-up screen");

        reusecodes login = new reusecodes(driver);
        Listeners.logTestStart("Login into Hubtel home screen");
        login.login();

    }

}
