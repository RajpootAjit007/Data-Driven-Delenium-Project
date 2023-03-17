package testNG_proj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_dependencies extends Basetest{
	
	@Test(priority=1,groups="smoke")
	public void userregistration()
	{
		System.out.println("users are being registered");
		Assert.fail("user not registered successfully");
	}
	
	@Test(priority=2,groups="functional")
	public void login()
	{
		System.out.println("login successful");
		Assert.fail("capturing the screenshot");
	}
	@Test(priority=3,groups="bvt")
	public void thirdtest()
	{
		System.out.println("executing third test case");
	}
	@Test(priority=4)
	public void fourthtest()
	{
		System.out.println("executing fourth test case");
	}

}
