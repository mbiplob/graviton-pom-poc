package com.graviton.tests;

import org.testng.annotations.Test;

public class LoginPageDataDrivenTest extends BaseTest {

    @Test(dataProvider="ida")
    public void dataDrivenLoginTest(String paramID, String paramPass) throws InterruptedException {
        logInPage.login(paramID,paramPass);
        System.out.println("Login Completed!!!");
    }

}
