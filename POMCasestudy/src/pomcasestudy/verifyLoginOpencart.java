package pomcasestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pomcasestudy.BrowseFactory;
import pomcasestudy.opencartLoginpage;

public class verifyLoginOpencart {
	
	@Test 
	public void TestUser()
	{
		WebDriver driver =  BrowseFactory.BrowserOptions("Chrome","https://demo.opencart.com/index.php?route=account/login" );
		opencartLoginpage Loginopencart = PageFactory.initElements(driver, opencartLoginpage.class);
		Loginopencart.Loginopencart("k05119921@gmail.com", "nausheen@05");
	}

}