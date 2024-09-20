package Core_java_Basic_code_example;

public class LevelinLoop4Demo {
	public static void main(String[] args) {
		outer: for(int i = 0 ; i < 3 ; i++) {
			System.out.println("Pass "+i+ ":");
			for(int j = 0 ; j< 100 ; j++) {
				if(j ==10)break outer;
				System.out.println(j + " ");
			}
			System.out.println("This will not print");
		}
		System.out.println(" Loops complete");
	}

}
