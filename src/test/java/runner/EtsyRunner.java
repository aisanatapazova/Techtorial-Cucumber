package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.cucumber.features.etsy/Etsy.feature",
        glue = "stepDefinitions",
        monochrome = true,
        dryRun = false
)
public class EtsyRunner {
}
