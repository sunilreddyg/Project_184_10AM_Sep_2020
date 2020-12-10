package pageObject_Model_Framework_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FB_SignIn_Page 
{
	WebDriver driver;
	
	public FB_SignIn_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//OBject Declaration at page factory.
	@FindBy(how=How.ID,using="email") WebElement Email_EB;   //OLD Format..
	@FindBy(id="pass") WebElement Password_EB;               //New Format
	@FindBy(xpath="//button[@data-testid='royal_login_button']") WebElement Login_btn;
	
	public void Type_username(String UID)
	{
		Email_EB.clear();
		Email_EB.sendKeys(UID);
	}
	
	public void Type_password(String PWD)
	{
		Password_EB.clear();
		Password_EB.sendKeys(PWD);
	}
	
	public void CLick_Login_btn()
	{
		Login_btn.click();
	}


}
