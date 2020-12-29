package testng_Framework.Suite_Parameter;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ModuleA 
{
	
	
	@Test(priority=0)
	@Parameters("url")
	public void Launch_Application(String Turl)
	{
		System.out.println("Application url is --->"+Turl);
	}
	
	
	@Test(priority=0)
	@Parameters({"uid","pwd"})
	public void User_login(String Tuid, String Tpwd)
	{
		System.out.println("Username is  --->"+Tuid);
		System.out.println("Password is  --->"+Tpwd);
	}
	
	@Test(priority=0)
	@Parameters("exp_result")
	public void Verify_Result(String Texp_result)
	{
		System.out.println("My expected Result is --> ");
		Assert.assertEquals(Texp_result, "Inbox");
	}

}
