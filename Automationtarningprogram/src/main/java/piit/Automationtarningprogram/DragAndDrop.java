package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver ;
	System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
	driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
			driver.manage().window().maximize();
			
			WebElement dropable=driver.findElement(By.linkText("Dropable"));
			dropable.click();
			driver.switchTo().frame(0);
			WebElement ElementToDrag=driver.findElement(By.id("draggable"));
			WebElement DropToHere=driver.findElement(By.id("doppable"));
			Actions ob=new Actions(driver);
			ob.dragAndDrop(ElementToDrag, DropToHere).build().perform();
			driver.switchTo().parentFrame();
			WebElement Sorting=driver.findElement (By. linkText ("Sortable")) ;
			Sorting.click();
	}

}
	
