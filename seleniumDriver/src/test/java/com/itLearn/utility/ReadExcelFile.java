package com.itLearn.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static FileInputStream inputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet excelSheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static String getCellValue(String fileName, String sheetName, int rowNo, int cellNo) {
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			cell = excelSheet.getRow(rowNo).getCell(cellNo);

			workbook.close();
			return cell.getStringCellValue();
		}

		catch (IOException e) {
			return "";
		}
	}

	public static int getRowCount(String fileName, String sheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			int row=excelSheet.getLastRowNum()+1;
			return row;

		} catch (IOException e) {
			return 0;
		}

	}
	
	public static int getColumnCount(String fileName,String sheetName) {
		try {
			inputStream = new FileInputStream(fileName);
			workbook = new XSSFWorkbook(inputStream);
			excelSheet = workbook.getSheet(sheetName);
			int col=excelSheet.getRow(0).getLastCellNum();
			workbook.close();
			return col;
			
		} catch (IOException e) {
			
		}
		return 0;
		
	}
	
	
}
