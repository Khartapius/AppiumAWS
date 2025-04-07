package com.Hubtel.TestUtils;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class reusecodes extends AndroidBaseTest {

    static AndroidDriver driver;

    // super(driver);

    public reusecodes(AndroidDriver driver) {
        //  super(driver);
        reusecodes.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Mobile Money")
    private static WebElement MobileMoneycard;

    @AndroidFindBy(xpath = "//android.view.View[@index='2']")
    private static List<WebElement> momoDropdown;

    @AndroidFindBy(accessibility = "Mobile Money")
    private static WebElement MobileMoneycardClick;


    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private static WebElement MTNMobileMoney;

    @AndroidFindBy(accessibility = "Telecel Cash")
    private static WebElement TelecelCash;

    @AndroidFindBy(accessibility = "AT Money")
    private WebElement ATMoney;

    @AndroidFindBy(accessibility = "Bank Card")
    private static WebElement BankCard;

    @AndroidFindBy(accessibility = "Wallets")
    private static WebElement wallets;

    @AndroidFindBy(accessibility = "Cash / Cheque")
    private static WebElement cash_check;

    @AndroidFindBy(accessibility = "Pay Small Small")
    private static WebElement paysmallSmall;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").instance(0)")
    private static WebElement CloseButton;

    //login
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"AGREE AND CONTINUE\")")
    private static WebElement agreeAndContinueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
    private static WebElement allowNotification;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private static WebElement enterPhonenumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private static WebElement enterWrongPhonenumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your mobile number is invalid.\")")
    private static WebElement invalidNumberMessage;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text=\"Verify you are human\"]")
    private static WebElement cloudFlare;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(16)")
    private static WebElement cloudflarePass;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"CONTINUE\")")
    private static WebElement continueButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Can’t dial *713*2# now?\n" +
            "Try a different way\")")
    private static WebElement tryDiffWayButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SMS Code\")")
    private static WebElement SMSCode;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private static WebElement wrongOTPFirst;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private static WebElement wrongOTPSecond;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private static WebElement wrongOTPThird;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private static WebElement wrongOTPFourth;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The OTP you entered is not correct.\")")
    private static WebElement wrongOTPMessage;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private static WebElement OTPFirst;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private static WebElement OTPSecond;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private static WebElement OTPThird;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private static WebElement OTPFourth;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"VERIFY\")")
    private static WebElement verifyButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Looks like you have used up all your attempts for an OTP. Wait a few minutes and start the process again.\"]")
    private static WebElement OTPVerifyAgain;

    //    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Select a different location\")")
//    private WebElement selectDiffLoc;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Use my current location\n" +
            "Accurate to 5m\")")
    private static WebElement useMyCurrentLoc;

    //setting location
    @AndroidFindBy(xpath = "//android.widget.ImageView[@index='10']")
    private static WebElement setLocation;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Select a different location\")")
    private static WebElement selectDiffLoc;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private static WebElement enterLoc;

    //press search key
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pokuase Overhead Accra side\n" +
            "Accra - Kumasi Road, Ghana\")")
    private static WebElement pokuaseClick;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message\"]")
    private static WebElement allowHubtel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.android.permissioncontroller:id/permission_message\"]")
    private static WebElement allowHubtelClick;

    //send Money

    @AndroidFindBy(accessibility = "AT Money")
    private static WebElement ATMoneyCard;

    @AndroidFindBy(accessibility = "G-Money")
    private static WebElement GMoneyCard;

    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private static WebElement MTNMobileMoneyCard;

    @AndroidFindBy(accessibility = "Telecel Cash")
    private static WebElement TelecelCashCard;

    @AndroidFindBy(accessibility = "Zeepay")
    private static WebElement ZeepayCard;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Bank\"]")
    private static WebElement bankHeading;

    @AndroidFindBy(accessibility = "ABSA Bank Ghana (formerly Barclays)")
    private static WebElement ABSA_BankGhana;

    @AndroidFindBy(accessibility = "Access Bank Ghana")
    private static WebElement Access_Bank_Ghana;

    // car Insurance
    //one month
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Third Party Only\")")
    private WebElement ThirdPartyOnlyGen;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Third Party, Fire & Theft\")")
    private WebElement thirdPartyFireTheftGen;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Comprehensive\")")
    private WebElement comprehensiveGen;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"3 months\")")
    private WebElement ThreemonthSelect;

    @AndroidFindBy(accessibility = "Car Insurance")
    private WebElement carInsuranceHeading;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"HB 123-23\")")
    private WebElement carNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"SELECT POLICY\")")
    private WebElement selectPolicyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"selected\")")
    private WebElement optionsSelect;
