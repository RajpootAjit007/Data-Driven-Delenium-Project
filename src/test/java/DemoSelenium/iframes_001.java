package DemoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes_001 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();  // here is no need to write system.setproperty because we downloaded the dependecies from maven of 
		//WebDriverManager
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//implicit wait : Global wait.
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement iframe1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(iframe1); // Now all focus is on iframe 1.
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello world");
		driver.switchTo().defaultContent(); // it will take back to main page so we can go to next iframe.
		WebElement iframe2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(iframe2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("I learnt");
        driver.findElement(By.tagName("Frame"));
        driver.quit();
        
	}

}
