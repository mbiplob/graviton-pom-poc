package com.graviton.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest{

    @Test
    public void registrationTest() throws InterruptedException {
        System.out.println("I am from the test method....");
        registrationPage.registerAccount();
    }

}
