package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class PayMoneyTest extends AppiumController {

	protected BasePage loginPage;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	
	@Test (priority = 0)
	public void PayMoneyVir() throws InterruptedException
	{
		log.info("**********Pay Money using Virtual Address**********");
		clickTextView("Pay");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankCrVpaSePinAccNo"));
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));
		clickTextView("- Select -");
		clickTextView("Virtual Address");   //Account Number + IFSC  //Aadhaar Number
		sendText("Enter Virtual Addr", prop.getProperty("addbankCreateVpaOnlyVPAOther")+"@vijb");
		back();
		sendText("Enter Amount", prop.getProperty("pMnyAmt"));
		back();
		/*sendText("UPI", "Remark Pay Vir Add");*/
		clickBtn("SUBMIT");
		waitForBtn("CONFIRM");
		//loadTextView();
		clickBtn("CONFIRM");
		sendText("****", prop.getProperty("NPCIPin"));
		clickBtn("SEND MONEY");
		waitForBtn("OK");
		if("Your transaction has been completed successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}

	@Test(priority = 1)
	public void PayMoneyIFSC() throws InterruptedException
	{
		log.info("**********Pay Money using Account & IFSC**********");
		clickTextView("Pay");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankCrVpaSePinAccNo"));
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));
		clickTextView("- Select -");
		clickTextView("Account Number + IFSC");   //Account Number + IFSC  //Aadhaar Number
        sendText("Enter Acc No", prop.getProperty("pMnyOtrAccNo"));
        back();
        sendText("IFSC",prop.getProperty("pMnyOtrIfsc"));
        back();
        sendText("Enter Amount", prop.getProperty("pMnyAmt"));
        back();
        clickBtn("SUBMIT");
		clickBtn("CONFIRM");
		sendText("****", prop.getProperty("NPCIPin"));
		clickBtn("SEND MONEY");
		waitForBtn("OK");
		if("Your transaction has been complted successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}
	
	@Test(priority = 2)
	public void PayMoneyAad() throws InterruptedException
	{
		log.info("**********Pay Money using Aadhar number**********");
		clickTextView("Pay");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankCrVpaSePinAccNo"));
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));
		clickTextView("- Select -");
		clickTextView("Aadhaar Number");   //Account Number + IFSC  //Aadhaar Number
		//sleep(2000);
		sendText("Enter Aadhaar No", "704535226825");
		back();
		clickTextView("BankName");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			do {
			try {
			driver.findElement(By.xpath("//android.widget.TextView[@text='"+prop.getProperty("pMnyOtrAadBank")+"']")).click();
			break;
					} catch (Exception e) {
						log.info("Scrolling");
						Dimension dimensions = driver.manage().window().getSize();
						Double screenHeightStart = dimensions.getHeight() * 0.5;
						int scrollStart = screenHeightStart.intValue();
						Double screenHeightEnd = dimensions.getHeight() * 0.2;
						int scrollEnd = screenHeightEnd.intValue();
						driver.swipe(0, scrollStart, 0, scrollEnd, 2000);	
					}
				} while (true);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		sendText("Enter Amount", "100");
		back();
		sendText("UPI", "Remark Pay Vir Add");
		clickBtn("SUBMIT");
		waitForBtn("CONFIRM");
		loadTextView();
		clickBtn("CONFIRM");
		waitForEditText("****");
		sendText("****", prop.getProperty("NPCIPin"));
		clickBtn("SEND MONEY");
		waitForBtn("OK");
		if("Your transaction has been complted successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			log.info("Actual Response is : "+loadTextView()[0] );
			log.info("Expected is : Your transaction has been complted successfully.");
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
