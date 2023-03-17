package DemoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/p/page3.html");
		WebElement element = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDropBy(element, 100, 0).perform();
		Thread.sleep(2000);
		a.dragAndDropBy(element, -150, 0).perform();
		WebElement rightclick = driver.findElement(By.id("selenium143"));
		Actions a1 = new Actions(driver);
		driver.quit();
		
		
		
		

	}

}
