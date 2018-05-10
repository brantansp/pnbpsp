package mBankingPageObjectFactory;

import java.lang.invoke.MethodHandles;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mBankingBaseFactory.ObjectRepository;

public class BasePage extends ObjectRepository {
	
	public static AppiumDriver <MobileElement> driver = getDriver();
	
	public static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	public BasePage (AppiumDriver <MobileElement> driver) 
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()) , this);
	}
	
	public void loginApp(String pin) throws InterruptedException
	{
	    try {
			waitForElement (pwdBox, 30);
		} catch (Exception e) {
			log.info(e);
		}
		sendText(loginBox,pin);
		log.info("Login Pin send  : "+pin);
		
		boolean flag = true;
		while(flag)
		{
		try{
			waitForElement (submit, 30);
			flag = false;
		} catch (Exception e) {
			back();
		}
		}
		click(submit);
	}
	
	public void exitApp() throws InterruptedException
	{	
	    try {
			waitForElement (menuDrawer, 30);
		} catch (Exception e) {
			log.info(e);
		}
		click(menuDrawer);
		log.info("Clicked on Menu Drawer box");
		click(logoutBtn);
		log.info("Clicked on Logout button");
		click(yesBtn);
		log.info("Clicked on Yes button");
	}
	
	public void exitapp()
	{	
		boolean flag = true;
		while(flag)
		{
			log.info("entering loop");
	      try {
			  waitForElement (menuDrawer, 5);
			  flag = false;
		   } catch (Exception e) {
			  back();
			  flag = true;
				  if(isDisplayed(noBtn)==true)
				  {
					  log.info("No btn appeared");
				                    click(noBtn);
		          }
				  log.info(flag);
		}
		click(menuDrawer);
		log.info("Clicked on Menu Drawer box");
		click(logoutBtn);
		log.info("Clicked on Logout button");
		click(yesBtn);
		log.info("Clicked on Yes button");
		}
	}
	
	public void addBank(String bankName) throws InterruptedException
	{
	    try {
			waitForElement (addbankBtn, 30);
		} catch (Exception e) {
			log.info(e);
		}
		click(addbankBtn);
		
	    try {
			waitForElement (pageTitle, 30);
		} catch (Exception e) {
			log.info(e);
		}
	    //click(searchBankBox);
	    sendText(searchBankBox,bankName);
	    int [] coords =getxy(searchBankBox);
	    TapinBankName(coords);
	    Integer x=1;
	    while (waitForElement (yesBtn, 50))
	    {
	    	    log.info("Transaction timed out : " +x);
		    	click(yesBtn);
		    	click(searchBankBox);
			    coords =getxy(searchBankBox);
			    TapinBankName(coords);
			    x++;
			    if(x.equals(3))
			    {
			    	break;
			    }
	    }  
	    log.info("element found");
	}
	
	public void setPIN (String cardNo, String expMnth, String year, String OTP, String newpin, String repin)
	{
	    try {
			waitForElement (setPINBtn, 30);
		} catch (Exception e) {
			log.info(e);
		}
		click(setPINBtn);
		
		 try {
				waitForElement (pageTitle, 30);
			} catch (Exception e) {
				log.info(e);
			}

		 if(viewArrow.isDisplayed())
		 {
			 click(viewArrow);
			 try {
					waitForElement (pageTitle, 30);
				} catch (Exception e) {
					log.info(e);
				}
    		 sendText(debitCardBox, cardNo);
			 sendText(expMonthBox, expMnth);
			 sendText(expYearBox, year);
			 click(submitBtn);
			 
			 try {
					waitForElement (NFormTitle, 30);
				} catch (Exception e) {
					log.info(e);
				}
			 
			 Dimension windowSize = driver.manage().window().getSize();
			 if (isDisplayed(detectingOTP))
			 {
          		 try {
          			waitForElement (otpTickImg, 50 );
   				    Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
   				    NPCIEnterText(newpin);
   				    Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
   				    NPCIEnterText(repin);
   				    Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);	
 				} catch (Exception e) {
 					log.info(e);
 				}
			 }
			
			 if (isDisplayed(resendBtn))
			 {
				 NPCIEnterText(OTP);
				 Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
				 NPCIEnterText(newpin);
				 Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
				 NPCIEnterText(repin);
				 Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);	
			 }
		 }
	}

	public void viewBalance ()
	{
		clickTextView("View Balance");
	    try {
			waitForElement (pinacc, 30);
			click(pinacc);
		} catch (Exception e) {
			log.info(e);
		}
	}
	
	public void PayMoneyVir(String viradd, String amt, String remark)
	{
	    try {
			waitForElement (payMoney, 30);
			click(payMoney);
		} catch (Exception e) {
			log.info(e);
		}
	    
	    try {
			waitForElement (fromAccSpinner, 30);
			click(fromAccSpinner);
			log.info("Clicked on Transfer From Account");
			String [] options = loadTextView();
		    clickTextView(options[1]);
		    click(noBtn);
		} catch (Exception e) {
			log.info(e);
		} 
	    waitForElement (payeeAddSpinner, 30);
	    String [] options = loadTextView();
	    clickTextView(options[1]);
	    click(payeeAddSpinner);
	    String [] payeeAddType = loadTextView();
	    clickTextView(payeeAddType[1]);
	    waitForElement(VirTextbox);
	    sendText(VirTextbox, viradd);
	    sendText(virAmt, amt);
	    sendText(payremark, remark);
        click(submit);
	}
	
	public void PayMoneyIFSC(String accNo, String ifsc, String amt, String remark)
	{
	    try {
			waitForElement (payMoney, 30);
			click(payMoney);
		} catch (Exception e) {
			log.info(e);
		}
	    
	    try {
			waitForElement (fromAccSpinner, 30);
			click(fromAccSpinner);
			log.info("Clicked on Transfer From Account");
			String [] options = loadTextView();
		    clickTextView(options[1]);
		    log.info("Selected account : " +options[1] );
		    click(noBtn);
		} catch (Exception e) {
			log.info(e);
		} 
	    waitForElement (payeeAddSpinner, 30);
	    click(payeeAddSpinner);
	    String [] payeeAddType = loadTextView();
	    clickTextView(payeeAddType[2]);
	    waitForElement(VirTextbox);
	    sendText(VirTextbox, accNo);
	    sendText(ifscfield, ifsc);
	    sendText(virAmt, amt);
	    sendText(payremark, remark);
        click(submit);
	}
	
	public void PayMoneyAad(String aadNo, String amt, String remark)
	{
	    try {
			waitForElement (payMoney, 30);
			click(payMoney);
		} catch (Exception e) {
			log.info(e);
		}
	    
	    try {
			waitForElement (fromAccSpinner, 30);
			click(fromAccSpinner);
			log.info("Clicked on Transfer From Account");
			String [] options = loadTextView();
		    clickTextView(options[1]);
		    log.info("Selected account : " +options[1] );
		    click(noBtn);
		} catch (Exception e) {
			log.info(e);
		} 
	    waitForElement (payeeAddSpinner, 30);
	    click(payeeAddSpinner);
	    String [] payeeAddType = loadTextView();
	    clickTextView(payeeAddType[2]);
	    waitForElement(VirTextbox);
	    sendText(VirTextbox, aadNo);
	    sendText(virAmt, amt);
	    sendText(payremark, remark);
        click(submit);
	}
	
	public void CollectMoney(String vpa, String amt, String date, String hour, String minute, String meridian, String remark)
	{
		waitForElement(collectMoney, 30);
		click(collectMoney);
		waitForElement(fromAccSpinner, 30);
		click(fromAccSpinner);
/*		String [] options = loadTextView();
	    clickTextView(options[1]);*/
		clickRelativeLayout("1");
	    waitForElement(fromAccVPA, 30);
	    click(fromAccVPA);
/*	    sleep(5000);
		String [] vpalist = loadTextView();
	    clickTextView(vpalist[1]);*/
	    clickRelativeLayout("1");
	    waitForElement(VirTextbox, 30);
	    sendText(VirTextbox, vpa);
	    	back();
	    sendText(virAmt, amt);
	    	back();
	    //sendText(expDate, "10-05-2018");
	    click(expDate);
	    clickView(date);
        clickBtn("OK");
        click(expTime);
        pickDate(hour);
        pickDate(minute);
        clickRadioBtn(meridian);
        clickBtn("OK");
	    sendText(payremark, remark);
        click(submit);
	}

    public void changePin(String oldpin, String newpin, String repin)
    {
        waitForElement(changepin, 30);	
        click(changepin);
    	waitForElement(pinacc);
    	click(pinacc);
    	
		 try {
				waitForElement (NFormTitle, 30);
			} catch (Exception e) {
				log.info(e);
			}
		 
		 Dimension windowSize = driver.manage().window().getSize();

		     NPCIEnterText(oldpin);
		     Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
			 NPCIEnterText(newpin);
			 Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);
			 NPCIEnterText(repin);
			 Tap(windowSize.getWidth()-100, windowSize.getHeight()-100);	
    }
}























