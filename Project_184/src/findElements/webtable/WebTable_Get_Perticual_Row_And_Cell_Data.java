package findElements.webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Get_Perticual_Row_And_Cell_Data {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();					
		driver.get("https://www.icicidirect.com/equity");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Target Table Using Unique location
		WebElement Gainers_table=driver.findElement(By.id("tblMarketToday"));

		//Find list of rows available in table
		List<WebElement> rows=Gainers_table.findElements(By.tagName("tr"));
		
		//Get 5th row using Index number
		WebElement Selected_row=rows.get(4);
		
		//Get List of Cells available with in Table
		List<WebElement> cells=Selected_row.findElements(By.tagName("td"));
		
		//Get First and Second cell data using index number
		String CName=cells.get(0).getText();
		String LTP=cells.get(1).getText();
		
		System.out.println(CName+"    "+LTP);
		
		
		
	}

}
