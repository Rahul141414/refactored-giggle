package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.Baseclass;
import POM.Homepage;
import Utility.Utilityclass;

public class Testclass extends Baseclass {
	Homepage home;
	@Parameters("Browsername")
	@BeforeClass
	public void launchbrowser(String Browsername) throws InterruptedException, EncryptedDocumentException, IOException {
		cross(Browsername);
		Thread.sleep(5000);
//		Utilityclass u = new Utilityclass();
//		String h = u.excel(0, 0);
		home= new Homepage(driver);
		home.pro();
		
	}
	@Test
	public void validation() {
		
	}
	

}
