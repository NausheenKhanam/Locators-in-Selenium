package pomcasestudy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class verifyEasy {
	
	@Test 
	public void TestUser()
	{
		WebDriver driver =  BrowseFactory.BrowserOptions("Chrome","https://www.login.hiox.com/login?referrer=easycalculation.com" );
		EasyLoginpage Logineasycalculation = PageFactory.initElements(driver, EasyLoginpage.class);
		Logineasycalculation.Logineasycalculation("sajjo8001@gmail.com", "nausheen@05");
	}

}