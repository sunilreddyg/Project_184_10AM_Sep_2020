package corejava.Arrays;

public class Static_Array {

	public static void main(String[] args)
	{
		/*
		 * Static Array:-->
		 * 			Static array was categorized into two types
		 * 				1. Single Dimensional array
		 * 				2. Double Dimensional array
		 */
		
		
		//Single dimensional static array..
		String names[]=new String[4];
		names[0]="Anil";
		names[1]="ridhi";
		names[2]="pranil";
		names[3]="ikshit";
		
		System.out.println("2nd index value is --> "+names[2]);
		System.out.println("Object count is  ---> "+names.length);
		

		//Double dimenstional statis array.
		String data[][]=new String[3][2];
		

		//1st row data
		data[0][0]="User1";
		data[0][1]="pwd1";
		
		//2nd row data
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//3nd row data
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		System.out.println(data[1][0]);
		System.out.println("Count of objects is --> "+data.length);
	}

}
