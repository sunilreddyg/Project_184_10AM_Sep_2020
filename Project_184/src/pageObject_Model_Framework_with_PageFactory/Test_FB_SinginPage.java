package pageObject_Model_Framework_with_PageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_FB_SinginPage {


	public static void main(String[] args) 
	{
		
		//Browser Initation
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		FB_SignIn_Page obj=new FB_SignIn_Page(driver);
		obj.Type_username("Darshan");
		obj.Type_password("Hello");
		obj.CLick_Login_btn();
				

	}

}
