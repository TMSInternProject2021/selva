package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.SearchByHubNameAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

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
        ac.click_addnew_action();
        ac.enter_details_action();
        ac.select_save_action();
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
        searchByHubNameAction.verifySearchByHubNameAction();
        System.out.println("User be able to see the hubs matching the search");
    }


}
