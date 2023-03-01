package ParalletTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample1_chrome 
{

	@Test
	public void chromebrun() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\New folder\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		
		driver.quit();
	}
	
}
