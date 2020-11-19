package javascript_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_window {

	public static void main(String[] args) throws Exception {
		
		//Set Runtime environment variable for chrome driver
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");    
		
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
			
		//To scroll window vertical.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(100,600)");
	   Thread.sleep(4000);
	   
	   
	   //To Scroll horizonal.
	   ((JavascriptExecutor)driver).executeScript("window.scroll(300,100)");

	}

}
