package corejava.staticmethods;

public class InputDevices 
{
	
	public static void Mouse()
	{
		System.out.println("Mouse Active");
	}
	
	public static void Keyboard()
	{
		System.out.println("Keyboard Active");
	}

	public static void main(String[] args) 
	{
		//Any static specifier methods with in class we can call without ClassName
		Mouse();
		Keyboard();

	}

}
