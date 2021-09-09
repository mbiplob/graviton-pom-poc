package com.graviton.tests;

import org.testng.annotations.Test;

public class LoginPageTest  extends BaseTest{

    @Test
    public void loginPageTest() throws InterruptedException {
        logInPage.login();
    }

}
