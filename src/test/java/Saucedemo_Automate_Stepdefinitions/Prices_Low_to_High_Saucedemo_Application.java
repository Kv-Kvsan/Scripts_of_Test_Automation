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

public class Prices_Low_to_High_Saucedemo_Application {

	WebDriver driver;
	WebElement Filter_dropdown;


	@Then("the user clicks the filter dropdown")
	public void the_user_clicks_the_filter_dropdown() throws InterruptedException 
	{
		driver=Hooks_Saucedemo_Automate.driver;

		Filter_dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Filter_dropdown.click();

		Thread.sleep(1000);   
	}

	@Then("user sorts the prices from low to high")
	public void user_sorts_the_prices_from_low_to_high() throws InterruptedException {

		Select select=new Select(Filter_dropdown);
		select.selectByVisibleText("Price (low to high)");
		Thread.sleep(1000);

	}

	@Then("the user retrieves the prices lists and confirm whether the prices are changed from low to high")
	public void the_user_retrieves_the_prices_lists_and_confirm_whether_the_prices_are_changed_from_low_to_high() {


		List<WebElement> Low_to_High=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

		List<Double> actualPrices = new ArrayList<>();

		for(WebElement prices: Low_to_High)
		{
			String value = prices.getText().replace("$", "");
			actualPrices.add(Double.parseDouble(value));
			System.out.println(value); 
		}	

		List<Double> expectedPrices = new ArrayList<>(actualPrices);
		Collections.sort(expectedPrices);

		Assert.assertEquals(expectedPrices, actualPrices);

	}

}
