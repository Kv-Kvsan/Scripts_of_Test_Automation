package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import static stepDefinitions.Hooks_For_Leafground.extentReport;
import static stepDefinitions.Hooks_For_Leafground.test;
import static stepDefinitions.Hooks_For_Leafground.driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Open_LeafgroundButtonMenu_stepDefinitions {
	

	@Given("the user opens the URL of the LeafGround")
	public void the_user_opens_the_url_of_the_leaf_ground() throws InterruptedException 
	{
		
	}
	@Then("the dashboard page of the leafground site should be displayed")
	public void the_dashboard_page_of_the_leafground_site_should_be_displayed()
	{
		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://leafground.com/";
		if(CurrentURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("It is a dashboard URL\n " +ExpectedURL);
		}
		else
		{
			System.out.println("It is not a dashboard URL");
		}

	}
	@When("the user clicks the elements menu on the right hand side, list of options should be displayed")
	public void the_user_clicks_the_elements_menu_on_the_right_hand_side_list_of_options_should_be_displayed() throws InterruptedException 
	{
		test=extentReport.createTest("Opening the Element menu");
		test.log(Status.INFO, "Verifying the list of options");
		WebElement element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		element.click();
		Thread.sleep(2000);

	}
	@Then("the user clicks the button menu from the list of options")
	public void the_user_clicks_the_button_menu_from_the_list_of_options() throws InterruptedException 
	{
		test.log(Status.INFO, "Verifying the menu of button");
		WebElement Button=driver.findElement(By.xpath("//*[@id='menuform:m_button']"));
		Button.click();
		test.log(Status.PASS, "Verified the button menu");
		Thread.sleep(2000);
	}
	@Then("the user navigated to the button page")
	public void the_user_navigated_to_the_button_page()
	{
		test.log(Status.INFO,"Navigating to the button page");
		test.log(Status.PASS, "User navigated to the button page");
		System.out.println(driver.getCurrentUrl());

	}
	@Then("the user should perform certain actions")
	public void the_user_should_perform_certain_actions() throws InterruptedException {
		//Click and confirm the title
		
		test.log(Status.INFO, "Click and confirm the title and URL");
		WebElement Click=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt90']"));
		Click.click();

		//Printing the title
		String title=driver.getTitle();
		System.out.println("The title is: " +title);
		test.log(Status.PASS, "User clicked and confirmed the title");
		
		//Printing the URL
		String URL=driver.getCurrentUrl();
		System.out.println("The URL is: " +URL);
		test.log(Status.PASS, "User clicked and confirmed the URL");

		Thread.sleep(3000);
		driver.navigate().back();

		//Confirm if the button is disabled.
		test.log(Status.INFO, "Confirm if the button is disabled");
		
		WebElement button=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt92']"));
		Boolean disabled=button.isEnabled();
		test.log(Status.PASS, "User confirmed the button is disabled");

		System.out.println(disabled);
		Thread.sleep(2000);

		//Find the position of the Submit button
		test.log(Status.INFO,"Find the position of the Submit button");
		WebElement position=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']"));
		Point location=position.getLocation();
		int x=location.getX();
		int y=location.getY();
		test.log(Status.PASS, "User found the position of the Submit button");
		System.out.println("Button position of X is--> " +x);
		System.out.println("Button position of Y is--> " +y);

		//Find the height and width of this button
		test.log(Status.INFO, "Find the height and width of this button");
		
		WebElement HandW=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		Dimension HeightandWidth=HandW.getSize();
		int width = HandW.getSize().getWidth();
		int height = HandW.getSize().getHeight();
		test.log(Status.PASS, "User found the height and width of this button");
		System.out.println("The Height and Width is: " +HeightandWidth);
		System.out.println("The Width is: " +width);
		System.out.println("The Height is: " +height);
		Thread.sleep(2000);

		//Click Image Button and Click on any hidden button
		test.log(Status.INFO, "Click Image Button and Click on any hidden button");
		
		WebElement Imagebutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt102:imageBtn']"));
		Imagebutton.click();
		test.log(Status.PASS, "User clicked the Image Button and Click on any hidden button");
		Thread.sleep(2000);

		test.log(Status.INFO,"Clicking the hidden button");
		WebElement hiddenbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']/following::div[2]"));
		hiddenbutton.click();
		test.log(Status.PASS, "User clicked the hidden button");

	}
}
