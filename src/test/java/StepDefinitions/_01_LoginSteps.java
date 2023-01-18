package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("User enter username and password and click login button")
    public void userEnterUsernameAndPasswordAndClickLoginButton() {
        dc.findAndSendKeys("username","turkeyts");
        dc.findAndSendKeys("password","TechnoStudy123");
        dc.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.findAndVerify("dasboard","Dashboard");
    }
}
