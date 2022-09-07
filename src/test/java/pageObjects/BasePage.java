package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected void sendKeys(WebDriver driver, By locator, String keyword){
        driver.findElement(locator).sendKeys(keyword);
    }

    protected void submit(WebDriver driver, By locator){
        driver.findElement(locator).submit();
    }
}
