package Pages;

import org.openqa.selenium.By;
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


    public boolean verify_DescendingSort(){
        boolean flag=true;
        WebElement count=driver.findElement(By.xpath("(//div//span[@class='bold-font'])[3]"));
        int count_val=Integer.parseInt(count.getText());
        count_val+=1;
       // System.out.println(count_val);
          int i=1;
        while(i+1!=count_val){

           WebElement ele=driver.findElement(By.xpath("//tr["+i+"]//td[2]"));
           WebElement ele2=driver.findElement(By.xpath("//tr["+(i+1)+"]//td[2]"));

            if(ele2!=null && ele.getText().compareTo(ele2.getText())<0){

                flag=false;
                break;
            }
            //System.out.println(ele.getText()+" "+ele2.getText());
            //System.out.println(ele2.getText());
            i++;
       }

        return flag;
    }
}
