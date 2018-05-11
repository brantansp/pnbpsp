package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.*;


public class LoginPageTest extends AppiumController{

	protected BasePage loginPage;

    AppiumDriver<MobileElement> driver;// = getDriver(); ;
    
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test
	public void AppLogin() throws InterruptedException
	{
		log.info("**********Login to Application**********");
		loginPage = new BasePage(driver);
		loginPage.loginApp("111111");
		//Assert.assertTrue(loginPage.welcomeBankLogo.isDisplayed());
		log.info("***************End***************");
	}
	
	@Test
	public void AppExit() throws InterruptedException
	{
		log.info("**********Exit Application**********");
		loginPage = new BasePage(driver);
		loginPage.exitApp();
		log.info("***************End***************");
	}
	

}
