package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo extends BaseTest 
{
	@Test
public void scriptsDemo()
{
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	WebElement fname=driver.findElement(By.name("firstname"));
	WebElement radio=driver.findElement(By.xpath("//input[@value='5' or @type='radio1']"));
	WebElement button=driver.findElement(By.name("submit"));
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].value='demojavascript';", fname);
jse.executeScript("arguments[0].click();", radio);
jse.executeScript("arguments[0].scrollIntoView();", button);
sleep();
driver.findElement(By.name("submit")).click();






}
}
