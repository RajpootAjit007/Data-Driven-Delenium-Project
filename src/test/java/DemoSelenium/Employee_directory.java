package DemoSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.util.Timeout;

public class Employee_directory {
	// private static final WebElement JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://masterdemo1.gtqsg.gr8hr3.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("username")).sendKeys("majordomo");
		driver.findElement(By.id("password")).sendKeys("sa");
		driver.findElement(By.xpath("//button[text()=' Log in ']")).click();
		driver.findElement(By.xpath("//a[text()='Allow']")).click();
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Set<String> whs = driver.getWindowHandles();

		for (String list : whs) {
			if (!pw.equalsIgnoreCase(list)) {
				System.out.println(list);
				System.out.println("switched");
				driver.switchTo().window(list).close();

			}
		}
		// wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("go ahead");
		driver.switchTo().window(pw);
		driver.findElement(By.xpath("(//i[@class='icon-group-v3'])[2]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//span[text()='Main'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='  Employee Directory  ']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("raydu");
		driver.findElement(By.xpath("//input[@placeholder='Enter Number']")).sendKeys("18007");
		driver.findElement(By.xpath("//input[@placeholder='Enter Number']")).sendKeys("18007");
		// driver.findElement(By.xpath("//span[]"))
		// WebElement root = driver.findElement(By.tagName("gt-button"));
		// WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor)
		// driver).executeScript("return arguments[0].root.shadowRoot", root);
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		System.out.println("i m here 1");
		// WebElement shadowDom1 = (WebElement) js.executeScript("return
		// arguments[0].shadowRoot", root);
		System.out.println("i m here 2");
		Thread.sleep(5000);
		String dateValue = "30-01-2020";
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		WebElement button = (WebElement) jse.executeScript(
				"return document.querySelector('gt-datepicker').shadowRoot.querySelector('article > div > button')");
		jse.executeScript("arguments[0].click();", button);

//executeScript("arguments[0].setAttribute('value','" + dateValue + "');", button);
		// WebElement gtbutton = shadowDom1.findElement(By.tagName("gt-button"));

//		Thread.sleep(10000);
//		Alert alrt = driver.switchTo().alert();
//		alrt.getText();
//		alrt.accept();
		System.out.println("i m here 3");

		Thread.sleep(5000);
		driver.quit();

	}

}
