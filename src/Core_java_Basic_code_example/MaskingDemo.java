package Core_java_Basic_code_example;

public class MaskingDemo {
public static void main(String[] args) {
	char hex[] = {
		'0' , '1' , '2' , '3' ,'4' , '5' ,'6','7','8' , '9' , 'a','b','c','d','e','f'	
	};
	
	byte b = (byte) 0xf1;
	
	System.out.println("b = 0x"+ hex[(b >> 4) & 0X0f] + hex[b & 0X0f]);
}
}
