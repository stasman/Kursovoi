package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class GoogleTranslate extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("https://translate.google.ru/");
		logger.step(2);
		GoogleTranslateActs siteToWorkWith = new GoogleTranslateActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.translate("Translate");
		browser.waitForPageToLoad();
		logger.step(4);
		siteToWorkWith.verbalizy();
		browser.waitForPageToLoad();
		logger.step(5);
		try {
			Thread.sleep(3000);
				} catch(InterruptedException e) {
					Thread.currentThread().interrupt(); 
			}
		siteToWorkWith.verbalizyInPortugal();
		try {
			Thread.sleep(3000);
				} catch(InterruptedException e) {
					Thread.currentThread().interrupt(); 
			}
		browser.waitForPageToLoad();
	}
}
