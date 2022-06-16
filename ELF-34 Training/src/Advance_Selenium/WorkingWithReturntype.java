package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Date1904Support;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithReturntype {
	
	public static String readsheet(String SheetName,int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
File f1=new File("./TestData/Testdata.xlsx");
		FileInputStream f2=new FileInputStream(f1);
		Workbook w=WorkbookFactory.create(f2);
		Sheet s=w.getSheet(SheetName);
		return s.getRow(RowNum).getCell(ColNum).getStringCellValue();
		
	}
	public static double readsheet1(String SheetName,int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
		File f1=new File("./TestData/Testdata.xlsx");
				FileInputStream f2=new FileInputStream(f1);
				Workbook w=WorkbookFactory.create(f2);
				Sheet s=w.getSheet(SheetName);
				return s.getRow(RowNum).getCell(ColNum).getNumericCellValue();
	}
	public static java.util.Date readsheet2(String SheetName,int RowNum,int ColNum) throws EncryptedDocumentException, IOException{
		File f1=new File("./TestData/Testdata.xlsx");
				FileInputStream f2=new FileInputStream(f1);
				Workbook w=WorkbookFactory.create(f2);
				Sheet s=w.getSheet(SheetName);
				return s.getRow(RowNum).getCell(ColNum).getDateCellValue();
				
				
	}
				
	

	public static void main(String[] args) {
	

	}

}
