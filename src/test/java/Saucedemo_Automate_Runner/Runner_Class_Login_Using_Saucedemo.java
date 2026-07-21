package Saucedemo_Automate_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Saucedemo_Automation\\Saucedemo_Website_Automate.feature", glue = {"SauceDemo_stepDefinitions"})
public class Runner_Class_Login_Using_Saucedemo {

}
