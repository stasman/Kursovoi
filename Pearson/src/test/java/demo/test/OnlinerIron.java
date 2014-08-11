package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class OnlinerIron extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.Onliner.by");
		logger.step(2);
		OnlinerIronActs siteToWorkWith = new OnlinerIronActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.baraholkaIn();
		logger.step(4);
		siteToWorkWith.searchIron("Утюг");
		logger.step(5);
		siteToWorkWith.findIron();
	}
}
