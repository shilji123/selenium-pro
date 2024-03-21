package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_titleverification {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void title_verification()
	{
		String sc=  driver.getTitle();
		String exp = "Google";
		
		if(sc.equals(exp))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is Fail");
		}
	}
	@After
	public void close()
	{
		driver.close();
	}
	

}