//
//    //Three month
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party Only\n" +
//            "GHS 202.23\n" +
//            "This third party policy covers death, bodily injury and damage to other person’s property\")")
//    private WebElement ThirdPartyOnlyThreeMonth;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party, Fire & Theft\n" +
//            "GHS 453.66\n" +
//            "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.\")")
//    private WebElement thirdPartyFireTheftThreeMonth;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Comprehensive\n" +
//            "GHS 1,459.37\n" +
//            "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")
//    private WebElement comprehensiveThreeMonth;
//
//    //six month
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party Only\n" +
//            "GHS 359.29\n" +
//            "This third party policy covers death, bodily injury and damage to other person’s property\")")
//    private WebElement ThirdPartyOnlySixMonth;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party, Fire & Theft\n" +
//            "GHS 873.57\n" +
//            "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.\")")
//    private WebElement thirdPartyFireTheftSixMonth;
//
//    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Comprehensive\n" +
//            "GHS 2,930.71\n" +
//            "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")
//    private WebElement comprehensiveSixMonth;

    //login
    public static void setAllowNotification() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        try{
            WebElement allow = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")));
            if(allow.isDisplayed()){
                allow.click();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
        }catch (NoSuchElementException | TimeoutException e){
//agreeAndContinueButton.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

    }

    public static void setAllowHubtelClick() {
        allowNotification.click();
        agreeAndContinueButton.click();
    }

    public static void setAgreeAndContinueButton() {
        agreeAndContinueButton.click();
    }


    public static void setEnterWrongPhonenumber() {
        enterPhonenumber.sendKeys("0222222222");
    }

    public static void setInvalidNumberMessage() {
        assertTrue(invalidNumberMessage.isDisplayed());
    }

    public static void setEnterPhonenumber() {
        enterPhonenumber.sendKeys("0539938805");
    }


    public static void setCloudFlare() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        try{
            WebElement cloudFlareClick = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.CheckBox[@text=\"Verify you are human\"]")));
            if(cloudFlareClick.isDisplayed()){
                cloudFlareClick.click();
            }
        }catch (NoSuchElementException | TimeoutException e){

        }



    }

