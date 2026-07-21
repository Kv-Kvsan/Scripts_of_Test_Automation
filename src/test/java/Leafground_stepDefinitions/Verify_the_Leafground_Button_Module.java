package Leafground_stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_the_Leafground_Button_Module
{
	WebDriver driver;

	@Then("the user mouse hover the button module")
	public void the_user_mouse_hover_the_button_module() throws InterruptedException
	{
		
		//Element Mouse Hover
		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Actions actionselement=new Actions(driver);
		actionselement.moveToElement(Element).perform();
		Thread.sleep(2000);

		Element.click();

		Thread.sleep(2000);

	}

	@When("the user clicks the button module")
	public void the_user_clicks_the_button_module() throws InterruptedException
	{
		//Clicking Button
		WebElement Button=driver.findElement(By.xpath("//*[@id='menuform:m_button']"));
		Button.click();

		Thread.sleep(2000);

	}

	@Then("the user should be directed to the button page and verify the button page URL")
	public void the_user_should_be_directed_to_the_button_page_and_verify_the_button_page_url()
	{
		System.out.println(driver.getCurrentUrl());
	}

	@Then("the user Click and Confirm title area")
	public void the_user_click_and_confirm_title_area() throws InterruptedException
	{

		//Click and Confirm title.
		WebElement Confirm_Title=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt90']"));
		Confirm_Title.click();

		String Title=driver.getTitle();
		System.out.println("The confirm title is : " +Title);

		Assert.assertTrue("The user is clicked the dashboard title", Title.contains("Dashboard"));

		String ExpectedURL="https://leafground.com/dashboard.xhtml";
		String URL=driver.getCurrentUrl();
		System.out.println("The Confirm URL is : " +URL);

		Assert.assertEquals(ExpectedURL, URL);
		System.out.println("The user is clicked the dashboard URL");

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);

	}

	@Then("the user verifies whether the Confirm if the button is disabled.")
	public void the_user_verifies_whether_the_confirm_if_the_button_is_disabled() throws InterruptedException
	{
		WebElement Button_Disabled=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt92']"));
		Boolean button=Button_Disabled.isEnabled();
		System.out.println(button);

		Thread.sleep(2000);

	}

	@Then("the user Find the position of the Submit button")
	public void the_user_find_the_position_of_the_submit_button()
	{
		WebElement Position=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']"));
		Point location=Position.getLocation();
		int x=location.getX();
		int y=location.getY();

		System.out.println("The position of the X Value is : " + x + ", The position of the Y Value is : " + y);
	}

	@Then("the user Find the Save button color")
	public void the_user_find_the_save_button_color()
	{
		//Find the Save button color
		WebElement Save_Button=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt96']"));
		String Button_Color=Save_Button.getCssValue("background-color");
		System.out.println("The background color is : " +Button_Color);

	}

	@Then("the user Find the height and width of this button")
	public void the_user_find_the_height_and_width_of_this_button()
	{

		WebElement Height_and_Width=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		int Height=Height_and_Width.getSize().getHeight();
		int Width=Height_and_Width.getSize().getWidth();

		System.out.println("The Height is : " + Height + ", The Width is : " + Width);
	}

	@Then("the user Mouse over and confirm the color changed")
	public void the_user_mouse_over_and_confirm_the_color_changed() throws InterruptedException
	{
		WebElement Mouse_Hover=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']"));
		WebElement salmon_Text = Mouse_Hover.findElement(By.tagName("span"));

		String colorBefore = Mouse_Hover.getCssValue("background-color");
		System.out.println("Before hover : " +colorBefore);

		Actions actions_mouse=new Actions(driver);
		actions_mouse.moveToElement(Mouse_Hover).perform();

		String colorAfter = salmon_Text.getCssValue("background-color");
		System.out.println("After hover : " +colorAfter);

		Assert.assertNotEquals(colorAfter, colorBefore);
		System.out.println("Yes!!! It's confirm the color has been changed");

		Thread.sleep(2000);

	}

	@Then("the user Click Image button and Click on any hidden button")
	public void the_user_click_image_button_and_click_on_any_hidden_button() throws InterruptedException
	{

		WebElement Image_Button=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt102:imageBtn']"));
		Image_Button.click();

		Thread.sleep(2000);

		WebElement Testleaf_Imagedisplayed=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt102:imagePanel']"));

		String Image_Class=Testleaf_Imagedisplayed.getDomAttribute("class");

		Assert.assertTrue(Image_Class.contains("ui-connected-overlay-enter-done"));

		System.out.println("The image is appeared");

		Thread.sleep(2000);

		WebElement hidden=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt96']/following::div[5]"));
		hidden.click();

		Thread.sleep(2000);

	}

	@Then("How many rounded buttons are there?")
	public void how_many_rounded_buttons_are_there()
	{
		List<WebElement> Rounded_Button=driver.findElements(By.xpath("//*[@id='j_idt88:j_idt100']/following::div[6]/button[@type='button']"));
		System.out.println(Rounded_Button.size());

		for(WebElement rounded: Rounded_Button)
		{
			System.out.println(rounded.getText());
		}

	}
}
