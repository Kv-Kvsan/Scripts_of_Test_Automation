package Saucedemo_Automate_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Saucedemo_Automation\\Saucedemo_Website_Filter_A_to_Z.feature", glue = {"Saucedemo_Automate_Stepdefinitions"})
public class Runner_Class_Filter_A_to_Z {

}
