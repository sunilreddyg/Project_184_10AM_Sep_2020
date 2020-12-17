package datadriven.NotepadFiles;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read_NotepadFile_Data_Using_Scanner {

	public static void main(String[] args) throws IOException {
		
		
		//Target file location
		String filepath="src\\datadriven\\NotepadFiles\\Input.txt";
		File file=new File(filepath);
		System.out.println("file located");
			
		
		//Create object for scanner
		Scanner sc=new Scanner(file);
		
		//Read Line
		while(sc.hasNext())
		{
			//Read Next line at notepad file
			String Rline=sc.nextLine();
			
			//Split all delimeted characters between Text[It store Data into Array]
			String Field[]=Rline.split(",");
			System.out.println(Field[0]+"   "+Field[1]+"    "+Field[2]);
		}

	}

}
