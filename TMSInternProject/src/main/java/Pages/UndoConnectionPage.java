package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UndoConnectionPage {

    WebDriver driver;

    public UndoConnectionPage(WebDriver webDriver){
        driver=webDriver;
    }

    @FindBy(xpath = "//div//tr[1]//img[@class='icon margin-l10']")
    WebElement delete_icon;

    @FindBy(xpath = "//div//button[@class='undo-button']")
    WebElement undo_button;
    public void del_connection() throws InterruptedException {
        delete_icon.click();
        Thread.sleep(3000);

    }
    public  void undo_connection(){
        undo_button.click();

    }




}
