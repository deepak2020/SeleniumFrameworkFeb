package day_1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases extends CommonMethods {
	
	@Test
	public void testSwitchWindowsFunctionality() {
		getUrl(getProperty("URL"));
		clickElement(findElementUsingXpath(getProperty("clickHere")));
		// After clicking on clickhere, you may see new window getting open but your driver is still
		//on parent windows
		//Fetch all the window handles using getWindowHandles()
		Set windowsHandles = driver.getWindowHandles();
		//Get each windows ID one by one using iterator
		Iterator<String> itr = windowsHandles.iterator();
		ArrayList<String> windowsHandlesList = new ArrayList<>();
		while (itr.hasNext()) {
			//Storing Windows ID one by one in ArrayList so that I can fetch it with index no.
			windowsHandlesList.add(itr.next());
		}
		//The value on index 0 is parentWindow ID
		String parentWindow = windowsHandlesList.get(0);
		//The Value on index 1 is child window ID
		String childWindow = windowsHandlesList.get(1);
		System.out.println("parentWindows   "+driver.getCurrentUrl());
		//Switching to the child windows by providing windowhandlesID
		driver.switchTo().window(childWindow);
		System.out.println("child windows "+ driver.getCurrentUrl());
		//Switching to the parent windows by providing windowhandlesID
		driver.switchTo().window(parentWindow);
		System.out.println("parentWindows   "+driver.getCurrentUrl());
	}
	
	
	

}
