package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_Files/Saucedemo_Login_Sending_Data_Via_Table_Without_Header.feature", glue = {"stepDefinitions"})
public class Runner_Class_Sending_Data_Via_Table_Without_Header {

}
