package Pom_Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageclass {
	WebDriver driver;
	
//	By fbemail=By.id("email");
	
	@FindBy(id = "email")
	WebElement fbemail;
	
	@FindBy(id = "pass")
	WebElement fbpass;
	
	@FindBy(name ="login")
	WebElement login;
	
	
	
	public Pageclass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void setvalues(String email, String passwrd)
	{
		fbemail.sendKeys(email);
		fbpass.sendKeys(passwrd);
	}
	
	public void login()
	{
		login.click();
	}
}
