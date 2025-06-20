package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Login_Using_TestNGParameterization {
	
	WebDriver driver;
	
	@BeforeClass
	public void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}
	
	@Test
	@Parameters("Name")
	public void popup(String mobilenumber) throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement number=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/div[1]/following::div[3]/following::input[1]"));
		number.sendKeys(mobilenumber);
		Thread.sleep(3000);
		
		WebElement popup = driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();
		
		Thread.sleep(2000);
		driver.quit();	
	}
}