package Pom_testpkg;


import org.testng.annotations.Test;

import Pom_Pagepkg.Pageclass;
import Pom_basepkg.Base_class;

public class Testclass extends Base_class {
//	WebDriver driver;
	
	@Test
	public void testlogin()
	{
		Pageclass ob = new Pageclass(driver);
		ob.setvalues("abc@123", "1234");
		ob.login();
	}

}
