package ui_verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_page_title 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		String Exp_title="Facebook – log in or sign up";
		String Act_title=driver.getTitle();
		
		
		//Validate Expected and Actual Value
		boolean flag=Act_title.equals(Exp_title);

		//Write a decision to continue on expected title
		if(flag==true)
		{
			System.out.println("Expected title found for Facebook homepage");
			WebElement Singup_link=driver.findElement(By.xpath("//a[@href='/r.php']"));
			Singup_link.click();
			
			//Nested condition to validate Singup page title
			if(driver.getTitle().equals("Sign up for Facebook | Facebook"))
			{
				System.out.println("Expected title preseted for Signup page");
			}
			else
			{
				System.out.println("wrong title presented for signup page");
			}
			
		}
		else
		{
			System.out.println("Expected title not found for Facebook Homepage");
		}
		
	}

}
