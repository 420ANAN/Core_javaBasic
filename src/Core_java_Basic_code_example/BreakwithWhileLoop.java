package Core_java_Basic_code_example;

public class BreakwithWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		while(100 > i ) {
			System.out.println("i is : "+ i);
			if(i == 40)
				break;
			i++;
			
			
		}
		System.out.println("Loop is completed.");
	}

}
