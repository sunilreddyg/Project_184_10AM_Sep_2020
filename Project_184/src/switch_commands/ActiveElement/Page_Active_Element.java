package switch_commands.ActiveElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Active_Element 
{

	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		WebElement Exp=driver.findElement(By.xpath("//input[@id='cjaExp']"));
		Exp.click();  //This syntax open list of options..
		Thread.sleep(4000);
		
		
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
	}

}
