package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to site")
    public void navigateToSite() {
        GWD.getDriver().get("https://test.mersys.io/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("User enter username and password and click login button")
    public void userEnterUsernameAndPasswordAndClickLoginButton() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(dc.username));
        dc.username.sendKeys("turkeyts");
        dc.password.sendKeys("TechnoStudy123");
        dc.loginButton.click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {

    }
}