//    public static void setCloudflarePass() {
//        if (cloudflarePass.isDisplayed()) {
//
//            continueButton.click();
//        } else {
//            if (!cloudflarePass.isDisplayed()) {
//                cloudFlare.click();
//                continueButton.click();
//            }
//        }
//    }

    public static void setContinueButton() {
        continueButton.click();

    }

    public static void setTryDiffWayButton() {
        tryDiffWayButton.click();
    }

    public static void setSMSCode() {
        SMSCode.click();
    }

    public static void setWrongOTPFirst() {
        OTPFirst.sendKeys("6");
    }


    public static void setWrongOTPSecond() {
        OTPSecond.sendKeys("6");
    }

    public static void setWrongOTPThird() {
        OTPThird.sendKeys("6");
    }

    public static void setWrongOTPFourth() {
        OTPFourth.sendKeys("6");
    }

    public static void setWrongOTPMessage() {
        assertTrue(wrongOTPMessage.isDisplayed(), "🧪 Error message 'The OTP you entered is not correct.' should be visible ");
    }

    public static void setOTPFirst() {
        OTPFirst.sendKeys("2");
    }


    public static void setOTPSecond() {
        OTPSecond.sendKeys("4");
    }

    public static void setOTPThird() {
        OTPThird.sendKeys("6");
    }

    public static void setOTPFourth() {
        OTPFourth.sendKeys("8");
    }

    public static void setVerifyButton() {
        verifyButton.click();
    }

    public static void setUseMyCurrentLoc() {
        useMyCurrentLoc.click();
    }

    public static void setSelectDiffLoc() {
        selectDiffLoc.click();
    }

    public static void setEnterLoc() {
        enterLoc.sendKeys("Pokuase");
    }
    //enter key

    public static void setPokuaseClick() {
        WebElement pokuase = driver.findElements(AppiumBy.xpath("//android.view.View[@index=0]")).get(8);
        pokuase.click();
        //pokuaseClick.click();
    }

    public static void enterKey() {
        // driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    //login
    public void login() throws InterruptedException {

        Listeners.executeStep(reusecodes::setAllowNotification,
                "📜 Clicking on allow notification on the login screen if visible if not click on continue button");


        Listeners.executeStep(reusecodes::setAgreeAndContinueButton,
                "Clicking on Agree and Continue button on the login screen");

        Listeners.executeStep(reusecodes::setEnterPhonenumber,
                "Entering phone Number in contact text field");
        Thread.sleep(5000);

        Listeners.executeStep(reusecodes::setCloudFlare,
                "verifying if i'm human is checked if not check and click on continue button ");

        Thread.sleep(2000);
        Listeners.executeStep(reusecodes::setContinueButton,
                "Clicking on continue button on contact text field screen");

        Listeners.executeStep(reusecodes::setTryDiffWayButton,
                "Clicking on Try a different way on Approve login screen ");

        Listeners.executeStep(reusecodes::setSMSCode,
                "Clicking on 'SMS Code' button on how you want to login screen");


        Thread.sleep(5000);
        Listeners.executeStep(reusecodes::setOTPFirst,
                "Inputting 2 for OTP verification on SMS verification screen");

        Listeners.executeStep(reusecodes::setOTPSecond,
                "Inputting 4 for OTP verification on SMS verification screen ");
        Thread.sleep(1000);

        Listeners.executeStep(reusecodes::setOTPThird,
                "Inputting 6 for OTP verification on SMS verification screen");
        Thread.sleep(1000);
        Listeners.executeStep(reusecodes::setOTPFourth,
                "Inputting 8 for OTP verification on SMS verification screen");
        Thread.sleep(5000);
//        Listeners.executeStep(reusecodes::setVerifyButton,
//                "Clicking on Verify button on OTP screen");


//        Listeners.executeStep(reusecodes::setUseMyCurrentLoc,
//                "Clicking on use my current location on location setup banner");
        Listeners.executeStep(reusecodes::setSelectDiffLoc,
                "🖱️Clicking on 'select different location'on set location pop-up screen");


        Listeners.executeStep(reusecodes::setEnterLoc,
                "📜Entering 'Pokuase' on Add a delivery screen ");

        Listeners.executeStep(reusecodes::enterKey,
                "📜Press search key on the keyboard");
        Thread.sleep(2000);
        Listeners.executeStep(reusecodes::setPokuaseClick,
                "🖱️Clicking on Pokuase Overhead Accra side from search results drop list");

        Thread.sleep(2000);

    }

    public static void setMobileMoneycard() {
        assertTrue(MobileMoneycard.isEnabled(), "Mobile Money Card should be visible");
    }

    public static void setMobileMoneycardClick() {
        MobileMoneycardClick.click();
    }

    public static void setMomoDropdown() {
        momoDropdown.get(1).click();
    }

    public static void setMTNMobleMoney() {
        boolean mtnmomo = MTNMobileMoney.isDisplayed();
        assertTrue(mtnmomo);
    }

    public static void setTelecelCash() {
        boolean telecelcash = TelecelCash.isDisplayed();
        assertTrue(telecelcash);
    }

    public static void setBankCard() {
        assertTrue(BankCard.isEnabled());
    }

    public static void setWallets() {
        assertTrue(wallets.isEnabled());
    }

    public static void setWalletsTap() {
       wallets.click();
    }

    public static void setCash_check() {
        assertTrue(cash_check.isEnabled());
    }

    public static void setPaysmallSmall() {
        assertTrue(paysmallSmall.isEnabled());
    }

    public static void setCloseButton() {
        CloseButton.click();
    }

    public static void scrolldown() {
        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                "left", 0, "top", 0, "width", 499, "height", 903,
                "direction", "down",
                "percent", 1.0
        ));

    }

    //send money

    public static void setATMoneyCard() {
        boolean ATMoneyCardB = ATMoneyCard.isDisplayed();
        assertTrue(ATMoneyCardB, "AT Money card should be visible");

    }

    public static void setGMoneyCard() {
        boolean GMoneyCardB = GMoneyCard.isDisplayed();
        assertTrue(GMoneyCardB, "G-Money card should be visible");

    }

    public static void setMTNMobileMoneyCard() {
        boolean MTNMobileMoneyCardB = MTNMobileMoneyCard.isDisplayed();
        assertTrue(MTNMobileMoneyCardB, "MTN Mobile Money card should be visible");

    }

    public static void setTelecelCashCard() {
        boolean TelecelCashCardB = TelecelCashCard.isDisplayed();
        assertTrue(TelecelCashCardB, "Telecel Cash card should be visible");

    }

    public static void setZeepayCard() {
        boolean ZeepayCardB = ZeepayCard.isDisplayed();
        assertTrue(ZeepayCardB, "Zeepay Card should be visible");

    }

    public static void setBankHeading() {
        boolean bankHeadingB = bankHeading.isDisplayed();
        assertTrue(bankHeadingB, "Should display Bank as the sub heading");
    }

    public static void setABSA_BankGhana() {
        boolean ABSA_BankGhanaB = ABSA_BankGhana.isDisplayed();
        assertTrue(ABSA_BankGhanaB, "ABSA Bank Ghana (formerly Barclays) Card should be visible");

    }

    public static void setAccess_Bank_Ghana() {
        boolean Access_Bank_GhanaB = Access_Bank_Ghana.isDisplayed();
        assertTrue(Access_Bank_GhanaB, "Access Bank Ghana Card should be visible");
    }



    public void checkout() throws InterruptedException {


        reusecodes.setMobileMoneycard();
        Listeners.logTestStep("🧪Should check for the presence of Mobile Money card");
Thread.sleep(1000);
        reusecodes.setMobileMoneycardClick();
        Listeners.logTestStep("👆Tap on Mobile Money card");

//        reusecodes.scrolldown();
//        Listeners.logTestStep("Scroll to mobile money");


        reusecodes.setMomoDropdown();
        Listeners.logTestStep("👆Tap on Mobile Money dropdown list");

        reusecodes.setMTNMobleMoney();
        Listeners.logTestStep("🧪Check for the presence of MTN mobile money");

        reusecodes.setTelecelCash();
        Listeners.logTestStep("🧪Check for the presence of Telecel Cash");

        reusecodes.setMobileMoneycardClick();
        Listeners.logTestStep("👆Tap on Mobile Money card");

        reusecodes.setBankCard();
        Listeners.logTestStep("🧪Should check for the presence of Bank card");

        reusecodes.setWallets();
        Listeners.logTestStep("🧪Should check for the presence of Wallets card");

        reusecodes.setWalletsTap();
        Listeners.logTestStep("👆Tap on Wallets card");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Hubtel\")")).click(),
                "👆Tap on Hubtel drop-down list under wallet");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Hubtel\")")).isDisplayed(),
                "🧪Hubtel wallet should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Zeepay\")")).isDisplayed(),
                "🧪Zeepay wallet should be visible");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"G-Money\")")).isDisplayed(),
                "🧪G-Money wallet should be visible");

        reusecodes.setWalletsTap();
        Listeners.logTestStep("👆Tap on Wallets card");

        reusecodes.setCash_check();
        Listeners.logTestStep("🧪Should check for the presence of Cash/Check card");

        reusecodes.setPaysmallSmall();
        Listeners.logTestStep("🧪Should check for the presence of Pay Small Small card");

        reusecodes.setCloseButton();
        Listeners.logTestStep("👆Tap on close button");
    }

    public void logOut() throws InterruptedException {
        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)")).click(),
                "👆Tapping on User Profile icon on HCA home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Account\")")).isDisplayed(),
                "🧪Heading 'Account should be visible' ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Log Out\")")).click(),
                "👆Tapping on logOut button on Account home screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, continue\")")).click(),
                " 👆Tapping on 'Yes, continue' button on logOut pop-up screen");
        Thread.sleep(200);

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Find and pay\n" +
                        "for everyday essentials\n" +
                        "from local retailers and service providers\")")).isDisplayed(),
                "🧪 Description 'Find and pay for everyday essentials from local retailers and service providers' should be visible");
    }
    public void setLocation(String SearchLocation, String LocationActual){
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        Listeners.executeStep(() ->wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"))).click(),
                "👆Tapping on 'Your delivery location is set to' on hubtel home screen");
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)")).click(),
//                " ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select a different location\")")).click(),
                "👆Tapping on 'select different location' on set location pop-up screen");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(0)")).sendKeys(SearchLocation),
                "📜Entering \""+SearchLocation+"\" on Add a delivery location screen ");

        Listeners.executeStep(() ->driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search")),
                "📜Press search key on the keyboard");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\""+LocationActual+"\")")).click(),
                "👆Tapping on '\""+LocationActual+"\"' from location search results drop list ");
    }

    //Send Money ML error

    public void MlWarning() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try{
            WebElement MLAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Verify Transaction\")")));
            if(MLAlert.isDisplayed()){

                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Verify Transaction\")")).isDisplayed(),
                        "🧪Heading 'Verify Transaction' should be visible ");

                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Dial *713# TO VERIFY\")")).isDisplayed(),
                        "🧪Instructions to verify your account should be visible 'Dial *713# TO VERIFY' ");

