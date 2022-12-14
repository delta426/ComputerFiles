package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowser 
{
   public WebDriver driver;
   @Parameters({"browser"})
   @Test
   public void test1(String browser)
   {
	   if(browser.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
	   }
	   else if(browser.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
	   }else if (browser="ie")
           {
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
           }
}
