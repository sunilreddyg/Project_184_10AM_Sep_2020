package wait_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_With_Try_Catch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		System.out.println("Site is up and running");
		
		
		boolean flag;
		
		//Enable Explicitwait timeout at automation browser window
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		try {
		
			flag=wait.until(ExpectedConditions.titleContains("QTP"));
			System.out.println("Selenium homepage title verified");
			
		} catch (Exception e) {
			
			flag=false;
		}
		
		System.out.println("Title Presented status is --> "+flag);
		

	}

}