//                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"I HAVE VERIFIED\")")).click(),
//                        "👆Tapping on 'I HAVE VERIFIED' button ");
//
//                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Transaction cannot be completed.\n" +
//                                "Payee verification failed.\")")).isDisplayed(),
//                        "🧪A message indicating that the user hasn't verified their account should be visible.");
//
//                Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"OKAY\")")).click(),
//                        "👆Tapping on OKAY button");

            }
        }catch (NoSuchSessionException | TimeoutException e){
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            checkout();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

    }

    public void  sendMoneyOptions(){
        Listeners.executeStep(reusecodes::setATMoneyCard,
                "🧪AT Money card should be visible on send money home screen");

        Listeners.executeStep(reusecodes::setGMoneyCard,
                "🧪G-Money card should be visible on send money home screen");

        Listeners.executeStep(reusecodes::setMTNMobileMoneyCard,
                "🧪MTN Mobile Money card should be visible on send money home screen");

        Listeners.executeStep(reusecodes::setTelecelCashCard,
                "🧪Telecel Cash card should be visible on send money home screen");

        Listeners.executeStep(reusecodes::setZeepayCard,
                "🧪Zeepay Card should be visible on send money home screen");

        Listeners.executeStep(reusecodes::setBankHeading,
                "Should display Bank as the sub heading ");

        Listeners.executeStep(reusecodes::setABSA_BankGhana,
                "ABSA Bank Ghana (formerly Barclays) Card should be visible");

        Listeners.executeStep(reusecodes::setAccess_Bank_Ghana,
                "Access Bank Ghana Card should be visible");
    }


    public void setCarInsuranceHeading() {
        //SoftAssert softAssert = Listeners.getSoftAssert();
        String insuranceHeading = carInsuranceHeading.getTagName();
        assertEquals(insuranceHeading, "Car Insurance", "Heading for Insurance first screen should be Car Insurance");
    }

    public void setCarNumber() {
        String number = carNumber.getTagName();
        assertEquals(number, "HB 123-23", "🧪 Car registration number should be HB 123-23 on the insurance sticker");
    }
    public void chassisCorOrdinateClick() {
        int x = 553;
        int y = 623;
        Map<String, Object> params = new HashMap<>();
        params.put("x", x);
        params.put("y", y);
        driver.executeScript("mobile:clickGesture", params);
    }
    public void setSelectPolicyButtonClick() {
        selectPolicyButton.click();
    }
    public void sendKeys(){
        WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().sendKeys("Blue").build().perform();

        String text = "Blue";
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
        element.click();
       // element.sendKeys(Keys.CONTROL, "v"); // For Windows/Linux
 element.sendKeys( "Blue"); // For Mac


    }

    public void stepsToPolicyScreen() throws InterruptedException {

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.logTestStart("🔎(06) Verify the presence of 'No, I have insurance' options ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"No, I have insurance\")")).click(),
                "👆 Tapping on No, I have insurance ");

