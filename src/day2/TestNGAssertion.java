package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	private static WebDriver driver;
	
	@Test
	 public void validatePageURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

    driver.get("http://www.google.com");
    
    String actualURL = driver.getCurrentUrl();
    String expectedURL = "https://www.facebook.com";
    
    Assert.assertEquals(actualURL, expectedURL, "Dude! You are on wrong website");
//    // Here driver will try to find out My Account link on the application
//
//    WebElement myAccount = driver.findElement(By.xpath(".//*[@id='account']/a"));
//
//    //Test will only continue, if the below statement is true
//
//    //This is to check whether the link is displayed or not
//
//    Assert.assertTrue(myAccount.isDisplayed());
//    
//
//    //My Account will be clicked only if the above condition is true
//
//    myAccount.click();
	}
	
//	@Test(retryAnalyzer = day2.RetryAnalyzer.class)
//	 public void Test1()
//	 {
//	 Assert.assertEquals(false, true);
//	 }
//	 
//	 @Test
//	 public void Test2()
//	 {
//	 Assert.assertEquals(false, true);
//	 }
}
