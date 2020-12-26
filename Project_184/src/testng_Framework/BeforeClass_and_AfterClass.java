package testng_Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_and_AfterClass 
{
	  @Test   //Invoke method to run without object creation
	  public void tc001() 
	  {
		  Reporter.log("testng executed first test",true); //true function print report in console
	  }
	  
	  @Test   //Invoke method to run without object creation
	  public void tc002() 
	  {
		  Reporter.log("testng executed second test",true); //true function print report in console
	  }
	  
	  
	  
	  
	  @BeforeClass  //It invoke once before execution of first @Test invoked
	  public void beforeClass()
	  {
		  System.out.println("PreCondition for class");
	  }
	
	  @AfterClass   //It invoke once after execution of last @Test invoked
	  public void afterClass() 
	  {
		  System.out.println("PostCondition for class");
	  }

}
