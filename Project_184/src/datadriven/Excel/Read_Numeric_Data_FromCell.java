package datadriven.Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Read_Numeric_Data_FromCell {

	public static void main(String[] args) throws IOException {
		
		//Target file
		FileInputStream fi=new FileInputStream("TestData\\Book1.xls");
		//Target Existing workbook
		HSSFWorkbook book=new HSSFWorkbook(fi);
		//Target sheet
		HSSFSheet sht=book.getSheet("Sheet2");
		//Target Row using sheet reference
		HSSFRow row=sht.getRow(1);

		//By Default Numericell value read double format
		double salary=row.getCell(1).getNumericCellValue();
		System.out.println("Double Format cell value is --> "+salary);
		
		//Read Interger value From NumericCell 
		double Number_in_Double_frmt=row.getCell(2).getNumericCellValue();
		System.out.println("Numer in double format is =--> "+Number_in_Double_frmt);
		
		//Convert primitive datatype double value to Object
		Double Object_format=new Double(Number_in_Double_frmt);
		
		//Double object format Convert INto Integer value
		int Attendes_list_in_integer_frmat=Object_format.intValue();
		System.out.println(Attendes_list_in_integer_frmat);
		
		//Double value conver into String format
		String Sal_text=NumberToTextConverter.toText(Number_in_Double_frmt);
		System.out.println("Salary in text format is --> "+Sal_text);
	}

}
