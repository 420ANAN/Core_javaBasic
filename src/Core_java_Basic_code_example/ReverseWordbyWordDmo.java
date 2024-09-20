package Core_java_Basic_code_example;

import java.util.Scanner;

public class ReverseWordbyWordDmo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string :");

		String inputString = sc.nextLine();

		String outputString = ReverseTheString(inputString);

		System.out.println("Input string:" + inputString);

		System.out.println("Output string:" + outputString);

		sc.close();
	}

	private static String ReverseTheString(String inputString) {

		String[] words = inputString.split("\\s");

		String outputString = " ";

		for (int i = words.length - 1; i >= 0; i--) {
			outputString = outputString + words[i] + ".";
		}

		return outputString;

	}

}
