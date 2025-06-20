package Open_Leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_DragandDrop {

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

		//Clicking DragMenu
		WebElement DragMenu=driver.findElement(By.xpath("//*[@id='menuform:m_drag']"));
		DragMenu.click();
		Thread.sleep(2000);

		//Click Dragmearound
		WebElement Draggable=driver.findElement(By.xpath("//*[@id='form:conpnl']"));
		Actions action = new Actions(driver);
		//action.dragAndDropBy(Draggable, 20, 200).perform();
		action.clickAndHold(Draggable).moveByOffset(200, 220).build().perform();
		Thread.sleep(2000);

		//Droppable
		WebElement Drag=driver.findElement(By.xpath("//*[@id='form:drag']"));
		WebElement Drop=driver.findElement(By.xpath("//*[@id='form:drop']"));
		Actions actionDragandDrop=new Actions(driver);
		actionDragandDrop.dragAndDrop(Drag, Drop).perform();
		Thread.sleep(2000);


		//Draggable Columns
		WebElement DraggableColumns=driver.findElement(By.xpath("//*[@id='form:j_idt94:j_idt95']"));
		WebElement DroppableColumns=driver.findElement(By.xpath("//*[@id='form:j_idt94:j_idt97']"));
		Actions actionDraggableandDroppableColumns=new Actions(driver);
		actionDraggableandDroppableColumns.moveToElement(DraggableColumns).clickAndHold().pause(Duration.ofMillis(500)).moveToElement(DroppableColumns).moveByOffset(20, 0).pause(Duration.ofMillis(500)).release().build().perform();
		Thread.sleep(2000);

		//Draggable Rows
		WebElement DraggableRows=driver.findElement(By.xpath("//*[@id='form:j_idt111_data']/tr[1]"));
		WebElement DroppableRows=driver.findElement(By.xpath("//*[@id='form:j_idt111_data']/tr[4]"));
		Actions actionDraggableandDroppable=new Actions(driver);
		actionDraggableandDroppable.clickAndHold(DraggableRows).moveToElement(DroppableRows,10,10).release().build().perform();
		Thread.sleep(2000);

		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollTo(0, document.body.scrollHeight)"); //Scroll to the bottom of the page
		Thread.sleep(3000);
		//Progress Bar
		WebElement Progress=driver.findElement(By.xpath("//*[@id='form:j_idt119']"));
		Progress.click();

		// Locate the element that contains the text
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement msg1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Progress Completed']")));
		String message = msg1.getText();
		System.out.println("Progress Message: " + message);

		//Resize Image to RHS
		WebElement RHS=driver.findElement(By.xpath("//*[@id='form:logo']/following::div[1]"));
		Actions resizeRHS=new Actions(driver);
		resizeRHS.clickAndHold(RHS).moveByOffset(50, 50).release().perform();
		Thread.sleep(3000);

		//Resize Image to Bottom
		WebElement bottom=driver.findElement(By.xpath("//*[@id='form:logo']/following::div[2]"));
		Actions resizebtm=new Actions(driver);
		resizebtm.clickAndHold(bottom).moveByOffset(50, 50).release().perform();
		Thread.sleep(3000);

		//Zooming the image
		WebElement zoom=driver.findElement(By.xpath("//*[@id='form:logo']/following::div[3]"));
		Actions zoomcross=new Actions(driver);
		zoomcross.clickAndHold(zoom).moveByOffset(5,5).release().perform();
		
		Thread.sleep(2000);
		driver.quit();
	}
}