package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksOpencart {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\Locaters in Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
        //Counting number of links
		List<WebElement> Links= driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of Links in opencart is..." + Nolinks);
	}
}
