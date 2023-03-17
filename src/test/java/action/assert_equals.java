package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assert_equals {
	@Test

	public void sample_test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	    Assert.assertTrue(driver.findElement(By.xpath("//div[@class='header section']")).isDisplayed());
	    Assert.assertFalse(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
	    Thread.sleep(2000);
	    String text = driver.findElement(By.xpath("//div[@class='post-body entry-content']")).getText();
	   Assert.assertEquals(text, "This is a sample text in the Page One.");
	    driver.quit();
	}

}
