package tafe.util;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	public static void selectOption(WebElement select, String option) throws Exception {
		
		Select dropbox = new Select(select);
		dropbox.selectByVisibleText(option);
		
	}

	public static void delay(int i) {
		
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static boolean isElementDisplayed(WebElement element) {
		boolean displayed = false;
		try {
			WebDriverWait wait = new WebDriverWait(Driver.Initialize(),10);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}

	public static void waitForElement(WebElement element) throws Exception {
		WebDriverWait wait = new WebDriverWait(Driver.Initialize(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void waitForPageLoad() throws Exception {
		WebDriverWait wait = new WebDriverWait(Driver.Initialize(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h1[text()='Loading...']")));
		
	}

	public static void switchToNative() throws Exception{
		Set <String> contexts = Driver.Initialize().getContextHandles();
		for(String context :contexts){
			MyLogger.log.info(context);
			if(context.indexOf("NATIVE_APP")!=-1){
				Driver.Initialize().context(context);
				MyLogger.log.info("Switched to Native view");
				break;
			}	
		}
		
	}
	
	public static void switchToWebview() throws Exception {
		Set <String> contexts = Driver.Initialize().getContextHandles();
		for(String context :contexts){
			MyLogger.log.info(context);
			if(context.indexOf("WEBVIEW")!=-1){
				Driver.Initialize().context(context);
				MyLogger.log.info("Switched to webview");
				delay(2000);
				break;
			}	
		}
		
	}

	public static void closeAlert() throws Exception{
		switchToNative();
		WebDriverWait wait = new WebDriverWait(Driver.Initialize(), 10);
		WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		MyLogger.log.info(Driver.Initialize().findElement(By.id("android:id/message")).getText());
		alert.click();
		switchToWebview();
		
	}

	
}
