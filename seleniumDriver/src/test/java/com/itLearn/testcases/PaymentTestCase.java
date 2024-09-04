package com.itLearn.testcases;

import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.DashboardPage;
import com.itLearn.pages.LoginPage;
import com.itLearn.pages.PaymentPage;
import com.itLearn.utility.ReadExcelFile;

public class PaymentTestCase extends BaseTest{
	
String fileName=System.getProperty("user.dir")+"\\TestData\\Book1.xlsx";
	
	@Test(priority =1)
	void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 1);
		lp.loginPortal(username, password);
		
		DashboardPage dp = new DashboardPage(driver);
		
		dp.dashboardclick();
		
		PaymentPage pg= new PaymentPage(driver);
		String crdnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 0);
		String expdate=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 1);
		String cvcnum=ReadExcelFile.getCellValue(fileName, "CardDetails", 0, 2);
		
		pg.paymentOption(crdnum, expdate, cvcnum);
		
	}

}