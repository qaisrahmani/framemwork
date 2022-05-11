package piit.Automationtarningprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {

	private static final WebElement Searchicon = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		driver.getCurrentUrl();
		driver.findElement(By.id("nav-search-submit-button"));
		WebElement searchican= driver.findElement(By.id("nav-seach-submit-buttom"));
			Searchicon.click();
			WebElement linktx= driver.findElement(By.linkText("keywords"));
			linktx.click();

	}

}
