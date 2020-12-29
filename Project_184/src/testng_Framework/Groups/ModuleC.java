package testng_Framework.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModuleC
{
	@Test(groups="RegB",dependsOnGroups="RegA")
	public void tc007()
	{
		Reporter.log("tcoo7 executed");
	}
	
	@Test(groups="RegA")
	public void tc008()
	{
		Reporter.log("tcoo8 executed");
	}
	
	
	@Test(groups="RegB")
	public void tc009()
	{
		Reporter.log("tcoo9 executed");
	}
	
}
