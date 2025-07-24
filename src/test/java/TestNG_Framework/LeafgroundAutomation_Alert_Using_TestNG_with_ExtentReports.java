package TestNG_Framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LeafgroundAutomation_Alert_Using_TestNG_with_ExtentReports
{

	ChromeDriver driver;
	ExtentReports extentReport;
	ExtentSparkReporter sparkReport;
	ExtentTest test;

	@BeforeSuite
	public void reports()
	{
		extentReport=new ExtentReports();
		sparkReport = new ExtentSparkReporter("test-output/ExtentReport_Alert.html");
		extentReport.attachReporter(sparkReport);
		
	}
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		test=extentReport.createTest("Open the leafground browser");
		test.log(Status.INFO, "Verifying the leafground browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.pass("I am automating an alert module");
		driver.get("https://leafground.com/");
		Thread.sleep(2000);
	}

	@Test
	public void browser() throws InterruptedException
	{
		//Browser
		test=extentReport.createTest("Opening the Browser menu");
		test.log(Status.INFO, "Verifying the browser menu");
		WebElement Browser=driver.findElement(By.xpath("//*[@id='menuform:j_idt39']"));
		Browser.click();
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="browser")
	public void Alertmenu() throws InterruptedException
	{
		//Clicking Alert
		test=extentReport.createTest("Opening the Alert menu");
		test.log(Status.INFO, "Verifying the Alert browser");
		WebElement Alert=driver.findElement(By.xpath("//*[@id='menuform:m_overlay']"));
		Alert.click();
		test.log(Status.PASS, "Alert menu opened successfully!!!");
		Thread.sleep(2000);
	}

	@Test(dependsOnMethods="Alertmenu")
	public void Alert_Simpledialog() throws InterruptedException
	{
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
	}

	@Test(dependsOnMethods="Alert_Simpledialog")
	public void Alert_Confirmdialog() throws InterruptedException
	{
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

	}

	@Test(dependsOnMethods= "Alert_Confirmdialog")
	public void Alert_SweetAlertSimpleDialog() throws InterruptedException
	{
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

	}

	@Test(dependsOnMethods="Alert_SweetAlertSimpleDialog")
	public void Alert_sweetmodaldialog() throws InterruptedException
	{
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
	}

	@Test(dependsOnMethods="Alert_sweetmodaldialog")
	public void prompt_dialog() throws InterruptedException
	{
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
	}

	@Test(dependsOnMethods= "prompt_dialog")
	public void Alert_Confirmation() throws InterruptedException
	{
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

	}

	@Test(dependsOnMethods= "Alert_Confirmation")
	public void MinandMax() throws InterruptedException
	{
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
		
	}
	
	@AfterClass
	public void teardown()
	{
		System.out.println("I closed the browser and it's done!!!");
		driver.quit();
	}
	
	@AfterSuite
	public void flush()
	{
		extentReport.flush();
	}
}
