package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Webdriverprgrm {
	WebDriver driver;
	
	@Before
	public void setup()
	{
		 driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("adf");
		
		
		driver.findElement(By.id("pass")).sendKeys("ahjuk");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void close()
	{
		
	}
	

}
