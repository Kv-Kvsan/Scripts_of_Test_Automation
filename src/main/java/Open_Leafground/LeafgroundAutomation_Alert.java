package Open_Leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_Alert
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExtentReports extentReport=new ExtentReports();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter("test-output/ExtentReport_using_Mainmethod_Alert.html");
		extentReport.attachReporter(sparkReport);

		ExtentTest test=extentReport.createTest("Open the chrome browser");
		test.log(Status.INFO, "Verifying the leafground site");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);

		//Browser
		test.log(Status.INFO, "Opening the browser menu");
		WebElement Browser=driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		Browser.click();
		Thread.sleep(2000);

		//Clicking Alert
		test=extentReport.createTest("Opening the Alert menu");
		test.log(Status.INFO, "Verifying the Alert browser");
		WebElement Alert=driver.findElement(By.xpath("//*[@id='menuform:m_overlay']"));
		Alert.click();
		test.log(Status.PASS, "Alert menu opened successfully!!!");
		Thread.sleep(2000);

		//Clicking Alert(Simple Dialog)
		test=extentReport.createTest("Verifying the Alert_Simpledialog module");
		test.log(Status.INFO, "Verifying the Alert_Simpledialog module");

		WebElement Alertsimpledialog=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		Alertsimpledialog.click();
		test.log(Status.PASS, "Simple dialog alert clicked successfully!!!");

		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		alert.accept();

		test.log(Status.PASS, "Simple dialog alert accepted successfully!!!");
		Thread.sleep(2000);

		//Clicking Alert (Confirm Dialog)
		test=extentReport.createTest("Verifying the Alert_Confirmdialog module");
		test.log(Status.INFO, "Verifying the Alert_Confirmdialog module");

		WebElement ConfirmDialog=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']"));
		ConfirmDialog.click();
		Thread.sleep(2000);

		Alert alertconfirm=driver.switchTo().alert();
		alertconfirm.dismiss();
		test.log(Status.PASS, "Simple dialog alert dismissed successfully!!!");
		Thread.sleep(2000);

		//Clicking Sweet Alert (Simple Dialog)
		test=extentReport.createTest("Verifying the Alert_SweetAlertSimpleDialog module");
		test.log(Status.INFO, "Verifying the Alert_SweetAlertSimpleDialog module");

		WebElement SweetAlert=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		SweetAlert.click();
		test.log(Status.PASS, "Sweet Alert Simple dialog alert clicked successfully!!!");
		Thread.sleep(2000);

		//Clicking Dismiss
		WebElement Dismiss=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		Dismiss.click();
		test.log(Status.PASS, "Sweet Alert Simple dialog alert dismissed successfully!!!");
		Thread.sleep(2000);

		//Clicking Sweet Alert (Simple Dialog)
		WebElement SweetAlertcross=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
		SweetAlertcross.click();
		test.log(Status.PASS, "Sweet Alert Simple dialog alert clicked successfully!!!");
		Thread.sleep(2000);

		//Clicking Cross
		WebElement Cross=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt96_title']/following::a[1]"));
		Cross.click();
		test.log(Status.PASS, "Sweet Alert Simple dialog alert closed successfully!!!");
		Thread.sleep(2000);


		//Clicking Sweet Modal Dialog
		test=extentReport.createTest("Verifying the Alert_sweetmodaldialog module");
		test.log(Status.INFO, "Verifying the Alert_sweetmodaldialog module");

		WebElement SweetModalDialog=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']"));
		SweetModalDialog.click();

		test.log(Status.PASS, "Sweet Modal Dialog clicked successfully");
		Thread.sleep(2000);

		//Clicking Crossbutton
		WebElement Crossbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt101_title']/following::a[1]"));
		Crossbutton.click();
		test.log(Status.PASS, "Sweet Modal Dialog closed successfully");
		Thread.sleep(2000);

		//Alert (Prompt Dialog)
		test=extentReport.createTest("Verifying the prompt_dialog module");
		test.log(Status.INFO, "prompt_dialog opened successfully");

		WebElement Prompt=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']"));
		Prompt.click();
		test.log(Status.PASS, "prompt_dialog clicked successfully");
		Thread.sleep(2000);

		Alert Promptvalue=driver.switchTo().alert();
		Promptvalue.sendKeys("Keerthivasan");
		Promptvalue.accept();
		test.log(Status.PASS, "prompt value accepted clicked successfully");
		Thread.sleep(2000);

		//Sweet Alert (Confirmation)
		test=extentReport.createTest("Verifying the Alert_Confirmation module");
		test.log(Status.INFO, "Verifying the Alert_Confirmation module");

		WebElement ConfirmationYes=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt106']"));
		ConfirmationYes.click();
		test.log(Status.INFO, "Clicked the confirmation button for Yes");
		Thread.sleep(2000);

		WebElement Yes=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt108']"));
		Yes.click();
		test.log(Status.PASS, "Clicked Yes for confirmation");
		Thread.sleep(2000);

		WebElement ConfirmationNo=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt106']"));
		ConfirmationNo.click();
		test.log(Status.PASS, "Clicked the confirmation button for No");

		WebElement No=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt109']"));
		No.click();
		test.log(Status.PASS, "Clicked No for confirmation");
		Thread.sleep(2000);

		//Minimize and Maximize
		test=extentReport.createTest("Verifying the MinandMax module");
		test.log(Status.INFO, "Verifying the MinandMax module");

		WebElement show=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt111']"));
		show.click();
		test.log(Status.INFO, "Clicked No for confirmation");
		Thread.sleep(2000);

		//Min
		WebElement Min=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[3]"));
		Min.click();
		test.log(Status.PASS, "Clicking Minimize");
		Thread.sleep(2000);

		//MinPlus
		WebElement minplus=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[3]"));
		minplus.click();
		test.log(Status.PASS, "Minimize the page");
		Thread.sleep(2000);

		//Max
		WebElement Max=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[2]"));
		Max.click();
		test.log(Status.PASS, "Clicking Maximize");
		Thread.sleep(2000);

		//MaxPlus
		WebElement maxplus=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[2]"));
		maxplus.click();
		test.log(Status.PASS, "Maximize the page");
		Thread.sleep(2000);

		//CrossConfirmation
		WebElement CrossConfirmation=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt112_title']/following::a[1]"));
		CrossConfirmation.click();
		test.log(Status.PASS, "Closed the page");
		Thread.sleep(2000);
	
		driver.quit();
		extentReport.flush();
	}
}