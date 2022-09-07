package factories;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class PageObjectManager {

    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return new HomePage(driver);
    }
}
