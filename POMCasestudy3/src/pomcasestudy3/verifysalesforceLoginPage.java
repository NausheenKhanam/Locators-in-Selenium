package pomcasestudy3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class verifysalesforceLoginPage {
	
	@Test 
	public void TestUser()
	{
		WebDriver driver =  BrowseFactory.BrowserOptions("Chrome","https://login.salesforce.com/?locale=in" );
		salesforceLoginpage Loginsalesforce = PageFactory.initElements(driver, salesforceLoginpage.class);
		Loginsalesforce.Loginsalesforce("k05119921@gmail.com", "nausheen@05");
	}

}