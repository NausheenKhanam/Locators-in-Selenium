package launchFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
               "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\LaunchFirefoxBrowser\\FirefoxBrowserJars\\geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      driver.quit();

	}

}
