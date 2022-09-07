package stepDefinition;

import factories.PageObjectManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class SearchStepDefinitions {

    TestContextSetup testContextSetup;
    PageObjectManager pageObjectManager;

    public SearchStepDefinitions(TestContextSetup testContextSetup){
        this.testContextSetup = testContextSetup;
        this.pageObjectManager = new PageObjectManager(testContextSetup.driver);
    }

    @Given("User is on the Home page")
    public void user_is_on_the_home_page() {
        System.out.println("User is on home page");

    }
    @When("User enters the product {string} and clicks on search")
    public void user_enters_the_product_and_clicks_on_search(String product) {
        HomePage homePage = pageObjectManager.getHomePage();
        homePage.enterSearch(product).clickSearch();
    }

    @Then("User is able to view the searched product")
    public void user_is_able_to_view_the_searched_product() {
        System.out.println("User is viewing the product");
    }

}
