package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class FirstSeleniumTest {


	@Test
	public void launchTest() {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		//

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println( driver.getTitle());
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getTitle());
		driver.get("https://www.twitter.com/");
		System.out.println(driver.getTitle());
	Navigation navigation=driver.navigate();
	navigation.back();
	System.out.println(driver.getTitle());
	navigation.forward();
	System.out.println(driver.getTitle());
	navigation.to("https://amazon.com");
	System.out.println(driver.getTitle());
	driver.navigate().back();
	System.out.println(driver.getTitle());
	driver.close();
	
	
	
	
		
	}
	
}

