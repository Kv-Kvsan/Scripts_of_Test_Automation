package Open_Leafground;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_File {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(2000);

		//Clicking Element
		WebElement Element=driver.findElement(By.xpath("//*[@id='menuform:j_idt43']"));
		Element.click();
		Thread.sleep(2000);

		//Clicking File
		WebElement File=driver.findElement(By.xpath("//*[@id='menuform:m_file']"));
		File.click();
		Thread.sleep(2000);

		//Basic Upload
		WebElement Upload=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt89']"));
		Upload.click();
		Thread.sleep(2000);

		String folder="D:\\User Files\\Documents";

		StringSelection Selection=new StringSelection(folder);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);

		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		String file="D:\\User Files\\Documents\\checkbox.txt";

		StringSelection Selectionfile=new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selectionfile, null);

		Robot robotfolder=new Robot();
		robotfolder.keyPress(KeyEvent.VK_CONTROL);
		robotfolder.keyPress(KeyEvent.VK_V);

		robotfolder.keyRelease(KeyEvent.VK_CONTROL);
		robotfolder.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);
		
		robotfolder.keyPress(KeyEvent.VK_ENTER);
		robotfolder.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		//Basic Download
		WebElement Download=driver.findElement(By.xpath("//*[@id='j_idt93:j_idt95']"));
		Download.click();
		Thread.sleep(2000);

		//Advanced Upload - Only Pictures
		WebElement pictures=driver.findElement(By.xpath("//*[@id='j_idt97:j_idt98']/div[1]/span"));
		pictures.click();
		Thread.sleep(2000);

		String picturefolder="D:\\User Files\\Pictures";

		StringSelection Selectionpicfolder=new StringSelection(picturefolder);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selectionpicfolder, null);

		Robot robotpicfolder=new Robot();
		robotpicfolder.keyPress(KeyEvent.VK_CONTROL);
		robotpicfolder.keyPress(KeyEvent.VK_V);

		robotpicfolder.keyRelease(KeyEvent.VK_CONTROL);
		robotpicfolder.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);

		robotpicfolder.keyPress(KeyEvent.VK_ENTER);
		robotpicfolder.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		String picture="D:\\User Files\\Pictures\\TestLeaf Logo.png";

		StringSelection Selectionpic=new StringSelection(picture);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selectionpic, null);

		Robot robotpic=new Robot();
		robotpic.keyPress(KeyEvent.VK_CONTROL);
		robotpic.keyPress(KeyEvent.VK_V);

		robotpic.keyRelease(KeyEvent.VK_CONTROL);
		robotpic.keyRelease(KeyEvent.VK_V);

		Thread.sleep(2000);


		robotpic.keyPress(KeyEvent.VK_ENTER);
		robotpic.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//Click Upload
		WebElement Uploadbutton=driver.findElement(By.xpath("//*[@id='j_idt97:j_idt98']/div[1]/button[1]"));
		Uploadbutton.click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}