package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.BasePage;

public class AddBankTest extends AppiumController {

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	
	@Test(priority = 1)
	public void AddBankValid() throws InterruptedException
	{
		log.info("**********Add Bank**********");
		basePage = new BasePage(driver);
		basePage.addBank(prop.getProperty("addBankValid"), prop.getProperty("addBankAccNo"));
		waitForTextView("VIRTUAL ADDRESS CREATION", 30);
		clickRadioBtn("Single use");
		sendText("Virtual Id","brantan1");
		//back();
/*		click(driver.findElement(By.id("com.fss.vijayapsp:id/spinner_for_psphandle")));
		clickTextView("@vijb");*/
		clickBtn("SUBMIT");
		waitForTextView("Virtual Address Created Successfully", 30);
		if(waitForTextView("Do you want to set UPI PIN now ?", 30))
		{
			clickBtn("NO");
		}
		log.info("***************End***************");
	}
	
	//@Test(priority = 2)
	public void AddBankAlreadyAdded() throws InterruptedException
	{
		log.info("**********Add Bank Already Added**********");
		basePage = new BasePage(driver);
		basePage.addBankForAccNo(prop.getProperty("addBankValid"), prop.getProperty("addBankAccNo"));
		log.info("***************End***************");
	}
	
	//@Test(priority = 3)
	public void AddBankAccNotExists() throws InterruptedException
	{
		log.info("**********Add Bank Acc Not Exists**********");
		basePage = new BasePage(driver);
		basePage.addBankForAccNo("Sarva UP Gramin Bank", prop.getProperty("addBankAccNo"));
		log.info("***************End***************");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
