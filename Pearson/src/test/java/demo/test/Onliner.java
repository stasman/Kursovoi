package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Onliner extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.onliner.by/");
		logger.step(2);
		OnlinerActs siteToWorkWith = new OnlinerActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.login("stas_man@tut.by","155155ss");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		siteToWorkWith.assertUser();
		logger.step(6);
		siteToWorkWith.usersPage();
		logger.step(7);
		siteToWorkWith.usersBookmarks();
		

	}
}
