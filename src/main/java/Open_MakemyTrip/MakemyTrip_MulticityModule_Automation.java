
package Open_MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_MulticityModule_Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		Thread.sleep(3000);

		//Close pop-up
		WebElement popup=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();

		Thread.sleep(3000);

		//Open Multi_City
		WebElement multicity=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[1]/ul/li[3]/span"));
		multicity.click();

		Thread.sleep(3000);

		//From Location
		WebElement FromLocation=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[1]/label"));
		FromLocation.click();

		Thread.sleep(3000);

		WebElement FromCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[5]"));
		FromCountry.click();

		Thread.sleep(3000);

		WebElement ToCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[6]"));
		ToCountry.click();

		Thread.sleep(3000);

		WebElement FromDate=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[2]/div"));
		FromDate.click();

		Thread.sleep(3000);

		//Travellers&Class
		WebElement TC=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div[4]"));
		TC.click();
		Thread.sleep(3000);

		//Adults
		WebElement Adults=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[1]/li[4]"));
		Adults.click();
		Thread.sleep(2000);

		//Children
		WebElement Children=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[2]/li[3]"));
		Children.click();

		//Infants
		WebElement Infants=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[3]/li[4]"));
		Infants.click();
		Thread.sleep(2000);

		//CHOOSE TRAVEL CLASS
		
		WebElement Travelclass=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/following::ul[4]/li[2]"));
		Travelclass.click();
		Thread.sleep(2000);

		//Apply
		WebElement Apply=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/button"));
		Apply.click();

		Thread.sleep(3000);

		WebElement ToCity=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/div[2]"));
		ToCity.click();

		Thread.sleep(3000);

		WebElement choosingcity=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div[2]/ul/li[1]"));
		choosingcity.click();
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,250);");
		
		Thread.sleep(2000);
		
		WebElement ToDate=driver.findElement(By.xpath("//div[@id='top-banner']/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]/div"));
		ToDate.click();
		
		Thread.sleep(3000);
		driver.quit();

	}
}