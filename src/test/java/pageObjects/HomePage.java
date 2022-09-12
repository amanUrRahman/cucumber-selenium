package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private WebDriver driver;
    private By searchInputBox = By.xpath("//input[@name='q']");
    private By searchButton = By.xpath("//input[@name='btnK']");

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }


    public HomePage enterSearch(String keyword){
        sendKeys(driver,searchInputBox,keyword);
        return this;
    }

    public void clickSearch(){
        submit(driver, searchButton);
    }

    public String getHomePageTitle(){
        return getTitle(driver);
    }

}
