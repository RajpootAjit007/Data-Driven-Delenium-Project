package DemoSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys_control {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement compkey = driver.findElement(By.xpath("//a[text()='compendiumdev']"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.keyDown(Keys.CONTROL).click(compkey).keyUp(Keys.CONTROL).perform();
		driver.quit();

	}

}
