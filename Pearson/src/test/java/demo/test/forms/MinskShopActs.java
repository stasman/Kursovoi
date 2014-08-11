package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class MinskShopActs extends BaseForm {
	private static String formlocator="//*[@id='logo']";
	private Label labelLogo = new Label(By.xpath("//*[@id='logo']"),"Логотип MinskShop");
	private TextBox textBoxFindItem = new TextBox(By.xpath("//*[@id='findtext']"),"Строка поиска товара");
	private Button buttonFind = new Button (By.xpath("//*[@class='findcol']/*[@class='simg']"),"кнопка поиска");
	private Label labelIsThereAtomizer = new Label(By.xpath("//*[@class='m']/h2/a[text()='Атомайзер Globus 510']"),"найденный товар");
	private Label labelChooseAtomizer = new Label(By.xpath("//*[@class='m']/h2/a[text()='Атомайзер Globus 510']"),"выбираем товар");
	private Label labelIsThereItem = new Label(By.xpath("//*[@class='m']/h2[text()='Атомайзер Globus 510']"),"выбранный товар");
	private Button buttonAddToCart = new Button (By.xpath("//*[@title='купить']"),"кнопка поиска");
	private Label labelCart = new Label(By.xpath("//*[@href='/shcart/?step=2&nstep=2&url=/']"),"корзина");
	private Label labelAtomizerInTheCart = new Label(By.xpath("//*[contains(.,'Атомайзер Globus 510')]"),"Наличие товара в корзине");
		
	public MinskShopActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void findItem(String item){
		textBoxFindItem.type(item);
		buttonFind.click();
		assert(labelIsThereAtomizer.isPresent()); 
	}
	
	public void chooseAtomizer(){
		labelChooseAtomizer.click();
		assert(labelIsThereItem.isPresent()); 
	}
	
	public void addToCart(){
		buttonAddToCart.click();
	}
	
	public void cartStatus(){
		buttonAddToCart.click();
		labelCart.click();
		assert(labelAtomizerInTheCart.isPresent()); 
	}
	

}
