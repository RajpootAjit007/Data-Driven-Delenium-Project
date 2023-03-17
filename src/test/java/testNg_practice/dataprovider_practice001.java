package testNg_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_practice001 {
	
	@Test(dataProvider = "getdata")
	
	public void dataPro(String userid, String password)
	{
		System.out.println("userid"+" "+userid+" "+"password"+" "+password);
	}
	@DataProvider
	
	public Object[][] getdata()
	{
		Object[][] object= new Object[3][2];
		
		object[0][0]="ajit@gmail.com";
		object[0][1]= "12456";
		
		object[1][0]="ankit@gmail.com";
		object[1][1]= "1245600";
		
		object[2][0]="viksha@gmail.com";
		object[2][1]= "458756";
		
		
		
		return object;
	}

}
