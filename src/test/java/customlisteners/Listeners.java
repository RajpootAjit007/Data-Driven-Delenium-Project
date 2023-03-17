package customlisteners;

import org.apache.poi.util.SystemOutLogger;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test got pass successfully");

	}
	public void onTestFailure(ITestResult result)
	{
		
		Reporter.log("sreenshot file");
		System.out.println("capturing screen shot-----"+result.getName());
	}
	

}
