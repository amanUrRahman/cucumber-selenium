package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class BasePage {

    protected void sendKeys(WebDriver driver, By locator, String keyword){
        driver.findElement(locator).sendKeys(keyword);
    }

    protected void submit(WebDriver driver, By locator){
        driver.findElement(locator).submit();
    }

    protected String getTitle(WebDriver driver){
        return driver.getTitle();
    }

    protected void switchToChildWindow(WebDriver driver){
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()){
            String nextWindow = iterator.next();
            if (!nextWindow.equals(currentWindow)){
                driver.switchTo().window(nextWindow);
                return;
            }

        }
    }
}
