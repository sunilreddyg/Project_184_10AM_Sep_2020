package testng_Framework.TestSuite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleA
{
	@Test
	public void tc001()
	{
		Reporter.log("tcoo1 executed");
	}
	
	@Test
	public void tc002()
	{
		Reporter.log("tcoo2 executed");
	}
	
	
	@Test
	public void tc003()
	{
		Reporter.log("tcoo3 executed");
	}

}
