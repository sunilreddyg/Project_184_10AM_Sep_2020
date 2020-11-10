package switch_commands.Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame with ID property
		driver.switchTo().frame("modal_window");
		
		//Modalwindow frame element
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.clear();
		email.sendKeys("info.dsnr@gmail.com");
		
		
		//Modalwindow frame element
		WebElement TripID=driver.findElement(By.xpath("//input[@id='tripidSecond']"));
		TripID.clear();
		TripID.sendKeys("809808");
		
		
		//Get Controls back to mainapge
		driver.switchTo().defaultContent();
		
		
		//Element under mainpage
		WebElement flights_linnk=driver.findElement(By.xpath("//span[contains(.,'Flights')]"));
		flights_linnk.click();

	}

}
