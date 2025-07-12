package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Saucedemo_Login_Using_Sending_Data_Via_Table_With_MultiData {
	
	WebDriver driver;
	
	@Given("the user navigates to the Saucedemo site")
	public void the_user_navigates_to_the_saucedemo_site() throws InterruptedException
	{   
		WebDriverManager.chromedriver().setup();
		Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.password_manager_leak_detection", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(2000);
		
	}
	@Then("the login screen should appear to the user")
	public void the_login_screen_should_appear_to_the_user()
	{  
		String CurrenURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.saucedemo.com/v1/";
		if(CurrenURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("It is a login URL\n" +ExpectedURL);
		}
		else
		{
			System.out.println("It isn't a login URL");
		}    
	}
	@Then("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) throws InterruptedException
	{
	   
		WebElement UN=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[1]"));
		UN.sendKeys(username);
		Thread.sleep(2000);
		
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[2]"));
		Pwd.sendKeys(password); 
		Thread.sleep(2000);
		
	}
	@When("the user performs the login action")
	public void the_user_performs_the_login_action() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[3]"));
		Login.click();   
		Thread.sleep(3000);
	       
	}
	@Then("the user should land on the product inventory screen")
	public void the_user_should_land_on_the_product_inventory_screen() 
	{
		System.out.println(driver.getCurrentUrl());      
	}
	
	@Then("the application should terminate the browser session")
	public void the_application_should_terminate_the_browser_session() throws InterruptedException
	{
		Thread.sleep(2000);
	    driver.quit();      
	}
}

