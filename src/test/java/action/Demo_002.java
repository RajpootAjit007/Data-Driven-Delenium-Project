package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo_002 {

	
	public  void demo2()throws InterruptedException {
		String browser= "firefox";
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
			
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
             driver = new FirefoxDriver();		
		
		}
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.id("confirm"));
		//element.click();
		WebElement element1 = driver.findElement(By.name("q"));
		element1.click();
		element1.sendKeys("Ajit kumar singh");
		Thread.sleep(6000);
		element1.clear();
		Thread.sleep(5000);
		//WebElement element2 = driver.findElement(By.className("classone"));
		//element2.sendKeys("Vikash mishra");
		//Thread.sleep(4000);
		String element3 = driver.findElement(By.xpath("//p[contains(text(),'PracticeAutomatio')]")).getText();
		System.out.println(element3);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.xpath("//a[text()='compendiumdev']")).click();
		//String url1 = driver.getCurrentUrl();
		//System.out.println(url1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		//driver.close();
		String value = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(value);
		boolean Displayed = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println("button is displayed"+" "+Displayed);
		boolean Enabled = driver.findElement(By.id("but1")).isEnabled();
		System.out.println("button is enabled"+" "+Enabled);
		boolean selected = driver.findElement(By.id("checkbox1")).isSelected();
		System.out.println("check box is selected"+" "+selected);
		boolean selected1 = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println("check box is selected"+" "+selected1);
		driver.quit();

	}

}
