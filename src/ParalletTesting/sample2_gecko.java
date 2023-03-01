package ParalletTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

public class sample2_gecko 
{

	@Test
	public void chromebrun() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"D:\\New folder\\Software\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	
	
}
