package testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclasses.BaseClass;
import pomclasses.PolicybajarPom;

public class PolicybajarTest 
{
	WebDriver driver;
	

	BaseClass bs;
	
	@BeforeClass
	public void openbrowser()
	{
		 bs=new BaseClass();
		driver= bs.launchbrowser();
	}
	
	@BeforeMethod
	public void abc()
	{
		
	}
	
	@Test
	public void TC001() throws InterruptedException
	{
		PolicybajarPom pol=new PolicybajarPom (driver);
		pol.healthicon();
		pol.button();
		pol.age("23");
		pol.button();
		
		
		pol.code("431001");
		pol.city1();
		pol.button();
	
		
		pol.fbtn();
		pol.name("Ajay singh");
		pol.numberr("9860590409");
		pol.button();
		
		
		pol.noneofthese();
		pol.button();
		
	
	
		pol.none1();
		
	}
	
	@AfterMethod
	public void xyz()
	{
		
	}
	
	@AfterClass 
	public void Stop()
	{
		
	}


}
