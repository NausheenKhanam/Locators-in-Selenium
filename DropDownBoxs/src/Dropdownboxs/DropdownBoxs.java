package Dropdownboxs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownBoxs {
	@Test
	public void DropdownDemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\DropDownBoxs\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");

	    WebElement month_Dropdown = driver.findElement(By.id("month"));
	    Select month_dd = new Select(month_Dropdown);
	    
	   month_dd.selectByIndex(3);
	    Thread.sleep(10000);
	    month_dd.selectByValue("9");
	    Thread.sleep(10000);
	    
	    month_dd.selectByVisibleText("Aug");
	    Thread.sleep(10000); 
	    
	    List<WebElement>month_List =month_dd.getOptions();
	    
	    int total_Month = month_List.size();
	    System.out.println("Months Count List Box:" + total_Month);
	    
	    for(WebElement ele: month_List) {
	    	String month_name = ele.getText();
	    	System.out.println("Total Months Count is List Box:" + month_name);
	    }
	    driver.quit();
	}
	}
