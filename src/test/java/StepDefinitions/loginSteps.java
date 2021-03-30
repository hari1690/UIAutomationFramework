package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page step");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password step");
	}

	@And("clicks login button")
	public void clicks_login_button() {
		System.out.println("clicks login button step");
	}

	@Then("user is navigated to the Home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user is navigated to the Home page step");
	}



}
