package tafe.sahyog.pages;

import org.testng.SkipException;

import tafe.util.MyLogger;
import tafe.util.Util;

public class SahyogMenu {
	private static SahyogMenuUiObject page = null;

	public static void init() {
		if (page == null)
			page = new SahyogMenuUiObject();
	}

	public static boolean isPageLoaded() {
		init();
		return Util.isElementDisplayed(page.sahyogMenu);

	}

	public static class Home {

		public static void getTo() {

			try {
				page.sahyogMenu.click();
				Util.waitForElement(page.homeLnk);
				page.homeLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Applist page navigation failed");
			}

		}

	}

	public static class Performance {

		public static void getTo() {

			try {
				page.sahyogMenu.click();
				Util.waitForElement(page.performanceLnk);
				page.performanceLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Performance page navigation failed");
			}

		}

	}

	public static class Schedule {

		public static void getTo() {
			try {
				init();
				page.sahyogMenu.click();
				Util.waitForElement(page.scheduleLnk);
				page.scheduleLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new AssertionError("Schedule page navigation failed");
			}

		}

	}

	public static class Pipeline {

		public static void getTo() {
			try {
				init();
				page.sahyogMenu.click();
				Util.waitForElement(page.pipelineLnk);
				page.pipelineLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Pipeline page navigation failed");
			}

		}

	}

	public static class Prospect {

		public static void getTo() {

			try {
				init();
				page.sahyogMenu.click();
				Util.waitForElement(page.prospectLnk);
				page.prospectLnk.click();
				Util.delay(5000);
			} catch (Exception e) {
				MyLogger.log.debug(e.getMessage());
				throw new SkipException("Prospect page navigation failed");
			}

		}

	}
}
