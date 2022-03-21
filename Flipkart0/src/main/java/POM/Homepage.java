package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy (xpath = "//button[@type='button']") private WebElement profile;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void pro() {
		profile.click();
	}

}
