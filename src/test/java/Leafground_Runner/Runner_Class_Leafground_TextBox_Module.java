package Leafground_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Leafground_Feature_Files\\Verify_the_Leafground_TextBox_Module.feature", glue = {"Leafground_stepDefinitions"}, plugin = {
        "pretty",
        "html:test-output/cucumber-report_of_Leafground_TextBox_Module.html"})

public class Runner_Class_Leafground_TextBox_Module {

}
