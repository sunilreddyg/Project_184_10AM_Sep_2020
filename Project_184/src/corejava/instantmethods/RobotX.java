package corejava.instantmethods;

public class RobotX 
{
	public RobotX()
	{
		System.out.println("Instance Executed");
	}
	
	public void method1()
	{
		System.out.println("method1 executed");
		
	}
	
    public void method2()
	{
		System.out.println("method2 executed");
		
	}

	public static void main(String[] args) 
	{
		
		//Calling only constructor
		new RobotX();
		
		//Calling Instance methods
		new RobotX().method1();
		new RobotX().method2();
		
		//Calling Instance method using variable.
		RobotX obj=new RobotX();
		obj.method1();
		obj.method2();
		
	}

}
