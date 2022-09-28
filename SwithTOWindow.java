package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwithTOWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		System.out.println("Before Switching...............:");
		driver.findElement(By.xpath("(//a[contains(.,' Click this link to start new Tab ')])[1]")).click();;
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[contains(.,' Click this link to start new Tab ')])[2]")).click();;
		System.out.println(driver.getTitle());
		Set<String> set = driver.getWindowHandles();
		List<String> l=new ArrayList<String>(set);
		Thread.sleep(3000);
		System.out.println("After Switching...............:");
		driver.switchTo().window(l.get(0));
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.switchTo().window(l.get(2));
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.switchTo().window(l.get(1));
		System.out.println(driver.getTitle());
		
	}

}
