package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTripHomepage_using_Grouping_with_TestNGFramework {

	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}

	@Test(groups={"Popup"})
	public void closepopup() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span")).click();		
		Thread.sleep(3000);
	}

	@Test(groups={"Scrollingdown"})
	public void scrolldown()
	{
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	@Test(groups={"Scrollingup"})
	public void scrollup()
	{
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0,0)");

	}

	@AfterClass(alwaysRun = true)
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
