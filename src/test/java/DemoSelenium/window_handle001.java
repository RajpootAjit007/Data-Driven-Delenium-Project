package DemoSelenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handle001 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open a popup window']"));
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String> itr = windowid.iterator();
		String mainwindowid = itr.next();
		String childwindowid = itr.next();
		driver.switchTo().window(childwindowid);
		String text1 = driver.findElement(By.id("para1")).getText();
		System.out.println(text1);
		driver.quit();
		

	}

}
