package com.itLearn.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.itLearn.pages.BaseTest;
import com.itLearn.pages.LoginPage;
import com.itLearn.pages.SearchPage;
import com.itLearn.utility.ReadExcelFile;

public class SearchTestCase extends BaseTest {
	
	String fileName=System.getProperty("user.dir")+ "\\TestData\\Book1.xlsx";
	@Test
	void searchCourseTest () {
		LoginPage lp= new LoginPage(driver);
		String username=ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 0);
		String password=ReadExcelFile.getCellValue(fileName, "Sheet1", 1, 1);
		System.out.println(password);
		lp.loginPortal(username, password);
		
		SearchPage sp= new SearchPage(driver);
		String serachCourse=ReadExcelFile.getCellValue(fileName, "SearchCourse", 0, 0);
		sp.searchCourse(serachCourse);
		
	}

}
