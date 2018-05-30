package mBankingTestVIJ;

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

	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	String vpa;

	@Test(groups = { "positive" })
	public void AddbankOnly() {
		log.info("**********Add Bank only Transaction**********");
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
		prop.setProperty("addBankOnlyAccNo", accounts[1].substring(16, 20));
		clickBtn("SUBMIT");
		String[] status = loadTextView();
		if ("Your bank account has been registered successfully. Please create a virtual address before performing any transactions."
				.equals(status[1])) {
			log.info(status[1]);
			clickBtn("OK");
			back();
			back();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
        waitForTextView("Manage A/C",30);
        clickTextView("Manage A/C");
        waitForTextView("VIEW BANK ACCOUNTS",10);
        click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
        clickTextView("XXXXXXXXXXX"+accounts[1].substring(16, 20));
        waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
        click(ObjectRepository.viewEditProfile);
		String [] status1=loadTextView();
		if("Are you sure want to delete the Regd Acc No?".equals(status1[0]))
		{
	         clickBtn("YES");
	        clickBtn("OK");
		}
		
	}

	@Test(groups = { "positive" })
	public void AddbankCreateVpaOnly() {
		log.info("**********Add Bank Create VPA Set Pin in Add bank**********");
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
			sendText("Virtual Id", vpa);
			click(ObjectRepository.submit);
			status = loadTextView();
			if ("Virtual Address Created Successfully".equals(status[0])) {
				clickBtn("NO");
				Assert.assertTrue(true);
				
			} else {
				Assert.assertTrue(false);
			}
		}
        waitForTextView("Manage A/C",30);
        clickTextView("Manage A/C");
        waitForTextView("VIEW BANK ACCOUNTS",10);
        click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
        clickTextView("XXXXXXXXXXX"+accounts[1].substring(16, 20));
        waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
        click(ObjectRepository.viewEditProfile);
		String [] status1=loadTextView();
		if("Are you sure want to delete the Regd Acc No?".equals(status1[0]))
		{
	         clickBtn("YES");
	        clickBtn("OK");
		}
		
		log.info("***************End***************");
	}

	@Test(groups = { "positive" })
	public void AddBankCreateVpaSetPin() throws InterruptedException {
		log.info("**********Add Bank Create VPA Set Pin in Add bank**********");
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
		prop.setProperty("addBankAccNo", accounts[1].substring(16, 20));
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
			sendText("Virtual Id", vpa);
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
				waitForTextView("ENTER OTP", 30);
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
					Assert.assertTrue(true);
				}
				
		         waitForTextView("Manage A/C",30);
		         clickTextView("Manage A/C");
		         waitForTextView("VIEW BANK ACCOUNTS",10);
		         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
		         clickTextView("XXXXXXXXXXX"+accounts[1].substring(16, 20));
		         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
		         click(ObjectRepository.viewEditProfile);
		 		String [] status1=loadTextView();
		 		if("Are you sure want to delete the Regd Acc No?".equals(status1[0]))
		 		{
		 	         clickBtn("YES");
		 	        clickBtn("OK");
		 		}
			}
		}

		else if ("The mobile number and account are already registered.".equals(status[0])) {
			back();
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(dependsOnMethods = "AddBankCreateVpaSetPin", groups = { "negative" })
	public void AddBankAlreadyAdded() throws InterruptedException {
		log.info("**********Add Bank Already Added**********");
		basePage = new BasePage(driver);
		waitForTextView("Add Bank A/C", 30);
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 30);
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
			Random random = new Random();
			vpa = prop.getProperty("addAcVirValid") + random.nextInt(90) + 10;
			sendText("Virtual Id", vpa);
			click(ObjectRepository.submit);
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
			
	         waitForTextView("Manage A/C",30);
	         clickTextView("Manage A/C");
	         waitForTextView("VIEW BANK ACCOUNTS",10);
	         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
	         clickTextView("XXXXXXXXXXX"+accounts[1].substring(16, 20));
	         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
	         click(ObjectRepository.viewEditProfile);
	 		String [] status1=loadTextView();
	 		if("Are you sure want to delete the Regd Acc No?".equals(status1[0]))
	 		{
	 	         clickBtn("YES");
	 	        clickBtn("OK");
	 		}
		}
		log.info("***************End***************");
	}

	@Test(groups = { "negative" })
	public void AddBankAccNotExists() throws InterruptedException {
		log.info("**********Add Bank Acc Not Exists**********");
		waitForTextView("Add Bank A/C", 30);
		clickTextView("Add Bank A/C");
		waitForTextView("ADD BANK ACCOUNT", 30);
		sendText("Search/Select your bank", "Aditya Birla Idea");
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

}
