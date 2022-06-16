package Advance_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Registration_clss_demo {

	public static Object[][] readValues(String string) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
File f1=new File("./TestData/Testdata.xlsx");//create file in that path 
		
		//perform action on the file by passing ref variable i.e path/location which the ref variable holds
		FileInputStream f2=new FileInputStream(f1);
		
		//Control will be in work book
		Workbook w=WorkbookFactory.create(f2);
		
		//control will be in sheet
		Sheet s=w.getSheet("Sheet3");
		
		
		int rowCount=s.getPhysicalNumberOfRows();
		int colCount=s.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;i<colCount;j++) {
				data[i-1][j]=s.getRow(i).getCell(j).toString();
			}
		
		}
		return data;
	}
}
