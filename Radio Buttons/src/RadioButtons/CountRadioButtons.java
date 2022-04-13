package RadioButtons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountRadioButtons {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\Radio Buttons\\SeleniumBrowserJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/OneDrive_1_4-11-2022/RadioButtons.html");
        //Counting number of RadioButtons
		List<WebElement> Radiobuttons= driver.findElements(By.xpath("//input[@type = 'radio']"));
		
		int browserRadiobuttons = Radiobuttons.size();
        
        System.out.println("Number of radiobuttons is..." + browserRadiobuttons);
	}
}

