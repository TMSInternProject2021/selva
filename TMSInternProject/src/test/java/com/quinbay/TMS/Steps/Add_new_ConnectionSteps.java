package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Add_new_ConnectionSteps {



    WebDriver driver;
    public Add_New_Connection_Action add_new_connection_action;

    @Given("User must stay on the Linehaul details page")
    public void userMustStayOnTheLinehaulDetailsPage() {
        driver=LoginSteps1.driver;
        add_new_connection_action= new Add_New_Connection_Action(driver);
        System.out.println("You are on the Linehaul detils web page");
    }

    @When("User clicks on the add new connection button")
    public void userClicksOnTheAddNewConnectionButton() {

        add_new_connection_action.click_addnew_action();

    }

    @And("User must enter all the valid details on the fields")
    public void userMustEnterAllTheValidDetailsOnTheFields() throws InterruptedException {
        add_new_connection_action.enter_details_action();

    }

    @Then("The connection will be established succesfully")
    public void theConnectionWillBeEstablishedSuccesfully() throws InterruptedException {
        add_new_connection_action.select_save_action();
        Thread.sleep(1000);
        System.out.println("Connection has been established");
    }




//





}
