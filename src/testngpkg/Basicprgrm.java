package testngpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basicprgrm {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//browser open
	}
	
	@BeforeMethod
	public void url()
	{
		//url loading
	}

	@Test(invocationCount = 3)
	public void f_open()
	{
		
	}
	
	@Test(priority = 1)
	public void Fb_login()
	{
		 //Edge browser
	}
	@Test( dependsOnMethods = {"Fb_login"})
	public void link_count()
	{
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void report()
	{
		//report generation
	}
	@AfterTest
	public void  browserquite()
	{
		//Browser close
	}
	
	
	
	
	
	
	
	
	

}
