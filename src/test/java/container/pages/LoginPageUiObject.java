package container.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageUiObject extends BasePage {
	@FindBy(xpath = "//input[@id='username']")
	protected WebElement usernameInput;

	@FindBy(xpath = "//input[@id='password']")
	protected WebElement pwdInput;

	@FindBy(xpath = "//a[@id='login_button']")
	protected WebElement signInBtn;
	
	@FindBy(xpath = "//input[@id='1']")
	protected WebElement pin1;
	
	@FindBy(xpath = "//input[@id='a']")
	protected WebElement pin2;
	
	@FindBy(xpath = "//input[@id='b']")
	protected WebElement pin3;
	
	@FindBy(xpath = "//input[@id='c']")
	protected WebElement pin4;
	
	@FindBy(xpath = "//a[@id='create_passcode_btn']")
	protected WebElement saveBtn;
	
	
	
	LoginPageUiObject() {
		super();
	}
}
