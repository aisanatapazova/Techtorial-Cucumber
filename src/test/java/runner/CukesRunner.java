package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com.cucumber.features.etsy/Etsy.feature",
        glue = "stepDefinitions",
        dryRun=false,
        monochrome = true  //prints out all the message from feature
)

public class CukesRunner {
}
