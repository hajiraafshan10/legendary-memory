package Advance_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {

	
		public static String read(String Key) throws IOException{
			FileInputStream fis=new FileInputStream("./TestData/Config.properties");
			Properties property=new Properties();
			property.load(fis);
			return property.getProperty(Key);
			

		}

	}

