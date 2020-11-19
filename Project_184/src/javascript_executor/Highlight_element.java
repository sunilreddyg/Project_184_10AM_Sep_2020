package javascript_executor;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Highlight_element {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		//Inject javascript on Automation browser..
		((JavascriptExecutor)driver).executeScript("document.getElementById('FromTag').style.outline='thick solid red'");
		Thread.sleep(4000);
		
		
		//Capture screen and covert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
		//Dump screen into local system 
		String Image_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\FlightSearh.png";
		FileHandler.copy(src, new File(Image_path));
		
		
		/*
		 * In Selenium we don't have object hightlihg option. In this case
		 * we used javascript executor to highlight object before taken screen shot..
		 */

	}

}
