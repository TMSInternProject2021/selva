package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.SortAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SortSteps {
    WebDriver driver;
    public SortAction sortAction;

    @Given("User must be on the linehaul deails page")
    public void userMustBeOnTheLinehaulDeailsPage() {

        driver=LoginSteps1.driver;
        sortAction= new SortAction(driver);
        System.out.println("You are on the Linehaul detils web page");
    }

    @When("User click the destination hub down arrow")
    public void userClickTheDestinationHubDownArrow() throws InterruptedException {
        sortAction.sort_Descending_action();
    }

    @Then("User be able to see the descending sorted linehaul details")
    public void theUserWillBeNavigatedToTheResultPage() {
        assertThat("Verify whether the destination hub is sorted in descending order",sortAction.verifySortDescendingOrderAction());


       // System.out.println("The user be able to see the descending sorted linehaul details");
    }
}
