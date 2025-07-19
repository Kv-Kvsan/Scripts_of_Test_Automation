package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static stepDefinitions.Hooks_in_Cucumber.driver;

public class Amazon_Login {
	
	@Given("the user launches the Amazon application")
	public void the_user_launches_the_amazon_application() 
	{
	   
	    
	}
	@When("the user clicks the Sign-in button")
	public void the_user_clicks_the_sign_in_button()
	{
	   WebElement Signin=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/a"));
	   Signin.click();
	    
	}
	@Then("the user should be redirected to the Sign-in page where the user can enter the valid credentials")
	public void the_user_should_be_redirected_to_the_sign_in_page_where_the_user_can_enter_the_valid_credentials(DataTable dataTable) throws InterruptedException
	{
	   
		Map<String, String> credentials=dataTable.asMap(String.class, String.class);
		String username=credentials.get("username"); 
		String password=credentials.get("password"); 
		
		WebElement UN=driver.findElement(By.xpath("//*[@id='ap_email_login']"));
		UN.sendKeys(username);
		Thread.sleep(3000);
		
		WebElement continuebtn=driver.findElement(By.xpath("//*[@id='continue']/span/input"));
		continuebtn.click();
		Thread.sleep(3000);
		
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='ap_password']"));
		Pwd.sendKeys(password); 
		Thread.sleep(3000);
		
	}
	
	@Then("the user can click the Sign-in button")
	public void the_user_can_click_the_sign_in_button()
	{
	   
	    WebElement login=driver.findElement(By.xpath("//*[@id=\"auth-signin-button\"]/span/input"));
	    login.click();
	}
	
	@Then("the user should be redirected to the Amazon home page")
	public void the_user_should_be_redirected_to_the_amazon_home_page()
	{
		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.amazon.in/?ref_=nav_ya_signin";
		if(CurrentURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("It is a login URL\n" +ExpectedURL);
		}
		else
		{
			System.out.println("It isn't a login URL");
		}
	    
	}
	@Then("the user can close the browser once the login is successfully done")
	public void the_user_can_close_the_browser_once_the_login_is_successfully_done()
	{
	   
	    
	}
}
