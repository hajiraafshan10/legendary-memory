package ClassicSelenium;

import java.time.LocalDateTime;

public class LearningDateNTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime systemdate=LocalDateTime.now();
		String date=systemdate.toString().replaceAll(":", "-");
		System.out.println(date);

	}

}





