package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\OrangeHRMLocators\\Browser Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	    driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
	    driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
	    driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
	    
	    
	    
	    List<WebElement> Links= driver.findElements(By.xpath("//a"));
        int Nolinks = Links.size();
        System.out.println("Number of Links is..." + Nolinks);
        
        //if Link exists in easy calculation then print each link
        	
        for(int i=0; i<=Links.size(); i++)
        {
        	System.out.println(Links.get(i).getText());
        	
        	String str = Links.get(i).getText();
        	String str1 = "Logout";
        	
        	if(str.equals(str1))
        	{
	    driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
        	}
	  
	    } 
	}
}
	