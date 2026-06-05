package SauceDemo_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\SauceDemo_Feature_Files\\Saucedemo_Login_Using_Non-Parameterization.feature", glue = {"SauceDemo_stepDefinitions"})
public class Runner_Class_Login_Using_Non_Parameterization 
{
	
}
