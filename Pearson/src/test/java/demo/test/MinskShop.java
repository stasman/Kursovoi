package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class MinskShop extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.minsk.shop.by/");
		logger.step(2);
		MinskShopActs siteToWorkWith = new MinskShopActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.findItem("Globus 510");
		logger.step(4);
		siteToWorkWith.chooseAtomizer();
		logger.step(5);
		siteToWorkWith.addToCart();
		logger.step(6);
		siteToWorkWith.cartStatus();
	}
}
