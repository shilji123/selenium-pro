package basicpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		   String title = driver.getTitle();
		   String exp = "google";
		   
		   if(title.equals(exp))
		   {
			   System.out.println("pass");
		   }
		   else
		   {
			   System.out.println("Fail");
		   }
		   
		   

	}

}
