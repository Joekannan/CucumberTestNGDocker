package runner;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.BaseTest;


@CucumberOptions(
        features = "./src/test/resources/features",
        glue="stepDefinition",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )

public class TestRunner extends AbstractTestNGCucumberTests {
	
//	@Override
//    @DataProvider(parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }
	
	BaseTest base = new BaseTest();
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setUp(String Browser) throws MalformedURLException {
		base.initialisationDriver(Browser);
	}
	
	@AfterMethod
	public void tearDown() {
		base.closeDriver();
	}
	

}
