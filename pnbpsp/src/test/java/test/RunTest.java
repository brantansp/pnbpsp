package test;

import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import mBankingUtilityCenter.MobileCapability;

public class RunTest {
	
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	protected static AndroidDriver<MobileElement>  driver;
	
	@BeforeSuite
	public void setup() throws MalformedURLException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability(MobileCapability.DEVICE_NAME, "Lenovo K8P");
		capabilities.setCapability(MobileCapability.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapability.PLATFORM_VERSION,"7.0");
		capabilities.setCapability(MobileCapability.UDID, "HKE7YGUA");
		capabilities.setCapability(MobileCapability.APP_PACKAGE, "com.fss.vijayapsp");
		capabilities.setCapability(MobileCapability.APP_ACTIVITY, "com.fss.controller.MainActivity");
		capabilities.setCapability(MobileCapability.NO_RESET, true);
		capabilities.setCapability("newCommandTimeout", 7200);
		String URL = "http://127.0.0.1:4723/wd/hub";
		driver = new AndroidDriver<MobileElement>(new URL(URL), capabilities);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	
	@AfterSuite
	public void tearDown()
	{
		
	}
}



































