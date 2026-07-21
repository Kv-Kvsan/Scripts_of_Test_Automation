package Leafground_stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.Hooks_Leafground;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_the_Leafground_CheckBox_Module
{

	WebDriver driver = Hooks_Leafground.driver;

	@Then("the user mouse hover the Element module")
	public void the_user_mouse_hover_the_element_module() throws InterruptedException {

		//Element Mouse Hover

		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Actions actionselement=new Actions(driver);
		actionselement.moveToElement(Element).perform();
		Thread.sleep(2000);

		Element.click();

		Thread.sleep(2000);

	}

	@When("the user clicks the Check Box option")
	public void the_user_clicks_the_check_box_option() throws InterruptedException {

		//Clicking Checkbox
		WebElement Checkbox=driver.findElement(By.xpath("//*[@id='menuform:m_checkbox']"));
		Checkbox.click();

		Thread.sleep(2000);

	}

	@Then("the user should be directed to the check box page and verify the check box page URL")
	public void the_user_should_be_directed_to_the_check_box_page_and_verify_the_check_box_page_url() throws InterruptedException {

		System.out.println(driver.getCurrentUrl());

	}

	@Then("the user clicks the Basic check box")
	public void the_user_clicks_the_basic_check_box() throws InterruptedException {

		//Basic Checkbox
		WebElement Basic=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		Basic.click();

		String Classvalue=Basic.getDomAttribute("class");
		Assert.assertTrue("You haven't clicked the Basic checkbox", Classvalue.contains("ui-state-active"));

		System.out.println("You have clicked the Basic checkbox");

		Thread.sleep(2000);
	}

	@Then("the user clicks the Notification check box and print the notification\\(s) message")
	public void the_user_clicks_the_notification_check_box_and_print_the_notification_s_message() throws InterruptedException {

		//Notification
		WebElement Notification=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/div[2]"));
		Notification.click();

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Checked=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Checked')]")));
		String Messagechecked=Checked.getText();
		System.out.println("The Notification has been : " +Messagechecked);

		Thread.sleep(2000);

		Notification.click();

		Thread.sleep(2000);

		WebElement Unchecked=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Unchecked')]")));
		String MessageUnchecked=Unchecked.getText();
		System.out.println("The Notification has been : " +MessageUnchecked);

		Thread.sleep(2000);
	}

	@Then("the user chooses the favorite programming languages")
	public void the_user_chooses_the_favorite_programming_languages() throws InterruptedException {

		//Choose your favorite language(s)
		WebElement Java=driver.findElement(By.xpath("//*[@id='j_idt87:basic:0']/following::div[1]"));
		Java.click();

		Thread.sleep(2000);

		WebElement Python=driver.findElement(By.xpath("//*[@id='j_idt87:basic:1']/following::div[1]"));
		Python.click();

		Thread.sleep(2000);

	}

	@Then("the user clicks the tri-state checkbox three times and print the state code and message")
	public void the_user_clicks_the_tri_state_checkbox_three_times_and_print_the_state_code_and_message() throws InterruptedException {

		//Tri State Checkbox
		WebElement ChangedState1=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		ChangedState1.click();

		WebDriverWait Stateof1=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State1 = Stateof1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof1 = Stateof1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 1']")));
		String Statemessageof1 = State1.getText();
		String codeof1= Statecodeof1.getText();
		System.out.println(Statemessageof1);
		System.out.println(codeof1);
		
		Thread.sleep(2000);

		WebElement tristate2=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate2.click();
		Thread.sleep(2000);

		WebDriverWait Stateof2=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State2 = Stateof2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof2 = Stateof2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 2']")));
		String Statemessageof2 = State2.getText();
		String codeof2 = Statecodeof2.getText();
		System.out.println(Statemessageof2);
		System.out.println(codeof2);

		WebElement tristate0=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate0.click();
		Thread.sleep(2000);

		WebDriverWait Stateof0=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State0 = Stateof0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof0 = Stateof0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 0']")));
		String Statemessageof0 = State0.getText();
		String codeof0 = Statecodeof0.getText();
		System.out.println(Statemessageof0);
		System.out.println(codeof0);

		Thread.sleep(2000);

	}

	@Then("the user turns on and off the toggle switch and print the message")
	public void the_user_turns_on_and_off_the_toggle_switch_and_print_the_message() throws InterruptedException {

		//Toggle Switch
		WebElement Toggle=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt100']/div[2]"));
		Toggle.click();

		WebDriverWait Togglewait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement ToggleChecked=Togglewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Checked')]")));
		String ToggleMessagechecked=ToggleChecked.getText();
		System.out.println("The Toggle Switch has been :" +ToggleMessagechecked);

		Thread.sleep(2000);

		Toggle.click();

		WebElement ToggleUnchecked=Togglewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Unchecked')]")));
		String ToggleMessageUnchecked=ToggleUnchecked.getText();
		System.out.println("The Toggle Switch has been :" +ToggleMessageUnchecked);

	}

	@Then("the user confirms and verifies the check box is disabled")
	public void the_user_confirms_and_verifies_the_check_box_is_disabled() throws InterruptedException {

		//Verify if check box is disabled
		WebElement disabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div[1]/input/following::div[1]"));
		Boolean disabledcheckbox=disabled.isEnabled();
		System.out.println(disabledcheckbox);
		Thread.sleep(3000);

	}

	@Then("the user clicks and select all the countries from the multiple drop down option")
	public void the_user_clicks_and_select_all_the_countries_from_the_multiple_drop_down_option() throws InterruptedException {

		//Select Multiple
		WebElement Multiple=driver.findElement(By.xpath("//*[@id='j_idt87:multiple']/ul"));
		Multiple.click();
		Thread.sleep(2000);

		//Select_All_Countries
		WebElement Select_All_Countries=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]"));
		Select_All_Countries.click();
		Thread.sleep(2000);

	}

	@Then("the user closes the multiple drop down option")
	public void the_user_closes_the_multiple_drop_down_option() throws InterruptedException {

		//Click_Close
		WebElement Click_Close=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/a"));
		Click_Close.click();
		Thread.sleep(2000);
	}

	@Then("the user removes all the selected countries from the multiple drop down option")
	public void the_user_removes_all_the_selected_countries_from_the_multiple_drop_down_option() throws InterruptedException {

		//Click_Close_of_all_Countries
		List<WebElement> Click_Close_of_all_Countries=driver.findElements(By.xpath("//span[contains(@class, 'ui-selectcheckboxmenu-token-icon ui-icon ui-icon-close')]"));

		for(WebElement icon : Click_Close_of_all_Countries)
		{
			icon.click();
		}

		Thread.sleep(2000);

	}

	@Then("the user re-clicks the multiple drop down and randomly selecting the countries")
	public void the_user_re_clicks_the_multiple_drop_down_and_randomly_selecting_the_countries() throws InterruptedException {

		WebElement Multiple=driver.findElement(By.xpath("//*[@id='j_idt87:multiple']/ul"));
		Multiple.click();

		Thread.sleep(2000);

		//Clicking Miami
		WebElement Miami=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[1]/div/div[2]"));
		Miami.click();

		Thread.sleep(2000);

		//Clicking Paris
		WebElement Paris=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[3]/div/div[2]"));
		Paris.click();

		Thread.sleep(2000);

		//Clicking Berlin
		WebElement Berlin=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[5]/div/div[2]"));
		Berlin.click();

		Thread.sleep(2000);

		//Clicking Amsterdam
		WebElement Amsterdam=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[9]/div/div[2]"));
		Amsterdam.click();

		Thread.sleep(2000);

	}

	@Then("the user re-closes the multiple drop down option")
	public void the_user_re_closes_the_multiple_drop_down_option() throws InterruptedException {

		WebElement Click_Close=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/a"));
		Click_Close.click();

		Thread.sleep(2000);

		//Click_Close_of_all_Countries
		List<WebElement> Click_Close_of_all_Countries=driver.findElements(By.xpath("//span[contains(@class, 'ui-selectcheckboxmenu-token-icon ui-icon ui-icon-close')]"));

		for(WebElement icon : Click_Close_of_all_Countries)
		{
			icon.click();
		}
		

	}

	@Then("the user clicks the multiple drop down option again and enter the country name\\(s) via search input")
	public void the_user_clicks_the_multiple_drop_down_option_again_and_enter_the_country_name_s_via_search_input() throws InterruptedException {

		WebElement Multiple=driver.findElement(By.xpath("//*[@id='j_idt87:multiple']/ul"));
		Multiple.click();

		//Search_Input
		WebElement Search_Input=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]/input"));
		Search_Input.click();

		Thread.sleep(2000);
		Search_Input.sendKeys("P");

		Thread.sleep(2000);

		WebElement Paris_Checkbox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[3]/div/div[2]"));
		Paris_Checkbox.click();

		Thread.sleep(2000);

		Search_Input.clear();

		Thread.sleep(2000);
		Search_Input.sendKeys("L");

		Thread.sleep(2000);

		WebElement London_Checkbox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[2]/div/div[2]"));
		London_Checkbox.click();

		Thread.sleep(2000);

		Search_Input.clear();
		Thread.sleep(2000);

		Search_Input.sendKeys("B");
		Thread.sleep(2000);

		WebElement Berlin_Checkbox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[5]/div/div[2]"));
		Berlin_Checkbox.click();

		Thread.sleep(2000);

		WebElement Barcelona_Checkbox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[6]/div/div[2]"));
		Barcelona_Checkbox.click();

		Thread.sleep(2000);

		WebElement Brasilia_Checkbox=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[8]/div/div[2]"));
		Brasilia_Checkbox.click();

		Thread.sleep(2000);

	}

	@Then("the user closes the multiple drop down option and quit the browser")
	public void the_user_closes_the_multiple_drop_down_option_and_quit_the_browser() throws InterruptedException {

		//Click_Close_Button
		WebElement Click_Close_Button=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/a"));
		Click_Close_Button.click();

	}
}
