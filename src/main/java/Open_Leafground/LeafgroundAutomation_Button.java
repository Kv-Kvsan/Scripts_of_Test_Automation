package Open_Leafground;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundAutomation_Button {

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

		//Clicking Button
		WebElement Button=driver.findElement(By.xpath("//*[@id='menuform:m_button']"));
		Button.click();
		Thread.sleep(2000);

		//Click and confirm the title
		WebElement Click=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt90']"));
		Click.click();

		//Printing the title
		String title=driver.getTitle();
		System.out.println("The title is: " +title);

		//Printing the URL
		String URL=driver.getCurrentUrl();
		System.out.println("The URL is: " +URL);

		Thread.sleep(3000);
		driver.navigate().back();

		//Confirm if the button is disabled.
		WebElement button=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt92']"));
		Boolean disabled=button.isEnabled();
		System.out.println(disabled);
		Thread.sleep(2000);

		//Find the position of the Submit button
		
		WebElement position=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt94']"));
		Point location=position.getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println("Button position of X is--> " +x);
		System.out.println("Button position of Y is--> " +y);

		//Find the height and width of this button
		WebElement HandW=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']"));
		Dimension HeightandWidth=HandW.getSize();
		int width = HandW.getSize().getWidth();
		int height = HandW.getSize().getHeight();
		
		System.out.println("The Height and Width is: " +HeightandWidth);
		System.out.println("The Width is: " +width);
		System.out.println("The Height is: " +height);
		Thread.sleep(2000);

		//Click Image Button and Click on any hidden button
		WebElement Imagebutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt102:imageBtn']"));
		Imagebutton.click();
		Thread.sleep(2000);

		WebElement hiddenbutton=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt100']/following::div[2]"));
		hiddenbutton.click();
		Thread.sleep(2000);
		
		driver.quit();

	}
}
