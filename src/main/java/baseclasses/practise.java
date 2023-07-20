package baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) 
	{
WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.close();
		
		System.out.println("hi hello this is Git HUb");
		
		System.out.println("Made changes");
		

	}

}
