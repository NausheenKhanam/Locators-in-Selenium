package FBBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFBBrowser {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\LaunchFBBrowser\\ChromeBrowsersJars\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       driver.quit();

	}

}
