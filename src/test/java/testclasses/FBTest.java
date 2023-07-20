package testclasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import baseclasses.Utility;
import configuration.ConfigurationPath;
import pomclasses.PomFB;

public class FBTest
{
	WebDriver driver;
	PomFB fb;
	BaseClass bc;
	
	@BeforeClass
	public void launchFB()
	{
		bc=new BaseClass();
		driver=bc.launchbrowser();
		
	}
	
	@BeforeMethod
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void tc01() throws EncryptedDocumentException, IOException
	{
		 fb=new PomFB(driver);
		 
		// fb.emailid("Ajayawchar07@gmail.com");
		// fb.password("Ajay@123");
		// fb.loginbutton();
		 
		 fb.emailid(Utility.readexcelsheet(0, 0));
		 Utility.screenshot(driver);
		 
		 fb.password(Utility.readexcelsheet(0, 1));
		 fb.loginbutton();
	}
	
	@AfterMethod
	public void refreshpage() throws InterruptedException
	{
		
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	

}
