package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void test()
	{
		WebElement drag =  driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop =  driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop);
		
		act.perform();
		
		String text =   drop.getText();
		if(text.equals("dropped!"))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail ");
		}
		
			
		
	}

}
