package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicybajarPom 
{
	@FindBy(xpath="(//div[@class='prd-icon add shadowHandler short'])[6]")private WebElement icon;
	
	@FindBy(xpath="//input[@type='submit']")private WebElement btn;
	
	@FindBy(xpath="//select[@id='Self']")private WebElement age;  //click
	
	@FindBy(xpath="//input[@id='txtcity']")private WebElement pincode;
	
	@FindBy(xpath="//span[text()='Aurangabad']")private WebElement city; 
	
	@FindBy(xpath="//div[@class='pq_radios']/label[2]")private WebElement Gender;
	
	@FindBy(xpath="//input[@type='text']")private WebElement name;
	
	@FindBy(xpath="//div[@class='input_box mobile_num_box input_box_step checked_input']")private WebElement num; //click
	
	
	@FindBy(xpath="//input[@name='noneOfThese']")private WebElement none;
	
	@FindBy(xpath="//button[@id='viewplans']")private WebElement plan;//click
	
	public PolicybajarPom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		}
	
	public void healthicon()
	{
		icon.click();
	}
	
	public void button()
	{
	    btn.click();
	}
	
	public void age(String A)
	{
		age.sendKeys(A);  //click
	}
	

	
	public void code(String B)
	{
		
		pincode.sendKeys(B);  
	}
	
	public void city1()
	{
		city.click(); //click
	}
	
	
	public void fbtn()
	{
		Gender.click();
	}
	
	public void name(String C)
	{
		name.sendKeys(C);
	}
	
	public void numberr(String D)
	{
		num.sendKeys(D);   //click
	}
	
	
	public void noneofthese()
	{
		none.click();
	}
	public void none1()
	{
		plan.click();
		
	}


}
