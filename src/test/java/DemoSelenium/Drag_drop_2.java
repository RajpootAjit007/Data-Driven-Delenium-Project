package DemoSelenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Dynamic.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Hightatras = driver.findElement(By.xpath("//img[@id='node']"));
		System.out.println("1");
		Thread.sleep(5000);
		WebElement tatras = driver.findElement(By.xpath("//div[@id='droparea']"));
		System.out.println("2");
		Thread.sleep(5000);
		Actions a = new Actions(driver);
		System.out.println("3");
		Thread.sleep(5000);
		a.dragAndDrop(Hightatras, tatras).perform();
		System.out.println("4");
		driver.quit();

	}

}
