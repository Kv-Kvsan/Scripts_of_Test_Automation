package stepDefinitions;

import java.util.HashMap;
import java.util.List;
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

public class Login_SauceDemo_Sending_Data_Via_Table {
	
	WebDriver driver;
	
	@Given("the user opens the URL of the Saucedemo URL")
	public void the_user_opens_the_url_of_the_saucedemo_url() throws InterruptedException {
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
	@Then("the login page of the saucedemo page should be displayed")
	public void the_login_page_of_the_saucedemo_page_should_be_displayed() 
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
	@Then("the user should enter the below credentials")
	public void the_user_should_enter_the_below_credentials(DataTable dataTable) throws InterruptedException {
	   
		List<String> credentials=dataTable.asList(String.class);
		String username=credentials.get(0); 
		String password=credentials.get(1); 
		
		WebElement UN=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[1]"));
		UN.sendKeys(username);
		Thread.sleep(2000);
		
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[2]"));
		Pwd.sendKeys(password); 
		Thread.sleep(2000);
	}
	
	@When("the user clicks login")
	public void the_user_clicks_login() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[3]"));
		Login.click();   
		Thread.sleep(3000);
	}
	
	@Then("the user will be directed to the inventory page of Saucedemo site")
	public void the_user_will_be_directed_to_the_inventory_page_of_saucedemo_site()
	{
	    
		System.out.println(driver.getCurrentUrl());
	}
	
	@Then("the user can quit the chrome browser")
	public void the_user_can_quit_the_chrome_browser() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
