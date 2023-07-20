package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.ConfigurationPath;
import pomclasses.RediffSignup;

public class SigunupRediffTest 
{
	WebDriver driver;
	
	@BeforeClass
	public void launchbrowser()
	{
       System.setProperty("webdriver.chrome.driver", ConfigurationPath.webdriverpath);
		
		driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@BeforeMethod
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC001() throws InterruptedException
	{
		RediffSignup acc=new RediffSignup(driver);
		
		acc.name("Ajay Awchar");
		acc.ID("abc07");
		acc.password("Ajay@123");
		acc.number("9860590407");
		acc.bdob("16");
		acc.bmonth("APR");
		acc.byear("1996");
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void refreshpage() throws InterruptedException
	{
		
	  // driver.navigate().refresh();
	   Thread.sleep(2000);
	}
	
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
	}

}
