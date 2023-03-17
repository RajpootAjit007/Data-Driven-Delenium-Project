package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_003 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		List<WebElement> webelements = driver.findElements(By.tagName("a"));
		for(int i=0;i<webelements.size();i++)
		{
			if(webelements.get(i).getText().length()>0)
			{
			System.out.println("list of elements having tag name is a"+" "+webelements.get(i).getText());
		}
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ajit kumar sing"); 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("007007");
		driver.findElement(By.xpath("//button[text()=' LogIn ']")).submit();
		String css_value = driver.findElement(By.xpath("//button[text()=' LogIn ']")).getCssValue("text-align");
		System.out.println("Alignment of Login button"+" "+"is"+" "+css_value);
		Dimension size = driver.findElement(By.xpath("//button[text()=' LogIn ']")).getSize();
		System.out.println("Hight of the log in button"+" "+size.height);
		System.out.println("Hight of the log in button"+" "+size.width);
		Point Location = driver.findElement(By.xpath("//button[text()=' LogIn ']")).getLocation();
		System.out.println("x co-ordinate of login button"+" "+Location.x);
		System.out.println("y co-ordinate of login button"+" "+Location.y);
		driver.findElement(By.xpath("//a[text()='onlytestingblog']")).click();
		Thread.sleep(3000);
		//driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//String page_source = driver.getPageSource();
		//System.out.println(page_source);
		driver.quit();

	}

}
