package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class PayMoneyTest extends AppiumController {

	protected BasePage loginPage;
    AppiumDriver<MobileElement> driver;// = getDriver(); 
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	
	@Test
	public void PayMoneyVir() throws InterruptedException
	{
		log.info("**********Pay Money using Virtual Address**********");
		loginPage = new BasePage(driver);
        //loginPage.PayMoneyVir("brantan@ybl", "100", "Sanity test");
		waitForTextView("Pay");
		clickTextView("Pay");
		waitForTextView("SEND MONEY");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));
		waitForTextView("VIRTUAL ADDRESS LIST");
		clickTextView("usb@vijb");
		waitForTextView("SEND MONEY");
		clickTextView("- Select -");
		clickTextView("Virtual Address");   //Account Number + IFSC  //Aadhaar Number
		waitForEditText("Enter Virtual Addr");
		sendText("Enter Virtual Addr", "bran@punbupi");
		sendText("Enter Amount", "100");
		back();
		sendText("UPI", "Remark Pay Vir Add");
		clickBtn("SUBMIT");
		waitForBtn("CONFIRM");
		loadTextView();
		clickBtn("CONFIRM");
		waitForEditText("****");
		sendText("****","1234");
		back();
		clickBtn("SEND MONEY");
		waitForBtn("ok");
		if("Your transaction has been complted successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}

	@Test
	public void PayMoneyIFSC() throws InterruptedException
	{
		log.info("**********Pay Money using Account & IFSC**********");
		loginPage = new BasePage(driver);
       // loginPage.PayMoneyIFSC("789452136521", "HDFC0000001", "100", "Sanity test");
		waitForTextView("Pay");
		clickTextView("Pay");
		waitForTextView("SEND MONEY");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));
		waitForTextView("VIRTUAL ADDRESS LIST");
		clickTextView("usb@vijb");
		waitForTextView("SEND MONEY");
		clickTextView("- Select -");
		clickTextView("Account Number + IFSC");   //  //Aadhaar Number
		waitForEditText("Enter Acc No");
		sendText("Enter Acc No", "133101021000828");
		back();
		sendText("IFSC", "VIJB0001331");
		back();
		sendText("Enter Amount", "100");
		back();
		sendText("UPI", "Remark Pay Vir Add");
		clickBtn("SUBMIT");
		waitForBtn("CONFIRM");
		loadTextView();
		clickBtn("CONFIRM");
		waitForEditText("****");
		sendText("****","1234");
		back();
		clickBtn("SEND MONEY");
		waitForBtn("ok");
		if("Your transaction has been complted successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}
	
	@Test
	public void PayMoneyAad() throws InterruptedException
	{
		log.info("**********Pay Money using Aadhar number**********");
		loginPage = new BasePage(driver);
        //loginPage.PayMoneyAad("789546321452", "100", "Sanity test");
		waitForTextView("Pay");
		clickTextView("Pay");
		waitForTextView("SEND MONEY");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankAccNo"));
		waitForTextView("VIRTUAL ADDRESS LIST");
		clickTextView("usb@vijb");
		waitForTextView("SEND MONEY");
		clickTextView("- Select -");
		clickTextView("Aadhaar Number");   // 
		waitForEditText("Enter Aadhar No");
		sendText("Enter Aadhar No", "704535226825");
		back();
		clickTextView("BankName");
		boolean flag= true;
		String bankName="Yes Bank";
		TouchActions action = new TouchActions(getDriver());
		flag = scrollToElement("//android.widget.EditText[@text='"+bankName+"'","");
        if(flag)
        {
    		clickTextView("Yes Bank");
        }
		sendText("Enter Amount", "100");
		back();
		sendText("UPI", "Remark Pay Vir Add");
		clickBtn("SUBMIT");
		waitForBtn("CONFIRM");
		loadTextView();
		clickBtn("CONFIRM");
		waitForEditText("****");
		sendText("****","1234");
		back();
		clickBtn("SEND MONEY");
		waitForBtn("ok");
		if("Your transaction has been complted successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
