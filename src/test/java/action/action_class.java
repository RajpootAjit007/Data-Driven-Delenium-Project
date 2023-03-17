package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action_class {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("1");
		WebElement element = driver.findElement(By.xpath("//span[text()='Blogs']"));
		Thread.sleep(8000);
		//System.out.println("2");
		Actions a = new Actions(driver);
		//System.out.println("3");
		a.moveToElement(element).perform();
		Thread.sleep(8000);
		//System.out.println("4");
		driver.quit();

}
}
