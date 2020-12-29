package testng_Framework.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleA
{
	@Test(groups="RegA")
	public void tc001()
	{
		Reporter.log("tcoo1 executed");
	}
	
	@Test(groups="RegB")
	public void tc002()
	{
		Reporter.log("tcoo2 executed");
	}
	
	
	@Test(groups="RegA")
	public void tc003()
	{
		Reporter.log("tcoo3 executed");
	}

}
