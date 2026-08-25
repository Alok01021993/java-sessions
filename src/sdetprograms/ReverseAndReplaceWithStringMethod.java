package sdetprograms;

public class ReverseAndReplaceWithStringMethod {

	public static void main(String[] args) {
		 	String name = "YASHASHWI ALOK";

	        System.out.println("Original name  : " + name);

	      
	        String lowerName = name.toLowerCase();
	        System.out.println("Lowercase name : " + lowerName);  // Step 1: Convert UPPERCASE to lowercase using String class method

	        
	        int length = lowerName.length();					// Step 2: Find length using String class method

	        // Step 3: Reverse the name using for loop + charAt()
	        StringBuilder reversed = new StringBuilder();
	        for (int i = length - 1; i >= 0; i--) {
	            reversed.append(lowerName.charAt(i));  // charAt() - String class method
	        }
	        System.out.println("Reversed name  : " + reversed.toString());

	        // Step 4: Replace 'a' with '@' using for loop + charAt()
	        StringBuilder replaced = new StringBuilder();
	        for (int i = 0; i < reversed.length(); i++) {
	            if (reversed.charAt(i) == 'a') {        // charAt() - String class method
	                replaced.append('@');                // replace 'a' with '@'
	            } else {
	                replaced.append(reversed.charAt(i)); // keep as it is
	            }
	        }
	        System.out.println("Replaced name  : " + replaced.toString());
	    }
	

	}


