package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import configuration.ConfigurationPath;
import pomclasses.Signupfb;

public class Signuptest 
{
	WebDriver driver;
	Signupfb FB;
	
	@BeforeClass
	public void signuplaunch()
	{
        System.setProperty("webdriver.chrome.driver", ConfigurationPath.webdriverpath);
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
	}
	
	@BeforeMethod
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void TC01() throws InterruptedException
	{
		FB=new Signupfb(driver);
		
		FB.Firstname("Ajay");
		FB.Lastname("Awchar");
		FB.Email("Ajayawchar07@gmail.com");
		FB.Password("Ajay@123");
		Thread.sleep(2000);
		FB.Birthday("16");
		FB.Birthmonth("Apr");
		FB.Birthyear("1996");
		Thread.sleep(2000);
		FB.Gender();
		
	}
	
	
	
	@AfterMethod
	public void refresh() throws InterruptedException
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
