package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Target_PerticualRow_Data_Using_Referrence_Record_Name {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Target Table Using Unique location
		WebElement Gainers_table=driver.findElement(By.id("eqGLBody"));

		//Find list of rows available in table
		List<WebElement> rows=Gainers_table.findElements(By.tagName("tr"));
		System.out.println("Number of rows available --> "+rows.size());
		
		boolean flag=false;
		//iterate for number of rows
		for (int i = 0; i < rows.size(); i++) 
		{
			
			//Get 5th row using Index number
			WebElement Each_Dynamic_Row=rows.get(i);
			
			String Row_Text=Each_Dynamic_Row.getText();
			if(Row_Text.contains("Bajaj Auto"))
			{
				flag=true;
				
				//Get List of Cells available with in Table
				List<WebElement> cells=Each_Dynamic_Row.findElements(By.tagName("td"));
				
				//Get First and Second cell data using index number
				String CName=cells.get(0).getText();
				String LTP=cells.get(1).getText();
				
				//Target company name cell and find link under cell
				WebElement CName_Cell=cells.get(0);  
				//Find a link under cell
				CName_Cell.findElement(By.tagName("a")).click();
				
				System.out.println(CName+"    "+LTP);
			
				
			}
			
		}
		
		
		
		System.out.println("Record available status is ---> "+flag);
		

	}

}
