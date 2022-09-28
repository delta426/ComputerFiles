
package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Option {
	
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		 WebElement ele = driver.findElement(By.xpath("//div[@class='_2aUbKa']"));
		
		Actions act=new Actions(driver);
		
		
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		
	}

}
