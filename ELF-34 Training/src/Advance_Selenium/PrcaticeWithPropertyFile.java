package Advance_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PrcaticeWithPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./TestData/Config.properties");
		Properties property=new Properties();
		property.load(fis);
		System.out.println(property.getProperty("URL"));

	}

}
