package DemoSelenium;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class calender_001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		Thread.sleep(2000);
		while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		List<WebElement> days = driver.findElements(By.className("ui-state-default"));
		for(int i=0;i<days.size();i++)
		{
			if(days.get(i).getText().contentEquals("25"))
			{
				days.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		
		driver.quit();
		 
		 
	}

}
