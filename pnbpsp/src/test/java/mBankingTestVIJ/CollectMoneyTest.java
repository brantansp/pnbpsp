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

	@Test(priority = 1)
	public void CollectMoneyVir() throws InterruptedException
	{
		log.info("**********Collect Money using Virtual Address**********");
		loginPage = new BasePage(driver);
		loginPage.loginApp("111111");
        loginPage.CollectMoney("brantan@pnb", "100", "20", "9", "30", "AM", "Collect money");
        loginPage.exitapp();
        log.info("***************End***************");
	}
	
}
