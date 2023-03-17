package p_pack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class t2_progarm {
	@Test(priority=2)
	void startplaying()
	{
		System.out.println("start playing cricket");
	}
	@BeforeClass
	void hit()
	{
		System.out.println("hit the ball");
	}
	@AfterClass
	void run()
	{
		System.out.println("get run");
	}
	@Test(priority=3)
	void test()
	{
		Assert.assertNotEquals("hi","bye");
	}

}
