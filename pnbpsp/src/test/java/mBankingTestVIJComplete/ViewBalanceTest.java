package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class ViewBalanceTest extends AppiumController {

	protected BasePage loginPage;
	AppiumDriver<MobileElement> driver;// = getDriver();
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void BalanceEnquiryValid() throws InterruptedException {
		log.info("**********Balance Enquiry Valid**********");
		loginPage = new BasePage(driver);
		waitForTextView("View Balance");
		clickTextView("View Balance");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
		sendText("****", prop.getProperty("NPCIPin"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		String bal;
		try {
			bal = loadTextView()[0];
			log.info("Ledger Bal : " + bal.substring(bal.lastIndexOf("Ledger") + 18, bal.lastIndexOf("Available")));
			log.info("Available Bal : " + bal.substring(bal.lastIndexOf("Available") + 21, bal.length()));
			clickBtn("OK");
			Assert.assertTrue(true);
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test
	public void BalanceEnquiryInValidNPCIPin() throws InterruptedException {
		log.info("**********Balance Enquiry Invalid NPCI PIN**********");
		loginPage = new BasePage(driver);
		waitForTextView("View Balance");
		clickTextView("View Balance");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
		sendText("****", "0001");
		clickBtn("SUBMIT");
		waitForBtn("OK");
		String bal;
		bal = loadTextView()[0];
		if (loadTextView()[0].contains("The UPI PIN is incorrect")) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test
	public void BalanceEnquiryPinNotConfigured() throws InterruptedException {
		log.info("**********Balance Enquiry wne the PIN is not configured**********");
		loginPage = new BasePage(driver);
		waitForTextView("View Balance");
		clickTextView("View Balance");
		clickTextView("XXXXXXXXXXX" + prop.getProperty("addBankCrVpaSePinAccNo"));
		sendText("****", prop.getProperty("NPCIPin"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		String bal;
		bal = loadTextView()[0];
		if (loadTextView()[0].contains("UPI PIN is not configured for the selected account")) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}
	// UPI PIN is not configured for the selected account. You must configure
	// UPI PIN for the account before performing any transactions.

	// The UPI PIN is incorrect. Kindly enter the correct UPI PIN.You have 2
	// retry attempt(s) left before your account gets locked.

}
