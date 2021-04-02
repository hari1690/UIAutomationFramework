package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepDefinitions"},
plugin = {"pretty","junit:target/JUnitReports/report.xml",
			"json:target/JSONReports/report.JSON",
			"html:target/HtmlReports"},
monochrome=true
)
public class TestRunner {

}
