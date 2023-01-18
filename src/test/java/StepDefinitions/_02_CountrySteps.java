package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {

    DialogContent dc = new DialogContent();
    LeftNav lf = new LeftNav();

    @And("Navigate to Country Page")
    public void navigateToCountryPage() {

        lf.findAndClick("setupButton");
        lf.findAndClick("parameters");
        lf.findAndClick("countries");

    }

    @When("User create a Country")
    public void userCreateACountry() {
        String randomGenName = RandomStringUtils.randomAlphabetic(8);
        String randomNumber = RandomStringUtils.randomNumeric(4);

        dc.findAndClick("addButton");
        dc.findAndSendKeys("nameInput",randomGenName);
        dc.findAndSendKeys("codeInput",randomNumber);
        dc.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndVerify("successMessage","success");
    }
}
