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

public class Login_SauceDemo_Application_Using_Non_Parameterization
{

	WebDriver driver;

	@Given("the user opens the URL of the Saucedemo")
	public void the_user_opens_the_url_of_the_saucedemo() throws InterruptedException
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
	@Then("the login page of the saucedemo site should be displayed")
	public void the_login_page_of_the_saucedemo_site_should_be_displayed() 
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
	@Then("the user can enter the Username as {string}")
	public void the_user_can_enter_the_username_as(String Username) throws InterruptedException
	{
		WebElement UN=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[1]"));
		UN.sendKeys("standard_user");
		
		String Name=UN.getAttribute("value");
		System.out.println("The Username is: " +Name);
		Thread.sleep(2000);

	}
	@Then("the user can enter the password as {string}")
	public void the_user_can_enter_the_password_as(String Password) throws InterruptedException 
	{
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[2]"));
		Pwd.sendKeys("secret_sauce");  
		
		String Pd=Pwd.getAttribute("value");
		System.out.println("The Password is: " +Pd);
		Thread.sleep(2000);

	}
	@When("the user clicks login button")
	public void the_user_clicks_login_button() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/input[3]"));
		Login.click();   
		Thread.sleep(3000);

	}
	@Then("the user should be directed to the inventory page of Saucedemo")
	public void the_user_should_be_directed_to_the_inventory_page_of_saucedemo() 
	{

		System.out.println(driver.getCurrentUrl());
	}
	@Then("the user can quit the browser")
	public void the_user_can_quit_the_browser() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}