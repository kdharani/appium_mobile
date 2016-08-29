package tafe.sahyog.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import container.pages.BasePage;

public class NewProspectPageUiObject extends BasePage{
	@FindBy(xpath = "//*[@id='cus_mobile_no']")
	WebElement mobileNumInput;
	@FindBy(xpath = "//*[@id='cluster_dropdown']")
	WebElement selectCluster;
	@FindBy(xpath = "//*[@id='village_dropdown']")
	WebElement selectVillage;
	@FindBy(xpath = "//*[@id='cust_Fname']")
	WebElement CustFnameInput;
	@FindBy(xpath = "//*[@id='custtype_select']")
	WebElement selectCustTYpe;
	@FindBy(xpath = "//*[@id='model_code']")
	WebElement selectModelCode;
	@FindBy(xpath = "//ul[@id='model_list']//input[@placeholder='Filter items...']")
	WebElement modelFilterInput;
	
	@FindBy(xpath = "//*[@id='EDD_date']")
	WebElement dateEDD;
	@FindBy(xpath = "//*[@id='followup_date']")
	WebElement dateNFD;
	@FindBy(xpath = "//*[@id='payment_option']")
	WebElement selectPaymentOption;
	@FindBy(xpath = "//*[@id='retail_checkbox']")
	WebElement assistanceReq;
	@FindBy(xpath = "//*[@id='addprospect_btn']")
	WebElement createBtn;
	
	NewProspectPageUiObject(){
		super();
	}
}
