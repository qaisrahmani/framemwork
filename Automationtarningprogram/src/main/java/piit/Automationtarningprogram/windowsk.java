package piit.Automationtarningprogram;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;

public class windowsk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		WebElement newreleaseslinks=driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		driver.getWindowHandle();
		Set<String> windowhandles= driver.getWindowHandles();
		Iterator<String> interator=windowhandles.iterator();
		
		
		
		
		
	
		
		
	
		
	}

}
