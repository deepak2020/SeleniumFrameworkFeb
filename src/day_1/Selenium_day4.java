package day_1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_day4 extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		openChromeBrowser();
		getUrl("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement element = findElementUsingXpath(".//button[text()='Prompt Pop up']");
		clickElement(element);
//		Thread.sleep(10000);
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
