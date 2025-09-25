package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/api/cucumber/Feature/login.feature"},glue = {"StepsDefination"},monochrome = true,
              plugin = {"pretty","html:target/HtmlReports1",
                      "junit:target/JUnitReports/report.xml",
                      "json:target/JSONReports/report.json"}
)
public class TestLoginRunner {
}
