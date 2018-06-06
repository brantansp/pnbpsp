package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class PendingApprovalTest extends AppiumController{

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void pendingApprovalApprove()
	{
		log.info("**********Pending Approval**********");
		waitForTextView("Pending Approval");
		clickTextView("Pending Approval");
		waitForTextView("PENDING APPROVAL");
		loadTextView();
        clickTextView("814510888128");	
        loadTextView();
        clickBtn("APPROVE");
        waitForTextView("PENDING APPROVAL");
        sendText("****","1234");
        clickBtn("YES");
		log.info("***************End***************");
	}
	
	@Test
	public void pendingApprovalDecline()
	{
		log.info("**********Pending Approval**********");
		waitForTextView("Pending Approval");
		clickTextView("Pending Approval");
		waitForTextView("PENDING APPROVAL");
		loadTextView();
        clickTextView("814510888128");
        loadTextView();
        clickBtn("DECLINE");
        waitForTextView("PENDING APPROVAL");
        clickBtn("YES");
        waitForBtn("OK");
        log.info(loadTextView()[0]);
		log.info("***************End***************");
	}
	
	@Test
	public void pendingApprovalDefer()
	{
		log.info("**********Pending Approval**********");
		waitForTextView("Pending Approval");
		clickTextView("Pending Approval");
		waitForTextView("PENDING APPROVAL");
		loadTextView();
        clickTextView("814510888128");	
        clickBtn("DEFER");
        /**
         * need to complete
         */
		log.info("***************End***************");
	}
	
	@Test
	public void pendingApprovalBlock()
	{
		log.info("**********Pending Approval**********");
		waitForTextView("Pending Approval");
		clickTextView("Pending Approval");
		waitForTextView("PENDING APPROVAL");
		loadTextView();
        clickTextView("814510888128");	
        clickTextView("BLOCK");
        /**
         * need to complete
         */
		log.info("***************End***************");
	}
}
