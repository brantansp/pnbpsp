package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class ChangePinTest extends AppiumController {

	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	String vpa;

	/**
	 * change pin without add bank
	 * 
	 * @throws InterruptedException
	 */
	// Transactions cannot be performed without registering your bank account to
	// the app. Please register your bank account to perform transactions.

	@Test(priority = 0)
	public void ChangePINWhenVPANotCreated() throws InterruptedException {
		
/*		prop.setProperty("addBankOnlyAccNo", "5491");  // vpa not set
		prop.setProperty("addbankCreateVpaOnlyAccNo", "6850");  //pin not set acc
		prop.setProperty("addBankCrVpaSePinAccNo", "6673");  // pin set acc
		prop.setProperty("NPCIPin", "4567");*/
		
		log.info("**********Change PIN When VPA Not Created**********");
		basePage = new BasePage(driver);
		Dimension windowSize = getDriver().manage().window().getSize();
		clickTextView("Change UPI PIN");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankOnlyAccNo"));
		waitForTextView("XXXXXXXXXXX" + prop.getProperty("addBankOnlyAccNo"));
		windowSize = getDriver().manage().window().getSize();
		NPCIEnterText(prop.getProperty("NPCIPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCINewPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCINewPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		waitForBtn("OK", 50);
		if ("You cannot perform transactions as a virtual address has not been created for the selected account. Create a virtual address for the account to proceed further."
				.equals(loadTextView()[0])) {
			log.info(loadTextView()[0]);
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	

	@Test(priority = 1)
	public void ChangePinWhenUPIPinNotAvailable() throws InterruptedException {
		log.info("**********Change Pin When UPI Pin Not Available**********");
		basePage = new BasePage(driver);
		clickTextView("Change UPI PIN");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addbankCreateVpaOnlyAccNo"));
		waitForTextView("XXXXXXXXXXX"+prop.getProperty("addbankCreateVpaOnlyAccNo"));
		Dimension windowSize = getDriver().manage().window().getSize();
		NPCIEnterText(prop.getProperty("NPCIPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCINewPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCINewPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		waitForBtn("OK", 50);
		if ("UPI PIN not available for the selected account.".equals(loadTextView()[0])) {
			log.info(loadTextView()[0]);
			Assert.assertTrue(true);
			clickBtn("OK");
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
}

	@Test(priority = 2)
	public void ChangePinInvalidNPCIPIN() throws InterruptedException {
		log.info("**********Change Pin Invalid UPI PIN**********");
		basePage = new BasePage(driver);
			clickTextView("Change UPI PIN");
			clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
			waitForTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
			Dimension windowSize = getDriver().manage().window().getSize();
			NPCIEnterText("0000 ");
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			NPCIEnterText(prop.getProperty("NPCINewPin"));
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			NPCIEnterText(prop.getProperty("NPCINewPin"));
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			waitForBtn("OK", 50);
			if ("INVALID UPI PIN".equals(loadTextView()[0])) {
				log.info(loadTextView()[0]);
				Assert.assertTrue(true);
				clickBtn("OK");
			} else {
				Assert.assertTrue(false);
			}
			log.info("***************End***************");
		}
	
	@Test(priority = 3)
	public void ChangePinValid() throws InterruptedException {
		log.info("**********Change Pin valid**********");
		basePage = new BasePage(driver);
			clickTextView("Change UPI PIN");
			clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
			waitForTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
			Dimension windowSize = getDriver().manage().window().getSize();
			NPCIEnterText(prop.getProperty("NPCIPin"));
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			NPCIEnterText(prop.getProperty("NPCINewPin"));
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			NPCIEnterText(prop.getProperty("NPCINewPin"));
			Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
			waitForBtn("OK", 50);
			if ("UPI PIN has been updated successfully.".equals(loadTextView()[0])) {
				log.info(loadTextView()[0]);
				Assert.assertTrue(true);
				prop.setProperty("NPCIPin", "NPCINewPin");
				clickBtn("OK");
			} else {
				Assert.assertTrue(false);
			}
			log.info("***************End***************");
		}
	

}
