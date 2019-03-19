package com.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GeneralFunc extends BaseTest {

	public GeneralFunc() throws IOException {

		super();
	}

	public <Workbook> String getExcelValues( String sheetName, String columnName, int rowNumber)
			throws IOException {
   /* public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
        //Create an object of File class to open xlsx file
        File file =    new File(filePath+"\\"+fileName);*/

		int colNum = 0;
		HSSFWorkbook WB = null;
		File file = new File(".//testData//MyTestData.xlsx");
		FileInputStream fis = new FileInputStream(file);

		WB = new HSSFWorkbook(fis);

		XSSFSheet mysheet = WB.getSheet(sheetName);
		XSSFRow myrow = mysheet.getRow(0);
		for (int i = 0; i < myrow.getLastCellNum(); i++) {
			String colValue = myrow.getCell(i).getStringCellValue();
			if (colValue.equalsIgnoreCase(columnName)) {
				colNum = i;
			}
		}
		String rowValue = String.valueOf(mysheet.getRow(rowNumber).getCell(colNum));

		return rowValue;
	}

}
