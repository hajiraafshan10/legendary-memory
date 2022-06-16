package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleReadClss {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		Object[][] data=MultipleReadClss.readAllValues("Login");
		for (int i = 0; i < 5-1; i++) {
			for (int j = 0; j <5; j++) {
				System.out.println(data[i][j]);
				
			}
			
		}
	}
		public static Object[][] readAllValues(String SheetName) throws EncryptedDocumentException, IOException{
		File file=new File("./TestData/TestData3.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(SheetName);
		
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		int colCount=sheet.getRow(1).getPhysicalNumberOfCells();
		
		
		Object[][] data=new Object[rowCount-1][colCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
		}
	}
				
				
			
