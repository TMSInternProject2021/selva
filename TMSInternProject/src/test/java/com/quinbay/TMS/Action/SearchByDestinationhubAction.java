package com.quinbay.TMS.Action;

import com.quinbay.TMS.Pages.LoginPage1;
import com.quinbay.TMS.Pages.SearchByDestinationhubPage;
import com.quinbay.TMS.Pages.SortPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchByDestinationhubAction {

    SearchByDestinationhubPage searchByDestinationhubPage;



    public SearchByDestinationhubAction(WebDriver driver) {
        searchByDestinationhubPage= PageFactory.initElements(driver, SearchByDestinationhubPage.class);
    }

    public void click_Des_Hub_Action(){
        searchByDestinationhubPage.select_Des_Hub();
    }
    public void click_Hub_Action() throws InterruptedException {
        searchByDestinationhubPage.select_DestinationHub();
    }

}
