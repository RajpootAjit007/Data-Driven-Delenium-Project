package DemoSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
	Set<String> windowid1 = driver.getWindowHandles();
	Iterator<String> itr = windowid1.iterator();
	String id1 = itr.next();
	String id2 = itr.next();
	driver.switchTo().window(id2);
	String childwindowitext = driver.findElement(By.xpath("//p[text()='Another paragraph of text']")).getText();
	System.out.println(childwindowitext);
	driver.close();
	driver.switchTo().window(id1);
	driver.close();
	

	}

}
