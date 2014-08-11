package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class ABook extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://asbook.net/");
		logger.step(2);
		ABookActs siteToWorkWith = new ABookActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.searchOnUpdate();
		logger.step(4);
		siteToWorkWith.searchOnYear();
		logger.step(5);
		siteToWorkWith.searchOnRaiting();
		logger.step(6);
		siteToWorkWith.searchOnVisits();
		logger.step(7);
		siteToWorkWith.searchOnLength();
		
/*		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		siteToWorkWith.searchAssert();
	*/	
		
	}
}
