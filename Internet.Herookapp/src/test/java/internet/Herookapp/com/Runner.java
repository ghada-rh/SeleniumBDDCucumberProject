package internet.Herookapp.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "internet.Herookapp.stepDefinitions.coom",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html"}
)



public class Runner {

}
