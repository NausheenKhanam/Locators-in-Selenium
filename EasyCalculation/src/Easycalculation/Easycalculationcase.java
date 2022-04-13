package Easycalculation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Easycalculationcase {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\EasyCalculation\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easycalculation.com/");

	    driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
	    driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
	    
	    List<WebElement> Links= driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of Links in Calculation is..." + Nolinks);
	    
	    
	    for(int i=0; i<=Links.size(); i++)
        {
        	System.out.println(Links.get(i).getText());
        	
        	String str = Links.get(i).getText();
        	String str1 = "Aws Certification In Bangalore - Quick results - In Bangalore";
        	
        	if(str.equals(str1))
        	{
	    driver.findElement(By.linkText("Aws Certification In Bangalore - Quick results - In Bangalore")).click();
		driver.findElement(By.xpath("//*[@id=\\\"e1\\\"]/div[1]/a"));
        	}
	  
	    } 
	    
	    
	   
	
	}
	}
