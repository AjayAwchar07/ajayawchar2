package baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import configuration.ConfigurationPath;

public class Utility 
{
   public static String readexcelsheet(int row,int cell) throws EncryptedDocumentException, IOException	
   {
	   FileInputStream file=new FileInputStream(ConfigurationPath.excelsheetpath);
	   
	   Sheet sht = WorkbookFactory.create(file).getSheet("Sheet6");
	   
	   String data = sht.getRow(0).getCell(0).getStringCellValue();
	   
	  return data;
	   
   }
   
   public static void screenshot(WebDriver driver) throws IOException
   {
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    Date d=new Date();
	    
	    String str = d.toString().replace(":", "_");
	    
	    File destination = new File(ConfigurationPath.screenshot+str+"ajay.jpg");
	    
	    FileHandler.copy(source, destination);
   }

}
