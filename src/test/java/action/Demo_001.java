package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_001 {
	
	@Test

	public void demo1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a[2]")).click();
		driver.findElement(By.xpath("//ol[@class='a-carousel']/descendant::li[4]")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='Grid-module__gridDisplayGrid_2X7cDTY7pjoTwwvSRQbt9Y']/child::div[@class='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'][4]")).click();
        driver.quit();
	}

}
