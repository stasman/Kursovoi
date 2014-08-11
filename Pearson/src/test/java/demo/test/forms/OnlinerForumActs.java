package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class OnlinerForumActs extends BaseForm {
	private static String formlocator="//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']";
	private Label labelLogo = new Label(By.xpath("//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']"),"Логотип Onliner");

	private Label labelForum = new Label(By.xpath("//*[@class='b-main-navigation__item']/a[text()='Форум']"),"Форум");
	private Label labelForumAssert = new Label(By.xpath("//*[@class='m-title']"),"проверка страницы Форум");
	private TextBox textBoxThemeSearch = new TextBox(By.xpath("//*[@id='search-input']"),"Строка поиска темы");	
	private Button buttonFind = new Button (By.xpath("//*[@class='onlsearch__btn']"),"кнопка Найти");	
	private Label labelWOTIsAny = new Label(By.xpath("//*[contains(.,'World of Tanks')]"),"Били ли найденa тема World Of Tanks");
	
	public OnlinerForumActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void forumIn(){
		labelForum.click();
		assert(labelForumAssert.isPresent());
	}
	
	public void searchWOT(String theme){
		textBoxThemeSearch.type(theme);
	}
	
	public void findTheme(){
		buttonFind.click();
		assert(labelWOTIsAny.isPresent());
	}
}
