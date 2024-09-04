package com.itLearn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.LoginPage;
import com.itLearn.utility.ReadExcelFile;

public class LoginTestDrivenData extends BaseTest {
	String fileName=System.getProperty("user.dir")+ "/TestData/Book1.xlsx";
	
	@Test(priority=1,dataProvider="LoginDataProvider")
	void verifyLogin(String uname,String pwd) throws IOException
	{
		LoginPage lp=new LoginPage(driver);
//		String username="Demo12";
//		String password="Test123456$";
		
		lp.loginPortal(uname, pwd);
//		lp.logoutPortal();
		
		if(uname.equals("Demo12") && pwd.equals("Test123456$"))
		{
			System.out.println("Test Passed");
			Assert.assertTrue(true);
			lp.logoutPortal();
		}
		else
		{
			captureScreenShot(driver,"verifyLogin");
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider(name="LoginDataProvider")
	public String[][] LoginDataProvider(){
		int row=ReadExcelFile.getRowCount(fileName, "Sheet1");
		int col=ReadExcelFile.getColumnCount(fileName, "Sheet1");
		
		String data[][]=new String[row-1][col];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<col;j++) {
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "Sheet1", i, j);
			}
		}
		return data;}
}
