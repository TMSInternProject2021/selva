package Pages;

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

    public void enter_HubName() throws InterruptedException {
        searchbar.click();
        Thread.sleep(3000);
        searchbar.sendKeys("TMS Hub");
        Thread.sleep(1000);
        select_hub.click();
    }

    @FindBy(xpath = "//div//button")
    WebElement click_search_icon;

    public void click_Search_Icon()
    {
        click_search_icon.click();
    }








}
