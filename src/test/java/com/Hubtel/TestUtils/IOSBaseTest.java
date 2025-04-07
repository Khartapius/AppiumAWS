package com.Hubtel.TestUtils;

import com.Hubtel.utils.AppiumUtils;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class IOSBaseTest extends AppiumUtils {

    public AppiumDriverLocalService service;
    public IOSDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws IOException {
        //calling data property file which woeks like the env
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//Hubtel//resources//data.properties");
        prop.load(fis);

        String ipAddress = prop.getProperty("ipAddress");
        String port = prop.getProperty("port");
        String platformName = prop.getProperty("platformName");
        String deviceName = prop.getProperty("iosDeviceName");


        //service = startAppiumServer(ipAddress, Integer.parseInt(port));

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName(deviceName);
        options.setApp("/Users/joshuabroni/Desktop/UIKitCatalog.app");
        options.setNoReset(true);
        options.setFullReset(false);
        options.setCapability("appium:settings[ignoreUnimportantViews]", true);
        options.setPlatformVersion("17.5");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));


        driver = new IOSDriver(service.getUrl(), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }


    @AfterClass
    public void teardown() {
        driver.quit();
        service.stop();
    }


}


