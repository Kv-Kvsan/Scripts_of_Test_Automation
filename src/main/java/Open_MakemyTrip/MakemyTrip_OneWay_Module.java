package Open_MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_OneWay_Module {

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

		//From Location
		WebElement FromLocation=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[1]/label"));
		FromLocation.click();

		Thread.sleep(3000);

		WebElement FromCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[3]"));
		FromCountry.click();

		Thread.sleep(3000);

		//To Location
		WebElement ToLocation=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/label"));
		ToLocation.click();

		Thread.sleep(3000);

		WebElement ToCountry=driver.findElement(By.xpath("//*[@id='react-autowhatever-1']/div/ul/li[2]"));
		ToCountry.click();

		Thread.sleep(3000);

		//From_Date
		WebElement FromDate=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/label/following::div[63]"));
		FromDate.click();

		//To_Date
		WebElement ToDate=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[4]"));
		ToDate.click();

		Thread.sleep(3000);

		//Choosing To_Date Click
		WebElement Choosing_To_Date=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[2]/label/following::div[138]"));
		Choosing_To_Date.click();

		Thread.sleep(3000);

		//Travellers&Class
		WebElement TC=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]"));
		TC.click();

		Thread.sleep(3000);

		//Adults
		WebElement Adults=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[4]"));
		Adults.click();
		Thread.sleep(3000);

		//Childrens
		WebElement Childrens=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/div/following::div[2]/ul/li[3]"));
		Childrens.click();
		Thread.sleep(3000);

		//Infants
		WebElement Infants=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/div/following::div[3]/ul/li[4]"));
		Infants.click();
		Thread.sleep(3000);

		//CHOOSE TRAVEL CLASS
		WebElement Travelclass=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]"));
		Travelclass.click();
		Thread.sleep(3000);

		//Apply
		WebElement Apply=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button"));
		Apply.click();

		Thread.sleep(3000);
		driver.quit();

	}
}