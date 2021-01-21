package com.quinbay.TMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidateTimeFieldPage {
    WebDriver driver;

    public  ValidateTimeFieldPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn']")
    WebElement addnewbutton;

    public void click_Addnew(){
        addnewbutton.click();
    }


    @FindBy(xpath = "//div//div//input[@class='input-box-style input dropdown large']")
    WebElement orghub;




    @FindBy(xpath = "//div[@class='search-result']//div[@class='option']")
    WebElement select_orghub;

    public void origin_hub() throws InterruptedException {
        orghub.click();
        Thread.sleep(1000);
        orghub.sendKeys("TMS Hub");
        select_orghub.click();
    }
    @FindBy(xpath = "(//div//input[@class='input-box-style input dropdown large'])[2]")
    WebElement deshub;
    @FindBy(xpath = "//div[@class='option']")
    WebElement sel_deshub;

    public void des_hub() throws InterruptedException {
        deshub.click();
        Thread.sleep(1000);
        deshub.sendKeys("Cep");
        sel_deshub.click();
    }
    @FindBy(xpath = "//div//input[@class='form-control']")
    WebElement date;
    @FindBy(xpath = "(//div[@class='DayPicker-Day'])[7]")
    WebElement sel_date;




    public void date() throws InterruptedException {
        date.click();
        Thread.sleep(1000);
        //sel_date.sendKeys(string);
        sel_date.click();
    }

    @FindBy(xpath = "//div//div[@class='repeat']")
    WebElement repeat;
    @FindBy(xpath = "(//div[@class='repeat-dropdown']//div[@class='option'])[2]")
    WebElement sel_repeat;
    public void repeat() throws InterruptedException {
        repeat.click();
        Thread.sleep(1000);
        //sel_date.sendKeys(string);
        sel_repeat.click();
    }

    @FindBy(xpath = "(//div[@class='input-block'])[3]//input[@class='input-box-style input']")
    WebElement start_time;

    public void start_time() throws InterruptedException {
        start_time.click();
        Thread.sleep(1000);
        start_time.sendKeys("25:03");
    }

    @FindBy(xpath = "(//div[@class='input-block'])[4]//input[@class='input-box-style input']")
    WebElement transit_time;
    public void transit_time() throws InterruptedException {
        transit_time.click();
        Thread.sleep(1000);
        transit_time.sendKeys("99:59");
    }



    @FindBy(xpath = "(//div[@class='input-block'])[5]//input")
    WebElement vehicle_type;
    @FindBy(xpath = "(//div[@class='input-block'])[5]//div[@class='option'][2]")
    WebElement select_vehicle_type;
    public void vehicle_Type() throws InterruptedException {

        vehicle_type.click();
        Thread.sleep(1000);

        select_vehicle_type.click();
    }

    @FindBy(xpath = "//div//button[@class='default-button pull-right marigin-top10 btn save']")
    WebElement save_button;
    public void click_Save() throws InterruptedException {
        Thread.sleep(1000);

        save_button.click();

    }

}
