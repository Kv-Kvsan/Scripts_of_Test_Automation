package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks_For_Leafground
{

	public static WebDriver driver;
	public static ExtentReports extentReport;
	public static ExtentTest test;
	public static ExtentSparkReporter sparkReport;
	

	@Before(order=1)
	public void extents()
	{
		extentReport=new ExtentReports();
		sparkReport = new ExtentSparkReporter("test-output/ExtentReport_Alert_BDD.html");
		extentReport.attachReporter(sparkReport);
	}
	
	@Before(order=2)
	public void Chrome_setup() throws InterruptedException
	{
		test=extentReport.createTest("Open the leafground browser");
		test.log(Status.INFO, "Verifying the leafground browser");
		
		WebDriverManager.chromedriver().setup();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.password_manager_leak_detection", false);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/125.0.0.0 Safari/537.36");
		driver=new ChromeDriver(options);

	}

	@Before(order=3)
	public void leafgroundsite() throws InterruptedException
	{
		test.pass("I am automating an alert module");
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);
	}

	@After(order=1)
	public void Leafground_teardown()
	{
		driver.quit();
		extentReport.flush();
	}
}

