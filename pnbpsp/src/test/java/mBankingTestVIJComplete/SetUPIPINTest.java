package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.*;

public class SetUPIPINTest extends AppiumController {

	protected BasePage basePage;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	@Test
	public void setUPIPIN() throws InterruptedException
	{
		log.info("**********Set UPI PIN**********");
		basePage = new BasePage(driver);
		//loginPage.setPIN("123456", "10", "20", "123456", "123456", "");
		clickTextView("Set UPI PIN");
		clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankOnlyAccNo"));
		sendText("xxxxxx",prop.getProperty("debitCardNo"));
		clickTextView("mm/yy");
		basePage.selectExpDate("2020", "Jul");
		clickBtn("SUBMIT");
        waitForTextView("ENTER OTP",30);
       // waitForImageView(ObjectRepository.otpTickImgS,50);
        waitForBtnToInvisible("Detecting OTP",50);
        Dimension windowSize = getDriver().manage().window().getSize();
        Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCIPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		NPCIEnterText(prop.getProperty("NPCIPin"));
		Tap(windowSize.getWidth() - 100, windowSize.getHeight() - 100);
		waitForBtn("OK", 50);
		if ("UPI PIN created successfully.".equals(loadTextView()[0])) {
			log.info(loadTextView()[0]);
			Assert.assertTrue(true);
			prop.setProperty("NPCIPin", "NPCIPin");
			clickBtn("OK");
		} else {
			Assert.assertTrue(false);
		}
        log.info("***************End***************");
	}

}
