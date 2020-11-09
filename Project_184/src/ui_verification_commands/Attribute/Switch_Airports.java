package ui_verification_commands.Attribute;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switch_Airports 
{

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		String Hyd_City="Hyderabad, IN - Rajiv Gandhi International (HYD)";
		String Del_City="New Delhi, IN - Indira Gandhi Airport (DEL)";
		
		
		WebElement Object_Departure_city=driver.findElement(By.xpath("//input[@id='FromTag']"));
		WebElement Object_Arrival_city=driver.findElement(By.xpath("//input[@id='ToTag']"));
		
		
		Object_Departure_city.clear();
		Object_Departure_city.sendKeys("HYD");
		driver.findElement(By.linkText(Hyd_City)).click();
		
		
		Object_Arrival_city.clear();
		Object_Arrival_city.sendKeys("DEL");
		driver.findElement(By.linkText(Del_City)).click();
		new Actions(driver).sendKeys(Keys.ESCAPE);   
		
		
		/*
		 * => Click Switch airports button
		 * => Expected Swithc airports between departure and arrival cities
		 */
		driver.findElement(By.xpath("//a[@title='Switch airports']")).click();
		Thread.sleep(5000);
		
		
		String From_value=Object_Departure_city.getAttribute("value");
		String To_Value=Object_Arrival_city.getAttribute("value");
		if(From_value.equals(Del_City) && To_Value.equals(Hyd_City))
			System.out.println("Testpass");
		else
			System.out.println("Testfail");
		

	}

}
