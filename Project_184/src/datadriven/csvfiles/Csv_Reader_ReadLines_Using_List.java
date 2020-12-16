package datadriven.csvfiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;

public class Csv_Reader_ReadLines_Using_List {

	public static void main(String[] args) throws Exception
	{
		//Target file
		FileReader fr=new FileReader("C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\src\\datadriven\\csvfiles\\Input.csv");
		System.out.println("file located");
		
		//Get Csv reader using File reference
		CSVReader reader=new CSVReader(fr);
		
		//Read all record into list interface
		List<String[]> list=reader.readAll();
		for (String[] EachRecord : list) 
		{
			System.out.println(EachRecord[0]+"    "+EachRecord[1]+"    "+EachRecord[2]);
		}
				

	}

}
