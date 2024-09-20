package Core_java_Basic_code_example;

public class EffectofIterationDemo {
public static void main(String[] args) {
	int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int sums = 0;
	
	for(int x : nums) {
		System.out.print(x + " ");
		x=x*10;
		
	}
	System.out.println();
	
	for(int x : nums)
		System.out.print(x + " ");
	System.out.println();
}
}
