package FRAMES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multipleframes {
	@Test
	public void FramesDemo() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\FRAMES_IN_SELENIUM\\ChromeBrowsersJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/OneDrive_1_4-11-2022/frame.html");
		
		
		//Count Number of frames
		
		int totalnoFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of frames...."+ totalnoFrames);
		
		//Perform some action on Selenium website
		 
		//Switch to Statement
		
		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		Thread.sleep(20000);
		driver.findElement(By.id("log_email")).sendKeys("sajjo8001@gmail.com");
		driver.findElement(By.id("log_password")).sendKeys("nausheen@05");
		driver.findElement(By.xpath("//input[contains(@name,'log_submit')]"));
		
						
	} 

}
