package tafe.util;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="Create Prospect")
	public static Object[][] dataProvider(){

		return new Object[][] {{"sekard"}};
	}
}