//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, I don't have insurance\")")).click(),
//                "👆 Tapping on 'No, I have insurance' ");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car has no insurance or has expired\")")).isDisplayed(),
                "🧪Text 'Car has no insurance or has expired' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Car insurance is still active\")")).isDisplayed(),
                "🧪Text 'Car insurance is still active' should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.logTestStart("🔎(07) Verify the functionality of 'I don't have insurance' feature  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Yes, I don't have insurance\")")).click(),
                "👆 Tapping on Yes, I don't have insurance on 'Are you sure your car is not insured?' screen");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Chassis Number/VIN\")")).isDisplayed(),
                "🧪Heading 'Chassis Number/VIN' should be visible ");

        Listeners.logTestStart("🔎(08) Verify the functionality of 'Where do I find my Chassis number/VIN?' feature  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Where do I find my Chassis number/VIN? \")")).click(),
                "👆 Tapping on 'Where do I find my Chassis number/VIN?' button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")")).isDisplayed(),
                "🧪Where to find chassis number on the car image should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"A VIN/Chassis contains 17 characters.\")")).isDisplayed(),
                "🧪Description of chassis number  should be visible ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆 Tapping on close button ");
        //Thread.sleep(1000);


        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.EditText")).click(),
                "👆Tapping on chassis number on 'Chassis Number/VIN' screen  ");

        Listeners.logTestStart("🔎(09) Verify the functionality of  'Enter your chassis number' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("7ACTBRSALGHB12323"),
                "📜Entering chassis number on 'Chassis Number/VIN' screen  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NEXT\")")).click(),
                "👆 Tapping on Next button ");

        Listeners.logTestStart("🔎(10) Verify the presence of Car Insurance sticker details");

        Listeners.executeStep(this::setCarInsuranceHeading,
                "🧪Car Insurance heading should be visible on car details screen");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"EIC\")")),
                "🧪Heading EIC should be visible");

        Listeners.executeStep(this::setCarNumber,
                "🧪 Car registration number should be HB 123-23 on the insurance sticker");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NO, THIS IS NOT MY CAR\")")).click(),
                "👆 Tapping on NO, THIS IS NOT MY CAR ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit Details\")")).isEnabled(),
                "🧪 Edit Details button should be enabled");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Edit Chassis / Vin\")")).isEnabled(),
                "🧪 Edit Chassis / Vin button should be enabled");


        Listeners.executeStep( this::chassisCorOrdinateClick,
                "📜 Existing from edit chassis pop-up");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"YES, THIS IS MY CAR\")")).click(),
                "👆 Tapping on YES, THIS IS MY CAR ");


        Listeners.executeStep(() -> driver.findElement(AppiumBy.accessibilityId("HB 123-23\n2018 TOYOTA COROLLA\n7ACTBRSALGHB12323")).isDisplayed(),
                "🧪 Car registration number and details should be visible");

        Listeners.logTestStart("🔎(11) Verify the functionality of  'cost of car' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).click(),
                "👆Tapping on the cost of the car text field   ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)")).sendKeys("80000"),
                "📜Entering the cost of the car  ");

        Listeners.logTestStart("🔎(12) Verify the functionality of  'Colour of car' text field ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).click(),
                "👆Tapping on color of the car text field  ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)")).sendKeys("Blue"),
                "📜Entering color of the car  ");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index=10]")).sendKeys("Blue"),
