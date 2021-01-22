package com.quinbay.TMS.Steps;


import com.quinbay.TMS.Action.LoginAction1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.google.common.base.Predicates.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps1 {

    public static WebDriver driver;
   public LoginAction1 action1;
    @Given("User must have valid credentials")
    public void user_must_have_valid_credentials() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // js = (JavascriptExecutor) driver;
        driver.get("http://tmsuiapp-01.uata.lokal/tms-ui/");
        action1=new LoginAction1(driver);

    }

    @When("User logs in")
    public void user_logs_in() throws InterruptedException {

        action1.login_Action();

    }

    @When("User clicks on the settings page")
    public void user_clicks_on_the_settings_page() {

        action1.select_Settings_Action();
    }

    @When("User navigates to the linehaul details")
    public void user_navigates_to_the_linehaul_details() {

        action1.navigation_To_linehaul_settings();

    }

    @And("User selects the hub and enters TMS hub")
    public void userSelectsTheHubAndEntersTMSHub() throws InterruptedException {
        action1.select_Hub_Action();
    }

    @Then("User lands on Linehaul page")
    public void user_lands_on_linehaul_page() {
        assertThat("Not Logged in successfully",action1.verifylogin_Action());
        System.out.println("On Linehaul details Page");
    }
}
