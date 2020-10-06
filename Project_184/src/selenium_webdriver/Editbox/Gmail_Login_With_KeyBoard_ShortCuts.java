package selenium_webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_With_KeyBoard_ShortCuts 
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		
		//Type Text into Email editbox and press Enter keyboard button
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("qadarshan"+Keys.ENTER);
		
		
		Thread.sleep(5000);  //It wait 5 seconds until password object load at webpage
		
		//Type text into password editbox and press enter keyboard button
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Hello1234",Keys.ENTER);
		
		
		
		
	}

}
