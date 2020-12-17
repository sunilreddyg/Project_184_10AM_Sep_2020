package datadriven.NotepadFiles;

import java.util.Scanner;

public class Using_Scanner_Read_Input_From_System {

	public static void main(String[] args) 
	{
		
		
		//Creating object for scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your name");
		String Rname=sc.next();
		System.out.println("I am -->"+Rname);
		System.out.println("\n");   //Create New line
		
		System.out.println("Enter your age");
		int RAge=sc.nextInt();
		System.out.println("My age is :--> "+RAge);
		System.out.println("\n");   //Create New line
		
		System.out.println("Enter your salary");
		double Rsal=sc.nextDouble();
		System.out.println("My salary is :--> "+Rsal);
		System.out.println("\n");  //Create new line
		
		
		
		
		System.out.println("Start Iteration");
		int Start=sc.nextInt();
		System.out.println("End iteation");
		int End=sc.nextInt();
		
		for (int i = Start; i <= End; i++) 
		{
			System.out.println(i);
		}
		
		

	}

}
