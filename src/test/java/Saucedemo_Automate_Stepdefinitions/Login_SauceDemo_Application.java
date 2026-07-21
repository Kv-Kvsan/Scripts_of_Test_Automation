package Saucedemo_Automate_Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SauceDemo_stepDefinitions.Hooks_Saucedemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SauceDemo_Application {

	WebDriver driver;

	@Given("the user opens the URL of the Saucedemo application")
	public void the_user_opens_the_url_of_the_saucedemo_application() throws InterruptedException {

		driver = Hooks_Saucedemo.driver;
		Thread.sleep(2000);

	}
	@Then("the login page of the saucedemo should be displayed")
	public void the_login_page_of_the_saucedemo_should_be_displayed()
	{

		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.saucedemo.com/";
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

	@Given("the user loads the URL of the Saucedemo application")
	public void the_user_loads_the_url_of_the_saucedemo_application() throws InterruptedException {
		driver = Hooks_Saucedemo.driver;
		Thread.sleep(2000);

	}

	@Then("the user should see the login form")
	public void the_user_should_see_the_login_form() {
		String CurrentURL=driver.getCurrentUrl();
		Assert.assertTrue("Login form not displayed. Current URL: " + CurrentURL, CurrentURL.contains("saucedemo.com"));

	}

	@Then("the user types an incorrect Username as {string}")
	public void the_user_types_an_incorrect_username_as(String string_username) throws InterruptedException {
		WebElement UN=driver.findElement(By.xpath("//*[@id='user-name']"));
		UN.sendKeys(string_username);
		Thread.sleep(2000);

	}
	@Then("the user types an incorrect Password as {string}")
	public void the_user_types_an_incorrect_password_as(String string_password) throws InterruptedException {
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='password']"));
		Pwd.sendKeys(string_password); 
		Thread.sleep(2000);

	}

	@When("the user clicks the Sign-In button")
	public void the_user_clicks_the_sign_in_button() throws InterruptedException {
		WebElement Signin=driver.findElement(By.xpath("//*[@id='login-button']"));
		Signin.click();   
		Thread.sleep(3000);   
	}

	@Then("the application should show an error message")
	public void the_application_should_show_an_error_message()
	{
		WebElement error=driver.findElement(By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']"));
		System.out.println(error.getText());
	}
}
