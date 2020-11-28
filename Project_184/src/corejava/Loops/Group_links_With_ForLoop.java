package corejava.Loops;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Group_links_With_ForLoop {

	public static void main(String[] args) throws Exception 
	{
		
		
	//Set Runtime environment variable for chrome driver
	String chrome_path="Drivers\\chromedriver.exe";
	
	//browser inititaion
	System.setProperty("webdriver.chrome.driver", chrome_path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	
	String links[]={"Sign Up","Log In","Messenger","People"
			,"Pages","Games","Terms","Services","Careers","Cookies"};
	
	//Iterate for number of links..
	for (int i = 0; i < links.length; i++) 
	{
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(2000);
			
			System.out.println(links[i]+"----> "+driver.getTitle());
			
			
			File Sfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String screen_path="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\";
			FileHandler.copy(Sfile, new File(screen_path+links[i]+".png"));
			
			Thread.sleep(2000);
			driver.navigate().back();
	}
	
	
	Thread.sleep(3000);
	driver.close();
	

	
}
	
}
