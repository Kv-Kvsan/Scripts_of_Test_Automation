package TestNG_Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_OpenNewTab_by_Choosingcountry_Dropdown_Using_TestNGFramework {

	WebDriver driver;
	List<String> windows;
	Set<String> windowHandles;
	List<String> windows2;
	Set<String> windowHandles2;

	@BeforeClass
	public void driver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

	}

	@Test
	public void closepopup() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span")).click();		
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods="closepopup")
	public void countrymenu() throws InterruptedException
	{
		WebElement countrymenu=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/a/following::li[5]"));
		countrymenu.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="countrymenu")
	public void country() throws InterruptedException
	{
		WebElement Country=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		Country.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="country")
	public void choosingcountry() throws InterruptedException
	{
		WebElement ChoosingCountry=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]/following::p[2]/following::span[2]"));
		ChoosingCountry.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="choosingcountry")
	public void Currency() throws InterruptedException
	{
		WebElement Currency=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[1]"));
		Currency.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Currency")
	public void ChoosingCurrency() throws InterruptedException
	{
		WebElement ChoosingCurrency=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[2]/p[6]"));
		ChoosingCurrency.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="ChoosingCurrency")
	public void Language() throws InterruptedException
	{
		WebElement Language=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[1]"));
		Language.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Language")
	public void ChoosingLanguage() throws InterruptedException
	{
		WebElement ChoosingLanguage=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[2]/p[2]"));
		ChoosingLanguage.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="ChoosingLanguage")
	public void Apply() throws InterruptedException
	{
		WebElement Apply=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/span/following::span[51]/following::p[1]/following::div[1]/button"));
		Apply.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Apply")
	public void Set()
	{
		windowHandles = driver.getWindowHandles();
		windows = new ArrayList<>(windowHandles);
		driver.switchTo().window(windows.get(1));
	}

	@Test(dependsOnMethods="Set")
	public void NewtabArabic() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement newtabpopup=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		newtabpopup.click();
		Thread.sleep(5000);

		String URL=driver.getCurrentUrl();
		System.out.println("Current Arabic URL: " + URL);
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="NewtabArabic")
	public void originalwindow() throws InterruptedException
	{
		driver.switchTo().window(windows.get(0));

		String OriginalURL=driver.getCurrentUrl();
		System.out.println("Current Original URL: " + OriginalURL);
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="originalwindow")
	public void countrymenu1() throws InterruptedException
	{
		WebElement countrymenu1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/a/following::li[5]"));
		countrymenu1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="countrymenu1")
	public void Country1() throws InterruptedException
	{
		WebElement Country1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		Country1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Country1")
	public void ChoosingCountry1() throws InterruptedException
	{
		WebElement ChoosingCountry1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]/following::p[2]/following::span[2]"));
		ChoosingCountry1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="ChoosingCountry1")
	public void Currency1() throws InterruptedException
	{
		WebElement Currency1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[1]"));
		Currency1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Currency1")
	public void ChoosingCurrency1() throws InterruptedException
	{
		WebElement ChoosingCurrency1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[2]/p[6]"));
		ChoosingCurrency1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="ChoosingCurrency1")
	public void Language1() throws InterruptedException
	{
		WebElement Language1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[1]"));
		Language1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Language1")
	public void ChoosingLanguage1() throws InterruptedException
	{
		WebElement ChoosingLanguage1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[2]/p[1]"));
		ChoosingLanguage1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="ChoosingLanguage1")
	public void Apply1() throws InterruptedException
	{
		WebElement Apply1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/span/following::span[51]/following::p[1]/following::div[1]/button"));
		Apply1.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Apply1")
	public void NewtabEnglish()
	{
		windowHandles2 = driver.getWindowHandles();
		windows2 = new ArrayList<>(windowHandles2);
		driver.switchTo().window(windows2.get(2));

		String URLEnglish=driver.getCurrentUrl();
		System.out.println("Current English URL: " + URLEnglish);
	}

	@Test(dependsOnMethods="NewtabEnglish")
	public void Windowenglishpopup()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement newtabpopup1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		newtabpopup1.click();

	}

	@AfterClass
	public void teardown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}
}