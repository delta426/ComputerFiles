package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puma {
	@Test
	public void testCompositeActions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://puma.com");
	}
}
