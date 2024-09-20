package Core_java_Basic_code_example;

import java.util.Scanner;

public class whileLoopDemo {
	public static void main(String[] args) {
		int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value : ");
        int n = input.nextInt();
        
		n1 = 0;
		n2 = 1;
		System.out.print(n1 + " " + n2);
		int c =2 ;
		while(n > c) {
			n3 = n1 + n2 ;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			
			c++;
			
		}
	}

}
