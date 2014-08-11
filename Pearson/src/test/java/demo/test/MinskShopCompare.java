package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class MinskShopCompare extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.minsk.shop.by/");
		logger.step(2);
		MinskShopCompareActs siteToWorkWith = new MinskShopCompareActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.sourchForESigarets();
		logger.step(4);
		siteToWorkWith.compareESigarets();
	}
}
