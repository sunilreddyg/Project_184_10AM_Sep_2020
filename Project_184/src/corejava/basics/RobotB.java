package corejava.basics;

public class RobotB 
{
	
	void walk()
	{
		System.out.println("Walking at starndard speed");
	}
	
	
	void walk(int KM)
	{
		System.out.println("Walking in "+KM+" speed");
	}
	

	public static void main(String[] args) {
		
		//Calling method without parameter
		new RobotB().walk();
		
		//Calling method with parameter
		new RobotB().walk(10);
	}

}
