package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/Open_LeafgroundButtonMenu.feature", glue = {"stepDefinitions"})
public class Runner_Class_Open_LeafgroundButton_Module {
	
	
	
}
