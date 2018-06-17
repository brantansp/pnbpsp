package mBankingTestVIJComplete;

import static org.testng.Assert.assertTrue;

import java.lang.invoke.MethodHandles;
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
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.BasePage;

public class AddBankTest extends AppiumController {

	/*
	 * getSize() - Dimension (Width,Height)
	 * getLocation() - Point (x,y)
	 */
	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	String vpa;

	@Test(groups = { "positive" })
	public void AddbankOnly() {
		log.info("**********Add Bank only Transaction**********");
		log.info("Test Case ID : "+TCID);
		basePage = new BasePage(getDriver());
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValid"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("addBankOnlyAccNo", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();
		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info("Test case passed : "+status[1]);
			clickBtn("OK");
			back();
			back();
			Assert.assertTrue(true);
		} else {
			log.info("Expected is : Your bank account has been registered successfully. Please create a virtual address before performing any transactions.");
			log.info("Actual is : "+status[1]); 
			Assert.assertTrue(false);
		}
	}

	@Test(groups = { "positive" })
	public void AddbankCreateVpaOnly() {
		log.info("**********Add Bank Create VPA Only**********");
		basePage = new BasePage(getDriver());
		// waitForTextView ("Add Bank A/C" , 30);
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValid"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("addbankCreateVpaOnlyAccNo", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();

		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info(status[1]);
			clickBtn("OK");
			clickRadioBtn("Single use");
			basePage.selectVirTimeLimit("2019", "25", "Jun");
			basePage.setVirAmtLimit("1000");
			back();
			Random random = new Random();
			vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			prop.setProperty("addbankCreateVpaOnlyVPA", vpa);
			sendText("Virtual Id", vpa);
			click(ObjectRepository.submit);
			status = loadTextView();
			if ("Virtual Address Created Successfully".equals(status[0])) {
				clickBtn("NO");
				log.info("Test case passed : "+status[0]);
				Assert.assertTrue(true);
			} else {
				log.info("Expected is : Virtual Address Created Successfully");
				log.info("Actual is : "+status[0]);
				Assert.assertTrue(false);
			}
		}

		log.info("***************End***************");
	}

	@Test(groups = { "positive" })
	public void AddBankCreateVpaSetPin() throws InterruptedException {
		log.info("**********Add Bank Create VPA Set Pin in Add bank**********");
		basePage = new BasePage(getDriver());
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValid"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("addBankCrVpaSePinAccNo", accounts[1].substring(16, 20));
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
			vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			prop.setProperty("addBankCrVpaSePinVPA", vpa);
			sendText("Virtual Id", vpa);
			//click(ObjectRepository.submit);
			clickBtn("SUBMIT");
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
				waitForTextView("ENTER OTP", 30);
				Dimension windowSize = getDriver().manage().window().getSize();
				try {
			        waitForBtnToInvisible("Detecting OTP",50);
					// waitForElement (ObjectRepository.otpTickImg, 50 );
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText(prop.getProperty("NPCIPin"));
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
					NPCIEnterText(prop.getProperty("NPCIPin"));
					Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
				} catch (Exception e) {
					log.info(e);
					Assert.assertTrue(false);
				}
				waitForBtn("OK", 30);
				status = loadTextView();
				if ("UPI PIN created successfully.".equals(status[0])) {
					log.info("UPI PIN created successfully.");
					clickBtn("OK");
					Assert.assertTrue(true);
				} else {
					Assert.assertTrue(false);
				}
			} else {
				Assert.assertTrue(false);
			}
		} else {
			back();
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	//@Test(dependsOnMethods = "AddBankCreateVpaSetPin", groups = { "negative" }) //cannot be tested in Simulator
	public void AddBankAlreadyAdded() throws InterruptedException {
		log.info("**********Add Bank Already Added**********");
		basePage = new BasePage(getDriver());
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValid"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		waitForTextView("Select Your Account", 30);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
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
			//Random random = new Random();
			//vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			sendText("Virtual Id", prop.getProperty("addBankCrVpaSePinAccNo"));
			//click(ObjectRepository.submit);
			clickBtn("SUBMIT");
			waitForBtn("OK", 30);
			status = loadTextView();
			if ("Virtual address provided is already in use. Please enter a different virtual address."
					.equals(status[0])) {
				clickBtn("OK");
				back();
				back();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		log.info("***************End***************");
	}

	@Test(groups = { "negative" })
	public void AddBankAccNotExists() throws InterruptedException {
		log.info("**********Add Bank Acc Not Exists**********");
		basePage = new BasePage(getDriver());
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", "Union Bank of India");
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		sleep(5000);
		// waitForTextView("ACCOUNT DOES NOT EXIST (REMITTER)", 30);
		String[] status = loadTextView();
		if ("ACCOUNT DOES NOT EXIST (REMITTER)".equals(status[0])) {
			clickBtn("OK");
			back();
			Assert.assertTrue(true);
		}
		log.info("***************End***************");
	}
	
	@Test(groups = { "positive" })
	public void AddbankCreateVpaOnlyOtherBank() {
		log.info("**********Add Bank Create VPA Only Other bank**********");
		basePage = new BasePage(getDriver());
		// waitForTextView ("Add Bank A/C" , 30);
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 50);
		sendText("Search/Select your bank", prop.getProperty("addBankValidOther"));
		int[] coords = getxyEditBox();
		TapinBankName(coords, 100, 100);
		clickTextView("Select Your Account");
		String[] accounts = loadTextView();
		clickTextView(accounts[1]);
		prop.setProperty("addbankCreateVpaOnlyAccNoOther", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();

		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info(status[1]);
			clickBtn("OK");
			clickRadioBtn("Single use");
			basePage.selectVirTimeLimit("2019", "25", "Jun");
			basePage.setVirAmtLimit("1000");
			back();
			Random random = new Random();
			vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			prop.setProperty("addbankCreateVpaOnlyVPAOther", vpa);
			sendText("Virtual Id", vpa);
			//click(ObjectRepository.submit);
			clickBtn("SUBMIT");
			status = loadTextView();
			if ("Virtual Address Created Successfully".equals(status[0])) {
				clickBtn("NO");
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		log.info("***************End***************");
	}

}
