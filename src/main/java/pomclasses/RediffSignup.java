package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSignup 
{
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement fn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement id;
	
	@FindBy(xpath="(//input[@type='password'])[1]")private WebElement pass;
	
	@FindBy(xpath="(//input[@type='text'])[6]")private WebElement mob;
	
	@FindBy(xpath="(//select[contains(@name,'DOB_')])[1]")private WebElement day;
	
	@FindBy(xpath="(//select[contains(@name,'DOB_')])[2]")private WebElement month;
	
	@FindBy(xpath="(//select[contains(@name,'DOB_')])[3]")private WebElement year;
	
	
	public RediffSignup(WebDriver driver)
	  {
		PageFactory.initElements(driver, this);
	  }
	
	public void name(String A)
	{
		fn.sendKeys(A);
	}
	public void ID(String B)
	{
		id.sendKeys(B);
	}
	public void password(String C)
	{
		pass.sendKeys(C);
	}
	public void number(String D)
	{
		mob.sendKeys(D);
	}
	public void bdob(String E)
	{
		day.sendKeys(E);
	}
	public void bmonth(String F)
	{
		month.sendKeys(F);
	}
	public void byear(String G)
	{
		year.sendKeys(G);
	}

}
