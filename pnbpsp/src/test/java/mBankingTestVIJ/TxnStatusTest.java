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

public class TxnStatusTest extends AppiumController{

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test
	public void txnStatus()
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
