package pageObject_Model_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page 
{
	protected WebDriver driver=null;
	
	private By Email_EB=By.xpath("//input[@id='email']");
	private By Password_EB=By.id("pass");
	private By Login_btn=By.name("login");
	private String Fb_page_title="Facebook – log in or sign up";
	
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public boolean verify_FB_Loginpage()
	{
		return driver.getTitle().contains(Fb_page_title);
	}
	
	
	public void Type_email(String Email)
	{
		driver.findElement(Email_EB).clear();
		driver.findElement(Email_EB).sendKeys(Email);
	}
	
	
	public void Type_password(String Password)
	{
		driver.findElement(Password_EB).clear();
		driver.findElement(Password_EB).sendKeys(Password);
	}
	
	public void click_Login_btn()
	{
		driver.findElement(Login_btn).click();
	}
	
	public void FB_Login(String UID,String PWD)
	{
		Type_email(UID);
		Type_password(PWD);
		click_Login_btn();
		
	}

}
