package container.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppListPageUiObject extends BasePage {
	@FindBy(xpath="//div[@name='Sahyog']")
	WebElement sahyogApp;
	
	@FindBy(xpath="//a[@id='panel_1_button']")
	WebElement panelMenu;
	
	AppListPageUiObject(){
		super();
	}
}
