package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		/*WebElement chk = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		chk.click();
		
		System.out.println(chk.isSelected());
		if(chk.isSelected())
		{
			Thread.sleep(2000);
			chk.click();
		}*/
		
		
		WebElement chk = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
		if(chk.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
			chk.click();
			
		}
		
	}
	
	
}
