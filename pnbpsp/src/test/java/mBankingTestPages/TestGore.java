package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class TestGore extends AppiumController {
	protected BasePage basePage;
    AppiumDriver<MobileElement> driver= getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
		
	@Test(priority = 1)
	public void silentSMS() throws InterruptedException
	{
		log.info("**********Registration**********");
	    sleep(10000);
        getDriver().closeApp();
        log.info("Loading app");
        getDriver().launchApp();
		log.info("***************End***************");
	}
}




















