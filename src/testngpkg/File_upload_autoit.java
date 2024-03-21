package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File_upload_autoit {
	WebDriver driver;
	@BeforeTest
	public void seup()
	{
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws IOException
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).click();
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		Runtime.getRuntime().exec("C:\\Users\\LuminarTechnolab\\Downloads\\ssa.exe");
		
		
	}

}
