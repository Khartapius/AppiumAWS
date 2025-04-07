package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.testng.Assert.*;

public class Send_Money extends AndroidActions {
    AndroidDriver driver;


    public Send_Money(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Send Money\"]")
    private WebElement sendMoneyClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Favourites\")")
    private WebElement favouritesHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Quick and Easy Transfers\")")
    private WebElement firstPageText;


    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView[1]")
    private WebElement searchField;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.ImageView[1]")
    private WebElement searchFieldClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"This search item is not available. Find your favorites or recent transactions via name or number to proceed\")")
    private WebElement afterSearch;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"SEND NOW\")")
    private WebElement sendNewButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Mobile money\")")
    private WebElement mobileMoneyHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Send\")")
    private WebElement sendHeading;


    @AndroidFindBy(accessibility = "AT Money")
    private WebElement ATMoneyCard;

    @AndroidFindBy(accessibility = "G-Money")
    private WebElement GMoneyCard;

    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private WebElement MTNMobileMoneyCard;

    @AndroidFindBy(accessibility = "Telecel Cash")
    private WebElement TelecelCashCard;

    @AndroidFindBy(accessibility = "Zeepay")
    private WebElement ZeepayCard;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Bank\"]")
    private WebElement bankHeading;

    @AndroidFindBy(accessibility = "ABSA Bank Ghana (formerly Barclays)")
    private WebElement ABSA_BankGhana;

    @AndroidFindBy(accessibility = "Access Bank Ghana")
    private WebElement Access_Bank_Ghana;

    //perform scroll and click on the last bank

    @AndroidFindBy(accessibility = "AT Money")
    private WebElement ATMoneyCardClick;


    //AT screen

    @AndroidFindBy(accessibility = "AT Money")
    private WebElement ATHeadingCheck;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mobile Money Number\"]")
    private WebElement ATMobileMoneyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement UseMyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement ATContactEnter;

    @AndroidFindBy(accessibility = "NEXT")
    private WebElement NextButtonClick;

    @AndroidFindBy(accessibility = "AT Money")
    private WebElement ATMoneyHeading;

    @AndroidFindBy(accessibility = "Edit")
    private WebElement editButtonClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement AccountNumber;

//click on next button

    @AndroidFindBy(xpath = "//android.view.View[@index='8']")
    private WebElement SelectReasonDropDown;

    @AndroidFindBy(accessibility = "Eating Out")
    private WebElement EatingOutCheck;

    @AndroidFindBy(accessibility = "Shopping")
    private WebElement shoppingCheck;

    @AndroidFindBy(accessibility = "Personal Care")
    private WebElement PersonalCareCheck;

    @AndroidFindBy(accessibility = "Entertainment")
    private WebElement EntertainmentCheck;

    @AndroidFindBy(accessibility = "Bills")
    private WebElement BillsCheck;

    @AndroidFindBy(accessibility = "School Fees")
    private WebElement SchoolFeesCheck;

    @AndroidFindBy(accessibility = "Religious Tithe/Dues")
    private WebElement ReligiousTithe_Dues;

    @AndroidFindBy(accessibility = "Transport")
    private WebElement transportCheck;

    @AndroidFindBy(accessibility = "Family")
    private WebElement familyCheck;


    @AndroidFindBy(accessibility = "Gifts")
    private WebElement GiftsCheck;


    @AndroidFindBy(accessibility = "Other")
    private WebElement otherCheck;

    @AndroidFindBy(accessibility = "Close")
    private WebElement CloseClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement typeRef;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement ATSendAmount;


    //MTN MOBILE MONEY SCREEN

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Send\")")
    private WebElement sendIcon;

    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private WebElement MTNMoneyCardClick;

    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private WebElement MTNHeadingCheck;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mobile Money Number\"]")
    private WebElement MTNMobileMoneyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement MTNUseMyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"233539938805\")")
    private WebElement MTNAccountNumberCheck;

    @AndroidFindBy(accessibility = "MTN Mobile Money")
    private WebElement MTNMoneyHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement MTNContactEnter;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0542410123\")")
    private WebElement MTNNumber;

//click on next button

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement MTNSendAmount;

//Telecel Screen

    @AndroidFindBy(accessibility = "Telecel Cash")
    private WebElement telecelMoneyCardClick;

    @AndroidFindBy(accessibility = "Telecel Cash")
    private WebElement telecelHeadingCheck;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Mobile Money Number\"]")
    private WebElement telecelMobileMoneyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Switch\")")
    private WebElement telecelUseMyNumberCheck;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0200045664\")")
    private WebElement telecelAccountNumberCheck;

    @AndroidFindBy(accessibility = "Telecel Cash")
    private WebElement telecelMoneyHeading;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement telecelContactEnter;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"0200045664\")")
    private WebElement telecelNumber;

