package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/Saucedemo_Login_Using_Non-Parameterization.feature", glue = {"stepDefinitions"})
public class Runner_Class_Login_Using_Non_Parameterization 
{
	

}
