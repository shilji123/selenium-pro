package junitpkg;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_linkvalidation {
	WebDriver driver;
	@Before
	public void url()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		List<WebElement> li= driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links " + li.size());
		
		        for(WebElement element:li)
		        {
		        	String link=	element.getAttribute("href");
		        //	System.out.println(link);
		        	
		        	String text=         element.getText();
		        	System.out.println(link + "------" + text);
		}

	}

}
