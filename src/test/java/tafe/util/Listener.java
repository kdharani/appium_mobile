package tafe.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		MyLogger.log.info("Test "+result.getName()+" started");
		
	}

	public void onTestSuccess(ITestResult result) {
		MyLogger.log.info("Test "+result.getName()+" passed");
		
	}

	public void onTestFailure(ITestResult result) {
		MyLogger.log.info("Test "+result.getName()+" failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		MyLogger.log.info("Test "+result.getName()+" skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
