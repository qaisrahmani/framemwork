package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class TestngTest {
	FirefoxDriver driver;
	@BeforeMethod
	public void Setup() {
		//System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
		//System.setProperty("webdriver.edge.driver", "/Users/qaisrahmani/Downloads/msedgedriver");
		System.setProperty("webdriver.gecko.driver", "/Users/qaisrahmani/Downloads/geckodriver");
	    //driver = new ChromeDriver();
		//driver=new EdgeDriver();
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		
	}
	
	@Test(priority = 2 )
	public void TitleofThePageTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
	}
	
	@Test(priority = 3)
	public void searchFieldTest() {
		Boolean searchfield = driver.findElement(By.id("twotabsearchtextbox")).isEnabled();
		Assert.assertEquals(searchfield, true);
	}
	
	@Test(priority = 1)
	public void searchEntryTest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Boolean product = driver.findElement(By.xpath("(//*[@class ='_dGV0c_image_1pfbQ'])[2]")).isDisplayed();
		Assert.assertEquals(product, true);
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.quit();
	}

}
