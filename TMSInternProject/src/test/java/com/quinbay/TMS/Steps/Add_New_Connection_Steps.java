package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.LoginAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Add_New_Connection_Steps {
    WebDriver driver;
    Add_New_Connection_Action action;

    @Given("Blibli Dashboard")
    public void blibli_dashboard() {




            System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            // js = (JavascriptExecutor) driver;
            driver.get("http://tmsuiapp-01.uata.lokal/tms-ui/settings/linehauldetails");
            action=new Add_New_Connection_Action(driver);

    }

    @When("I click on the Add new connection")
    public void i_click_on_the_add_new_connection() {
        action.click_addnew_action();


    }



    @When("Enter Destination hub name")
    public void enter_destination_hub_name() {

    }

    @When("Select the date from calendar")
    public void select_the_date_from_calendar() {

    }

    @When("Select the repeat from dropdown")
    public void select_the_repeat_from_dropdown() {

    }

    @When("Enter the start time")
    public void enter_the_start_time() {

    }

    @When("Enter the transit time")
    public void enter_the_transit_time() {

    }

    @When("Select the vehicle type")
    public void select_the_vehicle_type() {

    }

    @When("Click on save button")
    public void click_on_save_button() {

    }

    @Then("Linehaul Nework details page will be loaded")
    public void linehaul_nework_details_page_will_be_loaded() {

    }
}
