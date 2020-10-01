package corejava.other_packages;

import corejava.instantmethods.RobotX;
import corejava.staticmethods.InputDevices;

public class Calling_Methods_From_Different_Package 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * 1. Calling method should declare with public modifier, Inorder to
		 * 	  call from different package.
		 * 
		 * 2. Should import other package reference into Current Class.
		 */
		
		
		/*
		 * Calling Instant Methods
		 * Syntax:-->
		 * 			ClassName obj=new ClassName();
		 * 			obj.Methodname();
		 */
		RobotX obj=new RobotX();
		obj.method1();
		obj.method2();
		
		
		/*
		 * Calling Static Methods
		 * 			ClassName.Methodname();
		 */
		InputDevices.Keyboard();
		InputDevices.Mouse();

	}

}
