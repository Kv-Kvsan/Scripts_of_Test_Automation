package Leafground_stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Open_Leafground_Application {

	WebDriver driver;

	@Given("the user opens the URL of the Leafground")
	public void the_user_opens_the_url_of_the_leafground() throws InterruptedException
	{
		driver = Hooks_Leafground.driver;
		Thread.sleep(2000);

	}

	@Then("the user verify the URL")
	public void the_user_verify_the_url()
	{
		System.out.println(driver.getCurrentUrl());
	}

	@Then("the user mouse hover the each module and verify the each module name")
	public void the_user_mouse_hover_the_each_module_and_verify_the_each_module_name() throws InterruptedException
	{
		//Home Mouse Hover
		WebElement Home=driver.findElement(By.xpath("//*[@id='menuform:j_idt38']"));
		Actions actionshome=new Actions(driver);
		actionshome.moveToElement(Home).perform();

		String Text_Home=Home.getText();
		System.out.println(Text_Home);

		Thread.sleep(2000);

		//Browser Mouse Hover
		WebElement Browser=driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		Actions actionsbrowser=new Actions(driver);
		actionsbrowser.moveToElement(Browser).perform();

		String Text_Browser=Browser.getText();
		System.out.println(Text_Browser);

		Thread.sleep(2000);

		//Element Mouse Hover
		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Actions actionselement=new Actions(driver);
		actionselement.moveToElement(Element).perform();

		String Text_Element=Element.getText();
		System.out.println(Text_Element);

		Thread.sleep(2000);

		//Table Mouse Hover
		WebElement Table=driver.findElement(By.xpath("//*[@id='menuform:j_idt41']"));
		Actions actionsTable=new Actions(driver);
		actionsTable.moveToElement(Table).perform();

		String Text_Table=Table.getText();
		System.out.println(Text_Table);

		Thread.sleep(2000);

		//List Mouse Hover
		WebElement List=driver.findElement(By.xpath("//*[@id='menuform:j_idt42']"));
		Actions actionslist=new Actions(driver);
		actionslist.moveToElement(List).perform();

		String Text_List=List.getText();
		System.out.println(Text_List);

		Thread.sleep(2000);

		//Misc Mouse Hover
		WebElement Misc=driver.findElement(By.xpath("//*[@id='menuform:j_idt43']"));
		Actions actionsmisc=new Actions(driver);
		actionsmisc.moveToElement(Misc).perform();

		String Text_Misc=Misc.getText();
		System.out.println(Text_Misc);

	}

}
