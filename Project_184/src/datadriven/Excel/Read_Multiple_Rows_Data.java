package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class Read_Multiple_Rows_Data 
{

	public static void main(String[] args) throws IOException 
	{
		
		//Target file
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("Target file");
		
		//Access existing workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Taret Sheet Using SheetName
		HSSFSheet sht=book.getSheet("Sheet3");
		
		//Get First and Last Row Numbers, where data available.
		int Frnum=sht.getFirstRowNum();   
		int Lrnum=sht.getLastRowNum();
		
		//Iterate from First Number to Last Row
		for (int i = Frnum+1; i <= Lrnum; i++) 
		{
			//Target Each Row Usng Loop increment
			HSSFRow Eachrow=sht.getRow(i);
			
			//Target Speicific Cells
			String UID=Eachrow.getCell(0).getStringCellValue();
			String PWD=Eachrow.getCell(1).getStringCellValue();
			
			System.out.println(UID+"   "+PWD);
			
		}
		
		
		//Get First and Last row Numebr, Where Data available
		int Fcell_num=sht.getRow(1).getFirstCellNum();
		int Lcell_num=sht.getRow(1).getLastCellNum();
		System.out.println("Data Started at Cell Number -> "+Fcell_num);
		System.out.println("Data Available at Last Cell Number --> "+Lcell_num);
		

	}

}
