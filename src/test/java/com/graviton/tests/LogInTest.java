package com.graviton.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

    @Parameters({"emailID","password"})
    @Test
    public void loginTest(String paramID, String paramPass) throws InterruptedException {
        logInPage.login(paramID,paramPass);
    }


}
