package selenium_webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Commands {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Select Dropdown option Using OptionName
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(5000);
		
		
		//Select dropdown option using Value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("guntur");
		
		
		//Type Text into Editbox
		driver.findElement(By.name("localityName")).clear();
		driver.findElement(By.name("localityName")).sendKeys("Gandhi Nagar");
		
		//Selecting dropdown using index property
		new Select(driver.findElement(By.id("customRadius"))).selectByIndex(4);
		
		//Select ATM checkbox [For Check and Uncheck checkbox webdriver follow click method]
		driver.findElement(By.id("amenity_category_order_types50")).click();
		
		//Identitying location with xpath
		driver.findElement(By.xpath("//*[@id=\"SearchCustomAddress\"]/ul/li[7]/input")).click();

	}

}
