package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick 
{

		public static void main(String[] args) throws InterruptedException 
		{
		
			System.setProperty("webdriver.chrome.driver", "D:\\Data\\Software\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
			Actions act = new Actions(driver);
			
			WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
			act.contextClick(rc).perform();
			
			List<WebElement> rc_list = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/child::li/span"));
			
			for (WebElement ele :rc_list) 
			{
			
				
				if(ele.getText().equalsIgnoreCase("Copy"))
				{
					act.contextClick(ele).perform();
					break;
				}
				
			}
			
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			driver.quit();
			
		}
	
	
	
}
