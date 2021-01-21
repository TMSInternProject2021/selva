package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortPage {

    WebDriver driver;

    public  SortPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "(//div//span[@class='icon-down-arrow down'])[2]")
    WebElement descending_sort;

    public void descending_Sort() throws InterruptedException {
        Thread.sleep(1000);

        descending_sort.click();

    }
}
