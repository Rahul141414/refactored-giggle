package Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import Base.Baseclass;
public class Utilityclass  {
	public static String excel(int row ,int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\\\Excel files\\\\Book1.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet7").getRow(row).getCell(col).getStringCellValue();
		return value;
	     }
	public void screenshot(WebDriver driver,int id) throws IOException {
		      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      File destination = new File("D:\\\\Screenshots\\\\TC"+id+".jpg");
		      FileHandler.copy(source, destination);
		     
	}

}
