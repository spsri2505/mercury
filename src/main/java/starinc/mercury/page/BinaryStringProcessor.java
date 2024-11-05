package starinc.mercury.page;

import java.util.Scanner;

public class BinaryStringProcessor {
	
	public static String bitwiseOrBinaryStrings(String[] binaryStrings) {
		
		String binaryStr1 = binaryStrings[0];
		String binaryStr2 = binaryStrings[1];
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < binaryStr1.length(); i++) {
			char bit1 = binaryStr1.charAt(i);
	        char bit2 = binaryStr2.charAt(i);
	        
	        if (bit1 == '1' || bit2 == '1') {
	        	result.append('1');
	        } else {
	        	result.append('0');
	        }
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] binaryStrings = new String[2];
		
		for (int i = 0; i < 2; i++) {
			binaryStrings[i] = scanner.nextLine().trim();
		}
		

	            // Call the function and print the result
	            String result = bitwiseOrBinaryStrings(binaryStrings);
	            System.out.println("Result after bitwise OR: " + result);
	      
	            scanner.close();
	        }
	    
	}



