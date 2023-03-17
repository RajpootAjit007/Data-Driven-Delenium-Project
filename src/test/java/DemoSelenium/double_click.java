package DemoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class double_click {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		WebElement a = driver.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys("ajit");
		Actions a2 = new Actions(driver);
		a2.doubleClick(a).perform();
		driver.quit();

	}

}
