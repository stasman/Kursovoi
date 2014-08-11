package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;

public class KinokladActs extends BaseForm {
	private static String formLocator="//*[@background='http://www.kinoklad.ru/images/logo.jpg']";
	private Label labelLogo = new Label(By.xpath("//*[@background='http://www.kinoklad.ru/images/logo.jpg']"),"Логотип kinoklad");
	private TextBox textBoxSearchBar = new TextBox(By.xpath("//*[@name='query']"),"Строка поиска");
	private Button buttonSearch = new Button (By.xpath("//*[@value='искать']"),"Кнопка поиска");
	private Label filmName = new Label(By.xpath("//*[@title='Скачать фильм Планета обезьян: Революция бесплатно']"),"Фильм Планета обезьян: Революция");
	private TextBox textBoxName = new TextBox(By.xpath("//*[@name='author_name']"),"Имя комментатора");
	private TextBox textBoxEmail = new TextBox(By.xpath("//*[@name='author_email']"),"E-mail комментатора");
	private TextBox textBoxComment = new TextBox(By.xpath("//*[@wrap='virtual']"),"Комментарий");
	private Button buttonSend = new Button (By.xpath("//*[@name='op']"),"Кнопка отправить комментарий");
	private Label commentator = new Label(By.xpath("//*[@class='tiny']/noindex[text()='stas_man[@]tut.by']"),"Комментатор stas_man");

	public KinokladActs() {
		super(By.xpath(formLocator), "Страница Kinoklad.ru");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void searchFor(String text) {
		textBoxSearchBar.type(text);
    	buttonSearch.click();
    }
	
	public void filmChoosing(){
		filmName.click();
	}
	
	public void commentingTheFilm(String name,String email, String comment) {
		textBoxName.type(name);
		textBoxEmail.type(email);
		textBoxComment.type(comment);
		buttonSend.click();
    }
	
	public void assertComment(){
		assert(commentator.isPresent()); 
	}
	
}
