package Open_MakemyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Clicking_The_Search_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Close pop-up
		WebElement popup=driver.findElement(By.xpath("//*[@id='top-banner']/div[1]/div[1]/div[2]/div[2]/div/section/span"));
		popup.click();
		
		Thread.sleep(3000);
		
		//Clicking Search button
		WebElement Search=driver.findElement(By.xpath("//*[@id='top-banner']/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div[5]/span/following::p[1]/a"));
		Search.click();
		
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//*[text()='OKAY, GOT IT!']"));
		button.click();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		WebElement popupbutton=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/following::div[7]/button"));
		popupbutton.click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}