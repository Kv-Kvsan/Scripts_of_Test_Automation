package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static stepDefinitions.Hooks_in_Cucumber.driver;


public class Amazon_Menu_Bar {

	@Given("the user opens the URL of Amazon")
	public void the_user_opens_the_url_of_amazon()
	{    
		// The Amazon URL will be opened
	}

	@Then("the user can see the homepage of Amazon")
	public void the_user_can_see_the_homepage_of_amazon()
	{  
		// The home page will be displayed    
	}

	@When("the user clicks each menu item, the corresponding page is displayed")
	public void the_user_clicks_each_menu_item_the_corresponding_page_is_displayed() throws InterruptedException 
	{	
		String[] menuItems = {
				"Sell", "Bestsellers", "Today's Deals", "Mobiles", "Prime", "Fashion",
				"Customer Service", "New Releases", "Home & Kitchen", "Electronics",
				"Amazon Pay", "Computers", "Books", "Car & Motorbike"
		};

		for (String item : menuItems) {
			WebElement menuElement = driver.findElement(By.xpath("//div[@id='nav-xshop']//a[normalize-space()=\"" + item + "\"]"));
			menuElement.click();
			Thread.sleep(3000);
		}
	}

	@Then("the user can quit the browser of an application")
	public void the_user_can_quit_the_browser_of_an_application()
	{
		// The browser will be closed
	}
}
