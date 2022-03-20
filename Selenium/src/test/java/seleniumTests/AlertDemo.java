package seleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertDemo extends BaseTest{

	@Test
	
public void alertDemo()
{
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.name("submit"));
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", button);
		sleep();
		button.click();
		sleep();
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
//alert.dismiss();
sleep();

}
}
