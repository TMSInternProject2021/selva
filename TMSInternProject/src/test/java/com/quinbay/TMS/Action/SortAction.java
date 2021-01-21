package com.quinbay.TMS.Action;

import com.quinbay.TMS.Pages.Add_New_Connection_Page;
import com.quinbay.TMS.Pages.SortPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SortAction {
    public SortPage Sort_page;
    public SortAction(WebDriver driver){
        Sort_page= PageFactory.initElements(driver, SortPage.class);
    }

    public void sort_Descending_action() throws InterruptedException {
        Sort_page.descending_Sort();
    }

}
