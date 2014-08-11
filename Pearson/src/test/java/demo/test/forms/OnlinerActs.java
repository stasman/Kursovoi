package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class OnlinerActs extends BaseForm {
	private static String formlocator="//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']";
	private Label labelLogo = new Label(By.xpath("//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']"),"Логотип Onliner");
	private TextBox textBoxSetLogin = new TextBox(By.xpath("//*[@class='input unfocus']"),"Строка ввода логина");
	private TextBox textBoxSetPassword = new TextBox(By.xpath("//*[@class='input unfocus password']"),"Строка ввода пароля");
	private Button buttonSubmit = new Button (By.xpath("//*[@class='submit']"),"кнопка Submit");
	private Label labelUser = new Label(By.xpath("//*[@class='user-name']/a[text()='stas_man']"),"Авторизованный пользователь");
	private Label labelUsersBookmarks = new Label(By.xpath("//*[@class='b-ico i-smallfav-bl']"),"Закладки пользователя");
	private Label labelIsAnyBookmark = new Label(By.xpath("//*[@style='font-size:18px; margin:1.5em 2em']"),"Активные закладки пользователя");
	
	public OnlinerActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void login(String login,String password){
		textBoxSetLogin.type(login);
		textBoxSetPassword.type(password);
		buttonSubmit.click();
	}

	public void assertUser(){
		assert(labelUser.isPresent());
	}
	
	public void usersPage(){
		labelUser.click();
	}
	
	public void usersBookmarks(){
		labelUsersBookmarks.click();
		assert(labelIsAnyBookmark.isPresent());
		
	}
}
