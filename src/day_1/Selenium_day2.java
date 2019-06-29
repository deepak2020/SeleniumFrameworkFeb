package day_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_day2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@class='FPdoLc VlcLAe'] //*[text()=\"I'm Feeling \"]")));
		WebElement link = driver.findElement(By.xpath(".//*[@class='FPdoLc VlcLAe'] //*[text()=\"I'm Feeling \"]"));
		link.click();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// datatype in element 
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='FPdoLc VlcLAe'] //*[text()=\"I'm Feeling \"]")));
//		link.click();
		
		
		
		//driver.findElement(By.name("q")).click();
//		driver.findElement(By.xpath(".//*[@class='gLFyf gsfi']")).sendKeys("Deepak");;
		
//		driver.findElement(By.xpath("//*[contains(text(),'Feeling')]")).click();
//		driver.findElement(By.name("btnK")).click();
		
		
		
//		//Code to maximize browser
//		driver.manage().window().maximize();
//		driver.navigate().to("https://www.facebook.com");
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().back();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().forward();
//		System.out.println(driver.getCurrentUrl());
//		driver.navigate().refresh();
		

	}

}
