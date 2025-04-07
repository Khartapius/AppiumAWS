package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UtilityBills extends AndroidActions {
    AndroidDriver driver;
    public  UtilityBills(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.view.View[@index=2]")
    private WebElement meterName;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"SOSU ATSU MICHEAL\")")
            private WebElement meterName_amount;

    String PName = "SOSU ATSU MICHEAL";
    public void setMeterName(){
        String metername = meterName.getAttribute("contentDescription");
        Assert.assertEquals(metername,PName,"🧪Meter name should be 'SOSU ATSU MICHEAL' ");

    }

    //String name_amt = "SOSU ATSU MICHEAL Amount GHS 1.00 You will be charged GHS 1.00";
    String name_amt = "SOSU ATSU MICHEAL\\nP161152412\\nView details\\nTotal\\nGHS 1.00";
    public void setMeterName_amount(){
        //String Metername_Amount =meterName_amount.getAttribute("contentDescription").trim().toLowerCase().replaceAll("\\s+", " ");
        String Metername_Amount =meterName_amount.getAttribute("contentDescription").split("\\n")[4].replaceAll("[A-Z]","").replaceAll("\\s+", "");
        System.out.println("This are the meter details" + Metername_Amount);
        //Assert.assertEquals(Metername_Amount,name_amt,"🧪 Verifying the meter name and the purchase amount for ECG.");
   // Assert.assertTrue(Metername_Amount.contains(name_amt.trim().toLowerCase().replaceAll("\\s+", " ")),"🧪Verifying the meter name and the purchase amount for ECG.");
Assert.assertEquals(Metername_Amount,"1.00","🧪Verify purchase amount for ECG");
    }



}
