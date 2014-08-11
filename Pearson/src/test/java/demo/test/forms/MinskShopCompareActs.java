package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;

public class MinskShopCompareActs extends BaseForm {
	private static String formlocator="//*[@id='logo']";
	private Label labelLogo = new Label(By.xpath("//*[@id='logo']"),"Логотип MinskShop");
	private Label labelESigarets = new Label(By.xpath("//*[@href='/elektronnye_sigarety/']"),"Электронные сигареты");
	private Label labelSigarets = new Label(By.xpath("//*[@href='/elektronnye_sigarety/sigarety/']"),"Сигареты");
	private Label labelIsThereSigarets = new Label(By.xpath("//*[@class='title']/div[text()='Сигареты']"),"Найденные сигареты");
	private Button buttonAddFistCompare = new Button(By.xpath("//*[@id='comp_id26039']"),"Добавление в список сравнения");
	private Button buttonAddSecondCompare = new Button(By.xpath("//*[@id='comp_id26051']"),"Добавление в список сравнения");
	private Button buttonCompare = new Button(By.xpath("//*[@href='/compare/']"),"Сравнение");
	private Label labelIsThereComparing = new Label(By.xpath("//*[@class='title']/div[text()='Сравнение']"),"Сравниваются ли сигареты");
	
	public MinskShopCompareActs() {
		super(By.xpath(formlocator), "Страница Onliner");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void sourchForESigarets(){
		labelESigarets.click();
		labelSigarets.click();
		assert(labelIsThereSigarets.isPresent()); 
	}
	
	public void compareESigarets(){
		buttonAddFistCompare.click();
		buttonAddSecondCompare.click();
		buttonCompare.click();
		assert(labelIsThereComparing.isPresent()); 
	}
}
