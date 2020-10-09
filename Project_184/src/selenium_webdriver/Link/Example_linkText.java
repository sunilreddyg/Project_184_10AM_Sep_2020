package selenium_webdriver.Link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_linkText 
{

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("View Webinars")).click();
		
		/*
		 * <a class="tab-active" > ICICIdirect     Money Manager</a>
         *    => Use partial linktext when linkname have space           
		 */
		driver.findElement(By.partialLinkText("Money Manager")).click();
		
		
		driver.findElement(By.linkText("Study Table")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Insurance")).click();
		
		
		driver.findElement(By.linkText("Learn About The Importance Of Health Insurance")).click();
		
	}

}
