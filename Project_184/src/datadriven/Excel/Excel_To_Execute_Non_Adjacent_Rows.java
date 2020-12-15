package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel_To_Execute_Non_Adjacent_Rows {

	public static void main(String[] args) throws IOException 
	{

		//Target file
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		System.out.println("Target file");
		
		//Access existing workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		
		//Taret Sheet Using SheetName
		HSSFSheet sht=book.getSheet("Sheet4");
		
		//Get First and Last Row Numbers, where data available.
		int Frnum=sht.getFirstRowNum();   
		int Lrnum=sht.getLastRowNum();
		
		//Iterate from First Number to Last Row
		for (int i = Frnum+1; i <= Lrnum; i++) 
		{
			//Target Each Row Usng Loop increment
			HSSFRow Eachrow=sht.getRow(i);
			
			//Get Exceution Status From 3rd cell
			String Exe_Status=Eachrow.getCell(2).getStringCellValue();
			//Accept only Exeution status is "Y"
			if(Exe_Status.equalsIgnoreCase("y"))
			{
				//Target Speicific Cells
				String UID=Eachrow.getCell(0).getStringCellValue();
				String PWD=Eachrow.getCell(1).getStringCellValue();
				
				System.out.println(UID+"   "+PWD);
				
			}
			
			
		
		}
		

	}

}
