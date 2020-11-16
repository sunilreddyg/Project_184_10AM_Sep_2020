package interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_RightClick {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		//Press Right click using mouse...
		WebElement Button=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		new Actions(driver).contextClick(Button).perform();  //Context click analogs right click actio at mouse..
		
		
		//Click Delete button
		WebElement Delete_btn=driver.findElement(By.xpath("//body/ul[1]/li[5]/span[1]"));
		new Actions(driver).click(Delete_btn).perform();
		Thread.sleep(4000);
		
		//Switch to alert and click on ok button
		driver.switchTo().alert().accept();
	}

}
