package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment {

	private static Object searchfieldtaxt;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='MyAccount__button']")).click();
		//driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email' and @class ='form-input__field' ]")).click();
		driver.findElement(By.xpath("//*[@id='email' and @class ='form-input__field' ]")).sendKeys("jan@jan.com");
		driver.findElement(By.xpath("//*[@id='password-input-field']")).sendKeys("Qaisjanem123");
		Thread.sleep(2000);
		driver.findElement(By.id("zipCode")).sendKeys("20123");
		driver.findElement(By.id("phone")).sendKeys("6469009870");
		driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[1]")).click();
		
		
		Thread.sleep(10000);
		
		//driver.quit();
		
		
		
	
		
		
		
		
		

		
		
		
	}

}
