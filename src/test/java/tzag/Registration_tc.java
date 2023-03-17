package tzag;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_tc {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	 driver.findElement(By.id("login-button")).click();
     driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
     driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
     driver.findElement(By.className("shopping_cart_link")).click();
     driver.findElement(By.xpath("//button[text()='Checkout']")).click();
     driver.findElement(By.id("first-name")).sendKeys("ajit kumar");
     driver.findElement(By.id("last-name")).sendKeys("singh");
     driver.findElement(By.id("postal-code")).sendKeys("560076");
     driver.findElement(By.id("continue")).click();
     driver.findElement(By.xpath("//button[text()='Finish']")).click();
     driver.findElement(By.xpath("//button[text()='Back Home']")).click();
     
	 

	}

}
