package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkDemo {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\Locaters in Selenium\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");
        //Counting number of links
		List<WebElement> Links= driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of Links in Calculation is..." + Nolinks);
        
        //if Link exists in easy calculation then print each link
        	
        for(int i=0; i<=Links.size(); i++)
        {
        	System.out.println(Links.get(i).getText());
        	
        	String str = Links.get(i).getText();
        	String str1 = "Love Calculator";
        	
        	if(str.equals(str1))
        	{
        		driver.findElement(By.linkText("Love Calculator")).click();
        		driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul/li[2]/a"));
        	}
        }
        	
        
	}
	}
