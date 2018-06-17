package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingBaseFactory.ObjectRepository;
import mBankingPageObjectFactory.BasePage;

public class CollectMoneyTest extends AppiumController {

	/*
	 * ObjectRepository.expDate.sendKeys(Keys.chord(Keys.SHIFT,""));
	 */
	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;// = getDriver();
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void CollectMoneyVir1() throws InterruptedException {
		log.info("**********Collect Money using Virtual Address**********");
		basePage = new BasePage(driver);	
		clickTextView("Collect");
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinAccNo"));  //8237
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));  //brantan4710
		sendText("Type/Search Payer Address", prop.getProperty("addbankCreateVpaOnlyVPAOther")+"@vijb");   //pnbthanks
		back();
		sendText("Enter Amount", "100");
		back();
		click(ObjectRepository.expDate);   /* replace here  */
		Map<String, String> map = getCurrDate();
		Integer date = Integer.valueOf(map.get("date")) + 1;
		try {
			clickView(date.toString());
		} catch (Exception e) {
			clickView(map.get("date"));
		}
		clickBtn("OK");
		click(ObjectRepository.expTime);  /* replace here  */
		map.clear();
		map = getCurrTime();
		//pickDate(map.get("hour"));
		//pickDate(map.get("minute"));
		clickRadioBtn("AM");
		clickBtn("OK");
		clearText(ObjectRepository.payremark);
		sendText(ObjectRepository.payremark, "UPICOLMNYAPPR");
		back();
		clickBtn("SUBMIT");
		loadTextView();
		clickBtn("CONFIRM");
		waitForBtn("OK",50);
		if("The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.".equals(loadTextView()[0]))
		{
		   Assert.assertTrue(true);
		   prop.setProperty("collectMnyRmrkApprove", "UPICOLMNYAPPR");
		   clickBtn("OK");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("Actual is : "+loadTextView()[0]);
			log.info("Expected is : "+"The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.");
		}
		log.info("***************End***************");
	}

	@Test
	public void CollectMoneyVir2() throws InterruptedException {	
		log.info("**********Collect Money using Virtual Address**********");
		basePage = new BasePage(driver);	
		clickTextView("Collect");
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinAccNo"));
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));
		sendText("Type/Search Payer Address", prop.getProperty("addbankCreateVpaOnlyVPAOther")+"@vijb");
		back();
		sendText("Enter Amount", "100");
		back();
		click(ObjectRepository.expDate);  /* replace here  */
		Map<String, String> map = getCurrDate();
		Integer date = Integer.valueOf(map.get("date")) + 1;
		try {
			clickView(date.toString());
		} catch (Exception e) {
			clickView(map.get("date"));
		}
		clickBtn("OK");
		click(ObjectRepository.expTime);  /* replace here  */
		map.clear();
		map = getCurrTime();
		//pickDate(map.get("hour"));
		//pickDate(map.get("minute"));
		clickRadioBtn("AM");
		clickBtn("OK");
		clearText(ObjectRepository.payremark);
		sendText(ObjectRepository.payremark, "UPICOLMNYDECL");  /* replace here  */
		back();
		clickBtn("SUBMIT");
		loadTextView();
		clickBtn("CONFIRM");
		waitForBtn("OK",50);
		if("The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.".equals(loadTextView()[0]))
		{
		   Assert.assertTrue(true);
		   prop.setProperty("collectMnyRmrkDecline", "UPICOLMNYDECL");
		   clickBtn("OK");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("Actual is : "+loadTextView()[0]);
			log.info("Expected is : "+"The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.");
		}
		log.info("***************End***************");
	}

	@Test
	public void CollectMoneyVir3() throws InterruptedException {	
		log.info("**********Collect Money using Virtual Address**********");
		basePage = new BasePage(driver);	
		clickTextView("Collect");
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinAccNo"));
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("addBankCrVpaSePinVPA"));
		sendText("Type/Search Payer Address", prop.getProperty("addbankCreateVpaOnlyVPAOther")+"@vijb");
		back();
		sendText("Enter Amount", "100");
		back();
		click(ObjectRepository.expDate);  /* replace here  */
		Map<String, String> map = getCurrDate();
		Integer date = Integer.valueOf(map.get("date")) + 1;
		try {
			clickView(date.toString());
		} catch (Exception e) {
			clickView(map.get("date"));
		}
		clickBtn("OK");
		click(ObjectRepository.expTime);  /* replace here  */
		map.clear();
		map = getCurrTime();
		//pickDate(map.get("hour"));
		//pickDate(map.get("minute"));
		clickRadioBtn("AM");
		clickBtn("OK");
		clearText(ObjectRepository.payremark);
		sendText(ObjectRepository.payremark, "UPICOLMNYDEFR");  /* replace here  */
		back();
		clickBtn("SUBMIT");
		loadTextView();
		clickBtn("CONFIRM");
		waitForBtn("OK",50);
		if("The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.".equals(loadTextView()[0]))
		{
		   Assert.assertTrue(true);
		   prop.setProperty("collectMnyRmrkDefer", "UPICOLMNYDEFR");
		   clickBtn("OK");
		}
		else
		{
			Assert.assertTrue(false);
			log.info("Actual is : "+loadTextView()[0]);
			log.info("Expected is : "+"The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.");
		}
		log.info("***************End***************");
	}

	/*
	 * collect money without bank acc
	 */
	// Transactions cannot be performed without registering your bank account to
	// the app. Please register your bank account to perform transactions.
}
