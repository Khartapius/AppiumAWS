package com.Hubtel.pageObjects.android;

import com.Hubtel.utils.AndroidActions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CarInsuranceNewSticker extends AndroidActions {
    AndroidDriver driver;

    public CarInsuranceNewSticker(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
}
