package findElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);  //Static time to close advertise window..
		
		
		
		
		
	}

}
