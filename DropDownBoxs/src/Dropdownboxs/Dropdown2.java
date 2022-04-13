package Dropdownboxs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Dropdown2 {
	@Test
	public void DropdownDemo() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\DropDownBoxs\\SeleniumBrowserJars\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/campaign/landing.php");
        
		WebElement date_Dropdown= driver.findElement(By.id("day"));
		Select date_dd= new Select(date_Dropdown);
		
      	date_dd.selectByIndex(4);
		Thread.sleep(8000);
		
		date_dd.selectByValue("6");
		Thread.sleep(8000);
		
		date_dd.selectByVisibleText("12");
		Thread.sleep(8000); 
		
		List<WebElement> date_List= date_dd.getOptions();
		int total_Date= date_List.size();
		System.out.println("Total Days Count in List Box is : " + total_Date);
		
		for(WebElement ele: date_List) {
			String date_name= ele.getText();
			System.out.println("Date list: " + date_name);
		}
		driver.quit();	
	}
}	
 
