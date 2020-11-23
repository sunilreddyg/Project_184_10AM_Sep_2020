package wait_commands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_For_Page_title {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Site is up and running");
		
		
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.titleIs("SeleniumHQ Browser Automation"));
		System.out.println("title presented at webapge");
		
		/*
		 * Webdriver throw "TimeoutException" after exceeding timelimit.
		 */
		

		WebElement Download_link=driver.findElement(By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]"));
		Download_link.click();
		
		
		new WebDriverWait(driver, 50).until(ExpectedConditions.titleIs("Downloads"));
		System.out.println("Title verified for downloads page");
		
		
	}

}
