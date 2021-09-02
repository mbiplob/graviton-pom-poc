package com.graviton.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    private WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

    //This method clicks on an element
    public void clickOnElement(WebElement element) throws InterruptedException {
        Thread.sleep(3000);
        highlightElement(element);
        element.click();
    }

    public void highlightElement(WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='solid 3px red'",element);
    }

    //This method enters text in a textBox
    public void textInput(WebElement element, String textToType){
        highlightElement(element);
        element.clear();
        element.sendKeys(textToType);
    }
}
