package mBankingTestVIJComplete;

import static org.testng.Assert.assertTrue;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class SilentSMSTest extends AppiumController {
	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	//@Test(priority = 1)
	public void verifyTextDisplayed() throws InterruptedException
	{
		log.info("**********Verify the textView Notes**********");
		basePage = new BasePage(driver);
		String note= basePage.textviewNotes();
		if("Click here to verify your mobile number by sending an SMS.".equals(note))
		{
			assertTrue(true);	
		}else{
			assertTrue(false);
		}
		log.info("***************End***************");
	}
	
	//@Test(priority = 2)
	public void silentSMS() throws InterruptedException
	{
		log.info("**********Silent SMS Registration**********");
		basePage = new BasePage(driver);
		basePage.silentSMS();
		log.info("***************End***************");
	}
}




















