package demo.test.forms;

import org.openqa.selenium.By;

import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;
import webdriver.elements.Label;

public class GoogleTranslateActs extends BaseForm {
	private static String formlocator="//*[@id='gt-appname']";
	private Label labelLogo = new Label(By.xpath("//*[@id='gt-appname']"),"Логотип Google Translate");
	private TextBox textBoxTextToTranslate = new TextBox(By.xpath("//*[@id='source']"),"Поле для ввода текста");
	private Label labelIsThereEnglishTranslation = new Label(By.xpath("//*[contains(.,'переводить')]"),"наличие перевода на английском");
	private Button buttonVirbalizy = new Button(By.xpath("//*[@id='gt-res-listen']"),"Озвучить перевод");
	private Button buttonChooseLng = new Button(By.xpath("//*[@id='gt-tl-gms']"),"Выбор языка перевода");
	private Button buttonOnPortugal = new Button(By.xpath("//*[@id=':3v']"),"Нерепести на португальский");
	private Label labelIsTherePortugalTranslation = new Label(By.xpath("//*[contains(.,'traduzir')]"),"наличие перевода на португальском");
	
	public GoogleTranslateActs() {
		super(By.xpath(formlocator), "Страница Google Translate");
	}

	public void assertLogo(){
		assert(labelLogo.isPresent()); 
	}
	
	public void translate(String text){
		textBoxTextToTranslate.type(text);
		try {
			Thread.sleep(1000);
				} catch(InterruptedException e) {
					Thread.currentThread().interrupt(); 
			}
		assert(labelIsThereEnglishTranslation.isPresent()); 
	}
	
	public void verbalizy(){
		buttonVirbalizy.click();
	}
	
	public void verbalizyInPortugal(){
		buttonChooseLng.click();
		buttonOnPortugal.click();
		try {
			Thread.sleep(1000);
				} catch(InterruptedException e) {
					Thread.currentThread().interrupt(); 
			}
		assert(labelIsTherePortugalTranslation.isPresent()); 
		buttonVirbalizy.click();
	}	
}
