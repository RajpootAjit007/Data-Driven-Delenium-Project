package testNg_practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	

@Test(dataProvider ="getData" )

public void doLogin( String user, String Password) {
	
	
	System.out.println(user+" -----   "+Password);
}

@DataProvider

public Object [][]  getData() {
	
	Object[][] data = new Object[3][2];
	
	data[0][0] = "vikas@tlp";
	data[0][1] ="ajit@tlp";
	
	data[1][0] = "anjali@tlp";
	data[1][1] ="amit@tlp";
	
	data[2][0] = "rajni@tlp";
	data[2][1] ="pranhya@tlp";
	
	
	
	
	return data;
}
}
