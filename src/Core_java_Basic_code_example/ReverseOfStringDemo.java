package Core_java_Basic_code_example;

public class ReverseOfStringDemo {
	public static void main(String[] args) {
		String string = "My name is Anand Kumar";
		
		//strore the reverse of given string 
		
		String reversedStr = "";
		
		//Iterate through the from last and add each character to variable
		
		for(int i= string.length()-1 ; i>=0 ; i--) {
			reversedStr = reversedStr + string.charAt(i);// this function help to return the value at specified index in string 
			
		}
		
		System.out.println("Original string: "+ string);
		//Display the reverse of given string 
		System.out.println("Reverse of given string:"+ reversedStr);
	}

}
