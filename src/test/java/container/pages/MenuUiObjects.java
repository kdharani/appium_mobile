package container.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuUiObjects extends BasePage{
	@FindBy(xpath="//a[@id='panel_1_button']")
	WebElement menu;
	@FindBy(xpath = "//span[text()='Home']/parent::a")
	WebElement homeLnk;
	@FindBy(xpath = "//span[text()='App Library']/parent::a")
	WebElement appLibLnk;
	@FindBy(xpath = "//span[text()='Sync Status']/parent::a")
	WebElement syncStatusLnk;
	@FindBy(xpath = "//span[text()='Sync Now']/parent::a")
	WebElement syncNowLnk;
	@FindBy(xpath = "//span[text()='Saved Passwords']/parent::a")
	WebElement savedPasswordLnk;
	@FindBy(xpath = "//span[text()='Logout']/parent::a")
	WebElement logoutLnk;
	
	MenuUiObjects(){
		super();
	}
}
