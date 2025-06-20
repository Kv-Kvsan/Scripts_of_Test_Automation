package Open_MakemyTrip;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_OpenNewTab_by_Choosingcountry_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Close pop-up
		WebElement popup=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();

		Thread.sleep(3000);

		WebElement countrymenu=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/a/following::li[5]"));
		countrymenu.click();

		Thread.sleep(2000);

		WebElement Country=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		Country.click();

		Thread.sleep(2000);

		WebElement ChoosingCountry=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]/following::p[2]/following::span[2]"));
		ChoosingCountry.click();

		Thread.sleep(2000);

		WebElement Currency=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[1]"));

		Currency.click();

		Thread.sleep(2000);

		WebElement ChoosingCurrency=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[2]/p[6]"));
		ChoosingCurrency.click();

		Thread.sleep(2000);

		WebElement Language=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[1]"));
		Language.click();

		Thread.sleep(2000);

		WebElement ChoosingLanguage=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[2]/p[2]"));
		ChoosingLanguage.click();

		Thread.sleep(2000);

		WebElement Apply=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/span/following::span[51]/following::p[1]/following::div[1]/button"));
		Apply.click();

		Thread.sleep(2000);

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Close pop-up
		WebElement newtabpopup=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		newtabpopup.click();


		Thread.sleep(5000);

		driver.switchTo().window(windows.get(0));

		WebElement countrymenu1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/a/following::li[5]"));
		countrymenu1.click();

		Thread.sleep(2000);

		WebElement Country1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]"));
		Country1.click();

		Thread.sleep(2000);

		WebElement ChoosingCountry1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/div[2]/div[1]/following::p[2]/following::span[2]"));
		ChoosingCountry1.click();

		Thread.sleep(2000);

		WebElement Currency1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[1]"));

		Currency1.click();

		Thread.sleep(2000);

		WebElement ChoosingCurrency1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[2]/div[2]/div[2]/p[6]"));
		ChoosingCurrency1.click();

		Thread.sleep(2000);

		WebElement Language1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[1]"));
		Language1.click();

		Thread.sleep(2000);

		WebElement ChoosingLanguage1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/div[2]/div[1]/div[3]/div[2]/div[2]/p[1]"));
		ChoosingLanguage1.click();

		Thread.sleep(2000);

		WebElement Apply1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[1]/ul/li[5]/span/following::span[51]/following::p[1]/following::div[1]/button"));
		Apply1.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows2 = new ArrayList<>(windowHandles2);
		driver.switchTo().window(windows2.get(2));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Close pop-up
		WebElement newtabpopup1=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		newtabpopup1.click();

		Thread.sleep(3000);
		driver.quit();

	}
}