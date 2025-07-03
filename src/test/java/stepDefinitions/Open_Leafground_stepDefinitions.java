package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Open_Leafground_stepDefinitions {

	WebDriver driver;

	@Given("the user opens the URL of the LeafGround site")
	public void the_user_opens_the_url_of_the_leaf_ground_site() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);

	}
	@Then("the dashboard page should be displayed")
	public void the_dashboard_page_should_be_displayed() {
		String CurrentURL=driver.getCurrentUrl();
		String ExpectedURL="https://leafground.com/";
		if(CurrentURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("It is a dashboard URL\n" +ExpectedURL);
		}
		else
		{
			System.out.println("It is not a dashboard URL");
		}

	}
	@When("the user hovers over the menu on the right-hand side")
	public void the_user_hovers_over_the_menu_on_the_right_hand_side() throws InterruptedException 
	{
		//Home
		WebElement Home = driver.findElement(By.xpath("//*[@id='menuform:j_idt38']"));
		Actions actionshome = new Actions(driver);
		actionshome.moveToElement(Home).perform();
		Thread.sleep(2000);
		
		//Browser
		WebElement Browser = driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		Actions actionsbrowser = new Actions(driver);
		actionsbrowser.moveToElement(Browser).perform();
		Thread.sleep(2000);
		
		//Element
		WebElement Element = driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Actions actionselement = new Actions(driver);
		actionselement.moveToElement(Element).perform();
		Thread.sleep(2000);
		
		//Table
		WebElement Table = driver.findElement(By.xpath("//*[@id='menuform:j_idt41']"));
		Actions actionstable = new Actions(driver);
		actionstable.moveToElement(Table).perform();
		Thread.sleep(2000);

		//List
		WebElement List = driver.findElement(By.xpath("//*[@id='menuform:j_idt42']"));
		Actions actionslist = new Actions(driver);
		actionslist.moveToElement(List).perform();
		Thread.sleep(2000);

		//Misc
		WebElement Misc = driver.findElement(By.xpath("//*[@id='menuform:j_idt43']"));
		Actions actionsmisc = new Actions(driver);
		actionsmisc.moveToElement(Misc).perform();
	}
	
	@Then("the user can close the browser")
	public void the_user_can_close_the_browser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}