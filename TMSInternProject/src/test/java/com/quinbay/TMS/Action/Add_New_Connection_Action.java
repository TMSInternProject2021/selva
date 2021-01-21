package com.quinbay.TMS.Action;

import com.quinbay.TMS.Pages.Add_New_Connection_Page;
import com.quinbay.TMS.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Add_New_Connection_Action {
    public Add_New_Connection_Page ANCPage;
    public Add_New_Connection_Action(WebDriver driver){
        ANCPage= PageFactory.initElements(driver, Add_New_Connection_Page.class);
    }
    public  void click_addnew_action(){
        ANCPage.click_Addnew();

    }


    public  void enter_details_action() throws InterruptedException {
        ANCPage.origin_hub();
        ANCPage.des_hub();
        ANCPage.date();
        ANCPage.repeat();
        ANCPage.start_time();
        ANCPage.transit_time();
        ANCPage.vehicle_Type();
    }


    public  void select_save_action() throws InterruptedException {
        ANCPage.click_Save();
    }

    public void enterDetailsForUndoAction() throws InterruptedException {
        ANCPage.click_Addnew();
        ANCPage.enterDetailsForUndo();
    }



}
