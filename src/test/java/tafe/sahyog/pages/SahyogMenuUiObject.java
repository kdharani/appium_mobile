package tafe.sahyog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import container.pages.BasePage;

public class SahyogMenuUiObject extends BasePage {
	@FindBy(xpath = "//a[@id='sahyog_panel_button']")
	WebElement sahyogMenu;
	@FindBy(xpath = "//span[text()='New Prospect']/parent::a")
	WebElement prospectLnk;
	@FindBy(xpath = "//span[text()='Pipeline']/parent::a")
	WebElement pipelineLnk;
	@FindBy(xpath = "//span[text()='Schedule']/parent::a")
	WebElement scheduleLnk;
	@FindBy(xpath = "//span[text()='Performance']/parent::a")
	WebElement performanceLnk;
	@FindBy(xpath = "//span[text()='Home']/parent::a")
	WebElement homeLnk;
	
	SahyogMenuUiObject(){
		super();
	}
}
