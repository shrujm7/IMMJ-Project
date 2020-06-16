package Immj;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\Immj\\AddComputer.feature",
        tags="@Test",
        plugin = {"pretty",
                "html:target/cucumber.html",
                "html:target/cucumber-reports/cucumber-pretty.html",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "html:test-output/cucumber-reports/cucumber-pretty.html",
                "json:test-output/cucumber-reports/CucumberTestReport.json",
                "rerun:test-output/cucumber-reports/rerun.txt"}
)
public class RunTest {

}
