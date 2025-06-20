package Open_MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Flights_Types_of_Trips {

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
		
		//Round Trip
		WebElement RoundTrip=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[1]/ul/li[2]/span"));
		RoundTrip.click();
		Thread.sleep(3000);
		
		//Multicity
		WebElement Multicity=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[1]/ul/li[3]/span"));
		Multicity.click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
