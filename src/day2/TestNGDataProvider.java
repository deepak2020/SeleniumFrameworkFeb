package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {


	private static WebDriver driver;

  @DataProvider(name = "Authentication")

  public static Object[][] Urls() {

        return new Object[][] { { "https://www.facebook.com" }, { "https://www.google.com" }};

  }

  // Here we are calling the Data Provider object with its Name

  @Test(dataProvider = "Authentication")

  public void openWebsite(String URLs) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

      driver.get(URLs);
//
//      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//
//      driver.findElement(By.id("log")).sendKeys(sUsername);
//
//      driver.findElement(By.id("pwd")).sendKeys(sPassword);
//
//      driver.findElement(By.id("login")).click();
//
//      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

      driver.quit();

  }

}
