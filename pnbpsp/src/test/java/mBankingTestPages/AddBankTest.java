package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.BasePage;

public class AddBankTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	
	@Test(priority = 1)
	public void AddBankValid() throws InterruptedException
	{
		log.info("**********Add Bank**********");
		loginPage = new BasePage(driver);
		loginPage.addBank("Sarva UP Gramin Bank");
		log.info("***************End***************");
	}
	
	@Test(priority = 2)
	public void AddBankAlreadyAdded() throws InterruptedException
	{
		log.info("**********Add Bank Already Added**********");
		loginPage = new BasePage(driver);
		loginPage.addBank("Sarva UP Gramin Bank");
		log.info("***************End***************");
	}
	
	@Test(priority = 2)
	public void AddBankAccNotExists() throws InterruptedException
	{
		log.info("**********Add Bank Acc Not Exists**********");
		loginPage = new BasePage(driver);
		loginPage.addBank("Sarva UP Gramin Bank");
		log.info("***************End***************");
	}

}
