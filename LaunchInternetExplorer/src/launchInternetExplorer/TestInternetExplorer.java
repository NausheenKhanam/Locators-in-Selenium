package launchInternetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestInternetExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",
	               "C:\\Users\\Lenovo\\Documents\\DXC Selenium Automation Class\\LaunchInternetExplorer\\InternetExplorerJars\\IEDriverServer.exe");
	      WebDriver driver = new InternetExplorerDriver();
	       
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      driver.quit();

	}

}
