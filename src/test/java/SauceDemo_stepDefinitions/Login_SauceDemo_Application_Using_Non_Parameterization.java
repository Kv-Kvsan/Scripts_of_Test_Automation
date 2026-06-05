package SauceDemo_stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SauceDemo_Application_Using_Non_Parameterization
{
	WebDriver driver;

	@Given("the user opens the URL of the Saucedemo")
	public void the_user_opens_the_url_of_the_saucedemo() throws InterruptedException
	{

		driver = Hooks_Saucedemo.driver;
		Thread.sleep(2000);

	}
	@Then("the login page of the saucedemo site should be displayed")
	public void the_login_page_of_the_saucedemo_site_should_be_displayed() 
	{

		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.saucedemo.com/";
		Assert.assertEquals(ExpectedURL, CurrentURL);
	}

	@Then("the user can enter the Username")
	public void the_user_can_enter_the_username() throws InterruptedException
	{
		WebElement UN=driver.findElement(By.xpath("//*[@id='user-name']"));
		UN.sendKeys("standard_user");

		String Name=UN.getAttribute("value");
		System.out.println("The Username is: " +Name);
		Thread.sleep(2000);
	}

	@Then("the user can enter the password")
	public void the_user_can_enter_the_password() throws InterruptedException 
	{
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='password']"));
		Pwd.sendKeys("secret_sauce");  

		String Pd=Pwd.getAttribute("value");
		System.out.println("The Password is: " +Pd);
		Thread.sleep(2000);

	}
	@When("the user clicks login button")
	public void the_user_clicks_login_button() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login-button']"));
		Login.click();   
		Thread.sleep(3000);

	}
	@Then("the user should be directed to the inventory page of Saucedemo")
	public void the_user_should_be_directed_to_the_inventory_page_of_saucedemo() 
	{

		System.out.println(driver.getCurrentUrl());
	}

	@Then("the user should logout from the page")
	public void the_user_should_logout_from_the_page() throws InterruptedException {

		WebElement threelines=driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']"));
		threelines.click();

		Thread.sleep(2000);

		WebElement logout=driver.findElement(By.xpath("//*[@id='logout_sidebar_link']"));
		logout.click();

	}
}