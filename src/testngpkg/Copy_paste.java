package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copy_paste {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new EdgeDriver();
	}
	@Test
	public void test()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	      WebElement Fullname=	driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	    WebElement Rediffid=  driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Fullname.sendKeys("Amal");
		
		Actions act = new Actions(driver);
		act.keyDown(Fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(Fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(Rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		
		act.perform();


		
		
	}

}
