package wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Visibilityof_Element 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Site is up and running");
		
		
	
		
		By Downloads_link=By.xpath("//a[@class='nav-item'][contains(.,'Downloads')]");
		driver.findElement(Downloads_link).click();
		
		
		
		new WebDriverWait(driver, 30).until
		(ExpectedConditions.visibilityOfElementLocated(Downloads_link)).click();
		System.out.println("Download link clicked");
		
		
		

	}

}
