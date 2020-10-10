package day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_day1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Get Command
		driver.get("https://www.facebook.com");
		//Get Title
		String title = driver.getTitle();
		if (title.toLowerCase().contains("facebook")) {
			System.out.println("Title is correct");
		} else 
			System.out.println("Title is incorrect");
		
		//GetCurrentURL
		String url = driver.getCurrentUrl();
		if (url.contains("facebook")) {
			System.out.println("Url is correct");
		} else 
			System.out.println("Url is incorrect");
		
		
		//GetPage Source // Locators
		String pageSource = driver.getPageSource();
		
		
		
		
		driver.close();
		
		driver.quit();
		
		//Commit to different branch
		

	}

}
