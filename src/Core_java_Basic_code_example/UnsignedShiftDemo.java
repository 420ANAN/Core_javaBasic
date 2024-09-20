package Core_java_Basic_code_example;

public class UnsignedShiftDemo {
	public static void main(String[] args) {
		int value = 0x04030201;
		
		int a =  (value >> 24 );
		int b = (value >> 16);
		int c = (value >> 8);
		int d = value;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
