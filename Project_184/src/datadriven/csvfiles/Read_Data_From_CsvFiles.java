package datadriven.csvfiles;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Read_Data_From_CsvFiles {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file
		FileReader fr=new FileReader("C:\\Users\\SUNIL\\git\\Project_184_10AM_Sep_2020\\Project_184\\src\\datadriven\\csvfiles\\Input.csv");
		System.out.println("file located");
		
		//Get Csv reader using File reference
		CSVReader reader=new CSVReader(fr);
		
		//Read Line of Csvfile
		String R1[]=reader.readNext();
		System.out.println(R1[0]);
		System.out.println(R1[1]);
		System.out.println(R1[2]);
		
		
		String Rline[];    //Read all next records inside csv file and store into array
		while((Rline=reader.readNext())!=null)   
		{
			System.out.println(Rline[0]+"  "+Rline[1]+"   "+Rline[2]);
		}
		
		
		
		

	}

}
