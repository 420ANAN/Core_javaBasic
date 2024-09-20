package Core_java_Basic_code_example;

public class Revesion {
	public static void main(String[] args) {

		int arr[] = {0,1,2,3,4,5,6,7,8,9,10};
		int sum = 8;
		
		getPairsCount(arr ,sum);
		
		
	}

	private static void getPairsCount(int[] arr, int sum) {
		int count = 0;//intialization of variable count
		
		for(int i = 0 ; i<arr.length ; i++)
			for(int j = i+1 ; j<arr.length ; j++)
				if((arr[i] + arr[j]) == sum)
					count++;
		System.out.println("Count of pair is: "+ count);
		
	}

	
	
	

}
