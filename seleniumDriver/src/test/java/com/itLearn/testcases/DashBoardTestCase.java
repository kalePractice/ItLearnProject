package com.itLearn.testcases;


import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.DashboardPage;
import com.itLearn.pages.LoginPage;
import com.itLearn.utility.ReadExcelFile;


@Test
public class DashBoardTestCase extends BaseTest {

	String fileName=System.getProperty("user.dir")+ "\\TestData\\Book1.xlsx";
	
	
	public void testcourses()
	{
		LoginPage lp=new LoginPage(driver);
		String username= ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 0);
		String password= ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 1);
		System.out.println(username+" "+password);
		lp.loginPortal(username, password);
		
		DashboardPage db=new DashboardPage(driver);
		db.dashboardclick();
	}
	
}
