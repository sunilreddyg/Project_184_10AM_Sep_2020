package switch_commands.Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_Editbox {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		//Click textbox link
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		
		
		//Click alert button
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-info')]")).click();
		Thread.sleep(5000);
		
		
		//Type text into alert editbox
		driver.switchTo().alert().sendKeys("9030248855");
		
		//Accept alert window
		driver.switchTo().alert().accept();
	}

}
