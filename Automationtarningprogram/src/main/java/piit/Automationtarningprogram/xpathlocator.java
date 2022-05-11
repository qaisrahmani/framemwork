package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocator {//private static CharSequence[] desktop;
	public static void main(String[] args){
		
			 
		
	
	System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	WebElement searchtofield=driver.findElement(By.xpath("//input[@aria-label='Search']"));
	searchtofield.sendKeys("desktop");
	driver.findElement(By.id("id=\"twotabsearchtextbox\"")).sendKeys("Alexa");
	driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span")).click();
	
	}
}
