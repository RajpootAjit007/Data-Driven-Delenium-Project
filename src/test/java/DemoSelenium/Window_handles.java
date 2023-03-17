package DemoSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) {
	String browser = "chrome";
	WebDriver driver = null;
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", ".\\Driver\\geckodriver.exe");
	}
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	Set<String> windowsid = driver.getWindowHandles();
	Iterator<String> itr = windowsid.iterator();
	while(itr.hasNext())
	{
		String windowsids = itr.next();
		System.out.println(windowsids);
		driver.quit();
	}
	

	}

}
