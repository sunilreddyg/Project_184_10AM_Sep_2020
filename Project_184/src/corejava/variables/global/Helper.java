package corejava.variables.global;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver;
	private String Driver_path="Drivers\\chromedriver.exe";
	public String url="http://facebook.com";
	private String valid_uid="qadarshan@gmail.com";
	final String Valid_pwd="Hello12345";
	private String Invalid_uid="897jdlfj@gmail.com";
	final String Invalid_pwd="7kjdkfj9j";
	
	//During pageobject frame work we define locators globally
	By Obj_email=By.xpath("//input[contains(@name,'email')]");
	By Obj_pwd=By.xpath("//input[@id='pass']");
	By Obj_login_btn=By.xpath("//button[contains(@data-testid,'royal_login_button')]");
	
	public void Launch_browser()
	{
		System.setProperty("webdriver.chrome.driver", Driver_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void Load_webpage()
	{
		driver.get(url);
	}
	
	
	public void User_login_valid()
	{
		driver.findElement(Obj_email).clear();
		driver.findElement(Obj_email).sendKeys(valid_uid);
		
		driver.findElement(Obj_pwd).clear();
		driver.findElement(Obj_pwd).sendKeys(Valid_pwd);
		
		driver.findElement(Obj_login_btn).click();
		
	}
	
	public void User_login_INvalid()
	{
		WebElement Email_EB=driver.findElement(Obj_email);
		Email_EB.clear();
		Email_EB.sendKeys(Invalid_uid);
		
		driver.findElement(Obj_pwd).clear();
		driver.findElement(Obj_pwd).sendKeys(Invalid_pwd);
		
		driver.findElement(Obj_login_btn).click();
		
	}
	
	

}
