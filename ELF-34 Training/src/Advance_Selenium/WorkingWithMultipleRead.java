
package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithMultipleRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
File f1=new File("./TestData/Testdata.xlsx");//create file in that path 
		
		//perform action on the file by passing ref variable i.e path/location which the ref variable holds
		FileInputStream f2=new FileInputStream(f1);
		
		//Control will be in work book
		Workbook w=WorkbookFactory.create(f2);
		
		//control will be in sheet
		Sheet s=w.getSheet("Sheet1");
		
		
		int rowCount=s.getPhysicalNumberOfRows();
		int colCount=s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowCount][colCount];
		for(int i=0;i<rowCount;i++) {
			for(int j=0;i<colCount;j++) {
				data[i][j]=s.getRow(i).getCell(j).toString();
			}
		
		}
		for(int i=0;i<rowCount;i++) {
			for(int j=0;i<colCount;j++) {
				System.out.println(data[i][j]);
		
	}

}
	}
}
