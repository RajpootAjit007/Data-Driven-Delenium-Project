package testNG_proj;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo_annotation extends Basetest{
	
	
	@BeforeTest(groups="bvt")
	public void creat()
	{
		System.out.println("creating db connection");
	}
	@AfterTest
	public void end()
	{
		System.out.println("closing db connection");
	}
	
	
	@BeforeMethod
	public void launching()
	{
		System.out.println("launching browser");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("close the browser");
	}
	
	@Test(priority=1)
	public void userreg()
	{
		System.out.println("do user registration");
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("test case execution");
	}
	
	

}
