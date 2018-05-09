package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.*;

public class AddBankTest extends AppiumController {

	protected LoginPage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test(priority = 3)
	public void AddBankValid() throws InterruptedException
	{
		log.info("**********Add Bank**********");
		loginPage = new LoginPage(driver);
		loginPage.loginApp("123789");
		loginPage.addBank("Sarva UP Gramin Bank");
		log.info("***************End***************");
	}

}
