package switch_commands.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_Cancel_button {

	public static void main(String[] args) throws Exception 
	{
		

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		//Click Cancel button..
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		
		//Click alert button
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		Thread.sleep(5000);
		
		
		//Click on cancel button at alert window
		driver.switchTo().alert().dismiss();

		
		
		

	}

}
