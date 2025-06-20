package Open_MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Select_Special_Fares {

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

		//Select Special Fare
		WebElement Student=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[2]/div[1]"));
		Student.click();
	
		Thread.sleep(2000);

		WebElement Seniorcitizen=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[3]/div[1]"));
		Seniorcitizen.click();
		Thread.sleep(2000);

		WebElement ArmedForces=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[4]/div[1]"));
		ArmedForces.click();
		Thread.sleep(2000);

		WebElement DoctorandNurses=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[5]/div[1]"));
		DoctorandNurses.click();
		Thread.sleep(2000);

		driver.quit();

	}

}
