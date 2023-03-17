package DemoSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_autosuggestion {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//Thread.sleep(5000);
		
		WebElement logo = driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']"));
		//Thread.sleep(5000);
		Actions a = new Actions(driver);
		System.out.println("1");
		Thread.sleep(5000);
		
		System.out.println("2");
		a.moveToElement(logo).click().build().perform();
		System.out.println("3");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("del");
		int i = 0;
		while(i<4)
		{
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.DOWN);
		i++;
		
		}
		// the same option can be selected
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("Screen_shots\\screen_shots007.png"));
		

		driver.quit();

}
}
