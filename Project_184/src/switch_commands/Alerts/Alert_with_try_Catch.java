package switch_commands.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_try_Catch {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Note:--> Optionally alert presented at webpage and how to handle
		 * 			when alert presented and how to ingore when it was not presented..
		 */
		
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Alert_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		Alert_btn.click();
		Thread.sleep(5000);
		
		
		try {
			
			driver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			System.out.println("alert not presented at webpage");
			
		}
		
		
		

	}

}
