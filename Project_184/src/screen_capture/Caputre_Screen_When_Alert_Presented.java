package screen_capture;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caputre_Screen_When_Alert_Presented {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * When alert presented at webpage it disable page access so we 
		 * can't capture alert at webpage.it we tried capturing image when
		 * alert presented it throws exception [Unhandled Alert presented]
		 * 
		 * Solution:-->
		 * 			Capture alert using ROBOT class  [AWT]
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Alert_btn=driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]"));
		Alert_btn.click();
		Thread.sleep(5000);
		
		
		//Get System default Dimension
		Dimension Screen_dimension=Toolkit.getDefaultToolkit().getScreenSize();
		
		//Create Object for Robot
		Robot robot=new Robot();
		//Create New Screenshot using robot interface
		BufferedImage Image=robot.createScreenCapture(new Rectangle(Screen_dimension));
		
		//Write image into local system using IMageIo write..
		String  filepath="C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\screens\\image.png";
		ImageIO.write(Image, "PNG", new File(filepath));
		
		
		/*
		 * Disadvantage while capturing image with robot:-->
		 * 			
		 * 			Make sure required browser window visible at webpage.Because
		 * 			it can capture any thing visble.
		 * 
		 * 			In this case selenium screen capture method only capture
		 * 			automation browser interface even it was minized or Not-visible state.
		 */
		
		
	}

}
