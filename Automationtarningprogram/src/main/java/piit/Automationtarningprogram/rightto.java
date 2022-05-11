package piit.Automationtarningprogram;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightto {

		private static Actions ob;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
			driver.manage().window().maximize();
		// TODO Auto-generated method stub
			WebElement picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;]"));
			ob = new Actions(driver);
			ob.contextClick(picture);
			
	}

	
		

}
