package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_runtime_changes {

	public static void main(String[] args) throws Exception {
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      		//Launch browser
		driver.get("https://www.facebook.com/");        //load page to browser
		driver.manage().window().maximize();	  		//Maximize browser window
		
		
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identif Webelement
		WebElement Email_editbox=driver.findElement(By.id("email"));
		
		
		//Disable Element
		js.executeScript("arguments[0].disabled=true;",Email_editbox);
		Thread.sleep(5000);
		
		//Enabled element
		js.executeScript("arguments[0].disabled=false;",Email_editbox);
		Thread.sleep(5000);
		
		
		//Hide element from webpage
		js.executeScript("arguments[0].style.visibility='hidden';",Email_editbox);
		Thread.sleep(5000);
		
		//Visibility of element
		js.executeScript("arguments[0].style.visibility='visible';",Email_editbox);
		Thread.sleep(5000);
		
		
		/*
		 * Every runtime chanages using javascript executor is temporary. Once
		 * Page refreshed it comes to normal state..
		 */
		
		
	}

}
