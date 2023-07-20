package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.ConfigurationPath;
import pomclasses.RediffPom;

public class RediffTest 
{
	WebDriver driver;
	
	@BeforeClass
	public void launchurl()
	{
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.webdriverpath);
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@BeforeMethod
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC001() throws InterruptedException
	{
		RediffPom red=new RediffPom(driver);
		
		red.login("abc@hmail.com");
		red.password("abc@123");
		Thread.sleep(2000);
		
		red.signin();
	}

}
