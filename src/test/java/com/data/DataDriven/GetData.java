package com.data.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetData {


	@Test
	void getParticularData() throws InvalidFormatException, IOException  {

		File fs = new File("./Datadriven/DataDrivenNew.xlsx");
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sheet = wb.getSheetAt(0);
		for (int i = 1; i <=2; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < 2; j++) {
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} 
		}

	}
	
	
}
