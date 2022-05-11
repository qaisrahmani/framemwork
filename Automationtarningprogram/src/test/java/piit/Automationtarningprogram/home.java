package piit.Automationtarningprogram;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
 @FindBy(name = "email") WebElement Ids;
 @FindBy(name = "pass") WebElement password;
 @FindBy(linkText = "Forgot password?") WebElement forget;
private WebDriverInfo driver;
 
 public home(WebDriverInfo driver) {
	 this.driver=driver;
	 PageFactory.initElements((SearchContext) driver, this);
}
 public void Emial() {
	 Ids.sendKeys("John");
	 
 }
 
 public void passwordfindsEnter() {
	 password.sendKeys("Silver");
	 
}
 
 public void forgetlinkclick()    {
	 forget.click();
 }
}
