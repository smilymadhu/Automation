package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NavigationMethod extends BaseTest{




	//@Test (priority=1)
	public void launchTest() {
		
		System.out.println( driver.getTitle());
		driver.get("https://www.google.com/");
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
	
	}
		@Test(priority=0)
		public void loginTest(){
	{
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("rocky123@gmail.com");
		
			driver.findElement(By.name("pass")).sendKeys("rocky1");
			driver.findElement(By.name("login")).click();
		}
	
				
	
	
	
		
	}
	
}

