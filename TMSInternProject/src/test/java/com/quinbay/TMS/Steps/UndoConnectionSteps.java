package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.UndoConnectionAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UndoConnectionSteps {
    WebDriver driver;
    public UndoConnectionAction undoConnectionAction;
    public Add_New_Connection_Action add_new_connection_action;


    @Given("User will be on the linehaul details page")
    public void userWillBeOnTheLinehaulDetailsPage() {
        driver=LoginSteps1.driver;
        undoConnectionAction= new UndoConnectionAction(driver);
        add_new_connection_action=new Add_New_Connection_Action(driver);
        System.out.println("User will be on the linehaul details page");
    }

    @And("The new connection must be created by user")
    public void theNewConnectionMustBeCreatedByUser() throws InterruptedException {
        add_new_connection_action.enterDetailsForUndoAction();
    }
    @When("User Clicks on the delete icon")
    public void userClicksOnTheDeleteIcon() throws InterruptedException {
        undoConnectionAction.del_Connection_Action();
    }

    @And("Select the undo option")
    public void selectTheUndoOption() {
        undoConnectionAction.undo_Connection_Action();
    }

    @Then("Validate whether the connection has been restored.")
    public void validateWhetherTheConnectionHasBeenRestored() {
        assertThat("Verify whether the connection is restored",undoConnectionAction.verify_UndoAction());
        //System.out.println("The connection has been restored");
    }


}
