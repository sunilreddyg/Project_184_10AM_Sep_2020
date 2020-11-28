package corejava.Arrays;

public class Runtime_Array {

	public static void main(String[] args) {
		
		/*
		 * Runtime Array:-->
		 * 			Runtime array was categorized into two types
		 * 				1. Single Dimensional array
		 * 				2. Double Dimensional array
		 */
		
		
		//runtime single dimensional array
		String tools[]={"ide","rc","wd","grid","appium","katalon","jira"};
		System.out.println("3rd index value is --> "+tools[3]);
		System.out.println("Object Count is --> "+tools.length);
		
		
		//runtime double dimensional array.
		String userdata[][]= 
			{
					{"Rajesh","ECE"},
					{"Abdul","CSE"},
					{"Kushi","ECE"},
					{"Aakash","MEC"},
				
		    };
		
		System.out.println(userdata[2][0]);
		
		
		System.out.println("Object count is ---> "+userdata.length);
		
		
	}

}
