package demo.test;

import webdriver.BaseTest;
import demo.test.forms.*;

public class Kinoklad extends BaseTest {
	public void runTest() {

		logger.step(1);
		browser.navigate("http://www.kinoklad.ru");
		logger.step(2);
		KinokladActs siteToWorkWith = new KinokladActs();
		siteToWorkWith.assertLogo();
		logger.step(3);
		siteToWorkWith.searchFor("Планета обезьян");
		logger.step(4);
		browser.waitForPageToLoad();
		logger.step(5);
		siteToWorkWith.filmChoosing();
		logger.step(6);
		siteToWorkWith.commentingTheFilm("Stas","stas_man@tut.by","Отличный фильм");
		logger.step(7);
		siteToWorkWith.assertComment();
	}
}
