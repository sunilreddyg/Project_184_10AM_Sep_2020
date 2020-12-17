package junit_Framework;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClass_And_AfterClass 
{

	
	@Test
	public void testA() 
	{
		System.out.println("TestA");
	}
	
	
	@Test
	public void testB()
	{
		System.out.println("TestB");
	}
	
	
	
	@BeforeClass //Invoke Before first @Test annoation
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Class Precondition");
	}

	@AfterClass //Invoke After last @test annoation
	public static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Class PostCondition");
	}


}
