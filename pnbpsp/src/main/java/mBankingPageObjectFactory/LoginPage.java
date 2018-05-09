package mBankingPageObjectFactory;


import static org.testng.Assert.assertTrue;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import mBankingBaseFactory.AppiumController;
import mBankingBaseFactory.BasePage;
import mBankingBaseFactory.Driver;
import mBankingBaseFactory.ObjectRepository;

public class LoginPage extends ObjectRepository {
	
	public static AppiumDriver <MobileElement> driver = getDriver();
	
	public static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());

	public LoginPage (AppiumDriver <MobileElement> driver) 
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
		//loginBox.setValue(pin);
		log.info("Login Pin send  : "+pin);
		click(loginBtn);
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
		try   
		  {    
			while(flag)
			{
				if(!exitDialog.isDisplayed())     
		            {      
		                back();   
		             }else{
		            	 flag = false;
		             }
		    }
		  }      
		  catch(Exception e)     
		  {       
		   /**include the else part here*/     
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
		clickView("View Balance");
	    try {
			waitForElement (viewArrow, 30);
			click(viewArrow);
		} catch (Exception e) {
			log.info(e);
		}
		
	}
}























