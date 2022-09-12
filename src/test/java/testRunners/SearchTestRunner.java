package testRunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = {"src/test/java/features/SearchProduct.feature"},
        glue = "stepDefinition",
        tags = "@Search",
        plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
public class SearchTestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
