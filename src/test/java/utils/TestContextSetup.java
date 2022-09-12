package utils;

import factories.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {
    private WebDriver driver;
    private TestBase testBase;
    private PageObjectManager pageObjectManager;

    public TestContextSetup(){
        testBase = new TestBase();
        driver = testBase.webDriverManager();
        pageObjectManager = new PageObjectManager(driver);
    }

    public PageObjectManager getPageObjectManager(){
        return pageObjectManager;
    }

    public WebDriver getDriver(){
        return driver;
    }

}
