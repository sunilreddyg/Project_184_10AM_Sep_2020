package corejava.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DO_while_Example {

	public static void main(String[] args) throws Exception {
		
		
		//DO-while with false condition..
		int i=0;
		do {
			System.out.println(i);
		} while (i > 10);
		
		
		//Do-while with true condition [print numbers 1 to 10]
		int j=1;
		do {
			System.out.println(j);
			j=j+1;
		} while (j <= 10);
		
		
		
		
		
		/*
		 * Example:--> Using do-while write a program to reload page
		 * 				until expected page found..
		 */
		System.setProperty("webdriver.chrome.driver",  "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		boolean flag = false;
		int k=0;
		do {
			 driver.get("https://www.selenium.dev/");
			 
			 try {
				 flag=new WebDriverWait(driver, 20).until(ExpectedConditions.titleIs("Sign up for Facebook | Facebook"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			 
			 k=k+1;
			 if(k==10)
			 {
				 System.out.println("tried 10 times to load page after every 10 Seconds");
				 break;   //Stop iteration and come out form loop.
			 }
			 
		} while (!flag==true);
		
		
		System.out.println("page load successfull");
		
		
		/*
		 * Note:--> Do while is usefull to read dynamic webtable data..
		 */
		
		
		
	}

}
