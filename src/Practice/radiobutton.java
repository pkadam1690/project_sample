package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement rd = driver.findElement(By.xpath("//div/input[@type='radio']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].click();", rd);
		rd.click();
		
		
		
		
		
	}
	
	
	
}
