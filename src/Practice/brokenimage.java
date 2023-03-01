package Practice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpClient;

public class brokenimage 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");
		
		WebElement bi = driver.findElement(By.xpath("//div[contains(@class,'col-12 mt-4 col-md-6')]//div[2]//img[2]"));
		System.out.println(bi.isDisplayed());
		Integer iBrokenImageCount = 0;
		 
        
        driver.manage().window().maximize();
 
            iBrokenImageCount = 0;
           java.util.List<WebElement> image_list = driver.findElements(By.tagName("img"));
            /* Print the total number of images on the page */
            System.out.println("The page under test has " + image_list.size() + " images");
            for (WebElement img : image_list)
            {
                if (img != null)
                {
                    if (img.getAttribute("naturalWidth").equals("0"))
                    {
                        System.out.println(img.getAttribute("outerHTML") + " is broken.");
                        iBrokenImageCount++;
                    }
                	
                	
                			
                }
            }
          
        
    }
	}
	
	
