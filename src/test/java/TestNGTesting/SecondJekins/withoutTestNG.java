package TestNGTesting.SecondJekins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutTestNG {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://github.com/");
		driver.quit();

	}

}
