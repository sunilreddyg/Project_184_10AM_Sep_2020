package testng_Framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description {


	
	@Test(description="This test verify Adding product to cart")
	public void tc001()
	{
		Reporter.log("Product Added succesfull");
	}
	
	@Test(description="This test verify Removing product from cart")
	public void tc002()
	{
		Reporter.log("Prdocted removed successfull");
	}


}
