package testng_Framework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod 
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

	  
	  @BeforeMethod //This method invoke every @Test annotation before
	  public void beforeMethod()
	  {
		  System.out.println("Test preCondition");
	  }
	
	  @AfterMethod //This method invoke every @Test annotation after
	  public void afterMethod() 
	  {
		  System.out.println("Test postConditition"+"\n");
	  }

}
