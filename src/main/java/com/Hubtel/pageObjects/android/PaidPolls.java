package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Assert.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PaidPolls extends AndroidActions {
    AndroidDriver driver;

    public PaidPolls(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Paid Polls\")")
    private WebElement paidPollClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Paid Polls\")")
    private WebElement PaidPollHeading;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Media Kidz\n" +
            "Voting service For Media Kidz\")")
    private WebElement MediaKidz;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Error\n" +
            "Voting Service has ended \n" +
            "Okay\")")
    private WebElement errorMsg;

    @AndroidFindBy(className = "android.widget.ImageView")
    private List<WebElement> allPaidPolls;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"NO\")")
    private WebElement NOButton;

    @AndroidFindBy(className = "android.view.View")
    private List <WebElement> firstElement;

    @AndroidFindBy(className = "android.view.View")
    private List <WebElement> selectHundredVotes;

    @AndroidFindBy(className = "android.widget.ImageView")
    private WebElement awardDetailScreen;


    public void okayTap() {
        int x = 544;
        int y = 1344;
        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));
    }

    public void setPaidPollClick() {
        paidPollClick.click();
    }

    public void setPaidPollHeading() {
        Assert.assertTrue(PaidPollHeading.isDisplayed(), "🧪Paid Polls heading should be visible ");
    }


    public void okayClick() {

        WebElement ok = driver.findElement(AppiumBy.xpath("//*[contains(@content-desc, 'Okay')]"));
        Point point = ok.getLocation();
        int x = point.getX();
        int y = point.getY();

        driver.executeScript("mobile: clickGesture", ImmutableMap.of(
                "x", x,
                "y", y
        ));

    }
    String paidPollname;
    public void selectRandomElement(){

        try{
            if(!allPaidPolls.isEmpty()){
                Random random = new Random();
                int randomIndex = random.nextInt(allPaidPolls.size());
                WebElement randomElement = allPaidPolls.get(randomIndex);
                System.out.println("Selected Index: " + randomIndex);
                paidPollname = randomElement.getAttribute("contentDescription").split("\\n")[0];
                randomElement.click();

            }
        }catch(NoSuchElementException | TimeoutException e){

        }
    }
//
//    public void paidPollnameCheck(){
//        Assert.assertTrue(paidPollname);
//    }

    public void paidPollCompare(){
        String awardDescription = awardDetailScreen.getAttribute("contentDescription");
        Assert.assertEquals(awardDescription,paidPollname,"🧪The name of the paid poll selected should match the description on that paid poll details screen");
    }


    public void continueSession(){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement contSession = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Do you want to continue from previous session?\")")));


            if(contSession .isDisplayed()){
                NOButton.click();

            }
        }catch (TimeoutException | NoSuchElementException ignore){

        }

    }

    public void selectCategory() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement category = null;

        try {
            category = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Select Category\")")));
        } catch (TimeoutException e) {
            System.out.println("Element 'Select Category' not found within the timeout period.");
        }

        if (category != null && category.isDisplayed()) {
            try {
                firstElement.get(3).click();
            } catch (NoSuchElementException e) {
                System.out.println("Element to click not found: " + e.getMessage());
            }
        } else {
            System.out.println("Skipping click action as 'Select Category' element is not visible.");
        }
    }

    public void notNominee(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement notNomineeError = null;
        try{
            notNomineeError = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Error\n" +
                    "Sorry, not a nominee\n" +
                    "Okay\")")));
        }catch (TimeoutException ignore){

        }


        if(notNomineeError !=null && notNomineeError.isDisplayed()){
            driver.navigate().back();
            driver.navigate().back();
            selectRandomElement();
            continueSession();
            selectCategory();
            notNominee();
            setSelectHundredVotes();
        }


    }

    public void selectNominee(){
        firstElement.get(3).click();
    }

    public void setSelectHundredVotes(){
        selectHundredVotes.get(5).click();
    }

    public void tapConfirmButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement confirm = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Confirm\")")));
        WebElement cancel = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().description(\"Cancel\")")));

        try{
            if((confirm).isDisplayed()){
                confirm.click();
            }

        }catch (NoSuchElementException |TimeoutException ignored){

        }

    }



}
