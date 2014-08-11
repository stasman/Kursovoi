package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Label;

public class ABookActs extends BaseForm {
	private static String formlocator="//*[@class='b-header__top clearfix']/a[text()='слушайте аудиокниги онлайн']";
	private Label lbLogo = new Label(By.xpath("//*[@class='b-header__top clearfix']/a[text()='слушайте аудиокниги онлайн']"),"По дате обновления");

	private Label onUpdate = new Label(By.xpath("//*[@href='javascript:void(0)']/span[text()='Дате добавления']"),"По дате обновления");
	private Label onYear = new Label(By.xpath("//*[@href='javascript:void(0)']/span[text()='Году']"),"По году");
	private Label onRaiting = new Label(By.xpath("//*[@href='javascript:void(0)']/span[text()='Рейтингу']"),"По рейтингу");
	private Label onVisits = new Label(By.xpath("//*[@href='javascript:void(0)']/span[text()='Просмотрам']"),"По просмотрам");
	private Label onLength = new Label(By.xpath("//*[@href='javascript:void(0)']/span[text()='Времени звучания']"),"По времени звучания");
	
	public ABookActs() {
		super(By.xpath(formlocator), "Страница ABook");
	}
	
	public void assertLogo(){
		assert(lbLogo.isPresent()); 
	}
	
    public void searchOnUpdate() {
    	onUpdate.click();
    }
    
    public void searchOnYear() {
    	onYear.click();
    }
    
    public void searchOnRaiting() {
    	onRaiting.click();
    }
    
    public void searchOnVisits() {
    	onVisits.click();
    }
    
    public void searchOnLength() {
    	onLength.click();
    }
   
}
