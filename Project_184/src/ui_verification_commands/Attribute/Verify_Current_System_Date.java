package ui_verification_commands.Attribute;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Current_System_Date {

	public static void main(String[] args) throws Exception {
		
		
		/*
		 * Testcase:--> Verify every day Current System date displayed 
		 * 				at Departure editbox.
		 */
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement Departure_Editbox=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String DDate=Departure_Editbox.getAttribute("value");
		System.out.println("Departure date displayed is  --> "+DDate);
		
		
		//Capture current system date
		Date date=new Date();
		System.out.println(date.toString());
		
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		
		//Convert Date using simple date formatter
		String Sdate=sdf.format(date);
		System.out.println("System date in simple date format --> "+Sdate);
		
		
		//Verify System date match with Departure date
		if(Sdate.equals(DDate))
			System.out.println("As expected Today systam date matching with Departure date");
		else
			System.out.println("Mismatch between Systemdate and Departure date");
	}

}
