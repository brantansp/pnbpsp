package mBankingTestVIJ;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
	public void BalanceEnquiryValid() throws InterruptedException
	{
		log.info("**********Balance Enquiry Valid**********");
		loginPage = new BasePage(driver);
		//loginPage.viewBalance();
		waitForTextView("View Balance");
		clickTextView("View Balance");
		waitForTextView("BALANCE ENQUIRY");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));
		waitForTextView("UPI PIN");
		sendText("****","1234");
		clickBtn("SUBMIT");
		waitForBtn("OK");
		String bal =loadTextView()[0];
		 log.info("Ledger Bal : "+bal.substring(bal.lastIndexOf("Ledger")+18, bal.lastIndexOf("Available")));
		 log.info("Available Bal : "+bal.substring(bal.lastIndexOf("Available")+21, bal.length()));
		 clickBtn("OK");
        log.info("***************End***************");
	}

}
