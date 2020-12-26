package testng_Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class WebDriver_Tesng_ClassA
{
	WebDriver driver;
	String Screen_path="C:\\Users\\SUNIL\\git\\10th_July_6PM_2020\\Project_183\\screens\\";
	
	
	
	
	@Test(priority=0)
	public void Tc001_Signup_link()
	{
		WebElement Signup_link=driver.findElement(By.xpath("//a[@href='/r.php']"));
		Signup_link.click();
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
		Reporter.log("Expected title presented for Signup link is --> "+driver.getTitle());
	}
	
	
	
	
	@Test(priority=1)
	public void Tc002_login_link()
	{
		WebElement Login_link=driver.findElement(By.xpath("//a[@href='/login/']"));
		Login_link.click();
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook | Facebook");
		Reporter.log("Expected title presented for Login link is --> "+driver.getTitle());
	}
	

  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  Thread.sleep(3000);
	  File Sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(Sfile, new File(Screen_path+method.getName()+".png"));
	  //It take screenname as current constructed method
  }

  @BeforeClass
  public void beforeClass() 
  {
	  	System.setProperty("webdriver.chrome.driver","browser_drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
