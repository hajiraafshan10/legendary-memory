package Advance_Selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	
		@Test(dataProvider="Testdata")
		public void demo(String a, String b){
			System.out.println(a+" "+b);
			
			
		}
		//MethodMatcherException
		@DataProvider(name="Testdata")
		public Object[][] demo1(){
			Object[][] data=new Object[2][2];
			data[0][0]="abcd";
			data[0][1]="bcfs";
			data[1][1]="jdfk";
			
			
			return data;
			
		}
		

	}