//                "📜Entering color of the car  ");

//        Listeners.executeStep(this::sendKeys,
//                "📜Entering color of the car test");

        Listeners.executeStep(this::setSelectPolicyButtonClick,
                "👆Tapping on Select Policy button ");

        //selecting policy
        Listeners.logTestStart("🔎(13) Verify the functionality of 'Duration and cover type' feature");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months selected\")")).click(),
                "👆Tapping on select duration ");
        Thread.sleep(1000);

        Listeners.logTestStart("🔎(14) Verify the presence of all duration types");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select duration\")")).click(),
                "🧪Heading 'Select duration' should be visible on set duration pop-up ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1 month\")")).isEnabled(),
                "🧪'1 month’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).isEnabled(),
                "🧪'3 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).isEnabled(),
                "🧪'6 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months\")")).isEnabled(),
                "🧪'12 months’ should be included in the set duration pop-up list. ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Close\")")).click(),
                "👆Tapping on close button ");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months selected\")")).click(),
                "👆Tapping on select duration ");

        Listeners.logTestStart("🔎(15) Verify the price and description for 1 month duration");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"1 month\")")).click(),
                "👆 Tapping on 1 month policy ");

    }

//Ride Hailing
    //one month
    public void setThirdPartyOnlyOneMonthGen() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 103.53\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");

    }


    public void setThirdPartyFireTheftOneMonthGen() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 242.39\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveOneMonthGen() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 643.53\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Three month
    public void setThirdPartyOnlyThreeMonthGen() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 235.77\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftThreeMonthGen() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 688.34\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveThreeMonthGen() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 1,995.77\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //six month
    public void setThirdPartyOnlySixMonthGen() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 435.21\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftSixMonthGen() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 1,360.93\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveSixMonthGen() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 4,035.21\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //12 months
    public void setThirdPartyOnlyTwelveMonthGen() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 652.00\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property\n" +
                "Popular";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }


    public void setThirdPartyFireTheftTwelveMonthGen() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 2,092.00\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveTwelveMonthGen() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 6,252.00\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Commercial Purpose (Taxi)
    //one month
    public void setThirdPartyOnlyOneMonthTaxi() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 102.09\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");

    }


    public void setThirdPartyFireTheftOneMonthTaxi() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 240.94\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveOneMonthTaxi() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 642.09\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Three month
    public void setThirdPartyOnlyThreeMonthTaxi() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 231.06\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftThreeMonthTaxi() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 683.63\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveThreeMonthTaxi() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 1,991.06\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //six month
    public void setThirdPartyOnlySixMonthTaxi() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 425.57\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftSixMonthTaxi() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 1,351.29\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveSixMonthTaxi() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 4,025.57\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //12 months
    public void setThirdPartyOnlyTwelveMonthTaxi() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 637.00\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property\n" +
                "Popular";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }


    public void setThirdPartyFireTheftTwelveMonthTaxi() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 2,077.00\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveTwelveMonthTaxi() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 6,237.00\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Commercial Purpose(Trotro)
    //one month
    public void setThirdPartyOnlyOneMonthTrotro() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 103.53\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");

    }


    public void setThirdPartyFireTheftOneMonthTrotro() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 257.82\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveOneMonthTrotro() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 643.53\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Three month
    public void setThirdPartyOnlyThreeMonthTrotro() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 235.77\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftThreeMonthTrotro() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 738.63\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveThreeMonthTrotro() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 1,995.77\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //six month
    public void setThirdPartyOnlySixMonthTrotro() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 435.21\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftSixMonthTrotro() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 1,463.79\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveSixMonthTrotro() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 4,035.21\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //12 months
    public void setThirdPartyOnlyTwelveMonthTrotro() {
        String ThirdParty = ThirdPartyOnlyGen.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 652.00\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property\n" +
                "Popular";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }


    public void setThirdPartyFireTheftTwelveMonthTrotro() {
        String ThirdPartyFireTheft = thirdPartyFireTheftGen.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 2,252.00\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveTwelveMonthTrotro() {
        String ThirdPartyFireTheft = comprehensiveGen.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n"+"GHS 6,252.00\n"+"Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n"+"Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    public void setOptionsSelect(){
        optionsSelect.click();
    }

    public void backButton(){
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }
    public void rideHailingPriceCheck() throws InterruptedException {
        //Price comparison
        Thread.sleep(2000);

//one month

        Listeners.executeStep(this::setThirdPartyOnlyOneMonthGen,
                "🧪The heading, price, and content description on the Third Party Only for One Month card should match the expected values on select policy screen");


        Listeners.executeStep(this::setThirdPartyFireTheftOneMonthGen,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveOneMonthGen,
                "🧪The heading, price, and content description on Comprehensive for One Month card should match the expected values on select policy screen");

        //Three months
        Listeners.logTestStart("🔎(16) Verify the price and description for 3 month duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).click(),
                "👆Tap on 3 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyThreeMonthGen,
                "🧪The heading, price, and content description on the Third Party Only for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftThreeMonthGen,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveThreeMonthGen,
                "🧪The heading, price, and content description on Comprehensive for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        //Six months
        Listeners.logTestStart("🔎(17) Verify the price and description for 6 months duration");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).click(),
                "👆Tap on 6 months duration");


        Listeners.executeStep(this::setThirdPartyOnlySixMonthGen,
                "🧪The heading, price, and content description on the Third Party Only for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftSixMonthGen,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveSixMonthGen,
                "🧪The heading, price, and content description on Comprehensive for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        //12 months
        Listeners.logTestStart("🔎(18) Verify the price and description for 12 month duration");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months\")")).click(),
                "👆Tap on 12 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyTwelveMonthGen,
                "🧪The heading, price, and content description on the Third Party Only for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftTwelveMonthGen,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveTwelveMonthGen,
                "🧪The heading, price, and content description on Comprehensive for Twelve Month card should match the expected values on select policy screen");



