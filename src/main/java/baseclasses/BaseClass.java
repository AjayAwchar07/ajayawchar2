package baseclasses;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import configuration.ConfigurationPath;

public class BaseClass 
{
	WebDriver driver;


	public WebDriver launchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", ConfigurationPath.webdriverpath);
		
		driver=new ChromeDriver();
		
		driver.get(ConfigurationPath.fburl);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		return driver;
	}
	
	public void Pressab()
	{
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
	}

}
