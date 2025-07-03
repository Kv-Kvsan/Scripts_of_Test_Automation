package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/Open_Leafground_Site.feature", glue = {"stepDefinitions"})

public class Runner_Class_Open_Leafgroundsite {

	//The Runner_Class will combine the StepDefinition and Feature file
	//Define the way of Runner_Class
		
}