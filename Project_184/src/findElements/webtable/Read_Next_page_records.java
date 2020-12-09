package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Next_page_records {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement Gainers_table=driver.findElement(By.xpath("(//i[contains(@class,'icon-view-more')])[2]"));
		Gainers_table.click();
		
		
		
		
		
		WebElement Next_btn;
		Next_btn=driver.findElement(By.id("listingTable_next"));
		
		
		String Runtime_class;
		Runtime_class=Next_btn.getAttribute("class");
		boolean flag =Runtime_class.contains("disabled");
		
		
		boolean status=false;
		while(!flag==true)
		{
			
		
			//IDentify Table
			WebElement table;
			table=driver.findElement(By.id("listingTable"));
			
			//Find list of rows available under table
			List<WebElement> rows;
			rows=table.findElements(By.tagName("tr"));
			System.out.println("Number of rows available under table is --> "+rows.size());
			
			
			//Iterate for number of rows  [First row is header]
			for (int i = 1; i < rows.size(); i++) 
			{
				
				WebElement Dynamic_row=rows.get(i);
				//Get Each row text
				String Row_text=Dynamic_row.getText();
				
				if(Row_text.contains("Tata Motors Ltd"))
				{
					status=true;
					//Find List of cells under Each Dynamic row
					List<WebElement> cells=Dynamic_row.findElements(By.tagName("td"));
					
					//Target cell
					WebElement Actions_cell=cells.get(7);
					List<WebElement> links=Actions_cell.findElements(By.tagName("a"));
					links.get(0).click();
					break; //Once your reach your condition better to break a loop to avoid exception
				}
				
				
			}
			
			
			
			//Once your reach your condition better to break a loop to avoid exception
			if(status==true)
			{
				break;
			}
			
			
			
			
			Runtime_class=Next_btn.getAttribute("class");
			flag=Runtime_class.contains("disabled");
			System.out.println(flag);
			if(flag==true)
			{
				break;
			}
			
			Next_btn.click();
			Thread.sleep(2000);
			

			//Restore Next btn location to avlid staleElement reference exception
			Next_btn=driver.findElement(By.id("listingTable_next"));
		}
		
		System.out.println("At Gainers list record available status is --> "+status);
		

	}

}
