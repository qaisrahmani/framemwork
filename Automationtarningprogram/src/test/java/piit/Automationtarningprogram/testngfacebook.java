package piit.Automationtarningprogram;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngfacebook {
	private static final String Assort = null;
	ChromeDriver driver;
	@BeforeMethod
	public void Setup()    {
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/newtours/login.php");
		
	}
	@Test
	public void TitleofThepageTest()   {
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "phptravels.com/demo/");

	}
	
}
