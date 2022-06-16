package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenTesting {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File f1=new File("./TestData/Testdata.xlsx");//create file in that path 
		
		//perform action on the file by passing ref variable i.e path/location which the ref variable holds
		FileInputStream f2=new FileInputStream(f1);
		
		//Control will be in work book
		Workbook w=WorkbookFactory.create(f2);
		
		//control will be in sheet
		Sheet s=w.getSheet("Sheet1");
		//control will b on row n cell
		System.out.println(s.getRow(2).getCell(2).getNumericCellValue());
		System.out.println(s.getRow(2).getCell(1).toString());

	}

}
