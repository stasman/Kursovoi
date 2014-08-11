package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class OnlinerIronActs extends BaseForm {
	private static String formlocator="//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']";
	private Label labelLogo = new Label(By.xpath("//*[@href='http://www.onliner.by/']/*[@class='onliner_logo retina-off']"),"Логотип Onliner");

	private Label labelBaraholka = new Label(By.xpath("//*[@class='b-main-navigation__item']/a[text()='Барахолка']"),"Барахолка");
	private Label labelBaraholkaAssert = new Label(By.xpath("//*[@class='m-title']/h1[text()='Барахолка']"),"проверка страницы Барахолка");
	private TextBox textBoxItemSearch = new TextBox(By.xpath(".//*[@id='fleaMarketSearchInput']"),"Строка ввода для поиска товара");	
	private Button buttonFindItem = new Button (By.xpath("//*[@class='b-searchsubj']/button[text()='Найти']"),"кнопка Найти");	
	private Label labelIronIsAny = new Label(By.xpath("//*[contains(.,'Утюг')]"),"Били ли найдены утюги");
	
	public OnlinerIronActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void baraholkaIn(){
		labelBaraholka.click();
		assert(labelBaraholkaAssert.isPresent());
	}
	
	public void searchIron(String item){
		textBoxItemSearch.type(item);
	}
	
	public void findIron(){
		buttonFindItem.click();
		assert(labelIronIsAny.isPresent());
	}
}
