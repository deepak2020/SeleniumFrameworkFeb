package day_1;

public class MouseHover extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		openChromeBrowser();
		getUrl(getProperty("URL"));
//		mouseHoverOnElement(getProperty("tutorialXpath"));
//		mouseHoverOnElement(getProperty("tutorialXpath"));
//		mouseHoverOnElement(getProperty("apiXpath"));
		dragAndDrop(getProperty("sourceElement"), getProperty("targetElement"));
		//Commited to MouseHover

	}

}
