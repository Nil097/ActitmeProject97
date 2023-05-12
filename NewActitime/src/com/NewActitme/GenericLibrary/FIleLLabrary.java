package com.NewActitme.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FIleLLabrary {

	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String value =  p.getProperty(key);
		return value;
	}
	
	public String readDataFromeExcelSheet(String key,int r1,int c1) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testdata/Testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(key).getRow(r1).getCell(c1).getStringCellValue();
		return value;
	}
}
