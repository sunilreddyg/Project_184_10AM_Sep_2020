package corejava.variables;

public class Variable_Initiation 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Local Initiation
		 */
		int a=100;
		System.out.println("Variable value is --> "+a);
		
		
		/*
		 * Global Inititaion
		 */
		int b;
		b=300;
		b=400;
		System.out.println("Variable value is ---> "+b);
		
		
		//Condition statement with global variable
		String name;
		if(true)
		{
			name="MQ";
		}
		System.out.println("Name value is --> "+name);
		
		
		
		//Condition Statement With Global Variable
		int Age=18;
		boolean flag;
		if(Age>=18)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		
		System.out.println("Flag value is --> "+flag);
		
		
		
		//Loop with global variable
		int sum=0;
		for (int i = 1; i <= 10; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		

	}

}
