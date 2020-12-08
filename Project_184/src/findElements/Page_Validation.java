package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Validation {

	public static void main(String[] args) throws Exception {
		
		//Locate chrome browser in currnet system
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		
		
		String Exp_titles[]=new String[10];
		Exp_titles[0]="About | Cleartrip";
		Exp_titles[1]="Cleartrip - Careers";
		Exp_titles[2]="Cleartrip Flight FAQs";
		Exp_titles[3]="Cleartrip Support Center";
		Exp_titles[4]="Cleartrip Blog";
		Exp_titles[5]="Cleartrip Mobile";
		Exp_titles[6]="Collections - Travel blog";
		Exp_titles[7]="Business travel solution for companies | Cleartrip for Business";
		Exp_titles[8]="Cleartrip Giftcards";
		Exp_titles[9]="Cleartrip Referral Program";
		
		
		
		
		//Identitying footer links
		WebElement Footer_links=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
		//Identifying links under Footer_links area.
		List<WebElement> All_links=Footer_links.findElements(By.cssSelector("a[rel='nofollow']"));
		System.out.println("List of links available under footer links --> "+All_links.size());
		
		
		//Iterate for number of links
		for (int i = 0; i < All_links.size()-1; i++) 
		{
			//Get Each link using index number
			WebElement Eachlink=All_links.get(i);
			
			String Linkname=Eachlink.getText();
			String LInkhref=Eachlink.getAttribute("href");
			//System.out.println(Linkname+"       "+LInkhref);
			
			//Click Eachlink
			Eachlink.click();   //If page changes your references will be empty and your recieve "StateElementReference Exception"
			Thread.sleep(4000);
			
			if(driver.getTitle().equals(Exp_titles[i]))
				System.out.println(Linkname+"\t"+"Expected title presented");
			else
				System.out.println(Linkname+"\t"+"wrong  title presented");
			
			//Navigate back to mainpage
			driver.navigate().back();
			
			
			//Restore References to avoid StateElement Reference exception
			Footer_links=driver.findElement(By.cssSelector("ul[class='inline clearFix']"));
			All_links=Footer_links.findElements(By.cssSelector("a[rel='nofollow']"));
			
		}


	}

}
