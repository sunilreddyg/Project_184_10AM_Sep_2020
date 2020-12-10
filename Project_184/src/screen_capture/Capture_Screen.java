package screen_capture;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Capture_Screen {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Capture screen and covert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Dump screen into local system 
		String Image_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\Image.png";
		FileHandler.copy(src, new File(Image_path));
		
		
		/*
		 * => FileHanlder throwable exception type we must add
		 * 			throws exception to method.
		 * => We can alos other image extensions .bmp .jpg .png
		 */
		
		/*
		 * Selenium 3:-->
		 * 			Capture only visible interface of screen
		 * Selenium 4:-->
		 * 			Capture fullscreen
		 */
		
		
		/*
		 * In old selenium version inorder to copy file into local system
		 * 	we follow Fileutiles..
		 */
		
		/*
		 * Disadvantages:-->
		 * 		1. Only captring visible interface
		 * 		2. Overriding image every time when rerun the testcase
		 * 		3. We can't capture screen when alert presented
		 */
		
		

	}

}
