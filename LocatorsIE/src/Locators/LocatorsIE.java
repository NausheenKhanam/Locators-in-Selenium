package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LocatorsIE {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\LocatorsIE\\BrowserJars\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://demo-opencart.com/index.php?route=account/register");

	    driver.findElement(By.id("input-firstname")).sendKeys("Nausheen");
	    
	    driver.findElement(By.id("input-lastname")).sendKeys("Khanam");
	    
	}
	}