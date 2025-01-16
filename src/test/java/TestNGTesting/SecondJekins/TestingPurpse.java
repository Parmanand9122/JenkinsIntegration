package TestNGTesting.SecondJekins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingPurpse {

	@Test
	public void LaunchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
}
