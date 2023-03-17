package testNG_proj;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo_validation extends Basetest {
	
	@Test
	public void validtitiles()
	{
		System.out.println("starting");
		String expectedtitle = "Yahoo.com";
		String actualtitle = "Gmail.com";
		System.out.println("title is not matching");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualtitle, expectedtitle);
		System.out.println("page validation");
		softassert.assertEquals(true, false,"page not found");
		System.out.println("checkbox checking");
		softassert.assertEquals(true, false,"checkbox not present");
		//Assert.assertEquals(false, "title not found");
		//Assert.fail("title is not matching");
		System.out.println("ending");
		softassert.assertAll();
	}

}
