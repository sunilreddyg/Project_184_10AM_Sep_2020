package screen_capture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_By_Moving_Into_Location {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://naukri.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		
		WebElement gallery=driver.findElement(By.xpath("//h2[contains(.,'Job Gallery')]"));
		new Actions(driver).moveToElement(gallery).perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
		
		//Capture screen and covert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Dump screen into local system 
		String Image_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\Image.png";
		FileHandler.copy(src, new File(Image_path));
		
				

	}

}
