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

public class MakemyTrip_using_TestNG_Priority {

	WebDriver driver;

	@BeforeClass
	public void driver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}

	@Test(priority = 1)
	public void popup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement popup = driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void fromlocation() throws InterruptedException {
		WebElement FromLocation = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/label"));
		FromLocation.click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void fromcountry() throws InterruptedException {
		WebElement FromCountry = driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[3]"));
		FromCountry.click();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void tolocation() throws InterruptedException {
		WebElement ToLocation = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/label"));
		ToLocation.click();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void Tocountry() throws InterruptedException {
		WebElement ToCountry = driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[2]"));
		ToCountry.click();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void fromdate() throws InterruptedException {
		WebElement FromDate = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/label/following::div[73]"));
		FromDate.click();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void todate() throws InterruptedException {
		WebElement ToDate = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[4]"));
		ToDate.click();
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void ChoosingTo_DateClick() throws InterruptedException {
		WebElement Choosing_To_Date = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/label/following::div[138]"));
		Choosing_To_Date.click();
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void TC() throws InterruptedException {
		WebElement TC = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]"));
		TC.click();
		Thread.sleep(3000);
	}

	@Test(priority = 10)
	public void adults() throws InterruptedException {
		WebElement Adults = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[4]"));
		Adults.click();
		Thread.sleep(3000);
	}

	@Test(priority = 11)
	public void children() throws InterruptedException {
		WebElement Childrens = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/div/following::div[2]/ul/li[3]"));
		Childrens.click();
		Thread.sleep(3000);
	}

	@Test(priority = 12)
	public void Infants() throws InterruptedException {
		WebElement Infants = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/div/following::div[3]/ul/li[4]"));
		Infants.click();
		Thread.sleep(3000);
	}

	@Test(priority = 13)
	public void Travelclass() throws InterruptedException {
		WebElement Travelclass = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]"));
		Travelclass.click();
		Thread.sleep(3000);
	}

	@Test(priority = 14)
	public void Apply() throws InterruptedException {
		WebElement Apply = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button"));
		Apply.click();
	}

	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
