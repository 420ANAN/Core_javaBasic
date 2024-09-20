package Core_java_Basic_code_example;

public class IfThenElseDemo {
	public static void main(String[] args) {
		
		int i, a,b ,c,d  ;
		
		i =10;
		a  = 10;
		b = 20;
		c = 30;
		d = 40;
		
		
		if( i == 10) {
			if(a > 20) {
				System.out.println(a*b);
			}
			if(c >= 30) {
				System.out.println(a/b);
			}
		}
		else {
			System.out.println(c+d);
		}
	}

}
