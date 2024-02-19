package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageUnicef;
import runner.base_class.BaseSteps;

public class DonateSteps extends BaseSteps {
    HomePageUnicef homePage = new HomePageUnicef();

    @Given("The worldwide home page is loaded")
    public void the_worldwide_home_page_is_loaded() {
        homePage.GetHomePage();

    }

    @When("the user clicks on donate and gets redirected")
    public void the_user_clicks_on_donate_and_gets_redirected() {
        homePage.clickDonateButton();
    }

    @Then("the user should be able to donate")
    public void the_user_should_be_able_to_donate() {

    }
}
