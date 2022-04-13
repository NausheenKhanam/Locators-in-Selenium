package pomcasestudy2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EasyLoginpage {
	WebDriver driver;

	public EasyLoginpage(WebDriver driver)
	{
		
		this.driver = driver;
	}

	@FindBy(how = How.ID, using="log_email")
	WebElement UserEmail;

	@FindBy(how = How.ID, using="log_password")
	WebElement Password;

	@FindBy(how = How.XPATH, using="//*[@id=\"log_frm\"]/div[4]/input[1]")
	WebElement log_submit;

	public void Logineasycalculation(String UEmail, String Psd)

	{
		UserEmail.sendKeys(UEmail);
		Password.sendKeys(Psd);
		log_submit.click();
	}
}
