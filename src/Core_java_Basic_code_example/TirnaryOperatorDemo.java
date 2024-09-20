package Core_java_Basic_code_example;

public class TirnaryOperatorDemo {
	public static void main(String[] args) {
		int i , k, p, r;
        
		p=30;
		r=90;
		i=100;
		
		//expresion1:expression2
		k = i > 0 ? p*r : p+r;
		System.out.println(k);
		System.out.println();
		
		k = p < r ? r*i : r+i;
		System.out.println(k);
	}

}
  