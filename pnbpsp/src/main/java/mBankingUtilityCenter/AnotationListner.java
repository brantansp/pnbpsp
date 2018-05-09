package mBankingUtilityCenter;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class AnotationListner implements IAnnotationTransformer {

	public List<String> testsEnabled = new ArrayList();
	public static Log log = LogFactory.getLog(MethodHandles.lookup().lookupClass().getSimpleName());
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
   		//System.out.println("Transformer running for " + testMethod.getName());
		testsEnabled=ExcelReader.getEnabledTests("Data","Test_Cases_Flag");
		if(testsEnabled.contains(testMethod.getName()))
			{
				annotation.setEnabled(false);
			}			
		}
}
