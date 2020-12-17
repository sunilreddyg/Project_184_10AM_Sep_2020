package datadriven.NotepadFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Write_Data_Into_NotepadFile {

	public static void main(String[] args) throws Exception 
	{
		
		//Target file location
		String filepath="src\\datadriven\\NotepadFiles\\Output.txt";
		FileWriter fw=new FileWriter(filepath);
		
		//Create object for buffered writer..
		BufferedWriter writer=new BufferedWriter(fw);
		
		writer.write("Tc001 validated result as expected");
		
		writer.newLine();
		writer.write("Tc002 Validated result as expected");
		
		writer.newLine();
		writer.write("Tc003 Validated result as expected");
		
		
		writer.close();  //Write and Save file...
	}

}
