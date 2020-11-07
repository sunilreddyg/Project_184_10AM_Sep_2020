package ui_verification_commands.getText;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_visible_At_Webpage {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		//Identify webpage using page body tag
		WebElement Page_body=driver.findElement(By.tagName("body"));
		
		//Get innertext at page [only Visible at webpage]
		String Page_Visbile_text=Page_body.getText();
		System.out.println(Page_Visbile_text);
		
		
		if(Page_Visbile_text.contains("Create a new account"))
			System.out.println("text visible at FB registration page");
		else
			System.out.println("text not visible at FB registration page");
		
		
		if(Page_Visbile_text.contains("It's quick and easy."))
			System.out.println("text visible at FB registration page");
		else
			System.out.println("text not visible at FB registration page");
		
	}

}
