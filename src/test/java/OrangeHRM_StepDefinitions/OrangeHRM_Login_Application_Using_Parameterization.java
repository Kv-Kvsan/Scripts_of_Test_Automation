package OrangeHRM_StepDefinitions;

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

public class OrangeHRM_Login_Application_Using_Parameterization {

	WebDriver driver;

	@Given("the user opens the URL of the OrangeHRM Demo application")
	public void the_user_opens_the_url_of_the_orange_hrm_demo_application() throws InterruptedException 
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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

	}

	@Then("the login page of the OrangeHRM Demo should be displayed")
	public void the_login_page_of_the_orange_hrm_demo_should_be_displayed()
	{

		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(CurrentURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("It is a dashboard URL\n" +ExpectedURL);
		}
		else
		{
			System.out.println("It isn't a dashboard URL");
		}    

	}

	@Then("the user should enter the Username as \"(.*?)\"$")
	public void the_user_should_enter_the_username_as(String Username) throws InterruptedException
	{
		WebElement UN=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div[1]/div[2]/input"));
		UN.sendKeys(Username);
		Thread.sleep(2000);    
	}

	@Then("the user should enter the password as {string}")
	public void the_user_should_enter_the_password_as(String Password) throws InterruptedException 
	{
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		Pwd.sendKeys(Password); 
		Thread.sleep(2000);    
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Login.click();   
		Thread.sleep(3000);        
	}


	@Then("the user should receive the message")
	public void the_user_should_receive_the_message()
	{
		WebElement Text=driver.findElement(By.xpath("//*[text()='Invalid credentials']"));
		String Message=Text.getText();
		System.out.println("The Error Message is: " +Message);
	}

	@Then("the user should get the error message for username")
	public void the_user_should_get_the_error_message_for_username()
	{
		WebElement UNRM=driver.findElement(By.xpath("(//*[text()='Required'])[1]"));
		String UNRMMessage=UNRM.getText();
		System.out.println("The Error Message is: " +UNRMMessage);
	}
	@Then("the user should get the error message for password")
	public void the_user_should_get_the_error_message_for_password()
	{
		WebElement PWDRM=driver.findElement(By.xpath("(//*[text()='Required'])[2]"));
		String PWDRMMessage=PWDRM.getText();
		System.out.println("The Error Message is: " +PWDRMMessage);    
	}
	
	@Then("the user should be directed to the dashboard page of OrangeHRM demo site")
	public void the_user_should_be_directed_to_the_dashboard_page_of_orange_hrm_demo_site()
	{
		System.out.println(driver.getCurrentUrl());    
	}

	@Then("the user can quit browser")
	public void the_user_can_quit_browser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();    
	}
}