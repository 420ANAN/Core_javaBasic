package Core_java_Basic_code_example;

public class IfElseIfDemo {
	public static void main(String[] args) {

		int month = 5 ;

		String season;

		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		if (month == 3 || month == 4 || month == 5)
			season = "Spring";
		if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		if (month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = " Bogus Month";

		System.out.println(season);

	}

}
