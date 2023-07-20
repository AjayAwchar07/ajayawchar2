package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupfb 
{
    @FindBy(xpath="//input[@name='firstname']")private WebElement fname;
	
	@FindBy(xpath="//input[@name='lastname']")private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")private WebElement password;
	
	@FindBy(xpath="//select[@id='day']")private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")private WebElement year;
	
	@FindBy(xpath="//label[text()='Male']")private WebElement gender;
	
	
	
	public Signupfb(WebDriver driver)
	{

		PageFactory.initElements( driver,this);
	}
	public void Firstname(String A)
	{
		fname.sendKeys(A);
	}
	
	public void Lastname(String B)
	{
		lname.sendKeys(B);
	}
	
	public void Email(String C)
	{
		email.sendKeys(C);
	}
	
	public void Password(String D)
	{
		password.sendKeys(D);
	}
	
	public void Birthday(String e)
	{
		day.sendKeys(e);
	}
	
	public void Birthmonth(String f)
	{
		month.sendKeys(f);
	}
	
	public void Birthyear(String g)
	{
		year.sendKeys(g);
	}
	
	public void Gender()
	{
		gender.click();
	}

}
