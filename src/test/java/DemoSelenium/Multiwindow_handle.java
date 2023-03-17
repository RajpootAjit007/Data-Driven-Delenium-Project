package DemoSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiwindow_handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		driver.findElement(By.xpath("//a[text()='jqueryui']")).click();
	//	page title is jQuery UI
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String first_child_text = null;
		while(itr.hasNext())
		{
			String windowsid = itr.next();
			driver.switchTo().window(windowsid);
			if(driver.getTitle().equals("Basic Web Page Title"))
			{
				first_child_text=driver.findElement(By.xpath("//p[text()='A paragraph of text']")).getText();
			}
		}
		System.out.println(first_child_text);
		driver.quit();

	}

}
