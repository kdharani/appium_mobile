package container.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tafe.util.Driver;

public class BasePage {

	protected BasePage(){
		PageFactory.initElements(new AppiumFieldDecorator(Driver.Initialize(),20L,TimeUnit.SECONDS), this);
	}
}
