package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Action_Using_Javascript {

	public static void main(String[] args) throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("https://www.facebook.com/");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Enable javascript executor at automation browser.
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Set inptu value to email editbox.
		js.executeScript("document.getElementById('email').value='Aakash'");
		
		//Set Input value to Password Editbox
		js.executeScript("document.getElementById('pass').value='newpwd'");
		
		
		
		
		/*
		 * How to identify objects in webpage using javascript
		 * otherthan id property..
		 */
		WebElement Login_btn=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", Login_btn);
		//In above linke arguments[0] will take object form Login_btn

	}

}
