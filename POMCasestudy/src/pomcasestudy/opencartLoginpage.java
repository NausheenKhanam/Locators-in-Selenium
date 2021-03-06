package pomcasestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class opencartLoginpage {
	WebDriver driver;

	public opencartLoginpage(WebDriver driver)
	{
		
		this.driver = driver;
	}

	@FindBy(how = How.ID, using="input-email")
	WebElement UserEmail;

	@FindBy(how = How.ID, using="input-password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement LoginBtn;

	public void Loginopencart(String Uemail, String Psd)

	{
		UserEmail.sendKeys(Uemail);
		Password.sendKeys(Psd);
		LoginBtn.click();
	}
}
