package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPom 
{
	@FindBy(xpath="//input[@id='login1']")private WebElement un;
	
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")private WebElement button;
	
	
	public RediffPom(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void login(String a)
	{
		un.sendKeys(a);
	}
	
	public void password(String b)
	{
		pass.sendKeys(b);
	}
	
	public void signin()
	{
		button.click();
	}

}
