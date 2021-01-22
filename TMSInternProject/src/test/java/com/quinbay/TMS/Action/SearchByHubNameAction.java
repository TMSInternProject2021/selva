package com.quinbay.TMS.Action;

import Pages.Add_New_Connection_Page;
import Pages.SearchByHubNamePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchByHubNameAction {

    public SearchByHubNamePage searchByHubNamePage;

    public SearchByHubNameAction(WebDriver webDriver){
        searchByHubNamePage= PageFactory.initElements(webDriver,SearchByHubNamePage.class);
    }

    public void enter_HubName_Action() throws InterruptedException {
        searchByHubNamePage.enter_HubName();
    }

    public void click_Search_Icon_Action(){
        searchByHubNamePage.click_Search_Icon();
    }

    public boolean verifySearchByHubNameAction(){
       return searchByHubNamePage.verifySearchByHubName();
    }


}
