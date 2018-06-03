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
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;

public class Test2 extends RunTest{

	private static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	@Test(priority=0)
	public void beginTest()
	{
		log.info("Test Started");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.EditText']")));
		log.info("Elm Found");
		MobileElement elm =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		log.info(elm.isDisplayed());
		log.info(elm.isEnabled());


		MobileElement elmw=driver.findElement(By.id("com.fss.vijayapsp:id/button_submi"));
		log.info(elmw.isDisplayed());
		log.info(elmw.isEnabled());
		log.info("Test Completed");
	}
}
