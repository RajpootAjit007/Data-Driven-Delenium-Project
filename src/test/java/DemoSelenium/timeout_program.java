package DemoSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class timeout_program {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//implicit wait : Global wait.
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement Flipkartelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		//if button is visible then we should not use visibilityofelementLocated option we should use
		WebElement Flipkartelement1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Flipkart")));
		Flipkartelement.click();
		driver.quit();
		
		

	}

}
