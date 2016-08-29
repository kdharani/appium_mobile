package tafe.sahyog.pages;

import org.openqa.selenium.By;
import org.testng.SkipException;

import tafe.util.Driver;
import tafe.util.MyLogger;
import tafe.util.Util;

public class SchedulePage {
	private static SchedulePageUiObject page = null;
	
	public static void init(){
		if(page==null)
			page = new SchedulePageUiObject();
	}
	
	public static int getProspectCount(){
		int count=0;
		try {
			init();
			count= Integer.parseInt(page.hotProspectCount.getText());
		} catch (Exception e) {
			MyLogger.log.debug("Unable to get prospect count");
			//throw new SkipException(e.getMessage());
		}
		return count;
	}
	
	public static boolean checkIfProspectExists(String name) {
		boolean exists = false;
		String strName = "";
		try {
			init();
			page.todayTab.click();
			page.filterInput.sendKeys(name);
			Util.delay(2000);
			strName = (Driver.Initialize().findElement(By.xpath("//li[text()='Hot Prospect']/following-sibling::li[@class='children ui-last-child']"
					+ "//label[@id='Tod_cust_name']")).getText());
			if(name.equals(strName)){
				exists = true;
			}
		} catch (Exception e) {
			MyLogger.log.debug("Unable to find prospect");
			//throw new SkipException(e.getMessage());
		}
		return exists;
		
	}

}
