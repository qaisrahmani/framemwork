package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook {
	ChromeDriver driver;
	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
	}
	
	@Test
	public void f() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Connect with friends and the world around you on Facebook.");
		
	}
	
	
}
