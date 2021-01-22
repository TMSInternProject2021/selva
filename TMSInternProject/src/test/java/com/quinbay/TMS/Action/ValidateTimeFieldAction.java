package com.quinbay.TMS.Action;

import Pages.ValidateTimeFieldPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidateTimeFieldAction {

    public ValidateTimeFieldPage validatePage;
    public ValidateTimeFieldAction(WebDriver driver){
        validatePage= PageFactory.initElements(driver, ValidateTimeFieldPage.class);
    }
    public  void click_addnew_action(){
        validatePage.click_Addnew();

    }


    public  void enter_details_action() throws InterruptedException {
        validatePage.origin_hub();
        validatePage.des_hub();
        validatePage.date();
        validatePage.repeat();
        validatePage.start_time();
        validatePage.transit_time();
        validatePage.vehicle_Type();


    }


    public  void select_save_action() throws InterruptedException {
        validatePage.click_Save();
    }
    public boolean verify_TimeFieldAction(){
        return validatePage.verify_ValidationofTimeField();
    }
}
