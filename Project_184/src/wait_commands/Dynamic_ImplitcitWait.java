package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_ImplitcitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		System.out.println("Site is up and running");
		
		
		long Stime=System.currentTimeMillis();
		
		try {
			
			
			driver.findElement(By.id("FromTag"));   //Cleartrip application id
			System.out.println("Element Identified");
			System.out.println("Element IDentified in milliSeconds --> "+(System.currentTimeMillis()-Stime));
			System.out.println("Element Identified in Seconds --> "+TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()-Stime));
		
		} catch (Exception e) {
			long Etime=System.currentTimeMillis();
			long Dur=Etime-Stime;
			System.out.println("Duration in MilliSeconds--> "+Dur);
			System.out.println("Duration in Seconds--> "+TimeUnit.MILLISECONDS.toSeconds(Dur));
			System.out.println(e.getMessage());
		}
		

	}

}
