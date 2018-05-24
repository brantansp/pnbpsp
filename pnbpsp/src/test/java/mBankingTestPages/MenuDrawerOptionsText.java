package mBankingTestPages;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingBaseFactory.ObjectRepository;
import mBankingPageObjectFactory.BasePage;

public class MenuDrawerOptionsText extends AppiumController {

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	//@Test(priority=1)
	public void termsAndCondition()
	{
		log.info("**********Terms and conditions**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("Terms and Conditions");
		waitForElement(getDriver().findElement(By.id("com.android.chrome:id/security_button")),30);
		if ("https://www.vijayabank.com/Digital-Banking/UPI".equals(getText("android.widget.EditText")))
		{
			back();
			click(ObjectRepository.menuDrawer);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		log.info("***************End***************");
	}
	
	public void reportSpamBlock()
	{
		log.info("**********Report Spam Block VPA**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("Report Spam");
		waitForEditText("VPA Name",30);
		clickTextView("Block");
		sendText("VPA Name","brantan@ubi");
		if(loadButton().length==0)
		{
		back();
		}
		clickBtn("SUBMIT");
		/**
		 * Needs to be continued
		 */
		log.info("***************End***************");
	}
	
	//@Test
	public void reportSpamUnBlock()
	{
		log.info("**********Report Spam UnBlock VPA**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("Report Spam");
		waitForEditText("VPA Name",30);
		clickTextView("Unblock");
		/**
		 * Needs to be continued
		 */
		log.info("***************End***************");
	}
	
	//@Test
	public void faq()
	{
		log.info("**********FAQ**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("FAQ");
		/**
		 * Needs to be continued
		 */
		log.info("***************End***************");
	}
	
	//@Test
	public void complaintStatus()
	{
		log.info("**********Complaint Status**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("Complaint Status");
		waitForTextView("COMPLAINT STATUS");
		String [] texts = loadTextView();
		String today= texts[1].substring(0,2);
		int tdy = Integer.valueOf(today);
		int prev;
		if(tdy > 7 )
		{
			prev= tdy-6;
		} 
		else if(tdy > 1 )
		{
		    prev = 28;	
		}
		else
		{
			prev= tdy-1;
		}
			
		click(ObjectRepository.complainStartDate);
		clickView(String.valueOf(prev));
		clickBtn("OK"); 
        click(ObjectRepository.complainSubmit);
		//waitForElement(getDriver().findElement(By.xpath("//android.widget.Toast[1]")),30);
        sleep(300);
		screenShotThis("Complaint_Status");
		/* String text = getDriver().findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		 log.info("Toast appeared : "+text);
		*/
		back();
		click(ObjectRepository.menuDrawer);
		/**
		 * Needs to be continued
		 */
		log.info("***************End***************");
	}
	
	@Test
	public void deRegister()
	{
		log.info("**********De Register**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("De-Register");
		clickBtn("YES");
		waitForBtn("OK",30);
		if("You have been deregistered from the app successfully.".equals(loadTextView()[0]))
		{
		     log.info("You have been deregistered from the app successfully.");
		     clickBtn("OK");
		     Assert.assertTrue(true);
		}
		log.info("***************End***************");
	}
	
	//@Test
	public void changePassword()
	{
		log.info("**********Change Password**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		clickTextView("Change Password");
		sendText(ObjectRepository.changePwdOld, prop.getProperty("loginPin"));
		sendText(ObjectRepository.changePwdNew, prop.getProperty("loginNewPin"));
		sendText(ObjectRepository.changePwdCfm, prop.getProperty("loginNewPin"));
		clickBtn("SUBMIT");
		waitForBtn("OK",30);
		if("Your login password has been updated successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK");
			prop.setProperty("loginPin", prop.getProperty("loginNewPin"));
			Assert.assertTrue(true);
		}
		log.info("***************End***************");
	}
	
	//@Test
	public void editProfile()
	{
		log.info("**********Change Password**********");
		waitForElement(ObjectRepository.menuDrawer, 5);
		click(ObjectRepository.menuDrawer);
		click(ObjectRepository.editProfile);
		waitForElement(ObjectRepository.viewEditProfile, 30);
		click(ObjectRepository.viewEditProfile);
		clickBtn("YES");
		clickBtn("UPDATE");
		waitForBtn("OK",30);
		if("Your profile has been updated successfully.".equals(loadTextView()[0]))
		{
			clickBtn("OK"); 
			Assert.assertTrue(true);
		}
		log.info("***************End***************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
