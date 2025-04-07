package com.Hubtel.TestUtils;

import com.Hubtel.Melcom.melcom;
import com.Hubtel.pageObjects.android.*;

import com.Hubtel.utils.AppiumUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class AndroidBaseTest extends AppiumUtils {

    public Airtime airtime;

    public AppiumDriverLocalService service;
    public AndroidDriver driver;
    public InternetData internetData;
    public Send_Money sendMoney;
    public Car_Insurance carInsurance;
    public Home_Screen homePage;
    public CarInsuranceNewSticker carInsuranceNewSticker;
    public PaidPolls paidPoll;
   public Events_Tickets eventTicket;
    public SMS_Manual_Method smsManual;
    public  UtilityBills  utilityBills;
    public All_Meals allMeals;
    public All_Meals allMealsSpecific;
    public profile profile;
public All_Groceries  allGroceries;
public All_Groceries_Circle circleAllGroceries;
public Melcom melcom;
    @BeforeMethod
    public void preSetup() throws InterruptedException {

      driver.pressKey(new KeyEvent().withKey(AndroidKey.APP_SWITCH));


        //use this for browserstack
        // driver.executeScript("mobile: shell", ImmutableMap.of("command", "input keyevent KEYCODE_APP_SWITCH"));
      //  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
//
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "left", 0, "top", 0, "width", 505, "height", 435,
                "direction", "up",
                "percent", 1.0
        ));




//        Thread.sleep(2000);
//        driver.executeScript("mobile: shell", ImmutableMap.of("command", "am start -n com.hubtel.hcb/com.hubtel.hcb.MainActivity"));

        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of("intent", "com.hubtel.hcb/com.hubtel.hcb.MainActivity"
        ));
    }

    @AfterMethod
    public void HomeButtonClick() {
       // driver.pressKey(new KeyEvent(AndroidKey.HOME));

        //use this for browserstack
       // driver.executeScript("mobile: shell", ImmutableMap.of("command", "input keyevent KEYCODE_HOME"));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }

    @BeforeClass
    public void ConfigureAppium() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//Hubtel//resources//data.properties");
        String ipAddress = System.getProperty("ipAddress") != null ? System.getProperty("ipAddress") : prop.getProperty("ipAddress");
        prop.load(fis);

        // String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");
        String platformName = prop.getProperty("platformName");
        String appPackage = prop.getProperty("appPackage");
        String appActivity = prop.getProperty("appActivity");
        String deviceName = prop.getProperty("deviceName");

        service = startAppiumServer(ipAddress, Integer.parseInt(port));

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(platformName);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setAppPackage(appPackage);
        options.setAppActivity(appActivity);
        options.setDeviceName(deviceName);
        //options.setApp(System.getProperty("user.dir")+"/Apps/hubtel.apk");
        options.setNoReset(true);
        options.setFullReset(false);
        options.setCapability("appium:settings[ignoreUnimportantViews]", true);

        driver = new AndroidDriver(service.getUrl(), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        airtime = new Airtime(driver);

        internetData = new InternetData(driver);

        sendMoney = new Send_Money(driver);

        carInsurance = new Car_Insurance(driver);

        homePage = new Home_Screen(driver);
        utilityBills = new UtilityBills  (driver);
        carInsuranceNewSticker = new CarInsuranceNewSticker(driver);
        eventTicket = new Events_Tickets(driver);
        paidPoll = new PaidPolls(driver);
        smsManual = new SMS_Manual_Method(driver);
        allMeals = new All_Meals(driver);
        profile = new profile(driver);
        allGroceries = new All_Groceries(driver);
     circleAllGroceries = new All_Groceries_Circle(driver);
      melcom = new Melcom(driver);
      allMealsSpecific =   new All_Meals(driver);
    }


    @AfterClass
    public void teardown() {
        driver.quit();
        service.stop();
    }


}


