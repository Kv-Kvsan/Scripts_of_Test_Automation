package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/", glue = {"stepDefinitions"}, plugin = {
        "pretty",
        "html:target/cucumber-reports/report.html",
        "json:target/cucumber-reports/report.json",
        "junit:target/cucumber-reports/report.xml"
        })
public class Runner_Class_Execute_At_Once {

}
