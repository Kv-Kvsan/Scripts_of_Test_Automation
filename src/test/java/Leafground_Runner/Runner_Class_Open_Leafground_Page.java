package Leafground_Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Leafground_Feature_Files\\Open_Leafground_Webpage.feature", glue = {"Leafground_stepDefinitions"})

public class Runner_Class_Open_Leafground_Page {

}

