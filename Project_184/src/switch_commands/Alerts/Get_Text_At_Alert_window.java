package switch_commands.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Text_At_Alert_window {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Alert_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		Alert_btn.click();
		Thread.sleep(5000);
		
		
		//Get Text at alert window
		String Act_alert_msg=driver.switchTo().alert().getText();
		if(Act_alert_msg.equals("I am an alert box!"))
		{
			System.out.println("expected text presented at alert");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Wrong alert presented");
		}
			
	}

}
