package mBankingTestVIJ;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class CollectMoneyTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); 
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void CollectMoneyVir() throws InterruptedException
	{
		log.info("**********Collect Money using Virtual Address**********");
		loginPage = new BasePage(driver);
        loginPage.CollectMoney("brantan@pnb", "100", "20", "9", "30", "AM", "Collect money");
        loginPage.exitapp();
        log.info("***************End***************");
	}
	
	/*
	 * collect money without bank acc
	 */
//Transactions cannot be performed without registering your bank account to the app. Please register your bank account to perform transactions.
}
