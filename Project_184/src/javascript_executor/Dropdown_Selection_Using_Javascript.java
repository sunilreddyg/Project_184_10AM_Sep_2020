package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_Selection_Using_Javascript 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      		//Launch browser
		driver.get("https://www.facebook.com/");        //load page to browser
		driver.manage().window().maximize();	  		//Maximize browser window
		
		
		//Enable javascript executor at automation browser.
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//click Create Account page
		js.executeScript("document.getElementById('u_0_2').click()");
		Thread.sleep(2000);
		
		//Select dropdown with Dropdown option value property
		js.executeScript("document.getElementById('day').value='11'");
		//select dropdown with Index number  using javascript
		js.executeScript("document.getElementById('month').selectedIndex ='06'");
	}

}
