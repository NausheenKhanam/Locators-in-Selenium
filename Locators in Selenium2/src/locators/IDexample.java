package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDexample {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\Locators in Selenium2\\Browser Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

	    driver.findElement(By.id("input-firstname")).sendKeys("Nausheen");
	    
	    driver.findElement(By.id("input-lastname")).sendKeys("Khanam");
	    
	}
	}


