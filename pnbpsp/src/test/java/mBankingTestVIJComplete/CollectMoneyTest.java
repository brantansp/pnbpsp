package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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

	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;// = getDriver();
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void CollectMoneyVir() throws InterruptedException {
		log.info("**********Collect Money using Virtual Address**********");
		basePage = new BasePage(driver);
		
		/*
		 * Add bank for Payer
		 */
/*		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankPayer"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("cPayerAccNo", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();

		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info("Your bank account has been registered successfully");
			clickBtn("OK");
			clickRadioBtn("Single use");
			basePage.selectVirTimeLimit("2019", "25", "Jun");
			basePage.setVirAmtLimit("1000");
			back();
			Random random = new Random();
			String vpa = prop.getProperty("cPayerVirAddr") + random.nextInt(90) + 10;
			sendText("Virtual Id", vpa);
			prop.setProperty("cPayerVirAddr", vpa);
			click(ObjectRepository.submit);
			status = loadTextView();
			if ("Virtual Address Created Successfully".equals(status[0])) {
				clickBtn("YES");
				waitForTextView(accounts[1].substring(5, accounts[1].length()), 30);
				clickTextView(accounts[1].substring(5, accounts[1].length()));
				waitForTextView("MOBILE BANKING REGISTRATION / GENERATE PIN", 30);
				sendText("xxxxxx", "123569");
				clickTextView("mm/yy");
				basePage.selectExpDate("2020", "Jul");
				clickBtn("SUBMIT");
				waitForTextView("SET UPI PIN", 50);
				Dimension windowSize = getDriver().manage().window().getSize();
				try {
					sleep(30000);
					// waitForElement (ObjectRepository.otpTickImg, 50 );
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText("1234");
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText("1234");
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
				} catch (Exception e) {
					log.info(e);
				}
				waitForBtn("OK", 30);
				status = loadTextView();
				if ("UPI PIN created successfully.".equals(status[0])) {
					log.info("UPI PIN created successfully.");
					clickBtn("OK");
				}
			}
		}*/
		/*
		 *Add bank for Payee 
		 */
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankPayee"));
		int[] coords1 = getxyEditBox();
		TapinBankName(coords1, 100, 100);
		sleep(1500);
		clickTextView("Select Your Account");
		String[] accounts1 = loadTextView();
		clickTextView(accounts1[1]);
		prop.setProperty("cPayeeAccNo", accounts1[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status1 = loadTextView();

		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status1[1])) {
			log.info("Your bank account has been registered successfully");
			clickBtn("OK");
			clickRadioBtn("Single use");
			basePage.selectVirTimeLimit("2019", "25", "Jun");
			basePage.setVirAmtLimit("1000");
			back();
			Random random = new Random();
			String vpa = prop.getProperty("cPayeeVirAddr") + random.nextInt(90) + 10;
			sendText("Virtual Id", vpa);
			prop.setProperty("cPayeeVirAddr", vpa);
			click(ObjectRepository.submit);
			status1 = loadTextView();
			if ("Virtual Address Created Successfully".equals(status1[0])) {
				clickBtn("YES");
				waitForTextView(accounts1[1].substring(5, accounts1[1].length()), 30);
				clickTextView(accounts1[1].substring(5, accounts1[1].length()));
				waitForTextView("MOBILE BANKING REGISTRATION / GENERATE PIN", 30);
				sendText("xxxxxx", "123569");
				clickTextView("mm/yy");
				basePage.selectExpDate("2020", "Jul");
				clickBtn("SUBMIT");
				//waitForTextView("SET UPI PIN", 50);
				new WebDriverWait(getDriver(), 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.Widget.TextView[@text='SET UPI PIN']")));
				Dimension windowSize = getDriver().manage().window().getSize();
				try {
					sleep(30000);
					// waitForElement (ObjectRepository.otpTickImg, 50 );
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText("1234");
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText("1234");
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
				} catch (Exception e) {
					log.info(e);
				}
				waitForBtn("OK", 30);
				status1 = loadTextView();
				if ("UPI PIN created successfully.".equals(status1[0])) {
					log.info("UPI PIN created successfully.");
					clickBtn("OK");
				}
			}
		}
		/*
		 * collect Money
		 */

		//loginPage.CollectMoney("brantan@pnb", "100", "20", "9", "30", "AM", "Collect money");
		clickTextView("Collect");
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("cPayerAccNo"));
		clickTextView("- Select -");
		clickTextViewContains(prop.getProperty("cPayerVirAddr"));
		sendText("Type/Search Payer Address", prop.getProperty("cPayeeVirAddr")+"@vijb");
		back();
		sendText("Enter Amount", "100");
		back();
		click(ObjectRepository.expDate);
		Map<String, String> map = getCurrDate();
		Integer date = Integer.valueOf(map.get("date")) + 1;
		try {
			clickView(date.toString());
		} catch (Exception e) {
			clickView(map.get("date"));
		}
		clickBtn("OK");
		click(ObjectRepository.expTime);
		map.clear();
		map = getCurrTime();
		//pickDate(map.get("hour"));
		//pickDate(map.get("minute"));
		clickRadioBtn("AM");
		clickBtn("OK");
		sendText(ObjectRepository.payremark, "CollectMoneyVir");
		clickBtn("SUBMIT");
		loadTextView();
		clickBtn("CONFIRM");
		waitForBtn("OK",50);
		if("The Collect Money request has been initiated and a notification has been sent to the payer. Your transaction will be completed after the payer authorizes the request.".equals(loadTextView()[0]))
		{
		   Assert.assertTrue(true);
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
