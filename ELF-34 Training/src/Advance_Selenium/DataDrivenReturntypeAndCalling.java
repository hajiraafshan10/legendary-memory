package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenReturntypeAndCalling {
	
	public static String demo(String sh,int row,int cell) throws EncryptedDocumentException, IOException{
		File f1=new File("./TestData/Testdata.xlsx");
		FileInputStream f2=new FileInputStream(f1);
		Workbook w=WorkbookFactory.create(f2);
		Sheet s=w.getSheet(sh);
		return s.getRow(row).getCell(cell).toString();
	}
	public static String demo(int row,String sh,int cell) throws EncryptedDocumentException, IOException{
		File f1=new File("./TestData/Testdata.xlsx");
		FileInputStream f2=new FileInputStream(f1);
		Workbook w=WorkbookFactory.create(f2);
		Sheet s=w.getSheet(sh);
		return s.getRow(row).getCell(cell).toString();
	}
	public static String demo(int cell,int row,String sh) throws EncryptedDocumentException, IOException{
		File f1=new File("./TestData/Testdata.xlsx");
		
		
		FileInputStream f2=new FileInputStream(f1);
		Workbook w=WorkbookFactory.create(f2);
		Sheet s=w.getSheet(sh);
		return s.getRow(row).getCell(cell).toString();
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String s1=demo("sheet1",1,2);
		System.out.println(s1);
		String s2=demo("sheet1",1,2);
		System.out.println(s2);
		
		String s3=demo("sheet1",1,2);
		System.out.println(s3);

	}

}
