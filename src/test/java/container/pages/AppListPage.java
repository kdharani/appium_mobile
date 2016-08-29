package container.pages;

import org.testng.SkipException;

import tafe.util.MyLogger;
import tafe.util.Util;

public class AppListPage {

	private static AppListPageUiObject page = null;

	public static void init() {
		if (page == null)
			page = new AppListPageUiObject();
	}

	public static boolean isPageLoaded() {
		init();
		return Util.isElementDisplayed(page.panelMenu);

	}

	public static class Sahyog {

		public static void Open() {
			try {
				init();
				page.sahyogApp.click();
				Util.delay(5000);

			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new AssertionError("Sahyog app not opened");
			}

		}

		public static void download() {
			init();
			try {
				page.sahyogApp.click();
				// MyLogger.log.info(page.sahyogApp.getAttribute("app-downloaded"));
				while (page.sahyogApp.getAttribute("app-downloaded").equals("false")) {
					Util.delay(3000);
					init();
				}
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new AssertionError("Sahyog app download failed");

			}
		}
	}
}
