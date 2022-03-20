package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	
 @BeforeMethod
public void common()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

				 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
@AfterMethod
public void closeBrowser()
{
	

	driver.close();
}
	public void sleep()
	{
		
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
