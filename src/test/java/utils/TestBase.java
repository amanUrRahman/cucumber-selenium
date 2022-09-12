package utils;

import enums.browserType;
import exceptions.BrowserException;
import exceptions.FileException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class TestBase {

    private WebDriver driver;
    private static Properties properties;
    private static FileInputStream fileInputStream;


    static {
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            throw new FileException("Global properties file is not present");
        }
    }

    public WebDriver webDriverManager() {
        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase(browserType.CHROME.getBrowser())){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (properties.getProperty("browser").equalsIgnoreCase(browserType.FIREFOX.getBrowser())){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (properties.getProperty("browser").equalsIgnoreCase(browserType.EDGE.getBrowser())){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new BrowserException("Browser selection is Invalid");
        }
        driver.get(properties.getProperty("url"));
        return driver;
    }
}
