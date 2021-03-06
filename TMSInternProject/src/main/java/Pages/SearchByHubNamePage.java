package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByHubNamePage {

    WebDriver driver;

    public SearchByHubNamePage(WebDriver webdriver){
        driver=webdriver;
    }

    @FindBy(xpath = "//div//input")
    WebElement searchbar;

    @FindBy(xpath = "//div[@class='option']")
    WebElement select_hub;

    String searchText;
    public void enter_HubName() throws InterruptedException {
        searchbar.click();
        Thread.sleep(3000);
        searchbar.sendKeys("TMS Hub");

        Thread.sleep(1000);
        searchText=select_hub.getText();
        select_hub.click();
    }

    @FindBy(xpath = "//div//button")
    WebElement click_search_icon;

   // @FindBy(xpath = "//div//input[@class='input-box-style pull-left search-bar']")


    @FindBy(xpath = "//tr//td[1]")
    WebElement org_result;
    @FindBy(xpath = "//tr//td[2]")
    WebElement des_result;


    //div//span[@class='overlay-text']--failed
    //div//span[@class='icon-cross pull-right cursor-pointer']--cross
    public void click_Search_Icon()
    {
        click_search_icon.click();
    }

    public boolean verifySearchByHubName(){
//       System.out.println(searchText);
//        System.out.println(org_result.getText());
//        System.out.println(des_result.getText());
        if(org_result.getText().equals(searchText) || des_result.getText().equals(searchText)){
            return true;
        }
        else
        {
            return  false;
        }

//        return true;

    }

}
