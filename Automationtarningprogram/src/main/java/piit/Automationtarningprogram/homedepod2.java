package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class homedepod2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='MuiButton-label']")).click();
		driver.findElement(By.xpath("(//*[@class='jss10'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-lg btn-link ph-titlecase ng-binding ng-scope'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='btn btn-primary btnModal'])[1]")).click();
		
		
Thread.sleep(10000);
		
		driver.quit();
		


	}

}
