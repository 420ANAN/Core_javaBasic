package Core_java_Basic_code_example;

public class Iterationlessfor {
public static void main(String[] args) {
	int i;
	boolean done = false;
	
	i =0;
	for( ;!done ; ) {
		System.out.println("i is "+i);
		if(i ==10) done = true ;
		i++;
	}
}
}
