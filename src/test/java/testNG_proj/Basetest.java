package testNG_proj;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Basetest {
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("Everything got initialized");
	}
	
	@AfterSuite
	public void TearDown()
	{
		System.out.println("Everything got quit");
	}
			

}
