package day_1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_day3 extends CommonMethods {

	public static void main(String[] args) {
		openChromeBrowser();
		getUrl("https://www.toolsqa.com/iframe-practice-page/");
		driver.switchTo().frame("IF1");
		WebElement radioButton = findElementUsingXpath(".//*[@id='tool-0']");
		clickElement(radioButton);
		
		List<WebElement> elements = driver.findElements(By.xpath(".//*[@name='tool']"));
		Iterator<WebElement> itr = elements.iterator();
		while(itr.hasNext()) {
			WebElement elem = itr.next();
			boolean selected = elem.isSelected();
			if (!selected) {
				elem.click();
			}
		}
		
		// Changes is not done in file

	}

}
