package basicpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Page_source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String src =   driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("Test is present");
		}
		else
		{
			System.out.println("Text is not present");
		}

	}

}
