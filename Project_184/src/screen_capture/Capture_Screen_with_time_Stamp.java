package screen_capture;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_with_time_Stamp {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();      //Launch browser
		driver.get("http://cleartrip.com");       //load page to browser
		driver.manage().window().maximize();	  //Maximize browser window
		
		
		//Get Default System Date
		Date d=new Date();
		System.out.println(d.toString());
		//Crearing simple dateformat and convert Default into Simple format
		String New_Date=new SimpleDateFormat("yyyy-MMM-dd-hh-mm-ss").format(d);
		
		
		//Capture screen and covert into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Dump screen into local system 
		String Image_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\image";
		FileHandler.copy(src, new File(Image_path+New_Date+".png"));
		

	}

}
