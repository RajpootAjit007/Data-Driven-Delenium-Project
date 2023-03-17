package testNg_practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateTitle {
	
	@Test
	public void validateBrwTitle() {
		
		System.out.println("beggning");
		
		String acctual_Title = "www.google.com";
		String expected_title="www.yahoo.com";
		
		//SoftAssert softassert = new SoftAssert();
	//	softassert.assertEquals(acctual_Title, expected_title);
		Assert.assertEquals(acctual_Title, expected_title,"Title is not matching");
		
		System.out.println("end");
		
		//softassert.assertAll();
	}

}
