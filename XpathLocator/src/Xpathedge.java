import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Xpathedge {
	@Test
	public void IdDemo()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\XpathLocator\\BrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

	    driver.findElement(By.name("email")).sendKeys("k05119921@gmail.com");
	    
	    driver.findElement(By.name("password")).sendKeys("nausheen@05");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	    
	}
	}
