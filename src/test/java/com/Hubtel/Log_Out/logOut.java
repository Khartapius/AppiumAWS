package com.Hubtel.Log_Out;

import com.Hubtel.TestUtils.AndroidBaseTest;
import com.Hubtel.TestUtils.Listeners;
import com.Hubtel.TestUtils.reusecodes;
import org.testng.annotations.Test;

public class logOut extends AndroidBaseTest {
    @Test
    public void LogOut() throws InterruptedException {
//        reusecodes login = new reusecodes(driver);
//        Listeners.logTestStart("Login into Hubtel home screen");
//        login.login();

        reusecodes logOut1 = new reusecodes(driver);
        logOut1.logOut();
    }

}
