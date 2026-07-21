package Leafground_stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_the_Leafground_TextBox_Module 
{
	WebDriver driver;
	JavascriptExecutor executor;


	@Given("the user launches the Leafground application")
	public void the_user_launches_the_leafground_application() {
		driver = Hooks_Leafground.driver;
	}

	@Then("the user verifies the application URL")
	public void the_user_verifies_the_application_url()
	{
		System.out.println(driver.getCurrentUrl());

	}

	@When("the user mouse hover the TextBox module")
	public void the_user_mouse_hover_the_text_box_module() throws InterruptedException
	{
		//Element Mouse Hover

		Thread.sleep(2000);

		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Actions actionselement=new Actions(driver);
		actionselement.moveToElement(Element).perform();
		Thread.sleep(2000);

		Element.click();

		Thread.sleep(2000);
	}

	@Then("the user clicks the TextBox module")
	public void the_user_clicks_the_text_box_module() throws InterruptedException
	{
		//Clicking Textbox
		WebElement Textbox=driver.findElement(By.xpath("//*[@id='menuform:m_input']"));
		Textbox.click();

		Thread.sleep(2000);

	}

	@Then("the user should be directed to the TextBox page and verify the TextBox page URL")
	public void the_user_should_be_directed_to_the_text_box_page_and_verify_the_text_box_page_url()
	{

		System.out.println(driver.getCurrentUrl());

	}

	@Then("the user enters a name in the name field")
	public void the_user_enters_a_name_in_the_name_field() throws InterruptedException
	{
		//Typing our name
		WebElement Name=driver.findElement(By.xpath("//*[@id='j_idt88:name']"));
		Name.sendKeys("Keerthivasan");
		String printname=Name.getDomProperty("value");
		System.out.println("The Entered Name is : " +printname);

		Thread.sleep(2000);

	}

	@Then("the user appends\\(add) the country name to the existing text without deleting it")
	public void the_user_appends_add_the_country_name_to_the_existing_text_without_deleting_it() throws InterruptedException 
	{
		//Append Country to this City.
		WebElement Append=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']"));
		Append.sendKeys(", TamilNadu, India");
		String printappend=Append.getDomProperty("value");
		System.out.println("The Append country text is : " +printappend);

		Thread.sleep(2000);

	}

	@Then("the user verifies whether the textbox is disabled")
	public void the_user_verifies_whether_the_textbox_is_disabled() throws InterruptedException
	{
		//Verify if text box is disabled
		WebElement disabled=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']"));
		Boolean value=disabled.isEnabled();
		System.out.println(value);

		Thread.sleep(2000);
	}

	@Then("the user Clears the typed text from the textbox")
	public void the_user_clears_the_typed_text_from_the_textbox() throws InterruptedException {

		//Clear the typed text
		WebElement clear=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		clear.clear();

		Thread.sleep(2000);

	}

	@Then("the user Retrieves the typed text from the textbox")
	public void the_user_retrieves_the_typed_text_from_the_textbox() throws InterruptedException {

		//Retrieve the typed text.
		WebElement Typedtext=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt97']"));
		String text=Typedtext.getDomProperty("value");
		System.out.println("Here is the retrieved text: " +text);

		Thread.sleep(2000);

	}

	@Then("the user enters email and presses Tab")
	public void the_user_enters_email_and_presses_tab() throws InterruptedException
	{
		//Type email and Tab. Confirm control moved to next element.

		WebElement email=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt99']"));
		email.sendKeys("keerthivb2023@gmail.com");
		Thread.sleep(2000);

		email.sendKeys(Keys.TAB);

	}

	@Then("the user confirms whether the control is moved to next element after presses tab")
	public void the_user_confirms_whether_the_control_is_moved_to_next_element_after_presses_tab() throws InterruptedException
	{

		WebElement activeelement=driver.switchTo().activeElement();

		WebElement yourself=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101']"));

		Assert.assertTrue("No!!! The control isn't moved to the next element", activeelement.equals(yourself));

		Thread.sleep(2000);

	}

	@Then("the user enters information in About Yourself field")
	public void the_user_enters_information_in_about_yourself_field() throws InterruptedException {

		WebElement YSF=driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']"));
		YSF.sendKeys("Hi");
		YSF.sendKeys(Keys.ENTER);
		YSF.sendKeys("This is Keerthivasan");

		Thread.sleep(2000);

	}

	@Then("the user enters text in the  Text Editor and uses the text editor icons")
	public void the_user_enters_text_in_the_text_editor_and_uses_the_text_editor_icons() throws InterruptedException {

		//Text Editor
		WebElement editor=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103_editor']/div[1]/p"));
		editor.click();

		Thread.sleep(2000);

		editor.sendKeys("abcdefghijklmnopqrstuvwxyz");
		Thread.sleep(2000);

		editor.sendKeys(Keys.CONTROL,"a");


		Thread.sleep(2000);

		//Performing Alignment
		WebElement ordered=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[6]/button[1]"));
		ordered.click();

		Thread.sleep(2000);

		WebElement bullet=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[6]/button[2]"));
		bullet.click();

		Thread.sleep(2000);

		WebElement Increasing=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[6]/button[4]"));
		Increasing.click();

		Thread.sleep(2000);

		WebElement Decreasing=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[6]/button[3]"));
		Decreasing.click();

		Thread.sleep(2000);

		WebElement Bold=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[2]/button[1]"));
		Bold.click();

		Thread.sleep(2000);

		WebElement Italic=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[2]/button[2]"));
		Italic.click();

		Thread.sleep(2000);

		WebElement Underline=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[2]/button[3]"));
		Underline.click();

		Thread.sleep(2000);

		WebElement Strikethrough=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[2]/button[4]"));
		Strikethrough.click();

		Thread.sleep(2000);

		WebElement HeaderIncreaser=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[5]/button[1]"));
		HeaderIncreaser.click();

		Thread.sleep(2000);

		WebElement HeaderDecreaser=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[5]/button[2]"));
		HeaderDecreaser.click();

		Thread.sleep(2000);

		WebElement Blockquote=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[5]/button[3]"));
		Blockquote.click();

		Thread.sleep(2000);

		WebElement Codeblock=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt103']/div[1]/span[5]/button[4]"));
		Codeblock.click();

		Thread.sleep(2000);

		executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,0)"); //Scroll to the top of the page

		Thread.sleep(2000);
	}

	@Then("the user presses Enter and confirms the error message")
	public void the_user_presses_enter_and_confirms_the_error_message() throws InterruptedException {

		//Just Press Enter and confirm error message*
		WebElement enter=driver.findElement(By.xpath("//*[@id='j_idt106:thisform:age']"));
		enter.click();
		Thread.sleep(2000);

		enter.sendKeys(Keys.ENTER);

		WebElement refreshedEnter = driver.findElement(By.xpath("//*[@id='j_idt106:thisform:age']"));
		String errormsg=refreshedEnter.getDomAttribute("class");

		Assert.assertTrue("Error message is not confirmed", errormsg.contains("ui-state-error"));
		System.out.println("Error message is confirmed");
		Thread.sleep(2000);
	}

	@Then("the user clicks and verifies the Label Position changes")
	public void the_user_clicks_and_verifies_the_label_position_changes() throws InterruptedException {

		WebElement labelposition=driver.findElement(By.xpath("//*[@id='j_idt106:float-input']"));
		labelposition.click();

		String classValue = labelposition.getDomAttribute("class");

		Assert.assertTrue("No!!! The label position hasn't changed", classValue.contains("ui-state-focus"));
		System.out.println("Yes!!!! The label position has changed");
		Thread.sleep(2000);

	}

	@Then("the user enters name and choose the third option from the displayed list")
	public void the_user_enters_name_and_choose_the_third_option_from_the_displayed_list() throws InterruptedException {

		WebElement Nameoption=driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_input']"));
		Nameoption.sendKeys("Kee");

		Thread.sleep(2000);

		WebElement option=driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_panel']/ul/li[3]"));
		option.click();

		Thread.sleep(2000);

	}

	@Then("the user enters a DOB and verifies the selected date")
	public void the_user_enters_a_dob_and_verifies_the_selected_date() throws InterruptedException {
		WebElement DOB=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt116_input']"));
		DOB.sendKeys("12/23/1998");

		Thread.sleep(2000);

		WebElement datepicker=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt116_panel']/div/div[2]/table/tbody/tr[4]/td[4]/a[text()='23']"));
		datepicker.click();

		String date=DOB.getDomProperty("value");
		System.out.println("The date you have entered is: " +date);

		Assert.assertTrue("You entered the wrong date", date.equals("12/23/1998"));

		Thread.sleep(3000);

	}

	@Then("the user enters a random number and spin to confirm the value changes")
	public void the_user_enters_a_random_number_and_spin_to_confirm_the_value_changes() throws InterruptedException {

		//Type number and spin to confirm value changed
		WebElement spinnumber=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt118_input']"));
		spinnumber.click();

		Thread.sleep(2000);


		for(int i=1; i<=5; i++)
		{
			Thread.sleep(2000);
			spinnumber.sendKeys(Keys.ARROW_UP);
		}

		String spinvalue=spinnumber.getDomProperty("value");
		System.out.println("The value is: " +spinvalue);

		Thread.sleep(2000);

		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

	}


	@Then("the user clicks the keyboard appears field and confirm whether the virtual keyboard appears")
	public void the_user_clicks_the_keyboard_appears_field_and_confirm_whether_the_virtual_keyboard_appears() throws InterruptedException
	{

		//Click and Confirm Keyboard appears
		WebElement Keyboard=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt122']"));
		Keyboard.click();

		String Appear=Keyboard.getDomAttribute("class");

		Assert.assertTrue("Keyboard isn't appeared", Appear.contains("ui-state-focus"));
		System.out.println("The virtual is appeared");
		Thread.sleep(3000);

		WebElement button=driver.findElement(By.xpath("//*[@id='j_idt133']/div[1]/i/following::div[4]/button[13]"));
		button.click();

		Thread.sleep(3000);

	}

	@Then("the user enters a text in the Custom Toolbar and uses the toolbar icons")
	public void the_user_enters_a_text_in_the_custom_toolbar_and_uses_the_toolbar_icons() throws InterruptedException
	{

		//Custom Toolbar
		WebElement custom=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_editor']/div[1]/p"));
		custom.sendKeys("This text is entered to test the custom toolbar functionality.");

		Thread.sleep(2000);

		custom.sendKeys(Keys.CONTROL, "a");

		Thread.sleep(2000);

		WebElement CustomBold=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[1]/button[1]"));
		CustomBold.click();

		Thread.sleep(2000);

		WebElement CustomItalic=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[1]/button[2]"));
		CustomItalic.click();

		Thread.sleep(2000);

		WebElement CustomUnderline=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[1]/button[3]"));
		CustomUnderline.click();

		Thread.sleep(2000);

		WebElement Customstrike=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[1]/button[4]"));
		Customstrike.click();

		Thread.sleep(2000);

		//Font Dropdown
		WebElement FontDropdown=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[1]/span[1]"));
		FontDropdown.click();

		Thread.sleep(2000);

		//Sans Serif
		WebElement Sans=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[1]/span[2]/span[1]"));
		Sans.click();

		Thread.sleep(2000);

		FontDropdown.click();
		Thread.sleep(2000);

		//Serif
		WebElement Serif=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[1]/span[2]/span[2]"));
		Serif.click();

		Thread.sleep(2000);

		FontDropdown.click();
		Thread.sleep(2000);

		WebElement Monospace=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[1]/span[2]/span[3]"));
		Monospace.click();

		Thread.sleep(2000);

		//Size
		WebElement size=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[2]/span[1]"));
		size.click();

		Thread.sleep(2000);

		//Small
		WebElement Small=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[2]/span[2]/span[1]"));
		Small.click();
		Thread.sleep(2000);

		size.click();
		Thread.sleep(2000);

		//Normal
		WebElement Normal=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[2]/span[2]/span[2]"));
		Normal.click();
		Thread.sleep(2000);

		size.click();
		Thread.sleep(2000);

		//Large
		WebElement Large=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[2]/span[2]/span[3]"));
		Large.click();
		Thread.sleep(2000);

		size.click();
		Thread.sleep(2000);

		//Huge
		WebElement Huge=driver.findElement(By.xpath("//*[@id='j_idt106:j_idt124_toolbar']/span[2]/span[2]/span[2]/span[4]"));
		Huge.click();

	}
}
