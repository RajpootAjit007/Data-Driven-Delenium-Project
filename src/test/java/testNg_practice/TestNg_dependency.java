package testNg_practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_dependency {

	    @Test(priority=2)
		public void testcase1 ()
		{
			System.out.println("registration");
			Assert.fail("registration is not success");
		}
	    
	    @Test(priority=3, dependsOnMethods = "testcase1")
		public void testcase2 ()
		{
			System.out.println("registration done");
		}
	    
	    @Test(priority=1, dependsOnMethods = "testcase1", alwaysRun=true)
		public void testcase3 ()
		{
			System.out.println("Login");
		}
	    

	}


