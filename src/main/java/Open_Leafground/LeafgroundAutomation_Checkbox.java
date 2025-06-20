package Open_Leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);

		//Clicking Element
		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt40']"));
		Element.click();
		Thread.sleep(2000);

		//Clicking Checkbox
		WebElement checkbox=driver.findElement(By.xpath("//*[@id='menuform:m_checkbox']"));
		checkbox.click();
		Thread.sleep(2000);

		//Basic Checkbox
		WebElement basic=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']/div[2]"));
		basic.click();
		Thread.sleep(2000);

		//Notification
		WebElement notificationcheck=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/div[2]"));
		notificationcheck.click();
		Thread.sleep(2000);

		WebDriverWait waitcheck=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement Checked = waitcheck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Checked']")));
		String messagechecked= Checked.getText();
		System.out.println("The Notification is: " + messagechecked);

		WebElement notificationuncheck=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/div[2]"));
		notificationuncheck.click();
		Thread.sleep(2000);

		WebDriverWait waituncheck=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement Unchecked = waituncheck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unchecked']")));
		String messageUnchecked = Unchecked.getText();
		System.out.println("The Notification is: " + messageUnchecked);

		//Choose your favorite language(s)
		WebElement language1=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/following::div[6]"));
		language1.click();
		Thread.sleep(2000);

		WebElement language2=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt91']/following::div[7]"));
		language2.click();
		Thread.sleep(2000);

		//Tri State Checkbox
		WebElement tristate1=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate1.click();
		Thread.sleep(2000);

		WebDriverWait Stateof1=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State1 = Stateof1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof1 = Stateof1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 1']")));
		String Statemessageof1 = State1.getText();
		String codeof1= Statecodeof1.getText();
		System.out.println(Statemessageof1);
		System.out.println(codeof1);

		WebElement tristate2=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate2.click();
		Thread.sleep(2000);

		WebDriverWait Stateof2=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State2 = Stateof2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof2 = Stateof2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 2']")));
		String Statemessageof2 = State2.getText();
		String codeof2 = Statecodeof2.getText();
		System.out.println(Statemessageof2);
		System.out.println(codeof2);

		WebElement tristate0=driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		tristate0.click();
		Thread.sleep(2000);

		WebDriverWait Stateof0=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement State0 = Stateof0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State has been changed.']")));
		WebElement Statecodeof0 = Stateof0.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='State = 0']")));
		String Statemessageof0 = State0.getText();
		String codeof0 = Statecodeof0.getText();
		System.out.println(Statemessageof0);
		System.out.println(codeof0);

		Thread.sleep(2000);

		//Toggle Switch
		WebElement TScheck=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt100']/div[2]"));
		TScheck.click();

		WebDriverWait waittogglecheck=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement togglechecked = waittogglecheck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Checked']")));
		String messagetogglechecked = togglechecked.getText();
		System.out.println("The toggle is: " + messagetogglechecked);

		Thread.sleep(2000);

		WebElement TSUncheck=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt100']/div[2]"));
		TSUncheck.click();

		WebDriverWait waittoggleuncheck=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement toggleUnchecked = waittoggleuncheck.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unchecked']")));
		String messagetoggleUnchecked = toggleUnchecked.getText();
		System.out.println("The toggle is: " + messagetoggleUnchecked);
		Thread.sleep(2000);

		//Verify if check box is disabled
		WebElement Checkboxdisabled=driver.findElement(By.xpath("//*[@id='j_idt87:j_idt102']/div[2]"));
		Boolean disabled=Checkboxdisabled.isEnabled();
		System.out.println(disabled);

		//Select Multiple
		WebElement selectallthecountriesdropdown=driver.findElement(By.xpath("//*[@id='j_idt87:multiple']"));
		selectallthecountriesdropdown.click();
		Thread.sleep(2000);

		//		WebElement choosingallthecountries=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[1]"));
		//		choosingallthecountries.click();
		//		Thread.sleep(2000);
		//
		//		WebElement close=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]/following::a[1]"));
		//		close.click();
		//		Thread.sleep(2000);

		//Sendkeys
		WebElement sendkeys=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]/input"));
		sendkeys.sendKeys("L");
		Thread.sleep(2000);

		//London
		WebElement london=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[2]/div/div[2]"));
		london.click();
		Thread.sleep(2000);

		sendkeys.click();
		Thread.sleep(2000);
		sendkeys.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);

		sendkeys.sendKeys("B");
		Thread.sleep(2000);

		//Barcelona
		WebElement Barcelona=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[6]/div/div[2]"));
		Barcelona.click();
		Thread.sleep(2000);

		sendkeys.click();
		Thread.sleep(2000);
		sendkeys.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(2000);

		//Amsterdam
		WebElement Amsterdam=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[2]/ul/li[9]/div/div[2]"));
		Amsterdam.click();
		Thread.sleep(2000);

		WebElement close=driver.findElement(By.xpath("//*[@id='j_idt87:multiple_panel']/div[1]/div[2]/following::a[1]"));
		close.click();

		Thread.sleep(2000);
		driver.quit();

	}
}
