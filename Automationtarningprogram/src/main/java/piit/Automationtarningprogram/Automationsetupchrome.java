package piit.Automationtarningprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationsetupchrome {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/qaisrahmani/Downloads/chromedriver");
driver=new ChromeDriver();
driver.navigate().to("https://www.amazon.com");
driver.navigate().forward();
driver.navigate().back();
driver.navigate().refresh();
driver.getCurrentUrl();

	}

}