//click on next button

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement telecelSendAmount;


    public void setSendMoneyClick() {
        sendMoneyClick.click();
    }

    public void setFavouritesHeading() {
        boolean headingCheck = favouritesHeading.isDisplayed();
        assertTrue(headingCheck, "The heading for Send Money first screen should be Favourites");
    }


    public void setFirstPageText() {
        String pageText = firstPageText.getTagName();
        assertEquals("Quick and Easy Transfers", pageText);
    }

    public void setSearchFieldClick() {
        searchFieldClick.click();
    }


    public void setSearchField() {
        searchField.sendKeys("MTN");
    }

    public void backKeyPress() {
        driver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
    }

    public void setAfterSearch() {
        String afterSearchResult = afterSearch.getTagName();
        assertEquals(afterSearchResult, "This search item is not available. Find your favorites or recent transactions via name or number to proceed");
    }


    public void setSendNewButton() {
        sendNewButton.click();
    }


    public void setMobileMoneyHeading() {
        boolean mobileMoneyHeadingB = mobileMoneyHeading.isDisplayed();
        assertTrue(mobileMoneyHeadingB, "Should display Mobile Money as the sub heading");
    }


    public void setSendHeading() {
        boolean sendHeadingBody = sendHeading.isDisplayed();
        assertTrue(sendHeadingBody, "Should display Send as the Main heading");
    }


    public void setATMoneyCard() {
        boolean ATMoneyCardB = ATMoneyCard.isDisplayed();
        assertTrue(ATMoneyCardB, "AT Money card should be visible");

    }

    public void setGMoneyCard() {
        boolean GMoneyCardB = GMoneyCard.isDisplayed();
        assertTrue(GMoneyCardB, "G-Money card should be visible");

    }

    public void setMTNMobileMoneyCard() {
        boolean MTNMobileMoneyCardB = MTNMobileMoneyCard.isDisplayed();
        assertTrue(MTNMobileMoneyCardB, "MTN Mobile Money card should be visible");

    }

    public void setTelecelCashCard() {
        boolean TelecelCashCardB = TelecelCashCard.isDisplayed();
        assertTrue(TelecelCashCardB, "Telecel Cash card should be visible");

    }

    public void setZeepayCard() {
        boolean ZeepayCardB = ZeepayCard.isDisplayed();
        assertTrue(ZeepayCardB, "Zeepay Card should be visible");

    }

    public void setBankHeading() {
        boolean bankHeadingB = bankHeading.isDisplayed();
        assertTrue(bankHeadingB, "Should display Bank as the sub heading");
    }

    public void setABSA_BankGhana() {
        boolean ABSA_BankGhanaB = ABSA_BankGhana.isDisplayed();
        assertTrue(ABSA_BankGhanaB, "ABSA Bank Ghana (formerly Barclays) Card should be visible");

    }

    public void setAccess_Bank_Ghana() {
        boolean Access_Bank_GhanaB = Access_Bank_Ghana.isDisplayed();
        assertTrue(Access_Bank_GhanaB, "Access Bank Ghana Card should be visible");
    }


    //AT MONEY
    public void setATMoneyCardClick() {
        ATMoneyCardClick.click();
    }


    public void setATHeadingCheck() {
        String ATHeadingCheckB = ATHeadingCheck.getTagName();
        assertEquals(ATHeadingCheckB, "AT Money", "AT Money heading should be visible");
    }


    public void setATMobileMoneyNumberCheck() {
        String ATMobileMoneyNumberCheckB = ATMobileMoneyNumberCheck.getTagName();
        assertEquals(ATMobileMoneyNumberCheckB, "Mobile Money Number", "AT Mobile Money Number sub heading should be visible");
    }

    public void setATContactEnter() {
        ATContactEnter.sendKeys("0270760250");
    }

    public void setUseMyNumberCheck() {
        UseMyNumberCheck.click();
    }

    public void setAccountNumberCheck() {
        String accountNumCheck = AccountNumberCheck.getText();
        assertEquals(accountNumCheck, "233539938805");
    }


    public void setNextButtonClick() {
        NextButtonClick.click();
    }


    public void setATMoneyHeading() {
        String ATMoneyHeadingB = ATMoneyHeading.getTagName();
        assertEquals(ATMoneyHeadingB, "AT Money", "AT Money heading should be visible");
    }


    public void setEditButtonClick() {
        editButtonClick.click();
    }


    public void setAccountNumber() {
        String accNumber = AccountNumber.getText();
        assertEquals(accNumber, "0270760250");
    }

