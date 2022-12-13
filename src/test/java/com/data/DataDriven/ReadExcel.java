package com.data.DataDriven;

import java.io.IOException;
import java.text.Format;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcel {
	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		String[][] readParticularData = ReadExcel.readParticularData();
		//String[][] data= new String[2][2];
		//		data[0][0] ="Muthu@gmail.com";
		//		data[0][1] ="Muth%123";
		//		data[1][0] = "Muthu@gmail.com";
		//		data[1][1] ="Mu#132";
		return readParticularData;
	}

	@Test(dataProvider = "getdata")
	static String[][] readParticularData() throws IOException {
		String fileLocation="./Datadriven/DataDrivenNew.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		
		XSSFSheet sheetAt = wbook.getSheetAt(0);
		int lastRowNum = sheetAt.getLastRowNum();
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		System.out.println("Include Header"+physicalNumberOfRows);
		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
		System.out.println("Last cell Valu:"+lastCellNum);
		System.out.println("Last Row Valu:"+lastRowNum);
		String [][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);

			for (int j = 0; j <lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				//				String stringCellValue = cell.getStringCellValue();
				//				System.out.println(stringCellValue);
				DataFormatter datas = new DataFormatter();
				String formatCellValue = datas.formatCellValue(cell);
				//System.out.println(formatCellValue);
				data[i-1][j]=formatCellValue;
				
			} 
		}
		wbook.close();
		return data;






















		//		XSSFSheet sheet = wbook.getSheetAt(0);
		//		int lastRowNum = sheet.getLastRowNum();
		//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		//		System.out.println("Inclusive of header"+physicalNumberOfRows);
		//		System.out.println("No of Rows"+lastRowNum);
		//		short lastCellNum = sheet.getRow(0).getLastCellNum();
		//		System.out.println("No of cell values"+lastCellNum);
		//
		//		for (int i =1; i <=lastRowNum; i++) {
		//			XSSFRow row = sheet.getRow(i);
		//			for (int j =0; j <lastCellNum; j++) {
		//				XSSFCell cell = row.getCell(j);
		//				DataFormatter dft = new DataFormatter();
		//				String Value = dft.formatCellValue(cell);
		//			//	String stringCellValue = cell.getStringCellValue();
		//				System.out.println(Value);
		//
		//			} 
		//
		//		}
		//
		//
		//
		//		wbook.close();



	}


	public static void main(String[] args) throws IOException {
		readParticularData();

	}


}
