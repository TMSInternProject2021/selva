package com.quinbay.TMS.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByDestinationhubPage {
    WebDriver driver;

    public  SearchByDestinationhubPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//label[text()='Destination hub']")
    WebElement click_destinationhub;

           // (//div//span[@class='flex-box'])[2]//label[@class='clickable']


    public void select_Des_Hub(){
        click_destinationhub.click();
    }
    @FindBy(xpath = "//div//div//label[contains(text(),'TMS Hub')]")
            //div[@class='hub-dropdown']//div[@class='option unchecked'][43]
    WebElement select_hub;

    @FindBy(xpath = "//div[@class='margin-b10']")

    WebElement click_out;

    public void select_DestinationHub() throws InterruptedException {
        select_hub.click();
        Thread.sleep(3000);
        click_out.click();
    }

}
