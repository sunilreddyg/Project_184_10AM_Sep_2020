package datadriven.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Target_Excel_file {

	public static void main(String[] args) throws FileNotFoundException 
	{
		/*
		 * Note:--> Because Excel is raw file in  java we follow FileinputStream
		 * 			to target excel files.
		 */
		
		//target excel file
		FileInputStream fi=new FileInputStream("TestData//InputData.xls");
		System.out.println("File located");
		
		
		//Create Excel file
		FileOutputStream fo=new FileOutputStream("TestData//Ouput.xls");
		System.out.println("File created");
		
		
		//you can also user try catch istead of throws exception
		
		try {
			FileInputStream Inputfile=new FileInputStream("TestData//InputData.xls");
			System.out.println("file located");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
