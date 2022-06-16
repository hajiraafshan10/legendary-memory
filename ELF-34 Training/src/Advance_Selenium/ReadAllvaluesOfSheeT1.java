package Advance_Selenium;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadAllvaluesOfSheeT1 {

	@Test(dataProvider="Testdata")
	//data type must be in string or object type i.e dataprovider accepts only string n object
	public void demo(String Name,String Email,String Mob_no,String date,String Execution){
		System.out.println(Name);
		System.out.println(Email);
		System.out.println(Mob_no);
		System.out.println(date);
		System.out.println(Execution);

	}

@DataProvider(name="Testdata")
//method need not to b same as dataProvider
public static Object[][] dataProvider() throws EncryptedDocumentException, IOException{
	return MultipleReadClss.readAllValues("Sheet1");
}

}
