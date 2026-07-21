package Saucedemo_Automate_Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SauceDemo_Application {

	WebDriver driver;

	@Given("the user opens the URL of the Saucedemo application")
	public void the_user_opens_the_url_of_the_saucedemo_application() throws InterruptedException {

		driver = Hooks_Saucedemo_Automate.driver;
		Thread.sleep(2000);

	}
	@Then("the login page of the saucedemo should be displayed")
	public void the_login_page_of_the_saucedemo_should_be_displayed()
	{

		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.saucedemo.com/";
		
		System.out.println(CurrentURL);
		System.out.println(ExpectedURL);
		
		Assert.assertEquals(ExpectedURL, CurrentURL);
	}

	@Then("^the user should enter the Username as \"(.*?)\"$")
	public void the_user_should_enter_the_username_as(String Username) throws InterruptedException {

		WebElement UN=driver.findElement(By.xpath("//*[@id='user-name']"));
		UN.sendKeys(Username);
		Thread.sleep(2000);

	}

	@Then("^the user should enter the password as \"(.*?)\"$")
	public void the_user_should_enter_the_password_as(String Password) throws InterruptedException 
	{
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='password']"));
		Pwd.sendKeys(Password); 
		Thread.sleep(2000);

	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login-button']"));
		Login.click();   
		Thread.sleep(3000);    

	}

	@Then("the user should be directed to the inventory page of Saucedemo site")
	public void the_user_should_be_directed_to_the_inventory_page_of_saucedemo_site() 
	{
		System.out.println(driver.getCurrentUrl());

	}
}
