package com.quinbay.TMS.Action;

//import com.quinbay.TMS.Pages.LoginPage;
import com.quinbay.TMS.Pages.LoginPage1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginAction1 {
    LoginPage1 loginPage1;
    public LoginAction1(WebDriver driver) {
        loginPage1= PageFactory.initElements(driver, LoginPage1.class);
    }


    public void login_Action() throws InterruptedException {
       // Thread.sleep(3000);
        loginPage1.enter_UserCredentials();
    }

    public void select_Hub_Action() throws InterruptedException {
        loginPage1.select_Hub();
    }
    public void select_Settings_Action(){
        loginPage1.select_Settings();
    }
    public void navigation_To_linehaul_settings(){
        loginPage1.navigation_ToLinehaulDetails();
    }
}
