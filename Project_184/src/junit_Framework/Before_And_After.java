package junit_Framework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Before_And_After 
{

	@Before  //This will invoke every @Test annotation before
	public void setUp() throws Exception 
	{
		System.out.println("Test precondition");
	}

	@After //This will invoke every @Test annotation after
	public void tearDown() throws Exception 
	{
		System.out.println("Test post condition"+"\n");
	}

	@Test
	public void testA() 
	{
		System.out.println("TestA executed");
	}
	
	@Test
	public void testB() 
	{
		System.out.println("TestB executed");
	}


}
