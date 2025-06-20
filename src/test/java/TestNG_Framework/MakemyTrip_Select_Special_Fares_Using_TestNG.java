package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Select_Special_Fares_Using_TestNG {

	WebDriver driver;

	@BeforeClass
	public void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}

	@Test(priority=1)
	public void popup() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement popup = driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void Student_Special_Fare() throws InterruptedException
	{
		WebElement Student=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]"));
		Student.click();
		Thread.sleep(2000);
	}	

	@Test(priority=3)
	public void Seniorcitizen() throws InterruptedException
	{
		WebElement Seniorcitizen=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[3]/div[1]"));
		Seniorcitizen.click();
		Thread.sleep(2000);
	}

	@Test(priority=4)
	public void ArmedForces() throws InterruptedException
	{
		WebElement ArmedForces=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div[1]"));
		ArmedForces.click();
		Thread.sleep(2000);
	}

	@Test(priority=5)
	public void DoctorandNurses() throws InterruptedException
	{
		WebElement DoctorandNurses=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[5]/div[1]"));
		DoctorandNurses.click();
	}

	@AfterClass
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
