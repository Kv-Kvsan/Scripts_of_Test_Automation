package Saucedemo_Automate_Stepdefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_to_Cart_Saucedemo_Application
{
	
	WebDriver driver;

	@Given("the user hits the URL of the Saucedemo application")
	public void the_user_hits_the_url_of_the_saucedemo_application() throws InterruptedException
	{
		driver = Hooks_Saucedemo_Automate.driver;
		Thread.sleep(2000);   
	}
	
	@Then("the login page of the saucedemo will be displayed")
	public void the_login_page_of_the_saucedemo_will_be_displayed() 
	{
		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.saucedemo.com/";
		Assert.assertEquals(ExpectedURL, CurrentURL);   
	}
	
	@Then("the user enters the Username as {string}")
	public void the_user_enters_the_username_as(String Username) throws InterruptedException
	{
		WebElement UN=driver.findElement(By.xpath("//*[@id='user-name']"));
		UN.sendKeys(Username);
		Thread.sleep(2000);  
	}
	
	@Then("the user enters the password as {string}")
	public void the_user_enters_the_password_as(String Password) throws InterruptedException
	{
		WebElement Pwd=driver.findElement(By.xpath("//*[@id='password']"));
		Pwd.sendKeys(Password); 
		Thread.sleep(2000);        
	}
	
	@Then("the user presses the login button")
	public void the_user_presses_the_login_button() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath("//*[@id='login-button']"));
		Login.click();   
		Thread.sleep(3000);     
	}
	
	@Then("the user lands on the inventory page")
	public void the_user_lands_on_the_inventory_page()
	{
	    String URL="https://www.saucedemo.com/inventory.html";
	    String expURL=driver.getCurrentUrl();
	    
	    Assert.assertEquals(expURL, URL);
	    
	}
	
	@Then("the user adds every products to the cart")
	public void the_user_adds_every_products_to_the_cart() throws InterruptedException 
	{
	    List<WebElement> cart=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));
	    
	    for(WebElement add_to_cart: cart)
	    {
	    	Thread.sleep(1000);
	    	add_to_cart.click();
	    }
	    
	    Thread.sleep(2000);
	}
	
	@Then("user clicks the Add to cart button")
	public void user_clicks_the_add_to_cart_button()
	{
	    WebElement Cart_Button=driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
	    Cart_Button.click();
	}
	
	@Then("user removes the every products from the cart")
	public void user_removes_the_every_products_from_the_cart() throws InterruptedException
	{
	    List<WebElement> remove=driver.findElements(By.xpath("//button[@class='btn btn_secondary btn_small cart_button']"));
	    
	    for(WebElement button: remove)
	    {
	    	Thread.sleep(1000);
	    	button.click();
	    }
	    
	}

}
