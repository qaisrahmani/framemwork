package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverInfo;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiontopointer {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");			ChromeDriverInfo driver = new ChromeDriverInfo();
			driver.navigate().to("www.amazon.com");
			driver.manage () .window() .maximize() ;
			Actions ob=new Actions(driver);
			WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			ob.moveToElement(hovers).build().perform();
		
		
				
		
	}

}
