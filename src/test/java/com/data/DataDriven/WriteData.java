package com.data.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WriteData {
	@Test
	private void writeParticualrData() throws Exception {
		File fs = new File("./Datadriven/DataDrivenNew.xlsx");
		FileInputStream  sis = new FileInputStream(fs);
		Workbook wbs = new XSSFWorkbook(sis);
		wbs.createSheet("studentname4").createRow(0).createCell(1).setCellValue("email");
		FileOutputStream fos = new FileOutputStream(fs);
		wbs.write(fos);
		System.out.println("success");
		wbs.close();
	}
	
}
