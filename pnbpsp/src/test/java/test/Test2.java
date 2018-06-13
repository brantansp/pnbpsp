package test;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Test2 {

	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test(priority=0)
	public void beginTest()
	{
		log.info("Test Started");
		
	}

}
