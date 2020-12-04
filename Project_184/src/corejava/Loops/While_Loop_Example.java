package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop_Example {

	public static void main(String[] args) throws Exception 
	{
		
		
		//While loop print numbers from 1 to 10
		int i=1;
		while(i <=10) 
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		

		//While loop with false condition
		int j=10;
		while(j > 100)   //False Condition
		{
			System.out.println("This Statement doesn't execute");
			j=j+1;
		}
		
		
		//Example:--> Using while loop manage explicit wait.
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		
		WebElement Retype_Email=driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"));
		
		int k=0;
		while(!Retype_Email.isDisplayed())
		{
			System.out.println("Element is validating:-->");
			k=k+1;
			if(k==30)
			{
				throw new Exception("element not visible after validating 30 seconds");
			}
		}
		
		System.out.println("Element visible at webpage");

	}

}
