package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFB 
{
    @FindBy(xpath="//input[@id='email']")private WebElement email;
	
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	
	
	
	
	public PomFB(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void emailid(String A)
	{
		email.sendKeys(A);
	}
	
	public void password(String B)
	{
		pass.sendKeys(B);
	}
	
	public void loginbutton()
	{
		login.click();
	}
	
	
	

}
