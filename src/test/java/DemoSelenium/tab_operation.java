package DemoSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tab_operation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("ajit");
		a.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("007");
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		driver.quit();

	}

}
