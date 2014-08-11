package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class OnlinerBuyActs extends BaseForm {
	private static String formlocator="//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']";
	private Label labelLogo = new Label(By.xpath("//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']"),"Логотип Onliner");
	private TextBox textBoxSetLogin = new TextBox(By.xpath("//*[@class='input unfocus']"),"Строка ввода логина");
	private TextBox textBoxSetPassword = new TextBox(By.xpath("//*[@class='input unfocus password']"),"Строка ввода пароля");
	private Button buttonSubmit = new Button (By.xpath("//*[@class='submit']"),"кнопка Submit");
	private Label labelIsThereStasMan = new Label(By.xpath("//*[contains(.,'stas_man')]"),"Вошел ли пользователь Stas_man");
	private Label labelCatalog = new Label(By.xpath("//*[@class='b-main-navigation__item']/a[text()='Каталог и цены']"),"Раздел Каталог и цены");
	private Label labelIsAnyPhones = new Label(By.xpath("//*[contains(.,'Проводные телефоны')]"),"есть ли в разделе проводные телефоны");
	private Label labelPhones = new Label(By.xpath("//*[@href='http://catalog.onliner.by/phone/'][text()='Проводные телефоны']"),"Проводные телефоны");
	private Label labelIsThisPageIsUnlinePhones = new Label(By.xpath("//*[@id='unline']"),"Каталог проводных телефонов");
	private TextBox textBoxMinPrice = new TextBox(By.xpath("//*[@id='smth2']"),"Минимальная цена");
	private TextBox textBoxMaxPrice = new TextBox(By.xpath("//*[@id='smth3']"),"Максимальная цена");
	private Button buttonPickUp = new Button (By.xpath("//*[@alt='Подобрать']"),"кнопка Подобрать");
	private Label labelIsAnyToBuy = new Label(By.xpath("//*[@id='panaskxts2350']"),"Найдены ли телефоны в таком диапазоне цен");
	
	public OnlinerBuyActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}
	
	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void login(String login,String password){
		textBoxSetLogin.type(login);
		textBoxSetPassword.type(password);
		buttonSubmit.click();
		assert(labelIsThereStasMan.isPresent());
	}

	public void intoCatalog(){
		labelCatalog.click();
		assert(labelIsAnyPhones.isPresent());
	}
	
	public void findPhones(){
		labelPhones.click();
		assert(labelIsThisPageIsUnlinePhones.isPresent());
	}
	
	public void inputPriceBouds(String min,String max){
		textBoxMinPrice.type(min);
		textBoxMaxPrice.type(max);
		buttonPickUp.click();
		assert(labelIsAnyToBuy.isPresent());
	}
		
}
