package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class LoginStepDefinitions {

	private TestContextSetup testContextSetup;

	public LoginStepDefinitions(TestContextSetup testContextSetup){
		this.testContextSetup = testContextSetup;
	}

	@Given("^User is on Landing Page$")
	public void user_is_on_landing_page(){
		HomePage homePage = testContextSetup.getPageObjectManager().getHomePage();
		Assert.assertEquals(homePage.getHomePageTitle(), "Google");
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
