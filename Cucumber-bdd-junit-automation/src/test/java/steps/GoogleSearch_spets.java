package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Driver;

public class GoogleSearch_spets {
	@Given("user goes to google.com")
	public void user_goes_to_google_com() {
	    Driver.getDriver().get("https://google.com");
	}

	@When("user searches for an apple")
	public void user_searches_for_an_apple() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("user should see apple related result")
	public void user_should_see_apple_related_result() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
