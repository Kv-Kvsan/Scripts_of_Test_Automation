package Saucedemo_Automate_Stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class Add_to_Cart_Z_to_A_Saucedemo_Application
{

	WebDriver driver=Hooks_Saucedemo_Automate.driver;

	
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
