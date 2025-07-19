package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/Amazon_Login.feature", glue = {"stepDefinitions"}, tags="@hooks")
public class Runner_Class_Amazon_Login {

}
