package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Select Roundtrip Radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Type HYD Request at DepartueCity
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);  //Static timegap to load sugesstions.
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		//Type DEL request at Arrival City
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(8000);  //Static timegap to load sugesstions.
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		

		//Selecting date for datepicker.
		driver.findElement(By.linkText("23")).click();
		
		
		//Type Date Into Datepicker editbox [Only possible when editbox is in editable mode]
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 26 Mar, 2021");
		
		
		//Select Number of adults traveling
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("6");
		
		//Click on Search button
		driver.findElement(By.id("SearchBtn")).click();
		
		
		
	}

}
