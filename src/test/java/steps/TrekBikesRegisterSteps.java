package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TrekBikesRegisterPage;
import runner.base_class.BaseSteps;

public class TrekBikesRegisterSteps extends BaseSteps {

    TrekBikesRegisterPage TrekBikesRegisterPage = new TrekBikesRegisterPage();

    @Given("the trek register page is loaded")
    public void the_trek_register_page_is_loaded() {
    TrekBikesRegisterPage.OpenTrekRegisterPage();

    }

    @When("the user enters correct values to the fields and clicks on create new account")
    public void the_values_are_inserted_to_the_fields() {


    }

    @Then("the new user should be registered")
    public void the_trek_user_should_be_registered() {


    }
}