//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Comprehensive\")")).click(),
//                "👆 Tap on Comprehensive plan card ");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click(),
//                "👆Tap on cancel button on the checkout screen");
        Listeners.executeStep(this::backButton,
                "👆Navigate back to ' Registration Number/DV' screen");

    }

    public void taxiPriceCheck() throws InterruptedException {
        //Price comparison
        Thread.sleep(2000);

//one month
        Listeners.logTestStart("🔎(19) Verify the price and description for 1 month duration");

        Listeners.executeStep(this::setThirdPartyOnlyOneMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Only for One Month card should match the expected values on select policy screen");


        Listeners.executeStep(this::setThirdPartyFireTheftOneMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveOneMonthTaxi,
                "🧪The heading, price, and content description on Comprehensive for One Month card should match the expected values on select policy screen");

        //Three months
        Listeners.logTestStart("🔎(20) Verify the price and description for 3 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).click(),
                "👆Tap on 3 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyThreeMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Only for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftThreeMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveThreeMonthTaxi,
                "🧪The heading, price, and content description on Comprehensive for Three Month card should match the expected values on select policy screen");


        //Six months

        Listeners.logTestStart("🔎(21) Verify the price and description for 6 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).click(),
                "👆Tap on 6 months duration");

        Listeners.executeStep(this::setThirdPartyOnlySixMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Only for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftSixMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveSixMonthTaxi,
                "🧪The heading, price, and content description on Comprehensive for Six Month card should match the expected values on select policy screen");

        //12 months
        Listeners.logTestStart("🔎(22) Verify the price and description for 3 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months\")")).click(),
                "👆Tap on 12 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyTwelveMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Only for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftTwelveMonthTaxi,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveTwelveMonthTaxi,
                "🧪The heading, price, and content description on Comprehensive for Twelve Month card should match the expected values on select policy screen");



