package internet.Herookapp.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/HomePage.feature",
        glue = "internet.Herookapp.stepDefinitions.coom",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports"}
)



public class Runner {

}
