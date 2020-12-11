package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Read_Excel_Data_Using_SpecificRow_And_Specific_Cell 
{

	public static void main(String[] args) throws IOException {
		
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
		 
		 
		 /*
		 * 
		 * getStringCellValue:-->
		 * 			Method read characters from cell 
		 * getNumericCellValue:-->
		 * 			Method read number from cell and return in double format
		 * getDateCellValue:-->
		 * 			Method read data value from cell and return in Date format
		 * getBooleanvalue:-->
		 * 			Method read boolean value true/false from cell. 
		 */
		 
	}

}
