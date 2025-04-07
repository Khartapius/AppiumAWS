package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

public class Car_Insurance extends AndroidActions {
    AndroidDriver driver;
    public String engineCapacity;

    public Car_Insurance(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Car Insurance\")")
    private WebElement carInsuranceCard;

    @AndroidFindBy(accessibility = "Car Insurance")
    private WebElement carInsuranceHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement stickerQRScan;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement incompleteBanner;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"GET A STICKER\")")
    private WebElement getStickerButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"GET A STICKER\")")
    private WebElement getStickerButtonClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Policies\")")
    private WebElement policiesButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"History\")")
    private WebElement historybutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement deleteButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"SELECT POLICY\")")
    private WebElement selectPolicyButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"RENEW LATER\")")
    private WebElement renewLaterButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(6)")
    private WebElement navigateBackButton;

    //filling car details
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Registration Number/DV\")")
    private WebElement RegNumberHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"I use this car for\")")
    private WebElement I_use_this_car_for_subHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Private purposes\")")
    private WebElement purposeDropdown;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Select use of car\")")
    private WebElement Select_use_of_car_subHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Private purposes\")")
    private WebElement Private_purposes;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Ride Hailing (Uber/Bolt/Yango)\")")
    private WebElement RideHailing;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Commercial purposes (Taxi)\")")
    private WebElement CommercialPurposes_Taxi;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Commercial purposes (Trotro)\")")
    private WebElement CommercialPurposes_Trotro;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Close\")")
    private WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Car has no insurance or has expired\")")
    private WebElement insuranceStatusClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Car has no insurance or has expired\")")
    private WebElement carHasNoInsurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Car insurance is still active\")")
    private WebElement carIsStillActive;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement enterCarNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"NEXT\")")
    private WebElement nextButton;

    //@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(6)")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"red\")")
    private WebElement carColor;

    //12 month
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party Only\n" +
            "GHS 530.00\n" +
            "This third party policy covers death, bodily injury and damage to other person’s property\n" +
            "Popular\")")
    private WebElement ThirdPartyOnly;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party, Fire & Theft\n" +
            "GHS 1,330.00\n" +
            "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.\")")
    private WebElement thirdPartyFireTheft;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Comprehensive\n" +
            "GHS 4,530.00\n" +
            "Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n" +
            "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")
    private WebElement comprehensive;

    //Private purpose

    //one month
    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Third Party Only\")")
    private WebElement ThirdPartyOnlyOneMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Third Party, Fire & Theft\")")
    private WebElement thirdPartyFireTheftOneMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Comprehensive\")")
    private WebElement comprehensiveOneMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"3 months\")")
    private WebElement ThreemonthSelect;


    //Three month
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party Only\n" +
            "GHS 202.23\n" +
            "This third party policy covers death, bodily injury and damage to other person’s property\")")
    private WebElement ThirdPartyOnlyThreeMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party, Fire & Theft\n" +
            "GHS 453.66\n" +
            "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.\")")
    private WebElement thirdPartyFireTheftThreeMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Comprehensive\n" +
            "GHS 1,459.37\n" +
            "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")
    private WebElement comprehensiveThreeMonth;

    //six month
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party Only\n" +
            "GHS 359.29\n" +
            "This third party policy covers death, bodily injury and damage to other person’s property\")")
    private WebElement ThirdPartyOnlySixMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Third Party, Fire & Theft\n" +
            "GHS 873.57\n" +
            "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.\")")
    private WebElement thirdPartyFireTheftSixMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Comprehensive\n" +
            "GHS 2,930.71\n" +
            "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.\")")
    private WebElement comprehensiveSixMonth;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"AS  \n" +
            "○\n" +
            "  607 - N\n" +
            "GH\n" +
            "Enter your Chassis Number / VIN\")")
    private WebElement numberPlateValidation;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"HB 123-23\")")
    private WebElement carNumber;

    public void setCarInsuranceCard() {
        carInsuranceCard.click();
    }

    public void setCarInsuranceHeading() {
        //SoftAssert softAssert = Listeners.getSoftAssert();
        String insuranceHeading = carInsuranceHeading.getTagName();
        assertEquals(insuranceHeading, "Car Insurance", "Heading for Insurance first screen should be Car Insurance");
    }

    public void setStickerQRScan() {
        assertTrue(stickerQRScan.isDisplayed());
    }

    public void setIncompleteBanner() {
        assertTrue(incompleteBanner.isDisplayed());
    }

    public void setGetStickerButton() {
        assertTrue(getStickerButton.isEnabled());

    }

    public void setHomeButton() {
        assertTrue(homeButton.isEnabled());
    }

    public void setPoliciesButton() {
        assertTrue(policiesButton.isEnabled());
    }

    public void setHistorybutton() {
        assertTrue(historybutton.isEnabled());
    }

    public void QRClick() {
        stickerQRScan.click();
    }

    public void setDeleteButton() {
        assertTrue(deleteButton.isEnabled(), "Delete button should be enabled");
    }

    public void setSelectPolicyButton() {
        assertTrue(selectPolicyButton.isEnabled(), "Select Policy button should be enabled ");
    }

    public void setRenewLaterButton() {
        assertTrue(renewLaterButton.isEnabled(), "Renew Later button should be enabled");
    }

    public void setNavigateBackButton() {
        navigateBackButton.click();
    }

    public void setGetStickerButtonClick() {
        getStickerButtonClick.click();
    }

    public void setSelectPolicyButtonClick() {
        selectPolicyButton.click();
    }

    //Private use sticker
    //12 months
    public void setThirdPartyOnly() {
        String ThirdParty = ThirdPartyOnly.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 652.00\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property\n" +
                "Popular";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheft() {
        String ThirdPartyFireTheft = thirdPartyFireTheft.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 2,252.00\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensive() {
        String ThirdPartyFireTheft = comprehensive.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 6,252.00\n" +
                "Choose BankPay to pay with cash or cheque at any bank if your mobile money or card limit is less than this\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //Private use sticker
    //one month

    public void setThirdPartyOnlyOneMonth() {
        String ThirdParty = ThirdPartyOnlyOneMonth.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 103.53\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftOneMonth() {
        String ThirdPartyFireTheft = thirdPartyFireTheftOneMonth.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 257.82\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveOneMonth() {
        String ThirdPartyFireTheft = comprehensiveOneMonth.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 643.53\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    //Three month
    public void setThirdPartyOnlyThreeMonth() {
        String ThirdParty = ThirdPartyOnlyThreeMonth.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 235.77\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftThreeMonth() {
        String ThirdPartyFireTheft = thirdPartyFireTheftThreeMonth.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 738.63\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveThreeMonth() {
        String ThirdPartyFireTheft = comprehensiveThreeMonth.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 1,995.77\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }

    //six month
    public void setThirdPartyOnlySixMonth() {
        String ThirdParty = ThirdPartyOnlySixMonth.getAttribute("contentDescription");
        String expectedText = "Third Party Only\n" +
                "GHS 435.21\n" +
                "This third party policy covers death, bodily injury and damage to other person’s property";
        assertEquals(ThirdParty, expectedText, "🧪 The heading, price, and content description on the Third Party Only card should match the expected values on select policy screen");
    }

    public void setThirdPartyFireTheftSixMonth() {
        String ThirdPartyFireTheft = thirdPartyFireTheftSixMonth.getAttribute("contentDescription");
        String expectedText = "Third Party, Fire & Theft\n" +
                "GHS 1,463.79\n" +
                "Covers death, bodily injury, damage to other person’s property as well as fire and theft to your property.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on the Third Party Fire and Theft card should match the expected values on select policy screen");
    }

    public void setComprehensiveSixMonth() {
        String ThirdPartyFireTheft = comprehensiveSixMonth.getAttribute("contentDescription");
        String expectedText = "Comprehensive\n" +
                "GHS 4,035.21\n" +
                "Covers death, bodily injury, damage to other person’s property, fire and theft, minor scratches, windscreen, side mirrors and accidental damage to your vehicle.";
        assertEquals(ThirdPartyFireTheft, expectedText, "🧪 The heading, price, and content description on Comprehensive card should match the expected values on select policy screen");
    }


    public void setComprehensiveSixMonthClick() {
        comprehensiveSixMonth.click();

    }


    public void setComprehensiveOneMonthClick() {
        comprehensiveOneMonth.click();

    }

    public void validateNumberPlate() {
        SoftAssert softAssert = new SoftAssert();
        // Extract the description from the WebElement
        String description = numberPlateValidation.getAttribute("contentDescription");

        // Use a regular expression to find the car number
        Pattern pattern = Pattern.compile("AS\\s+○\\s+607\\s+-\\s+(\\w)\\s+GH");
        Matcher matcher = pattern.matcher(description);

        if (matcher.find()) {
            // Get the last character of the car number
            char lastChar = matcher.group(1).charAt(0);
            System.out.println("this is the alphabet" + lastChar);
            // Assert that it is a capital 'N'
            assertEquals(lastChar, 'N', "The last value is not a capitalized on the number plate template.");

        } else {
            softAssert.fail("Car number is not well formated.");
        }

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

    public void okTap() {
        int x = 548;
        int y = 1373;
        Map<String, Object> params = new HashMap<>();
        params.put("x", x);
        params.put("y", y);
        driver.executeScript("mobile:clickGesture", params);
    }

    public void carDetails() {
        engineCapacity = driver.findElement(AppiumBy.xpath("//android.view.View[@index=23]")).getTagName();
        System.out.println("this is the value for the car engine capacity" + engineCapacity);
    }

    public void newSticker() {
        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"TOYOTA\n" +
                "National Insurance Commission\n" +
                "HB 123-23\n" +
                "Make:\n" +
                "TOYOTA\n" +
                "Model:\n" +
                "COROLLA\n" +
                "Colour:\n" +
                "BLUE\n" +
                "Inception:\n" +
                "-----\n" +
                "Expiry:\n" +
                "-----\n" +
                "Continue from where you left off\n" +
                "Complete & Renew\")")).click();
    }

    public void engineCapacityCheck() {
        String engineCapCompare = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index=22]")).getText();

        System.out.println("This is the value for the last car engine capacity" + engineCapCompare);
        assertEquals(engineCapCompare, engineCapacity, "🧪 The engine capacity should be 1.8 liters, as previously stated on the car details screen.");

    }

    public void deleteSticker(){
        while(true){
            try{

            }catch (NoSuchElementException | TimeoutException ignore){

            }
        }

    }

    public void sendKeys(){
       WebElement element = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\\\"android.widget.EditText\\\").instance(4)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys("Blue").build().perform();

    }

}
