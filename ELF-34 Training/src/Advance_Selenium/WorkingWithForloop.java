package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithForloop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
File f1=new File("./TestData/TestData3.xlsx");//create file in that path 
		
		
		FileInputStream f2=new FileInputStream(f1);
		
				Workbook w=WorkbookFactory.create(f2);
		
		
		Sheet s=w.getSheet("Sheet1");
		
		
		int rowCount=s.getPhysicalNumberOfRows();
		int colCount=s.getRow(0).getPhysicalNumberOfCells();
		/*System.out.println(rowCount);
		System.out.println(colCount);
		System.out.println(s.getRow(0).getCell(1).toString());
		*/
		Object [][] data = new Object[rowCount-1][colCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i-1][j]=s.getRow(i).getCell(j).toString();
				
			}
			
		}
		for (int i = 0; i < rowCount-1; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.println(data[i][j]);
				
			}
			
		}

		
		
				

	}

		}
