package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchByDestinationhubPage<selected_hub> {
    WebDriver driver;
    //WebElement selected_hub;

    public  SearchByDestinationhubPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//label[text()='Destination hub']")
    WebElement click_destinationhub;

    public void select_Des_Hub(){
        click_destinationhub.click();
    }
    @FindBy(xpath = "//div//div//label[contains(text(),'TMS Hub')]")
    WebElement select_hub;

    @FindBy(xpath = "//div[@class='margin-b10']")

    WebElement click_out;
    @FindBy(xpath = "//div[@class='option']")
    public WebElement selected_hub;

    //selected_hub=driver.findElement(By.xpath("//div[@class='option']"));
String selected_hubText="";





    public void select_DestinationHub() throws InterruptedException {
        select_hub.click();
        Thread.sleep(3000);
        selected_hubText=selected_hub.getText();
        click_out.click();
    }

    @FindBy(xpath = "//tr//td[1]")
    WebElement org_result;
    @FindBy(xpath = "//tr//td[2]")
    WebElement des_result;

    public boolean verifySearchByDestinationhub(){


        if(org_result.getText().equals(selected_hubText) || des_result.getText().equals(selected_hubText)){
            return true;
        }
        else
        {
            return  false;
        }



    }

}
