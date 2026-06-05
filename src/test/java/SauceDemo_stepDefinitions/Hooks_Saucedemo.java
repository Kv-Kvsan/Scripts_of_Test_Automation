package SauceDemo_stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks_Saucedemo {

	public static WebDriver driver;	
	public static Properties prop;

	@Before
	public void setup() throws IOException, InterruptedException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\User Files\\Documents\\Scripts_of_Test_Automation\\config.properties");
		prop.load(fis);

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.password_manager_leak_detection", false);

		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}


	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();
	}
}
