package testRunners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinition")
public class SearchTestRunner extends AbstractTestNGCucumberTests {
}
