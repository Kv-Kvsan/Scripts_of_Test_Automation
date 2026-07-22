package Saucedemo_Automate_Stepdefinitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class A_to_Z_Filter_Saucedemo_Application {

	WebDriver driver;

	@Then("the user retrieves the product names in alphabetical order and confirm whether it is changed or not")
	public void the_user_retrieves_the_product_names_in_alphabetical_order_and_confirm_whether_it_is_changed_or_not()
	{

		driver=Hooks_Saucedemo_Automate.driver;
		List<WebElement> Product_Names=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
		
		List<WebElement> Default_Prices=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

		List<String> actualNames = new ArrayList<>();


		List<Double> actualPrices=new  ArrayList<>();

		for(WebElement Names: Product_Names)
		{
			actualNames.add(Names.getText());
			System.out.println(Names.getText());
		}
		
			for(WebElement prices: Default_Prices)
			{
				String value = prices.getText().replace("$", "");
				actualPrices.add(Double.parseDouble(value));
				System.out.println(value); 
			}


		List<String> expectedNames = new ArrayList<>(actualNames);
		List<Double> expectedPrices=new  ArrayList<>(actualPrices);
		Collections.sort(expectedNames);
		

		Assert.assertEquals(expectedNames, actualNames);
		Assert.assertEquals(expectedPrices, actualPrices);

	}
}
