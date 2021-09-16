package com.graviton.tests;

import com.graviton.pages.LogInPage;
import com.graviton.pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import static com.graviton.utils.ExcelReader.readExcelData;

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
        //WebDriverManager.firefoxdriver().setup();
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.navigate().to(baseURL);
    }

    @DataProvider(name="ida")
    public Object [][] loginData() throws IOException {

        Object [][] arrayObject = readExcelData();
        return arrayObject;
    }

}
