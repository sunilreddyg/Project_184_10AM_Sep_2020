package ui_verification_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_page_Source {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		
		//Method capture entirepage source into String..
		String PageSource=driver.getPageSource();
		
		
		/*
		 * Note:--> In this line when element not found at [DOM] webdriver throw
		 * 			exception and suspend your run  [NosuchElementException]
		 */
		WebElement Email=driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
		Email.clear();
		Email.sendKeys("9030248855");
		
		
		/*
		 * Note:--> In this line when element not found at Pagesource
		 * 			it prevent action to perform on location and lest us know
		 * 			element not available at source without throwing exception..
		 */
		if(PageSource.contains("royal_email"))
		{
			System.out.println("Element Presented at source");
			WebElement Email_EB=driver.findElement(By.cssSelector("input[data-testid='royal_email']"));
			Email_EB.clear();
			Email_EB.sendKeys("9030248855");
		}
		else
		{
			System.out.println("Element Not presented at source");
		}
		
		
		
		/*
		 * Verify Element presented at source using try-catch block..
		 */
		try {
			
			driver.findElement(By.cssSelector("input[data-testid='royal_emai']"));
			System.out.println("Element presented at source");
			
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Completed run");
		
		

	}

}
