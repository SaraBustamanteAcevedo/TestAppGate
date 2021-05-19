package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/feature/",
    glue = "stepDefinitions",
    plugin = {"pretty",
        "html:target/cucumberReports/mobile/html",
        "json:target/cucumberReports/mobile/json"
    })
public class RunnerTest {

}
