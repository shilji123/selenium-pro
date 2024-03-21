package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_box {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/LuminarTechnolab/Desktop/webpage_alert.html");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		   Alert a=  driver.switchTo().alert();
		   a.accept();
		  
		
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Ahcv");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("raj");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
