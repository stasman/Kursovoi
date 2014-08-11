package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class OnlinerBuy extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.Onliner.by/");
		logger.step(2);
		OnlinerBuyActs siteToWorkWith = new OnlinerBuyActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.login("stas_man@tut.by","155155ss");
		logger.step(4);
		siteToWorkWith.intoCatalog();
		logger.step(5);
		siteToWorkWith.findPhones();
		logger.step(5);
		siteToWorkWith.inputPriceBouds("5","15");
	}
}
