package com.graviton.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //WebElements
    @FindBy(xpath="//a[@href ='/login']")
    WebElement loginBtn;
    @FindBy(id="username")
    WebElement emailforLogIn;
    @FindBy(id="password")
    WebElement passforLogIn;
    @FindBy(xpath="//*[@id='login']/form/button")
    WebElement loginButtonforLogin;



    public void login() throws InterruptedException {
        clickOnElement(loginBtn);
        textInput(emailforLogIn, "graviton100@graviton.com");
        textInput(passforLogIn, "graviton1");
        clickOnElement(loginButtonforLogin);

    }

    public void login(String userID, String pass) throws InterruptedException {
        clickOnElement(loginBtn);
        textInput(emailforLogIn, userID);
        textInput(passforLogIn, pass);
        clickOnElement(loginButtonforLogin);

    }

}
