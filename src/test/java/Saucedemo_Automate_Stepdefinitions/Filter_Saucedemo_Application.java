package Saucedemo_Automate_Stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;

public class Filter_Saucedemo_Application {

	WebDriver driver=Hooks_Saucedemo_Automate.driver;
	WebElement Filter;

	@Then("the user clicks the filter option")
	public void the_user_clicks_the_filter_option() throws InterruptedException
	{
	    Filter=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    Filter.click();
	    
	    Thread.sleep(1000);
	    
	}
	
	@Then("user sorts the products in reverse alphabetical order")
	public void user_sorts_the_products_in_reverse_alphabetical_order() throws InterruptedException
	{
		Select select=new Select(Filter);
	    select.selectByVisibleText("Name (Z to A)");
	    
	    Thread.sleep(1000);
	    
	}
	
	@Then("the user retrieves the product names and confirm whether it is changed or not")
	public void the_user_retrieves_the_product_names_and_confirm_whether_it_is_changed_or_not()
	{
	    List<WebElement> Reverse_Product_Names=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
	    
	    List<String> actualNames = new ArrayList<>();
	    
	    for(WebElement Names: Reverse_Product_Names)
	    {
	    	actualNames.add(Names.getText());
	    	System.out.println(Names.getText()); 
	 
	    }
	    
	    List<String> expectedNames = new ArrayList<>(actualNames);
	    Collections.sort(expectedNames, Collections.reverseOrder());

	    Assert.assertEquals(expectedNames, actualNames);
	    
	}
}
