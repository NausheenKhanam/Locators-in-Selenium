package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathOrangeHRM {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\Locaters in Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    
	}
	}