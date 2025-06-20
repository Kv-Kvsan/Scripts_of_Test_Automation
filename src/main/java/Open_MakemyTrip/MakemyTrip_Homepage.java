package Open_MakemyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip_Homepage {

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
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
