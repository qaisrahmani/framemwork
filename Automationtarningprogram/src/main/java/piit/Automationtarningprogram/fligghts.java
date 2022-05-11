package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fligghts {

	private static final WebElement Departuretodate = null;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/eclipse-workspace/Automationtarningprogram/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		WebElement departure=driver.findElement(By.id("d1-btn"));
		departure.click();
		WebElement Departure=driver.findElement(By.xpath("//*(@aria-label='May 16, 2022]"));
		Departuretodate.click();
		

	}

}
