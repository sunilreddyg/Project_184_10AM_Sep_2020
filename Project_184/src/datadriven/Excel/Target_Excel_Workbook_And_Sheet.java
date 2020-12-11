package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_Excel_Workbook_And_Sheet 
{

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
			 
			 //Target sheet with Index number using book reference
			 HSSFSheet sht2= book.getSheetAt(1);     //Shett Index number [Index number starts with zero]
		
			 //Get Number of sheets avaialble..
			 System.out.println("Number of sheets available is--> "+book.getNumberOfSheets());
		
		

	}

}
