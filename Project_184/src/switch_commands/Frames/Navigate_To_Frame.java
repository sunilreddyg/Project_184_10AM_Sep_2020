package switch_commands.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_To_Frame {

	public static void main(String[] args) throws Exception 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		Thread.sleep(5000);
		
		//Modalwindow frame element
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("info.dsnr@gmail.com");
		
		
		//Modalwindow frame element
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("809808");
		
		//Get Back to Homepage
		driver.navigate().back();
				
		
		
	}

}
