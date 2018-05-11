package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class ChangePinTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); 
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test(priority = 1)
	public void ChangePinValid() throws InterruptedException
	{
		log.info("**********Change PIN**********");
		loginPage = new BasePage(driver);
		loginPage.loginApp("111111");
		loginPage.changePin("123456", "456789", "456789");
		loginPage.exitapp();
		log.info("***************End***************");
	}
	
}