//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Comprehensive\")")).click(),
//                "👆 Tap on Comprehensive plan card ");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click(),
//                "👆Tap on cancel button on the checkout screen");
        Listeners.executeStep(this::backButton,
                "👆Navigate back to '' Registration Number/DV");

    }

    public void trotroPriceCheck() throws InterruptedException {
        //Price comparison
        Thread.sleep(2000);

//one month


        Listeners.executeStep(this::setThirdPartyOnlyOneMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Only for One Month card should match the expected values on select policy screen");


        Listeners.executeStep(this::setThirdPartyFireTheftOneMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for One Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveOneMonthTrotro,
                "🧪The heading, price, and content description on Comprehensive for One Month card should match the expected values on select policy screen");

        //Three months
        Listeners.logTestStart("🔎(24) Verify the price and description for 3 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"3 months\")")).click(),
                "👆Tap on 3 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyThreeMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Only for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftThreeMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Three Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveThreeMonthTrotro,
                "🧪The heading, price, and content description on Comprehensive for Three Month card should match the expected values on select policy screen");

        //Six months
        Listeners.logTestStart("🔎(25) Verify the price and description for 6 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"6 months\")")).click(),
                "👆Tap on 6 months duration");

        Listeners.executeStep(this::setThirdPartyOnlySixMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Only for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftSixMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Six Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveSixMonthTrotro,
                "🧪The heading, price, and content description on Comprehensive for Six Month card should match the expected values on select policy screen");

        //12 months
        Listeners.logTestStart("🔎(26) Verify the price and description for 12 months duration");

        Listeners.executeStep(this::setOptionsSelect,
                "👆Tap on duration dropdown option");

        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"12 months\")")).click(),
                "👆Tap on 12 months duration");

        Listeners.executeStep(this::setThirdPartyOnlyTwelveMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Only for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setThirdPartyFireTheftTwelveMonthTrotro,
                "🧪The heading, price, and content description on the Third Party Fire and Theft for Twelve Month card should match the expected values on select policy screen");

        Listeners.executeStep(this::setComprehensiveTwelveMonthTrotro,
                "🧪The heading, price, and content description on Comprehensive for Twelve Month card should match the expected values on select policy screen");



//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().descriptionContains(\"Comprehensive\")")).click(),
//                "👆 Tap on Comprehensive plan card ");
//
//        Listeners.executeStep(() -> driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)")).click(),
//                "👆Tap on cancel button on the checkout screen");
        Listeners.executeStep(this::backButton,
                "👆Navigate back to '' Registration Number/DV");

    }


}
