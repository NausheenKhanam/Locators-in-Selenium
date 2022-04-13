package Locate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsFirefox
{
@Test
public void IdDemo()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\LocatorsFirefox\\BrowserJars\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/index.php?route=account/register");

    driver.findElement(By.id("input-firstname")).sendKeys("Nausheen");
    
    driver.findElement(By.id("input-lastname")).sendKeys("Khanam");
    
}
}
