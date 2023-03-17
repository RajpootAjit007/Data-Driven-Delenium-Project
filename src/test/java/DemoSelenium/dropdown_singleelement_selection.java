package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_singleelement_selection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("drop1")).sendKeys("doc 4"); //but this is not the correct method of select the element from drop down
		WebElement webelement1 = driver.findElement(By.id("drop1"));//select method is correct way to select the element from drop down
		Select select = new Select(webelement1);
		//select.selectByIndex(3);// selecting by index.
		select.selectByVisibleText("doc 3");
		driver.quit();
		
		

	}

}
