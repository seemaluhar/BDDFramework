package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\software\\BDDFramework\\src\\test\\resources\\Features\\Register.feature",
        glue = {"StepDefinition"}
)

public class TestRunner {
}
