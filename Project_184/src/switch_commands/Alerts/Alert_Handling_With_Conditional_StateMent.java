package switch_commands.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_Handling_With_Conditional_StateMent {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Alert_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		Alert_btn.click();
		Thread.sleep(5000);
		
		
		//Using Condition verify alert presented at webpage...
		if(ExpectedConditions.alertIsPresent()!=null)
		{
				Alert alert=driver.switchTo().alert();
				String alert_msg=alert.getText();
				System.out.println(alert_msg);
				
				alert.accept();
		}
		else
		{
			System.out.println("alert not presented");
		}
		
		
		
		

	}

}
