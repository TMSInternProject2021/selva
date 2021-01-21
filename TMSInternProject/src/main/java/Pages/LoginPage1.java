package com.quinbay.TMS.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class LoginPage1 {
   WebDriver driver;

   public  LoginPage1(WebDriver webDriver){
       driver=webDriver;
   }

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    public void enter_UserCredentials() throws InterruptedException {
       // username.click();
        username.sendKeys("tmsadmin");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       // password.click();
        password.sendKeys("Test@2020");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        password.sendKeys(Keys.RETURN);
        Thread.sleep(1000);

    }

    @FindBy(xpath = "//div//div//button[@class='default-button card_button']")
    WebElement click_ms;

    @FindBy(xpath = "//*[contains(@class, 'Select-input')]/..")
     WebElement hubSelectorDropDown;
    @FindBy(xpath = "//div[@class='Select-input']//input")
     WebElement hubSelectorInput;

    @FindBy(xpath = "//div//span[@class='icon icon-settings']")
    WebElement settings;
    @FindBy(xpath = "//div//ul[@class='side-tab']//li[15]")
    WebElement Lin_details;


    public void select_Hub() throws InterruptedException {

        click_ms.click();
        Thread.sleep(1000);

try {
    hubSelectorDropDown.click();


    hubSelectorInput.sendKeys("TMS Hub");


    hubSelectorInput.sendKeys(Keys.ENTER);
} catch(Exception e){
    throw new RuntimeException("Unable to select hub from dropdown",e);
}

    }
    public void select_Settings(){

        settings.click();

    }
    public void navigation_ToLinehaulDetails(){

        Lin_details.click();

    }



}
