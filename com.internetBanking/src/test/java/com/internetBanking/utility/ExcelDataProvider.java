package com.internetBanking.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workbook;

	public ExcelDataProvider(String filename) {
		try {
			File fs = new File("./TestData/" + filename + ".xlsx");
			FileInputStream fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);

		} catch (Exception e) {
			System.out.println("File not found in specified working directory " + e);
		}
	}

	public int rowcount(String sheetname) {
		return workbook.getSheet(sheetname).getLastRowNum();
	}

	public int columncount(String sheetname, int row) {
		return workbook.getSheet(sheetname).getRow(row).getLastCellNum();
	}

	public int rowcount(int index) {
		return workbook.getSheetAt(index).getLastRowNum();
	}

	public int columncount(int index, int row) {
		return workbook.getSheetAt(index).getRow(row).getLastCellNum();
	}

	public String getStringCellData(String sheetname, int row, int col) {
		return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public String getStringCellData(int index, int row, int col) {
		return workbook.getSheetAt(index).getRow(row).getCell(col).getStringCellValue();
	}

	public int getNumericCellData(String sheetname, int row, int col) {
		return (int) workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}

	public int getNumericCellData(int index, int row, int col) {
		return (int) workbook.getSheetAt(index).getRow(row).getCell(col).getNumericCellValue();
	}
	
	public String[][] getExcelsheetData() 
	{
		int rows = rowcount("newCustomer"); //newCustomer
		int cols = columncount("newCustomer",0);
		
		String [][] data= new String [rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i][j]=workbook.getSheet("newCustomer").getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	public static void main(String[] args) {
		
	  ExcelDataProvider excelDataProvider = new ExcelDataProvider("TestData");
//	  System.out.println(excelDataProvider.rowcount(0));  // rowcount= Totalrows-1
//	  System.out.println(excelDataProvider.columncount("Login", 0));
//	  
//	  System.out.println(excelDataProvider.getStringCellData(0, 1, 0));
//	  System.out.println(excelDataProvider.getStringCellData(0, 1, 1));
//	  System.out.println(excelDataProvider.getStringCellData(0, 1, 2));
//		
//	  System.out.println(excelDataProvider.getStringCellData("Login", 1, 0));
//	  System.out.println(excelDataProvider.getStringCellData("Login", 1, 1));
//	  System.out.println(excelDataProvider.getStringCellData("Login", 1, 2));
//	  
//	  System.out.println(excelDataProvider.getStringCellData("Login", 0, 0));
//	  System.out.println(excelDataProvider.getStringCellData("Login", 0, 1));
//	  System.out.println(excelDataProvider.getStringCellData("Login", 0, 2));
	  
	  excelDataProvider.getExcelsheetData();
	 }

	public void SetStringCelldata(String string, int row, String customerID) {
		// TODO Auto-generated method stub
		
	}

}
