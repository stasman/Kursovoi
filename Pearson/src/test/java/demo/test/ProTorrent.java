package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class ProTorrent extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://pro-torrent.com/");
		logger.step(2);
		ProTorrentActs siteToWorkWith = new ProTorrentActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.searchFor("Мишки Гамии");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		siteToWorkWith.assertGummiBearsFilm();
		logger.step(6);
		siteToWorkWith.howToLoad();
		browser.waitForPageToLoad();
		

	}
}
