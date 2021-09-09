package com.graviton.tests;

import com.graviton.pages.LogInPage;
import com.graviton.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
   public WebDriver driver;
   String baseURL = "https://demo.broadleafcommerce.org/";

   //Test Classes
    protected RegistrationPage registrationPage;
    protected LogInPage logInPage;

    @BeforeClass
    public void setup(){
        init();
        registrationPage = new RegistrationPage(driver);
        logInPage = new LogInPage(driver);
    }

    @AfterClass
    public void teardown(){
        if(driver != null){
            driver.quit();
        }
    }

    public void init(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.navigate().to(baseURL);
    }
}
