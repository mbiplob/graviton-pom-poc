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
    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    WebElement profileLink;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutButton;



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
        System.out.println("Clicked on Login Button");
        Thread.sleep(5000);
        clickOnElement(profileLink);
        System.out.println("Clicked on profile");
        Thread.sleep(2000);
        clickOnElement(logoutButton);
        System.out.println("Clicked on LogOut Button");
    }

}
