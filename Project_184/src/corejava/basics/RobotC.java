package corejava.basics;

public class RobotC 
{
	//Method type is void, So it doesn't return any value
	void walk() 
	{
		System.out.println("walk method executed");
	}
	
	
	//Method type is integer, So it return value to method name
	int getSpeed()
	{
		return 10;
	}
	
	
	String getName()
	{
		return "Chitti";
	}
	
	
	public static void main(String[] args) 
	{
		 //Calling method without return type
		new RobotC().walk();
		
		//Calling methods with return types
		int speed=new RobotC().getSpeed();
		System.out.println(speed);
		
		String name=new RobotC().getName();
		System.out.println(name);

	}
	

}
