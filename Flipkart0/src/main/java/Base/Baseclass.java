package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

public class Baseclass {
	protected WebDriver driver;
	@Parameters("Browsername")
	
	public void cross(String Browsername) {
		if(Browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browsername.equals("mozila")) {
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\chromedriver_win32\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.adidas.co.in/");
		
	}
	

}
