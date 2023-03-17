package testNG_proj;

import org.testng.Assert;
import org.testng.annotations.Test;

public class failuretest extends Basetest {
	
	@Test
	public void dologin()
	{
		Assert.fail("failing login test case");
		System.out.println("capturing the screenshot");
	}

}
