package container.pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tafe.sahyog.pages.SahyogMenuUiObject;
import tafe.util.Driver;
import tafe.util.MyLogger;
import tafe.util.Util;

public class LoginPage {

	
	private static LoginPageUiObject page = null;
	
	public static void init(){
		if(page == null)
			page = new LoginPageUiObject();
	}
	
	public static boolean isPageLoaded(){
		init();
		return Util.isElementDisplayed(page.usernameInput);

	}
	
	public static void savePin(String pin){
		init();
		String code[] = pin.split(" ");
		
		try {
			init();
			page.pin1.sendKeys(code[0]);
			page.pin2.sendKeys(code[1]);
			page.pin3.sendKeys(code[2]);
			page.pin4.sendKeys(code[3]);
			page.saveBtn.click();
			Util.delay(5000);
		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new AssertionError("Save pin failed");
		}
	}

	public static void loginAs(String username, String password) {

		try {
				init();
				page.usernameInput.clear();
				page.usernameInput.sendKeys(username);
				page.pwdInput.clear();
				page.pwdInput.sendKeys(password);
				page.signInBtn.click();
				Util.delay(2000);
				savePin("1 2 3 4");
				Util.delay(2000);
				Util.waitForPageLoad();
		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new AssertionError("Login failed");
		}

	}

}
