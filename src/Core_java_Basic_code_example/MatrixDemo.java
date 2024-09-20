package Core_java_Basic_code_example;

public class MatrixDemo {
	public static void main(String[] args) {
		
		int twoD[][] = new int[4][5];
		int i,j, k=0 ; // here  i , j is declared and k is declared as well initialized
		
		for(i=0 ; i< 4 ; i++) {
			for(j = 0 ; j<5 ;j++) {
				twoD[i][j] = k;
				k++;
			}
		}
		
		
		for(i = 0 ; i<4 ; i++) {
			for(j = 0 ; i<5 ; j++) {
				System.out.print(twoD[i][j] + " ");
				System.out.println();
			}
		}

	}
}
