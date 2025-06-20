package TestNG_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_MulticityMakemyTrip_Using_TestNG_DependsonMethods {

	WebDriver driver;
	long starttime;
	long endtime;
	long totaltime;

	@BeforeClass
	public void driver() {
		starttime=System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	}

	@Test
	public void popup() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement popup = driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="popup")
	public void Multi_City() throws InterruptedException
	{

		WebElement multicity=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[1]/ul/li[3]/span"));
		multicity.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="Multi_City")
	public void Fromlocation() throws InterruptedException
	{
		WebElement FromLocation=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/label"));
		FromLocation.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="Fromlocation") 
	public void Fromcountry() throws InterruptedException
	{
		WebElement FromCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[5]"));
		FromCountry.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="Fromcountry")
	public void ToCountry() throws InterruptedException
	{
		WebElement ToCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[6]"));
		ToCountry.click();
	}

	@Test(dependsOnMethods="ToCountry")
	public void FromDate() throws InterruptedException
	{
		WebElement FromDate=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]/div"));
		FromDate.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="FromDate")
	public void TC() throws InterruptedException {
		WebElement TC = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[4]"));
		TC.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="TC")
	public void adults() throws InterruptedException {
		WebElement Adults = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[1]/li[4]"));
		Adults.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="adults")
	public void children() throws InterruptedException {
		WebElement Childrens = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[2]/li[3]"));
		Childrens.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="children")
	public void Infants() throws InterruptedException {
		WebElement Infants = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[3]/li[4]"));
		Infants.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="Infants")
	public void Travelclass() throws InterruptedException {
		WebElement Travelclass = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[4]/li[2]"));
		Travelclass.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="Travelclass")
	public void Apply() throws InterruptedException
	{
		WebElement Apply = driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/button"));
		Apply.click();
	}

	@Test(dependsOnMethods="Apply")
	public void ToCity() throws InterruptedException
	{
		WebElement ToCity=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]"));
		ToCity.click();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="ToCity")
	public void choosingcity() throws InterruptedException
	{
		WebElement choosingcity=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div[2]/ul/li[1]"));
		choosingcity.click();
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,250);");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="choosingcity")
	public void ToDate()
	{
		WebElement ToDate=driver.findElement(By.xpath("//div[@id='top-banner']/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]/div"));
		ToDate.click();
	}

	@AfterClass
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
		endtime=System.currentTimeMillis();
		totaltime=endtime-starttime;
		System.out.println("The total time is:" +totaltime);
	}

}