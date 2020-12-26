package testng_Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestng_Test 
{
  @Test   //Invoke method to run without object creation
  public void tc001() 
  {
	  Reporter.log("tesng executed first test");
  }
  
  @Test   //Invoke method to run without object creation
  public void tc002() 
  {
	  Reporter.log("testng executed second test",true); //true function print report in console
  }
  
  @Test   //Invoke method to run without object creation
  public void tc003() 
  {
	  Reporter.log("testng executed thrid test");
  }
}
