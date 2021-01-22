package com.quinbay.TMS.Steps;

import com.quinbay.TMS.Action.Add_New_Connection_Action;
import com.quinbay.TMS.Action.SearchByDestinationhubAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class SearchSteps {
    WebDriver driver;
    public SearchByDestinationhubAction searchByDestinationhubAction;

    @Given("User must be staying on the linehaul details page")
    public void userMustBeStayingOnTheLinehaulDetailsPage()
    {
        driver=LoginSteps1.driver;
       // searchByDestinationhubAction= new SearchByDestinationhubAction(driver);
        System.out.println("You are on the Linehaul detils web page to search");

    }

    @When("User clicks on the Destination Hub")
    public void userClicksOnTheDestinationHub() throws InterruptedException {
        Thread.sleep(1000);
        searchByDestinationhubAction= new SearchByDestinationhubAction(driver);
        searchByDestinationhubAction.click_Des_Hub_Action();

    }

    @And("Select the desired hub to search")
    public void selectTheDesiredHubToSearch() throws InterruptedException {
        searchByDestinationhubAction.click_Hub_Action();
    }

    @Then("User will be able to see the hubs matching the search")
    public void userWillBeAbleToSeeTheHubsMatchingTheSearch() {
        assertThat("Unsuccessfull search",searchByDestinationhubAction.verifySearchByDestinationhub_Action());
        System.out.println("User will be able to see the hubs matching the search based on destination hub");
    }



}
