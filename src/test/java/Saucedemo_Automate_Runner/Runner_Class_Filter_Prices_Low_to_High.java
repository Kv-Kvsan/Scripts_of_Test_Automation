package Saucedemo_Automate_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Saucedemo_Automation\\Saucedemo_Website_Price_Low_to_High.feature", glue = {"Saucedemo_Automate_Stepdefinitions"})
public class Runner_Class_Filter_Prices_Low_to_High {

}
