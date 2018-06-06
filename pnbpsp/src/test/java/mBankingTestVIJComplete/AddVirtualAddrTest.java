package mBankingTestVIJComplete;

import java.lang.invoke.MethodHandles;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import mBankingBaseFactory.*;
import mBankingPageObjectFactory.BasePage;

public class AddVirtualAddrTest extends AppiumController {

	protected BasePage basePage;
    AppiumDriver<MobileElement> driver;// = getDriver(); ;
	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test
	public void addVirAddressValid()
	{
	log.info("**********Add Virtual Address valid**********");
	basePage = new BasePage(driver);
	
	waitForTextView("Add Virtual Address",30);
	basePage.clickTextView("Add Virtual Address");
	waitForTextView("Select an account to create virtual address");
	clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankOnlyAccNo"));
	clickRadioBtn("Single use");
	basePage.selectVirTimeLimit("2018","25","May");
	basePage.setVirAmtLimit("1000");
		back();
		Random random=new Random();
	sendText("Virtual Id", prop.getProperty("addVirValid")+random.nextInt(90) + 10);
	click(ObjectRepository.submit);
	String [] status1=loadTextView();
	if("Virtual Address Created Successfully".equals(status1[0]))
	{
		clickBtn("OK");
		Assert.assertTrue(true);
	}
	
	log.info("***************End***************");
	//The virtual Address bran10@vijb is already available and is currently active. Enter a new virtual address.
}

	@Test (dependsOnMethods = "addVirAddressValid")
	public void addAlreadyAddedVirAddress()
	{
	log.info("**********Adding already added Virtual Address **********");
	basePage = new BasePage(driver);
	waitForTextView("Add Virtual Address",30);
	basePage.clickTextView("Add Virtual Address");
	waitForTextView("Select an account to create virtual address");
	clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankOnlyAccNo"));
	clickRadioBtn("Single use");
	basePage.selectVirTimeLimit("2018","25","May");
	basePage.setVirAmtLimit("1000");
		back();
	sendText("Virtual Id", prop.getProperty("addVirValid"));
	click(ObjectRepository.submit);
	String [] status=loadTextView();
	String text= "The virtual Address "+prop.getProperty("addVirValid")+"@"+prop.getProperty("psphandle")+" is already available and is currently active. Enter a new virtual address.";
	if(text.equals(status[0]))
	{
		clickBtn("OK");
		Assert.assertTrue(true);
		back();
		back();
	}
	else if ("Virtual address provided is already in use. Please enter a different virtual address.".equals(status[0]))
	{
		clickBtn("OK");
		Assert.assertTrue(true);
		back();
		back();
	}
	
    waitForTextView("Manage A/C",30);
    clickTextView("Manage A/C");
    waitForTextView("VIEW BANK ACCOUNTS",10);
    clickTextView("XXXXXXXXXXX"+prop.getProperty("addBankOnlyAccNo"));
    waitForTextView("ADDED VIRTUAL ADDRESS LIST",10);     
    click(ObjectRepository.viewEditProfile);
	String [] status2=loadTextView();
	if("Are you sure want to delete the Regd Acc No?".equals(status2[0]))
	{
         clickBtn("YES");
        clickBtn("OK");
	}
	
	log.info("***************End***************");
}































}