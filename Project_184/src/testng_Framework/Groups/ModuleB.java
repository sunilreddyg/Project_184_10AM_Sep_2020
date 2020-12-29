package testng_Framework.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleB
{
	
	@Test(groups="RegB")
	public void tc004()
	{
		Reporter.log("tcoo4 executed");
	}
	
	@Test(groups="RegA")
	public void tc005()
	{
		Reporter.log("tcoo5 executed");
	}
	
	
	@Test(groups="RegB")
	public void tc006()
	{
		Reporter.log("tcoo6 executed");
	}
 
}
