package tafe.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driver {
	private static AppiumDriver driver = null;
	private static DesiredCapabilities caps = new DesiredCapabilities();
	
	private Driver(){
		
	}
	
	public static AppiumDriver Initialize() {

		try {
			if (driver == null) {
				caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
				caps.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.4.16");
				caps.setCapability(MobileCapabilityType.BROWSER_NAME, "");
				caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
				caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+File.separator+"app"+File.separator+"tafe_android.apk");
				caps.setCapability(MobileCapabilityType.APP_PACKAGE, "com.appsfreedom.quality");
				caps.setCapability(MobileCapabilityType.APP_ACTIVITY, "appsFreedom");
				caps.setCapability("autoWebview", true);
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "A0001");
				caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "180");
				caps.setCapability(MobileCapabilityType.DEVICE_READY_TIMEOUT, "60");
				URL serverUrl = new URL("http://localhost:4723/wd/hub");
				driver = new AndroidDriver(serverUrl, caps);
				driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
				Util.switchToWebview();
			} else
				return driver;

		} catch (Exception e) {
			MyLogger.log.debug(e.getMessage());
			throw new AssertionError("Driver not initialized");
		}
		return driver;
	}

}
