package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.ValidateTimeFieldAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ValidateTimeFieldSteps {

    WebDriver driver;
    public ValidateTimeFieldAction validateTimeFieldAction;

    @Given("The user must be on the Add new connection page")
    public void theUserMustBeOnTheAddNewConnectionPage() {
        driver=LoginSteps1.driver;
        validateTimeFieldAction= new ValidateTimeFieldAction(driver);
        validateTimeFieldAction.click_addnew_action();
    }

    @When("User enter invalid values in the start time field")
    public void userEnterInvalidValuesInTheStartTimeField() throws InterruptedException {
        validateTimeFieldAction.enter_details_action();

    }

    @And("User clicks on the save button")
    public void userClicksOnTheSaveButton() throws InterruptedException {
        validateTimeFieldAction.select_save_action();
    }

    @Then("Mandatory error message will be displayed")
    public void mandatoryErrorMessageWillBeDisplayed() {
    assertThat("Verify whether the error message is displayed",validateTimeFieldAction.verify_TimeFieldAction());
        //System.out.println("Validation of time field is tested----'Mandatory error message will be displayed'");
    }
}
