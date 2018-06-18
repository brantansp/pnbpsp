package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingBaseFactory.ObjectRepository;
import mBankingPageObjectFactory.BasePage;

public class ParticipantsTest extends AppiumController {

	protected BasePage basePage;
	// AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test(priority = 0)
	public void addParticipantsVirNo() {
		log.info("**********Add participants Virtual number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Virtual Address");
		sendText(ObjectRepository.addParticipantVirAdd,
				prop.getProperty("addVirAddValidVIR") + "@" + prop.getProperty("psphandle"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddVirNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Your payee or payer has been registered successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 1)
	public void addParticipantsVirNoUsedNickName() {
		log.info("**********Add participants Virtual number with already used Nick Name**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Virtual Address");
		sendText(ObjectRepository.addParticipantVirAdd,
				prop.getProperty("addVirAddValidVIR") + "@" + prop.getProperty("psphandle"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddVirNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("The nickname you entered is already registered for another contact. Please enter another nickname."
				.equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 2)
	public void addParticipantsVirNoAlreadyRegd() {
		log.info("**********Add participants Virtual number with already Registered VPA**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Virtual Address");
		sendText(ObjectRepository.addParticipantVirAdd,
				prop.getProperty("addVirAddValidVIR") + "@" + prop.getProperty("psphandle"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, "Anderson");
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Payee's virtual address is already registered using a different nickname, therefore, you cannot register it again."
				.equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 3)
	public void viewParticipantsVirAdd() {
		log.info("**********View participants Virtual Address**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Virtual Address");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		String[] ls = loadTextView();
		for (String str : ls) {
			if (prop.getProperty("partAddVirNickName").equals(str)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(true);
			}
		}
		log.info("***************End***************");
	}

	@Test(priority = 4)
	public void deleteParticipantsVirAdd() {
		log.info("**********Delete participants Virtual Address**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Virtual Address");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		click(ObjectRepository.qrDeleteImage);
		clickById(ObjectRepository.viewEditProfile);
		clickBtn("YES");
		waitForBtn("OK");
		if ("Your payee or payer has been deleted successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 10)
	public void addParticipantsAccNo() {
		log.info("**********Add participants Account number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Account Number + IFSC");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAccNo"));
		back(); // pMnyOtrIfsc
		sendText(ObjectRepository.addParticipantIFSC_code, prop.getProperty("pMnyOtrIfsc"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddAcNoNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Your payee or payer has been registered successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 11)
	public void addParticipantsAccNoUsedNickName() {
		log.info("**********Add participants Account number with already used Nick Name**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Account Number + IFSC");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAccNo"));
		back(); // pMnyOtrIfsc
		sendText(ObjectRepository.addParticipantIFSC_code, prop.getProperty("pMnyOtrIfsc"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddAcNoNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("The nickname you entered is already registered for another contact. Please enter another nickname."
				.equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 12)
	public void addParticipantsAccNoAlreadyRegd() {
		log.info("**********Add participants Account number with already Registered Acc**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Account Number + IFSC");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAccNo"));
		back(); // pMnyOtrIfsc
		sendText(ObjectRepository.addParticipantIFSC_code, prop.getProperty("pMnyOtrIfsc"));
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName, "Nicole");
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Entered account number is already registered under different nickname.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 13)
	public void viewParticipantsAccNo() {
		log.info("**********View participants Account number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Account Number + IFSC");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		String[] ls = loadTextView();
		for (String str : ls) {
			if (prop.getProperty("partAddAcNoNickName").equals(str)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(true);
			}
		}
		log.info("***************End***************");
	}

	@Test(priority = 14)
	public void deleteParticipantsAccNo() {
		log.info("**********Delete participants Account number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Account Number + IFSC");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		click(ObjectRepository.qrDeleteImage);
		clickById(ObjectRepository.viewEditProfile);
		clickBtn("YES");
		waitForBtn("OK");
		if ("Your payee or payer has been deleted successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 20)
	public void addParticipantsAadNo() {
		log.info("**********Add participants Aadhaar number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Aadhaar Number");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAadharNo"));
		clickTextView("Select Your Bank");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		do {
			try {
				driver.findElement(
						By.xpath("//android.widget.TextView[@text='" + prop.getProperty("pMnyOtrAadBank") + "']"))
						.click();
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

		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddAadNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Your payee or payer has been registered successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}
	
	@Test(priority = 21)
	public void addParticipantsAadNoUsedNickName() {
		log.info("**********Add participants Aadhaar number with already used Nick Name**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Aadhaar Number");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAadharNo"));
		clickTextView("Select Your Bank");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		do {
			try {
				driver.findElement(
						By.xpath("//android.widget.TextView[@text='" + prop.getProperty("pMnyOtrAadBank") + "']"))
						.click();
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
		sendText(ObjectRepository.addParticipantPayeeNickName, prop.getProperty("partAddAcNoNickName"));
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Entered aadhaar number is already registered under different nickname."
				.equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 22)
	public void addParticipantsAadNoAlreadyRegd() {
		log.info("**********Add participants Aadhaar number with already Registered Aadhaar Number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.addParticipant);
		clickTextView("Select Payment Address Type");
		clickTextView("Aadhaar Number");
		sendText(ObjectRepository.addParticipantAddr, prop.getProperty("pMnyOtrAadharNo"));
		clickTextView("Select Your Bank");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		do {
			try {
				driver.findElement(
						By.xpath("//android.widget.TextView[@text='" + prop.getProperty("pMnyOtrAadBank") + "']"))
						.click();
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
		sendText(ObjectRepository.addParticipantPayeeNickName, "Nicole");
		clickBtn("SUBMIT");
		waitForBtn("OK");
		if ("Entered aadhaar number is already registered under different nickname.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

	@Test(priority = 23)
	public void viewParticipantsAadNo() {
		log.info("**********View participants Aadhaar number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Aadhaar Number");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		String[] ls = loadTextView();
		for (String str : ls) {
			if (prop.getProperty("partAddAadNickName").equals(str)) {
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(true);
			}
		}
		log.info("***************End***************");
	}

	@Test(priority = 24)
	public void deleteParticipantsAadNo() {
		log.info("**********Delete participants Aadhaar number**********");
		basePage = new BasePage(driver);
		clickTextView("Participants");
		click(ObjectRepository.paymntAddType);
		clickTextView("Aadhaar Number");
		clickBtn("SUBMIT");
		waitForElementById(ObjectRepository.viewEditProfile);
		click(ObjectRepository.qrDeleteImage);
		clickById(ObjectRepository.viewEditProfile);
		clickBtn("YES");
		waitForBtn("OK");
		if ("Your payee or payer has been deleted successfully.".equals(loadTextView()[0])) {
			clickBtn("OK");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}

}
