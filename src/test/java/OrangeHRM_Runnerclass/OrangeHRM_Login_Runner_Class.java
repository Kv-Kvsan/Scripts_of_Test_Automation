package OrangeHRM_Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_Files\\OrangeHRM_Parameterization\\OrangeHRM_Login_Application_Using_Parameterization.feature", tags="@Loginnegative or @LoginBlank", glue = {"OrangeHRM_StepDefinitions"}, plugin = {"pretty", "html:target/CucumberReports/OrangeHRMLogin.html"})
public class OrangeHRM_Login_Runner_Class {
	
}


