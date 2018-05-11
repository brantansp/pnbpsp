package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class PayMoneyTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); 
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		log.info("**********Login to application**********");
		loginPage = new BasePage(driver);
        
        log.info("***************End***************");
	}
	
	@Test(priority = 1)
	public void PayMoneyVir() throws InterruptedException
	{
		log.info("**********Pay Money using Virtual Address**********");
		loginPage = new BasePage(driver);
		loginPage.loginApp("111111");
        loginPage.PayMoneyVir("brantan@ybl", "100", "Sanity test");
        log.info("***************End***************");
	}

	@Test(priority = 2)
	public void PayMoneyIFSC() throws InterruptedException
	{
		log.info("**********Pay Money using Account & IFSC**********");
		loginPage = new BasePage(driver);
        loginPage.PayMoneyIFSC("789452136521", "HDFC0000001", "100", "Sanity test");
        log.info("***************End***************");
	}
	
	@Test(priority = 3)
	public void PayMoneyAad() throws InterruptedException
	{
		log.info("**********Pay Money using Aadhar number**********");
		loginPage = new BasePage(driver);
        loginPage.PayMoneyAad("789546321452", "100", "Sanity test");
        loginPage.exitapp();
        log.info("***************End***************");
	}
	
}
