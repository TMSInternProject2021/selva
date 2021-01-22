package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.SearchByHubNameAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SearchByHubNameSteps {
    WebDriver driver;
    SearchByHubNameAction searchByHubNameAction;
    Add_New_Connection_Action ac;


    @Given("User must be staying on the linehaul details web page")
    public void userMustBeStayingOnTheLinehaulDetailsWebPage() {
        driver=LoginSteps1.driver;
        searchByHubNameAction=new SearchByHubNameAction(driver);
        ac=new Add_New_Connection_Action(driver);
        System.out.println("User must be staying on the linehaul details web page");

    }
    @And("The user creates new connection")
    public void theUserCreatesNewConnection() throws InterruptedException {


        ac.enterDetailsForSearchByHubAction();

    }


    @When("User Enters the desired hubname in the search bar")
    public void userEntersTheDesiredHubnameInTheSearchBar() throws InterruptedException {
        searchByHubNameAction.enter_HubName_Action();

    }

    @And("User clicks on the search icon")
    public void userClicksOnTheSearchIcon() {
        searchByHubNameAction.click_Search_Icon_Action();
    }

    @Then("User be able to see the hubs matching the search")
    public void userBeAbleToSeeTheHubsMatchingTheSearch() {
        assertThat("Verify whether the results are based on given hub on search bar", searchByHubNameAction.verifySearchByHubNameAction());
        System.out.println("User be able to see the hubs matching the search");

    }


}
