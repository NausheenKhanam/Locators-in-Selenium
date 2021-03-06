package pomcasestudy3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class salesforceLoginpage {
	WebDriver driver;

	public salesforceLoginpage(WebDriver driver)
	{
		
		this.driver = driver;
	}

	@FindBy(how = How.ID, using="username")
	WebElement UserName;

	@FindBy(how = How.ID, using="password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"Login\"]")
	WebElement LoginBtn;

	public void Loginsalesforce(String UName, String Psd)

	{
		UserName.sendKeys(UName);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}
}
