package corejava.Loops;

public class For_Example {

	public static void main(String[] args) 
	{
		
		//Print numbers from 1 to 10
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//Print number from 10 to 1
		for (int i = 10; i >=1; i--) 
		{
			System.out.println(i);
		}
		
		
		
		//Print all value inside array
		String tools[]= {"ide","rc","grid","wd","jira"};
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		//Conduct sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		
		
		
		//How to reverse a string
		String toolname="webdriver";
		
		char[] c=toolname.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) 
		{
			char ch=toolname.charAt(i);
			System.out.println(ch);
		}
		
		System.out.println("\n");
		
		
		
		//Break keyword in java
		for (int i = 0; i < 10; i++) 
		{
			if(i==4)
			{
				break;
			}
			System.out.println(i);
		}
		
		
		//Continue keyword in java
		for (int i = 0; i < 10; i++) 
		{
			if(i==4 || i==8)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}
