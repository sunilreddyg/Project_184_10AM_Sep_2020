package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driver_Test {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fi=null;
		try {
			fi=new FileInputStream("TestData\\Book1.xls");
			System.out.println("file located");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 //get existing workbook
		 HSSFWorkbook book=new HSSFWorkbook(fi);
		 
		 //Target sheet with sheetname using book reference
		 HSSFSheet sht1=book.getSheet("Sheet1");   //Sheet name is casesensitive
		 
		 //Target specific row
		 HSSFRow row=sht1.getRow(1);
		 
		 //Target cell using above row reference
		 HSSFCell Url_Cell=row.getCell(0);
		 
		 //Read Data inside cell
		 String App_url=Url_Cell.getStringCellValue();
		 System.out.println(App_url);
		 
		 
		 //Read username and password
		 String UID=row.getCell(1).getStringCellValue();
		 String PWD=row.getCell(2).getStringCellValue();
		 
		 System.out.println(UID+"   "+PWD);
		 
		 
		 System.setProperty("webdriver.chrome.driver", "Browser_Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get(App_url);
		 driver.manage().window().maximize();
		 
			
		 driver.findElement(By.id("email")).sendKeys(UID);
		 driver.findElement(By.id("pass")).sendKeys(PWD+Keys.ENTER);

	}

}
