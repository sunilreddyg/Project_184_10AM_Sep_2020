package pageObject_Model_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login_Page {

	public static void main(String[] args) 
	{
		
		//Browser Initation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Login_Page obj=new Login_Page(driver);
		if(obj.verify_FB_Loginpage())
			obj.FB_Login("9030248855", "Hello12345");
		else
			System.out.println("Failed to open FB login page");
		
		
		
		

	}

}
