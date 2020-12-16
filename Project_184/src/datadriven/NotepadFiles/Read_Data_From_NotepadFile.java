package datadriven.NotepadFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_Data_From_NotepadFile {

	public static void main(String[] args) throws IOException {
		
		//Target file location
		String filepath="src\\datadriven\\NotepadFiles\\Input.txt";
		FileReader fr=new FileReader(filepath);
		System.out.println("file located");
		
		//Create object for BufferedReader.
		BufferedReader reader=new BufferedReader(fr);
		
		//Read Header line of notepad file
		String Header=reader.readLine();
		
		//Split Header text using , delimeted file
		String New_Header[]=Header.split(",");
		System.out.println(New_Header[0]+"   "+New_Header[1]+"    "+New_Header[2]);
		
		
		String Rline;  //To read all lines inside text file..
		while((Rline=reader.readLine())!=null)
		{
			String Line[]=Rline.split(",");
			System.out.println(Line[0]+"    "+Line[1]+"    "+Line[2]);
		}
	}

}
