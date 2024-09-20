package Core_java_Basic_code_example;

public class ForEachDemo {
	public static void main(String[] args) {
		int nums[] = { 1, 2,3,4,5,6,7,8,9,10 };
		int sum = 0;
		//use for-each style to display and sum the values
		for(int x : nums) {
			System.out.println("Value is: "+ x);
			sum += x;
			if(x == 5)
				break;
		}
		System.out.println("Summation: "+ sum);
		
	}

}
