package Core_java_Basic_code_example;

import java.util.Scanner;

public class ForLoopDemoTableprinting {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to get table : ");
		int n = input.nextInt();
		
		for(int i = 1 ; i<= 10 ; i++) {
			for(int j = 1 ; j<= n ; j++) {
		
			System.out.print(i*j+"     ");
			
			
			}
			System.out.println();
			
		}
		
	}
	

}
