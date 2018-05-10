package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.*;

public class SetUPIPINTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); 
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		log.info("**********Login to application**********");
		loginPage = new BasePage(driver);
        loginPage.loginApp("123789");
        log.info("***************End***************");
	}
	
	@Test(priority = 1)
	public void setUPIPIN() throws InterruptedException
	{
		log.info("**********Set UPI PIN**********");
		loginPage = new BasePage(driver);
		loginPage.setPIN("123456", "10", "20", "123456", "123456", "");
        log.info("***************End***************");
	}

	@Test(priority = 50)
	public void AppExit() throws InterruptedException
	{
		log.info("**********Exit Application**********");
		loginPage = new BasePage(driver);
		loginPage.exitapp();
		log.info("***************End***************");
	}
	
}
