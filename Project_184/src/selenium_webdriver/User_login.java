package selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_login {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();   //Launching browser
		driver.get("http://facebook.com");     //Open Webpage
		
		//Identifying email location and typing mobile number
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Identifying password location and typing password
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		//Identifying login button and clicking A button
		driver.findElement(By.name("login")).click();
	}

}
