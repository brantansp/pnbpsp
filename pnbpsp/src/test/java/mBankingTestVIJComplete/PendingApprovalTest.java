package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.AppiumController;
import mBankingPageObjectFactory.BasePage;

public class PendingApprovalTest extends AppiumController {

	protected BasePage basePage;
	AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test(priority = 0)
	public void pendingApprovalDefer() {
		log.info("**********Pending Approval Defer**********");
		clickTextView("Pending Approval");
		try {
			waitForTextView(prop.getProperty("collectMnyRmrkDefer"), 10);
		} catch (Exception e) {
			log.info("scrolling down");
			verticalScrollDown();
		}
		clickTextView(prop.getProperty("collectMnyRmrkDefer"));
		clickBtn("DEFER");
		clickBtn("YES");
		waitForBtn("OK");
		if ("You have successfully deferred the Collect Money transaction. We will remind you about this transaction again later."
				.equals(loadTextView()[0])) {
			Assert.assertTrue(true);
			clickBtn("OK");
		} else {
			Assert.assertTrue(false);
		}
		/**
		 * need to complete
		 */
		log.info("***************End***************");
	}

	@Test(priority = 1)
	public void pendingApprovalDecline() {
		log.info("**********Pending Approval Decline**********");
		clickTextView("Pending Approval");
		try {
			waitForTextView(prop.getProperty("collectMnyRmrkDecline"), 10);
		} catch (Exception e) {
			log.info("scrolling down");
			verticalScrollDown();
		}
		clickTextView(prop.getProperty("collectMnyRmrkDecline"));
		clickBtn("DECLINE");
		clickBtn("YES");
		waitForBtn("OK");
		if("The Collect Money request has been declined successfully.".equals(loadTextView()[0]))
		{
			Assert.assertTrue(true);
			log.info(loadTextView()[0]);
			clickBtn("OK");
		}
		log.info("***************End***************");
	}

	@Test(priority = 2)
	public void pendingApprovalApprove() {
		log.info("**********Pending Approval Approve**********");
		clickTextView("Pending Approval");
		try {
			waitForTextView(prop.getProperty("collectMnyRmrkApprove"), 10);
		} catch (Exception e) {
			log.info("scrolling down");
			verticalScrollDown();
		}
		clickTextView(prop.getProperty("collectMnyRmrkApprove"));
		clickBtn("APPROVE");
		clickBtn("YES");
		sendText("****", "1234");
		clickBtn("YES");
		log.info("***************End***************");
	}

	// @Test
	public void pendingApprovalBlock() {
		log.info("**********Pending Approval Block**********");
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
