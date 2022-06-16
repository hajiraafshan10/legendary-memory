package Advance_Selenium;

import org.testng.annotations.Test;

public class PracticeOnXML_Include_Exclude {

	@Test(groups="regression")
	public void StudentName(){
		System.out.println("Divya");
		System.out.println("Afshan");
		System.out.println("Azeez");
	}
	@Test
	public void StudentID(){
		System.out.println("1034");
		System.out.println("1035");
		System.out.println("1036");
	}
	@Test(groups="regression")
	public void batch(){
		System.out.println("ELF-31");
		System.out.println("ELF-32");
		System.out.println("ELF-33");
	}
	@Test
	public void subjects(){
		System.out.println("physics");
		System.out.println("Chemistry");
		System.out.println("Mathematics");
	}

}
