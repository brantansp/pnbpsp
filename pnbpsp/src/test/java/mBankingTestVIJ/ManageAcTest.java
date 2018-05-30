package mBankingTestVIJ;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

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

public class ManageAcTest extends AppiumController {

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test
	public void generateQRforVirAdd()
	{
		log.info("**********Generate QR for Virtual Address**********");
         basePage =new BasePage(driver);
         waitForTextView("Manage A/C",30);
         clickTextView("Manage A/C");
         waitForTextView("VIEW BANK ACCOUNTS",10);
         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);
         ArrayList <MobileElement> arr=(ArrayList<MobileElement>) getDriver().findElements(By.id(ObjectRepository.qrImageView));
         click(arr.get(0));
         waitForTextView("QR Code Input Details (Optional)",10);
         sendText(ObjectRepository.qrTxnAmt, prop.getProperty("qrTxnAmt"));
         sendText(ObjectRepository.qrMinAmt, prop.getProperty("qrMinAmt"));
         sendText(ObjectRepository.qrRemark, prop.getProperty("qrRemark"));
         clickBtn(" GENERATE QR CODE ");
         waitForTextView("A/C Details", 10);
         screenShotThis("QR_TxnAmt_"+prop.getProperty("qrTxnAmt")+"_MinAmt_"+prop.getProperty("qrMinAmt")+"_Remark_"+prop.getProperty("qrRemark"));
         back();
         back();
         back();
         log.info("***************End***************");
	}
	
	@Test
	public void editVirAddress()
	{
		log.info("**********Edit Virtual Address valid**********");
         basePage =new BasePage(driver);
         waitForTextView("Manage A/C",30);
         clickTextView("Manage A/C");
         waitForTextView("VIEW BANK ACCOUNTS",10);
         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);
         ArrayList <MobileElement> arr=(ArrayList<MobileElement>) getDriver().findElements(By.id(ObjectRepository.qrEditImage));
         click(arr.get(0));
         clickBtn("YES");
         clickRadioBtn("Single use");
         clickCheckBox("Expiry Date");
         basePage.selectVirTimeLimit("2018","25","May");
         clickCheckBox("Available limit");
     	basePage.setQrVirAmtLimit("100");
		back();
		click(ObjectRepository.submit);
		String [] status=loadTextView();
		if("Your virtual address has been updated successfully.".equals(status[0]))
		{
			clickBtn("OK");
			Assert.assertTrue(true);
		}
         log.info("***************End***************");
	}
	
	@Test
	public void deleteVirAddress()
	{
		log.info("**********Delete Virtual Address valid**********");
         basePage =new BasePage(driver);
         waitForTextView("Manage A/C",30);
         clickTextView("Manage A/C");
         waitForTextView("VIEW BANK ACCOUNTS",10);
         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
         ArrayList <MobileElement> arr=(ArrayList<MobileElement>) getDriver().findElements(By.id(ObjectRepository.qrDeleteImage));
         click(arr.get(0));
         clickBtn("YES");
 		String [] status=loadTextView();
 		if("Your virtual address has been deleted successfully.".equals(status[0]))
 		{
 			clickBtn("OK");
 			Assert.assertTrue(true);
 		}
          log.info("***************End***************");
	}
	
	@Test
	public void deleteBankAccount()
	{
		log.info("**********Delete Bank Account valid**********");
         basePage =new BasePage(driver);
         waitForTextView("Manage A/C",30);
         clickTextView("Manage A/C");
         waitForTextView("VIEW BANK ACCOUNTS",10);
         click(getDriver().findElement(By.xpath("//android.widget.LinearLayout[@index='0']")));
         waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
         click(ObjectRepository.viewEditProfile);
 		String [] status=loadTextView();
 		if("Are you sure want to delete the Regd Acc No?".equals(status[0]))
 		{
 	         clickBtn("YES");
 		}
 		
 		status=loadTextView();
 		if("Your bank account has been deleted successfully.".equals(status[0]))
 		{
 			clickBtn("OK");
 			Assert.assertTrue(true);
 		}
          log.info("***************End***************");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
