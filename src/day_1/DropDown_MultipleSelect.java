package day_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown_MultipleSelect extends CommonMethods{

	public static void main(String[] args) {
		openChromeBrowser();
		getUrl("https://www.toolsqa.com/automation-practice-form/");
		WebElement continentDropDown = findElementUsingXpath(".//*[@id='continents']");
		WebElement seleniumCommands = findElementUsingXpath(".//*[@id='selenium_commands']");
		
//		clickElement(continentDropDown);
//		
//		WebElement country = findElementUsingXpath(".//*[text()='Antartica']");
//		clickElement(country);

		Select selection = new Select(continentDropDown);
		Select seleniumCommand = new Select(seleniumCommands);
		selection.selectByIndex(3);
		selection.selectByVisibleText("Africa");
		seleniumCommand.selectByIndex(0);
		seleniumCommand.selectByIndex(1);
		seleniumCommand.deselectAll();

	}

}

//chandan Pass
