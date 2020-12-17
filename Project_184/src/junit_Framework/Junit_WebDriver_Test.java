package junit_Framework;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Junit_WebDriver_Test 
{
	static WebDriver driver;
	static String chromepath="Browser_Drivers\\chromedriver.exe";
	static String url="https://www.facebook.com/";
	static String screen_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\";
    public @Rule TestName test=new TestName();  //This statement help to get constructed method name
	
	@Test
	public void Tc001_Verify_Signup_link() 
	{
		driver.findElement(By.xpath("//a[@href='/r.php'][contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
	}
	
	
	@Test
	public void Tc002_Verify_Login_link() 
	{
		driver.findElement(By.xpath("//a[@href='/login/'][contains(.,'Log In')]")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
	}
	
	@Test
	public void Tc003_Verify_Messenger_link()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
	}
	
	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception 
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(screen_path+test.getMethodName()+".png"));
		//test.getMethodName() ---> Current TestName [Because iamge override we have to Current Testname]
	}

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}


}
