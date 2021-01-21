package com.quinbay.TMS.Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
//    WebDriver driver;
//
//    public  LoginPage(WebDriver webDriver){
//        driver=webDriver;
//    }
    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//div//div//button[@class='default-button card_button']")
    WebElement click_ms;

   @FindBy(xpath = "//div//div//div[@class='Select-placeholder']")
    WebElement select_hub;
//div//div//div[@class='Select-placeholder']
    //div//div//div[@class='Select-input']
    //div//span[@id='react-select-3--value-item']
    @FindBy(xpath = "//div[@class='Select-menu-outer']")
    WebElement click_hub;



    @FindBy(xpath = "//div//span[@class='icon icon-settings']")
    WebElement settings;


    @FindBy(xpath = "//div//ul[@class='side-tab']//li[15]")
    WebElement Lin_details;

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement addnewbutton;
    @FindBy(xpath = "//div//div//input[@class='input-box-style input dropdown large']")
    WebElement orghub;
    @FindBy(xpath = "//div//div[@class='search-result']//div[@class='option']")
    WebElement sel_orghub;
    //div//div[@class='search-result']//div[@class='option']
  //  (//div//input[@class='input-box-style input dropdown large'])[2]

    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[2]")
    WebElement deshub;
    @FindBy(xpath = "//div[@class='option']")
    WebElement sel_deshub;

    @FindBy(xpath = "//div//input[@class='form-control']")
    WebElement date;
    @FindBy(xpath = "(//div[@class='DayPicker-Day'])[7]")
    WebElement sel_date;

    @FindBy(xpath = "//div//div[@class='repeat']")
    WebElement repeat;
    @FindBy(xpath = "(//div[@class='repeat-dropdown']//div[@class='option'])[2]")
    WebElement sel_repeat;

    @FindBy(xpath = "(//div[@class='input-block'])[3]//input[@class='input-box-style input']")
    WebElement start_time;

    @FindBy(xpath = "(//div[@class='input-block'])[4]//input[@class='input-box-style input']")
    WebElement transit_time;

    @FindBy(xpath = "(//div[@class='input-block'])[5]//input")
    WebElement vehicle_type;
    @FindBy(xpath = "(//div[@class='input-block'])[5]//div[@class='option'][2]")
    WebElement select_vehicle_type;

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn save']")
    WebElement save_button;

     @FindBy(xpath = "//*[contains(@class, 'Select-input')]/..")
     private WebElement hubSelectorDropDown;
     @FindBy(xpath = "//div[@class='Select-input']//input")
     private WebElement hubSelectorInput;

    @FindBy(xpath = "(//div//span[@class='icon-down-arrow up'])[2]")
    WebElement ascending_sort;

    @FindBy(xpath = "(//div//span[@class='icon-down-arrow down'])[2]")
    WebElement descending_sort;

//



    public void click_username(){
    username.click();
    }

    public  void enter_username(){
        username.sendKeys("tmsadmin");
    }

    public void click_password(){
        password.click();

    }

    public  void enter_password() throws InterruptedException {
        password.sendKeys("Test@2020");

        password.sendKeys(Keys.RETURN);
        Thread.sleep(1000);
    }

    public void click_Ms() throws InterruptedException {
        click_ms.click();
        Thread.sleep(1000);

    }

    public void select_hub(String hub) throws InterruptedException {

        hubSelectorDropDown.click();
        hubSelectorInput.sendKeys(hub);
        Thread.sleep(1000);
        hubSelectorInput.sendKeys(Keys.ENTER);
    }

    public void click_settings(){
        settings.click();
    }
    public void click_LinDetails(){
       // JavascriptExecutor js=(JavascriptExecutor) driver;

        Lin_details.click();
    }
    public void click_Addnew(){
        addnewbutton.click();
    }
    public void origin_hub(String string) throws InterruptedException {
        orghub.click();
        Thread.sleep(1000);
        orghub.sendKeys(string);
        sel_orghub.click();
    }

    public void des_hub(String string) throws InterruptedException {
        deshub.click();
        Thread.sleep(1000);
        deshub.sendKeys(string);
        sel_deshub.click();
    }

    public void date() throws InterruptedException {
        date.click();
        Thread.sleep(1000);
        //sel_date.sendKeys(string);
        sel_date.click();
    }

    public void repeat() throws InterruptedException {
        repeat.click();
        Thread.sleep(1000);
        //sel_date.sendKeys(string);
        sel_repeat.click();
    }

    public void start_time(String string) throws InterruptedException {
        start_time.click();
        Thread.sleep(1000);
        start_time.sendKeys(string);
    }
    public void transit_time(String string) throws InterruptedException {
        transit_time.click();
        Thread.sleep(1000);
        transit_time.sendKeys(string);
    }
    public void vehicle_Type() throws InterruptedException {

        vehicle_type.click();
        Thread.sleep(1000);

        select_vehicle_type.click();
    }


    public void click_Save() throws InterruptedException {
        Thread.sleep(1000);

        save_button.click();

    }

    public void click_Sort() throws InterruptedException {
        Thread.sleep(1000);

        ascending_sort.click();

    }

    public void descending_Sort() throws InterruptedException {
        Thread.sleep(1000);

        descending_sort.click();

    }



}
