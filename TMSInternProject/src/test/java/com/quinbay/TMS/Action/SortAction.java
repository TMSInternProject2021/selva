package com.quinbay.TMS.Action;

import Pages.SortPage;
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
    public boolean verifySortDescendingOrderAction(){
        return Sort_page.verify_DescendingSort();
    }

}
