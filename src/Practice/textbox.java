package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class textbox 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("A S D K");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ASDK@maail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("A,S,D,K");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("A,S,D,K");
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit")));
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
		
		WebElement btn = driver.findElement(By.xpath("//button[@id='submit']"));
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", btn);
		
		Actions act = new Actions(driver);
		act.moveToElement(btn).perform();
		
		btn.click();
		
		driver.quit();
		
		
	}
	
	
}
