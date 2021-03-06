package JSLocator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSalertLocator {
	@Test
	public void AlertDemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\JavascriptLocater\\ChromeBrowsersJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//Case Study 1 Information Alert
		Alert alert =driver.switchTo().alert();
		Thread.sleep(8000);
		alert.accept();
		String  result = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result);
		Assert.assertEquals("You successfully clicked on alert", result);

//Case Study2 Confirmation Alert
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert alert2 =driver.switchTo().alert();
		Thread.sleep(8000);
		alert2.dismiss();
		String  result2 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result2);
		Assert.assertEquals("You clicked: Cancel", result2);
		
//Case Study3 Prompt Alert
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		driver.switchTo().alert().sendKeys("Hello Nausheen");
		
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		
		String  result3 = driver.findElement(By.cssSelector("#result")).getText();
		System.out.println(result3);
		Assert.assertEquals("You entered: Hello Nausheen", result3);
		
		
	}
	}