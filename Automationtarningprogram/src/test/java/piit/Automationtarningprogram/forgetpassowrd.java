package piit.Automationtarningprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgetpassowrd {
	WebDriver driver;
	@FindBy(xpath = "(//*[@name='email'])[2]") WebElement id;
	@FindBy(xpath = "(//*[@name='did_submit'])[1]") WebElement searchbuttonClick;
	public void Forgotpassword(RemoteWebDriver driver)  {
		this.driver=driver;
		PageFactory.initElements(driver ,   this);
	}
	
	public void IdSendkeys()  {
		id.sendKeys("qaissikanderi@gmail.c");
	}
	public void searchButtonClick() {
		searchbuttonClick.click();
	}
	
	

}
