package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class OnlinerForum extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.Onliner.by");
		logger.step(2);
		OnlinerForumActs siteToWorkWith = new OnlinerForumActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.forumIn();
		logger.step(4);
		siteToWorkWith.searchWOT("World of Tanks");
		logger.step(5);
		siteToWorkWith.findTheme();
	}
}
