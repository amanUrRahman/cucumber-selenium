package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {

	@Given("^User is on Home Page$")
	public void user_is_on_home_page(){
		System.out.println("User is on Home Page");
	}

	@When("^User enter correct username and password$")
	public void user_enter_correct_username_and_password(){
		System.out.println("User enter correct username and password");
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully(){
		System.out.println("User is logged in successfully");
	}


}
