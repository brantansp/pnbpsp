package mBankingTestVIJ;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingBaseFactory.ObjectRepository;
import mBankingPageObjectFactory.BasePage;

public class ParticipantsTest extends AppiumController {

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void viewParticipantsVirAdd()
	{
		log.info("**********Add participants Virtual Address**********");
		waitForTextView("Participants");
		clickTextView("Participants");
		waitForTextView("VIEW CONTACTS");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[1]);
		clickBtn("SUBMIT");
		/**
		 * need to add
		 */
		log.info("***************End***************");
	}
	
	@Test
	public void viewParticipantsAcIfsc()
	{
		log.info("**********Add participants Account IFSC**********");
		waitForTextView("Participants");
		clickTextView("Participants");
		waitForTextView("VIEW CONTACTS");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[2]);
		clickBtn("SUBMIT");
		/**
		 * need to add
		 */
		log.info("***************End***************");
	}
	
	@Test
	public void viewParticipantsAadNum()
	{
		log.info("**********Add participants Aadhar number**********");
		waitForTextView("Participants");
		clickTextView("Participants");
		waitForTextView("VIEW CONTACTS");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[3]);
		clickBtn("SUBMIT");
		/**
		 * need to add
		 */
		log.info("***************End***************");
	}
		
	@Test
	public void addParticipantsVirNo()
	{
		log.info("**********Add participants Virtual number**********");
		waitForTextView("Participants");
		click(ObjectRepository.addParticipant);
		waitForTextView("REGISTER CONTACT");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[1]);
		sendText(ObjectRepository.addParticipantVirAdd, "bran123@unbi");
		back();
		sendText(ObjectRepository.addParticipantVirAdd,"Brantan UNBI");
		log.info("***************End***************");
	}
	
	@Test
	public void addParticipantsAccNo()
	{
		log.info("**********Add participants Account number**********");
		waitForTextView("Participants");
		click(ObjectRepository.addParticipant);
		waitForTextView("REGISTER CONTACT");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[1]);
		sendText(ObjectRepository.addParticipantAddr, "bran123@unbi");
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName,"Brantan UNBI");
		click("SUBMIT");
		waitForBtn("OK");
		if("Your payee or payer has been registered successfully.".equals(loadTextView()[0]))
		{
			log.info("Your payee or payer has been registered successfully.");
			clickBtn("OK");
		}
		log.info("***************End***************");
	}
	
	@Test
	public void addParticipantsAadNo()
	{
		log.info("**********Add participants Account number**********");
		waitForTextView("Participants");
		click(ObjectRepository.addParticipant);
		waitForTextView("REGISTER CONTACT");
		clickTextView("Select Payment Address Type");
		clickTextView(loadTextView()[1]);
		sendText(ObjectRepository.addParticipantAddr, "bran123@unbi");
		back();
		sendText(ObjectRepository.addParticipantPayeeNickName,"Brantan UNBI");
		click("SUBMIT");
		waitForBtn("OK");
		if("Your payee or payer has been registered successfully.".equals(loadTextView()[0]))
		{
			log.info("Your payee or payer has been registered successfully.");
			clickBtn("OK");
		}
		log.info("***************End***************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
