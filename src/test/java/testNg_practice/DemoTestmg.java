package testNg_practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestmg {

	
	@BeforeTest
	
	public void createConnection() {
		
		System.out.println("Create DB Connection");
	}
	
	@AfterTest
public void closeConnection() {
		
		System.out.println("close DB Connection");
	}
	
	@BeforeMethod
	
public void launchBrowser() {
		
		System.out.println("launching the browser");
	}
	
	@AfterMethod
public void closeBrowser() {
		
		System.out.println("closing the browser");
	}
	@Test(priority=2)
	
public void doLogin() {
		
		System.out.println("login the applicastion");
	}
	@Test(priority =1)
public void userRegister() {
		
		System.out.println("Register the applicastion");
	}
	
}
