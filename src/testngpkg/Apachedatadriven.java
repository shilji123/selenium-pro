package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Apachedatadriven {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream f = new FileInputStream("https://docs.google.com/spreadsheets/d/1LhYvFk78z6R7FHBnOHo_x_cJxwUlqpOeoXHGCBbQ17c/edit#gid=0");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		 XSSFSheet sh =  wb.getSheet("Sheet1");
		 
		        int rowcount= sh.getLastRowNum();
		        for(int i=1; i<= rowcount; i++)
		        {
		        	String username = sh.getRow(i).getCell(0).getStringCellValue();
		        	System.out.println("username =" + username);
		        	
		        	
		        	
		        	String password=  sh.getRow(i).getCell(1).getStringCellValue();
		        	System.out.println("password ==" +password);
		        	
		        	driver.get("https://www.facebook.com");
		        	driver.findElement(By.name("email")).sendKeys(username);
		        	driver.findElement(By.name("pass")).sendKeys(password);
		        	driver.findElement(By.name("login")).click();
		        	
		        }
	}

}
