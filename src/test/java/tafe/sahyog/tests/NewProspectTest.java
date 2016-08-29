package tafe.sahyog.tests;

import org.apache.log4j.Level;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import container.pages.AppListPage;
import container.pages.AppListPage;
import container.pages.LoginPage;
import container.pages.Menu;
import tafe.sahyog.pages.NewProspectPage;
import tafe.sahyog.pages.SahyogMenu;
import tafe.sahyog.pages.SchedulePage;
import tafe.util.DataProviderClass;
import tafe.util.Driver;
import tafe.util.MyLogger;
import tafe.util.Util;

@Listeners({tafe.util.Listener.class})
public class NewProspectTest {

	private int prospectCount;

	@BeforeTest
	public void setup(){
		MyLogger.log.setLevel(Level.DEBUG);
		Driver.Initialize();
		LoginPage.loginAs("9010038598","af1234");
		AppListPage.Sahyog.download();
	}
	
	@Test(dataProviderClass=DataProviderClass.class, dataProvider="Create Prospect")
	public void createNewProspect(String name){

		SoftAssert sftAssert = new SoftAssert();
		
		MyLogger.log.info("Opening Sahyog app");
		AppListPage.Sahyog.Open();
		MyLogger.log.info("Navigating to Schedule page");
		SahyogMenu.Schedule.getTo();
		MyLogger.log.info("Getting prospect count");
		prospectCount = SchedulePage.getProspectCount();
		MyLogger.log.info("Navigating to Prospect page");
		SahyogMenu.Prospect.getTo();
		MyLogger.log.info("Creating new prospect");
		NewProspectPage.createNewProsect(name);
		
		sftAssert.assertEquals(SchedulePage.getProspectCount(), prospectCount+1, "Prospect count not equal");
		sftAssert.assertTrue(SchedulePage.checkIfProspectExists(name), "Prospect not exists");
		
		SahyogMenu.Home.getTo();
		sftAssert.assertAll();

	}
	
	@AfterTest
	public void teardown(){
		Menu.logout();
		Driver.Initialize().quit();
	}
}
