package container.pages;


import org.testng.SkipException;

import tafe.util.MyLogger;
import tafe.util.Util;

public class Menu {
	private static MenuUiObjects page = null;
	
	public static void init(){
		if(page==null)
			page = new MenuUiObjects();
	}
	
	public static void syncNow(){
		try {
			init();
			page.menu.click();
			Util.waitForElement(page.syncNowLnk);
			page.syncNowLnk.click();
			Util.closeAlert();
		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new SkipException("sync now failed");
		}
	}
	
	public static void logout(){
		try {
			init();
			page.menu.click();
			Util.waitForElement(page.logoutLnk);
			page.logoutLnk.click();
			Util.delay(5000);
		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new AssertionError("logout failed");
		}
	}
	
	public static class Home {
		public static void getTo(){
			try {
				init();
				page.menu.click();
				Util.waitForElement(page.homeLnk);
				page.homeLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Home page navigation failed");
			}
		}
		
	}
	
	public static class AppLibrary {
		public static void getTo(){
			try {
				init();
				page.menu.click();
				Util.waitForElement(page.homeLnk);
				page.homeLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("App Library navigation failed");
			}
		}
	}
	
	public static class SyncStatus {
		public static void getTo(){
			try {
				init();
				page.menu.click();
				Util.waitForElement(page.homeLnk);
				page.homeLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Sync status page navigation failed");
			}
		}
	}
	
	public static class SavedPassword {
		public static void getTo(){
			try {
				init();
				page.menu.click();
				Util.waitForElement(page.homeLnk);
				page.homeLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Saved password page navigation failed");
			}
		}
	}
}
