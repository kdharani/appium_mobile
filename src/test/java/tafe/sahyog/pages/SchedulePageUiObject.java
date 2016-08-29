package tafe.sahyog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import container.pages.BasePage;import tafe.util.Util;

public class SchedulePageUiObject extends BasePage{

	@FindBy(xpath="//span[text()='Today']/parent::a")
	WebElement todayTab;
	@FindBy(xpath="//span[text()='Week']/parent::a")
	WebElement weekTab;
	@FindBy(xpath="//span[text()='Month']/parent::a")
	WebElement monthTab;
	@FindBy(xpath="//span[text()='Rest']/parent::a")
	WebElement restTab;
	@FindBy(xpath="//input[@placeholder='Filter items...']")
	WebElement filterInput;
	@FindBy(xpath="//li[text()='Hot Prospect']")
	WebElement hotProspect;
	@FindBy(xpath="//li[text()='Hot Prospect']/span")
	WebElement hotProspectCount;
	
	public SchedulePageUiObject() {
		super();
	}

}
