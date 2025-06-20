package Open_Leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);

		//Browser
		WebElement Browser=driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		Browser.click();
		Thread.sleep(2000);

		//Clicking Alert
		WebElement Alert=driver.findElement(By.xpath("//*[@id='menuform:m_overlay']"));
		Alert.click();
		Thread.sleep(2000);

		//Clicking Alert(Simple Dialog)
		WebElement Alertsimpledialog=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		Alertsimpledialog.click();

		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		//Clicking Alert (Confirm Dialog)
		WebElement ConfirmDialog=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
		ConfirmDialog.click();

		Thread.sleep(2000);

		Alert alertconfirm=driver.switchTo().alert();
		alertconfirm.dismiss();
		Thread.sleep(2000);

		//Clicking Sweet Alert (Simple Dialog)
		WebElement SweetAlert=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		SweetAlert.click();
		Thread.sleep(2000);

		//Clicking Dismiss
		WebElement Dismiss=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		Dismiss.click();
		Thread.sleep(2000);

		//Clicking Sweet Alert (Simple Dialog)
		WebElement SweetAlertcross=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		SweetAlertcross.click();
		Thread.sleep(2000);

		//Clicking Dismiss
		WebElement Cross=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt96_title']/following::a[1]"));
		Cross.click();
		Thread.sleep(2000);
		
		//Clicking Sweet Modal Dialog
		WebElement SweetModalDialog=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']"));
		SweetModalDialog.click();
		Thread.sleep(2000);
		
		//Clicking Crossbutton
		WebElement Crossbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101_title']/following::a[1]"));
		Crossbutton.click();
		Thread.sleep(2000);
		
		//Alert (Prompt Dialog)
		WebElement Prompt=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']"));
		Prompt.click();
		Thread.sleep(2000);
		
		Alert Promptvalue=driver.switchTo().alert();
		Promptvalue.sendKeys("Keerthivasan");
		Promptvalue.accept();
		Thread.sleep(2000);
		
		//Sweet Alert (Confirmation)
		WebElement ConfirmationYes=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt106']"));
		ConfirmationYes.click();
		Thread.sleep(2000);
		
		WebElement Yes=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt108']"));
		Yes.click();
		Thread.sleep(2000);
		
		//Sweet Alert (Confirmation)
		WebElement ConfirmationNo=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt106']"));
		ConfirmationNo.click();
		Thread.sleep(2000);
		
		WebElement No=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt109']"));
		No.click();
		Thread.sleep(2000);
		
		//Minimize and Maximize
		WebElement show=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt111']"));
		show.click();
		Thread.sleep(2000);
		
		//Min
		WebElement Min=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[3]"));
		Min.click();
		Thread.sleep(2000);
		
		//MinPlus
		WebElement minplus=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[3]"));
		minplus.click();
		Thread.sleep(2000);
		
		//Max
		WebElement Max=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[2]"));
		Max.click();
		Thread.sleep(2000);
	
		//MaxPlus
		WebElement maxplus=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[2]"));
		maxplus.click();
		Thread.sleep(2000);
		
		//CrossConfirmation
		WebElement CrossConfirmation=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[1]"));
		CrossConfirmation.click();
		Thread.sleep(2000);
		driver.quit();
	}
}