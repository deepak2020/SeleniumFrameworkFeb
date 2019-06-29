package day_1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Selenium_day3_2 extends CommonMethods {

	public static void main(String[] args) {
		openChromeBrowser();
		getUrl("https://www.toolsqa.com/automation-practice-table/");

		List<WebElement> rowsHeader = driver.findElements(By.tagName("tr"));
		int row = rowsHeader.size();

		List<WebElement> headersCount = driver.findElements(By.tagName("th"));
		int column = headersCount.size() - rowsHeader.size() - 1;

		for (int r = 1; r < row; r++) {
			for (int c = 1; c <= column; c++) {
					WebElement table = driver
							.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[" + r + "]/td[" + c + "]"));
					System.out.println(table.getText());
			}
		}

	}

}
