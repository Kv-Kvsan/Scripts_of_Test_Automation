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
	
	public class Prices_High_to_Low_Saucedemo_Application {
	
		WebDriver driver;
		WebElement Filter_dropdown;
		
		@Then("user sorts the prices from high to low")
		public void user_sorts_the_prices_from_high_to_low() throws InterruptedException {
		    
			driver=Hooks_Saucedemo_Automate.driver;
			
			Filter_dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			Filter_dropdown.click();
	
			Thread.sleep(2000); 
			
			
			Select select=new Select(Filter_dropdown);
			select.selectByVisibleText("Price (high to low)");
			Thread.sleep(1000);
		    
		}
		
		@Then("the user retrieves the prices lists and confirm whether the prices are changed from high to low")
		public void the_user_retrieves_the_prices_lists_and_confirm_whether_the_prices_are_changed_from_high_to_low()
		{
		    
			List<WebElement> High_to_Low=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
	
			List<Double> actualPrices = new ArrayList<>();
	
			for(WebElement prices: High_to_Low)
			{
				String value = prices.getText().replace("$", "");
				actualPrices.add(Double.parseDouble(value));
				System.out.println(value); 
			}	
	
			List<Double> expectedPrices = new ArrayList<>(actualPrices);
			Collections.sort(expectedPrices, Collections.reverseOrder());
	
			Assert.assertEquals(expectedPrices, actualPrices);
	
		}
	
		}
