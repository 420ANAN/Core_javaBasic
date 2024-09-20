package Core_java_Basic_code_example;

public class SearchingusingforeachDemo {
	public static void main(String[] args) {
		int nums[] = {6 , 8 , 3, 5, 4 , 2 ,7};
		int value = 8;
		boolean found = false ;
		
		for(int x : nums) {
			if(x == value) {
			found = true;
			break;
			}
		}
		
		if(found)
			System.out.println("Value found at ");
	}

}
