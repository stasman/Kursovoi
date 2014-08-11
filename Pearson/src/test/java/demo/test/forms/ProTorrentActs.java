package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class ProTorrentActs extends BaseForm {
	private static String formLocator="//body[@class='global']";
	private Label labelLogo = new Label(By.xpath(".//*[@id='masthead']/a"),"Логотип Pro-Torrent");
	private TextBox textBoxSearchBar = new TextBox(By.id("box-search"),"Строка поиска");
	private Button buttonSearch = new Button (By.id("button-search"),"Кнопка поиска");
	private Label filmName = new Label(By.xpath("//*[@id='right-bar']"),"Фильм Мишки Гамми");
	private Label buttonFilm = new Label(By.xpath("//*[@id='navigation']/ol/li[5]/a"),"как скачать фильм");


	public ProTorrentActs() {
		super(By.xpath(formLocator), "Страница Pro-Torrent.com");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void searchFor(String text) {
		textBoxSearchBar.type(text);
    	buttonSearch.click();
    }
	
	public void assertGummiBearsFilm(){
		assert(filmName.isPresent());
	}
	public void howToLoad() {
		buttonFilm.click();
    }
}
