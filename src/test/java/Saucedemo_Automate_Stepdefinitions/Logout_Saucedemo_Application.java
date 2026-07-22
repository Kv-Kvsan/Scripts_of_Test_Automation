package Saucedemo_Automate_Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout_Saucedemo_Application {
	
	WebDriver driver;
	
	@When("the user clicks menu button on the left hand side")
	public void the_user_clicks_menu_button_on_the_left_hand_side() throws InterruptedException {
	    
		driver=Hooks_Saucedemo_Automate.driver;
		
		Thread.sleep(1000);
		WebElement Menu=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		Menu.click();
		Thread.sleep(2000);
	    
	}
	
	@Then("the user clicks logout")
	public void the_user_clicks_logout() {
	    
	    WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
	    logout.click();
	}
	
	@Then("the user redirects to the login page")
	public void the_user_redirects_to_the_login_page()
	{
	    System.out.println(driver.getCurrentUrl());
	    
	}

}
