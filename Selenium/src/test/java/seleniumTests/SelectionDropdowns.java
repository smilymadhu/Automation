package seleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectionDropdowns extends BaseTest{
	//@Test
public void SelectDropdownTest()
{
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	sleep();
	
	WebElement month=driver.findElement(By.id("month"));
	Select select=new Select(month);
			select.selectByIndex(5);
			sleep();
			select.selectByValue("10");
			sleep();
			select.selectByVisibleText("Dec");
			List<WebElement>selects=select.getAllSelectedOptions();
					for(WebElement wb:selects)
					{
						System.out.println(wb.getText());
					}
			sleep();
			List<WebElement>months=select.getOptions();
			
			for(WebElement wb:months)
			{
			System.out.println(wb.getText());	
			System.out.println(wb.getAttribute("value"));
			}
			
			
}
	@Test
	public void moreWebElementMethods()
	{
	driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	driver.findElement(By.xpath("//input[@value='5' or @type='radio1']")).click();
	driver.findElement(By.xpath("//input[@value='RC']")).click();
	driver.findElement(By.name("submit")).click();
	
	
}
}
			