//click on next button


    public void setSelectReasonDropDown() {
        SelectReasonDropDown.click();
    }


    public void setEatingOutCheck() {
        String EatingOutCheckB = EatingOutCheck.getTagName();
        assertEquals(EatingOutCheckB, "Eating Out");
    }

    public void setShoppingCheck() {
        String shoppingCheckB = shoppingCheck.getTagName();
        assertEquals(shoppingCheckB, "Shopping");
    }

    public void setPersonalCareCheck() {
        String PersonalCareCheckB = PersonalCareCheck.getTagName();
        assertEquals(PersonalCareCheckB, "Personal Care");
    }

    public void setEntertainmentCheck() {
        String EntertainmentCheckB = EntertainmentCheck.getTagName();
        assertEquals(EntertainmentCheckB, "Entertainment");
    }

    public void setBillsCheck() {
        String BillsCheckB = BillsCheck.getTagName();
        assertEquals(BillsCheckB, "Bills");
    }

    public void setSchoolFeesCheck() {
        String SchoolFeesCheckB = SchoolFeesCheck.getTagName();
        assertEquals(SchoolFeesCheckB, "School Fees");
    }

    public void setReligiousTithe_Dues() {
        String ReligiousTithe_DuesB = ReligiousTithe_Dues.getTagName();
        assertEquals(ReligiousTithe_DuesB, "Religious Tithe/Dues");
    }

    public void setTransportCheck() {
        String transportCheckB = transportCheck.getTagName();
        assertEquals(transportCheckB, "Transport");
    }

    public void setFamilyCheck() {
        String familyCheckB = familyCheck.getTagName();
        assertEquals(familyCheckB, "Family");
    }

    public void setGiftsCheck() {
        String GiftsCheckB = GiftsCheck.getTagName();
        assertEquals(GiftsCheckB, "Gifts");
    }

    public void setOtherCheck() {
        String otherCheckB = otherCheck.getTagName();
        assertEquals(otherCheckB, "Other");
    }

    public void setCloseClick() {
        CloseClick.click();
    }


    public void setTypeRef() {
        typeRef.sendKeys("School Fees");
    }

    public void setATSendAmount() {
        ATSendAmount.sendKeys("1");
    }

    //next button click

    //MTN SCREEN
    public void setSendIcon() {
        sendIcon.click();
    }

    public void setMTNMoneyCardClick() {
        MTNMoneyCardClick.click();
    }


    public void setMTNHeadingCheck() {
        String MTNHeadingCheckB = MTNHeadingCheck.getTagName();
        assertEquals(MTNHeadingCheckB, "MTN Mobile Money", "MTN Mobile Money heading should be visible");
    }


    public void setMTNMobileMoneyNumberCheck() {
        String MTNMobileMoneyNumberCheckB = MTNMobileMoneyNumberCheck.getTagName();
        assertEquals(MTNMobileMoneyNumberCheckB, "Mobile Money Number", "MTN Mobile Money Number sub heading should be visible");
    }


    public void setMTNAccountNumberCheck() {
        String accountNumCheck = MTNAccountNumberCheck.getText();
        assertEquals(accountNumCheck, "233539938805");
    }


    public void setMTNMoneyHeading() {
        String MTNMoneyHeadingB = MTNMoneyHeading.getTagName();
        assertEquals(MTNMoneyHeadingB, "MTN Mobile Money", "MTN Mobile Money heading Should be Visible");
    }

    public void setMTNContactEnter() {
        MTNContactEnter.sendKeys("0542410123");
    }

    public void setMTNSendAmount() {
        MTNSendAmount.sendKeys("100");
    }


    //Telecel Screen

    public void setTelecelMoneyCardClick() {
        telecelMoneyCardClick.click();
    }


    public void setTelecelHeadingCheck() {
        String telecelHeadingCheckB = telecelHeadingCheck.getTagName();
        assertEquals(telecelHeadingCheckB, "Telecel Cash", "Telecel Cash heading should be visible");
    }


    public void setTelecelMobileMoneyNumberCheck() {
        String telecelMobileMoneyNumberCheckB = MTNMobileMoneyNumberCheck.getTagName();
        assertEquals(telecelMobileMoneyNumberCheckB, "Mobile Money Number", "Mobile Money Number sub heading should be visible");
    }

    public void setTelecelAccountNumberCheck() {
        String accountNumCheck = telecelAccountNumberCheck.getText();
        assertEquals(accountNumCheck, "0200045664");
    }


    public void setTelecelMoneyHeading() {
        String MTNMoneyHeadingB = telecelMoneyHeading.getTagName();
        assertEquals(MTNMoneyHeadingB, "Telecel Cash", "Telecel Cash heading Should be Visible");
    }

    public void setTelecelContactEnter() {
        telecelContactEnter.sendKeys("0200045664");
    }

    public void setTelecelSendAmount() {
        telecelSendAmount.sendKeys("1");
    }

    public void allowHubtelAccessLoc(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try{
            WebElement allow = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\")")));
if(allow.isDisplayed()){
    allow.click();
}
        }catch (NoSuchElementException | TimeoutException e){

        }

    }

    public void MlWarning(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        try{
            WebElement allow = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"This transaction requires additional authorisation to debit account: 0539938805\")")));
            if(allow.isDisplayed()){

            }
        }catch (NoSuchSessionException | TimeoutException e){


        }

    }


}
