package com.graviton.tests;

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

    @BeforeClass
    public void setup(){
        init();
        registrationPage = new RegistrationPage(driver);
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
