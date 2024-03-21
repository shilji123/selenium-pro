package junitpkg;

import java.io.File;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpage_screenshot {
	WebDriver driver;
	@Before
	public void setup()
	{
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/LuminarTechnolab/Desktop/webpage_alert.html");
	}
	
	@Test
	public void test() throws IOException
	{
		
		File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		org.openqa.selenium.io.FileHandler.copy(src, new File("E:\\Screen.png"));

		                                
		                                
		       
		                             
		
		
	}

	
}
