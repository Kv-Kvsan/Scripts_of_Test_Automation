package stepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_SauceDemo_Sending_Data_Via_Table_Without_Header {

	WebDriver driver;
	
	@Given("the user launches the Saucedemo application")
	public void the_user_launches_the_saucedemo_application() throws InterruptedException
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
	
	@Then("the login page should be visible to the user")
	public void the_login_page_should_be_visible_to_the_user()
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
	@Then("the user enters valid login credentials")
	public void the_user_enters_valid_login_credentials(DataTable dataTable) throws InterruptedException {
		
		Map<String, String> credentials=dataTable.asMap(String.class, String.class);
		String username=credentials.get("username"); 
		String password=credentials.get("password"); 
		
		WebElement UN=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[1]"));
		UN.sendKeys(username);
		Thread.sleep(2000);
		
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[2]"));
		Pwd.sendKeys(password); 
		Thread.sleep(2000);
	    
	    
	}
	@When("the user submits the login form")
	public void the_user_submits_the_login_form() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[3]"));
		Login.click();   
		Thread.sleep(3000);
	    
	}
	@Then("the user should be redirected to the inventory page")
	public void the_user_should_be_redirected_to_the_inventory_page()
	{
		System.out.println(driver.getCurrentUrl());    
	    
	}
	@Then("the browser should be closed after verification")
	public void the_browser_should_be_closed_after_verification() throws InterruptedException
	{
		Thread.sleep(2000);
	    driver.quit();    
	}
}
