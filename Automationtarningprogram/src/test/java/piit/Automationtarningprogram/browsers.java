package piit.Automationtarningprogram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.Files;

public class browsers {


    
	WebDriver driver;
	//private File screenshots;
	@Test
	public void amazon() throws IOException {
	File screenshots = ((TakesScreenshot)driver) .getScreenshotAs (OutputType.FILE);
	FileHandler.copy(screenshots, new File("/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Pictures/GRAPHIC.jpg"));	
		
	}
	@BeforeMethod
	public void Setup() {
		Browsers("Edge");

	}
	public void Browsers(String window)   {
		if(window.equalsIgnoreCase("Chrome"))  {
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
	
		}
		else if (window.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "/Users/qaisrahmani/Downloads/msedgedriver");
		driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
		}
		
	
		else if (window.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/qaisrahmani/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.amazon.com");
		}
		
		
	
	}
	

	
	
	
	
	
	
	}			
	

