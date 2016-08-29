package tafe.sahyog.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

import container.pages.LoginPage;
import container.pages.LoginPageUiObject;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import tafe.util.Driver;
import tafe.util.MyLogger;
import tafe.util.Util;

public class NewProspectPage {

	private static NewProspectPageUiObject page = null;

	public static void init() {
		if (page == null)
			page = new NewProspectPageUiObject();
	}

	public static boolean isPageLoaded() {
		init();
		return Util.isElementDisplayed(page.mobileNumInput);

	}

	public static void createNewProsect(String prospectName) {
		try {
			init();
			page.mobileNumInput.sendKeys("9962591778");
			Util.selectOption(page.selectCluster, "THORRUR");
			Util.selectOption(page.selectVillage, "AMMAPUR");
			page.CustFnameInput.sendKeys(prospectName);
			Util.selectOption(page.selectCustTYpe, "First Time Buyer");
			selectModel("MF 1035 MS-574");
			// Util.selectOption(page.selectModelCode, "MF 1035 MS-574");
			setDate(page.dateEDD, currentDate());
			setDate(page.dateNFD, currentDate());
			// page.setEDD.setAttribute("value", "8/31/2016");
			// page.setNFD.sendKeys("8/31/2016");
			Util.selectOption(page.selectPaymentOption, "CASH");
			page.assistanceReq.click();
			page.createBtn.click();
			Util.closeAlert();
			Util.delay(5000);
		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new SkipException(("New prospect creation failed"));
		}

	}

	public static String currentDate() {
		Date date = new Date();
		String DATE_FORMAT = "M/d/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return sdf.format(date);
	}

	public static void selectModel(String modelName) throws Exception {
		init();
		page.selectModelCode.click();
		page.modelFilterInput.sendKeys(modelName);
		WebElement model = Driver.Initialize().findElement(By.xpath("//label[text()='" + modelName + "']/parent::div"));
		MyLogger.log.debug(model.getAttribute("data-totransfer"));
		model.click();

	}

	public static void setDate(WebElement element, String date) {
		((JavascriptExecutor) Driver.Initialize()).executeScript("arguments[0].setAttribute('value',arguments[1]);",
				element, date);
	}

}
