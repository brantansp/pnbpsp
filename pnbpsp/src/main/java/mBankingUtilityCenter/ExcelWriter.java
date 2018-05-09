package mBankingUtilityCenter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelWriter {  
	 
    public static void main(String[] args) throws Exception{
    	writeTestCaseID(1, "testCaseID001");
    }
    
    public static void writeTestCaseID(int row, String testCaseID) throws Exception
    {
        String path = System.getProperty("user.dir")+"\\output\\testcases\\Mpay_4.0_Automation_Test_Cases.xls";
        FileInputStream fsIP= new FileInputStream(new File(path));
        HSSFWorkbook wb = new HSSFWorkbook(fsIP); 
        HSSFSheet worksheet = wb.getSheetAt(2); 
        Cell cell = null; 
        cell = worksheet.getRow(row+8).getCell(1);  
        cell.setCellValue(testCaseID); 
        fsIP.close(); 
        FileOutputStream output_file =new FileOutputStream(new File(path));
        wb.write(output_file); 
        output_file.close();
        wb.close();
    }
    
    public static void writeTestCaseDesc(int row, String testCaseDesc) throws Exception
    {
        String path = System.getProperty("user.dir")+"\\output\\testcases\\Mpay_4.0_Automation_Test_Cases.xls";
        FileInputStream fsIP= new FileInputStream(new File(path));
        HSSFWorkbook wb = new HSSFWorkbook(fsIP); 
        HSSFSheet worksheet = wb.getSheetAt(2); 
        Cell cell = null; 
        cell = worksheet.getRow(row+8).getCell(3);  
        cell.setCellValue(testCaseDesc); 
        fsIP.close(); 
        FileOutputStream output_file =new FileOutputStream(new File(path));
        wb.write(output_file); 
        output_file.close();
        wb.close();
    }
    
    public static void writeTestResult(int row, int result) throws Exception
    {
    	String testResult = "";
        String path = System.getProperty("user.dir")+"\\output\\testcases\\Mpay_4.0_Automation_Test_Cases.xls";
        FileInputStream fsIP= new FileInputStream(new File(path));
        HSSFWorkbook wb = new HSSFWorkbook(fsIP); 
        HSSFSheet worksheet = wb.getSheetAt(2); 
        Cell cell = null; 
        cell = worksheet.getRow(row+7).getCell(4);  
        switch (Integer.valueOf(result))
        {
        case 1:
        	testResult = "PASS";
        	break;
        case 2:
        	testResult = "FAIL";
        	break;
        default :
        	testResult = "Not executed";
        }
        
        cell.setCellValue(testResult); 
        fsIP.close(); 
        FileOutputStream output_file =new FileOutputStream(new File(path));
        wb.write(output_file); 
        output_file.close();
        wb.close();
    }
}
