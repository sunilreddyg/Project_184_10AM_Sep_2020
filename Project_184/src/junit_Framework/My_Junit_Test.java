package junit_Framework;

import org.junit.Ignore;
import org.junit.Test;

public class My_Junit_Test 
{

	@Test  //@Test annotation invoke method to run without object creation
	public void testA() 
	{
		System.out.println("TestA executed");
	}
	
	@Test  //@Test annotation invoke method to run without object creation
	public void testB() 
	{
		System.out.println("TestB executed");
	}
	
	
	@Ignore
	public void TestC()
	{
		System.out.println("Method will be ignored");
	}

}
