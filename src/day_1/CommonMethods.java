package day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonMethods {

	static WebDriver driver;
	
	@BeforeTest
	public static void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}

	public static void getUrl(String url) {
		driver.navigate().to(url);
	}
	
	public static WebElement findElementUsingXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	public static void clickElement(WebElement element) {
		element.click();
		
	}
	
	public static void mouseHoverOnElement(String xpath) {
		Actions action = new Actions(driver);
		action.moveToElement(findElementUsingXpath(xpath)).build().perform();
		
		
	}
	
	public static void dragAndDrop(String sourcexpath, String targetxpath) {
		Actions action = new Actions(driver); 
		Action dragAndDrop = action.clickAndHold(findElementUsingXpath(sourcexpath))
		.moveToElement(findElementUsingXpath(targetxpath))
		.release(findElementUsingXpath(targetxpath))
		.build();
		dragAndDrop.perform();		
	}
	
	public static void waitForElement(String xpath) {
		WebDriverWait wait=new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(findElementUsingXpath(xpath)));
		
	}
	
	public static String getProperty(String property) {
		Properties prop = new Properties();
		String value = null;
		try {
		    //load a properties file from class path, inside static method
			prop.load(new FileInputStream("C:\\Users\\deepak.kumar\\eclipse-workspace\\Selenium_Project\\src\\config.properties"));
		    //get the property value and print it out
			value = prop.getProperty(property);
		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		return value;
	}
	
	public static void takescreenshot() {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
             File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
                File DestFile=new File(fileWithPath);
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
	}
	
	@AfterTest
	public static void closeBrowser() {
		driver.quit();
	}
}
