package Core_java_Basic_code_example;

import java.util.Scanner;

public class LoopprimenumberDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = input.nextInt();

		boolean isPrime;

		if (num < 2)
			isPrime = false;
		else
			isPrime = true;

		for (int i = 2; i <= num / i; i++) {
			if ((num % i) == 0)
				isPrime = false;
			break;
		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not prime");

	}

}
