package mBankingTestVIJ;

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
import mBankingBaseFactory.ObjectRepository;
import mBankingPageObjectFactory.BasePage;

public class ChangePinTest extends AppiumController {

	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	String vpa;
	
	/**
	 * change pin without add bank
	 * @throws InterruptedException
	 */
	//Transactions cannot be performed without registering your bank account to the app. Please register your bank account to perform transactions.
	
	@Test(priority = 0)
	public void ChangePINWhenVPANotCreated() throws InterruptedException {
		log.info("**********Change PIN When VPA Not Created**********");
		basePage = new BasePage(driver);
		Dimension windowSize = getDriver().manage().window().getSize();
		clickTextView("Change UPI PIN");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
		waitForTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
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
	public void ChangePinWithoutCreatingVirAddr() throws InterruptedException {
		log.info("**********Change Pin With out Creating Virtual Address**********");
		basePage = new BasePage(driver);
				
		clickTextView("Change UPI PIN");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankOnlyAccNo"));
		waitForTextView("XXXXXXXXXXX" + prop.getProperty("addBankOnlyAccNo"));

		Dimension windowSize = getDriver().manage().window().getSize();
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

	@Test(priority = 2)
	public void ChangePinWhenUPIPinNotAvailable() throws InterruptedException {
		log.info("**********Change Pin When UPI Pin Not Available**********");
		basePage = new BasePage(driver);
		
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValid"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("addBankAccNo", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();

		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info("Your bank account has been registered successfully");
			clickBtn("OK");
			clickRadioBtn("Single use");
			basePage.selectVirTimeLimit("2019", "25", "Jun");
			basePage.setVirAmtLimit("1000");
			back();
			Random random = new Random();
			vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			sendText("Virtual Id", vpa);
			click(ObjectRepository.submit);
			status = loadTextView();
			if ("Virtual Address Created Successfully".equals(status[0])) {
				clickBtn("NO");
			}
			
		clickTextView("Change UPI PIN");

		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));
		waitForTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));

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
}

}
