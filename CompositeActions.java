package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CompositeActions 
{
	@Test
	public void testCompositeActions() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://seleniumpractise.blogspot.com");
		WebElement ele = driver.findElement(By.xpath("//a[contains(.,'2018')]"));
		ele.click();
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.sendKeys(Keys.CONTROL).click(ele).perform();
	}

}
