package sdetprograms;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        // Take input from user
		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        String reversed = "";

		        // Reverse the string using a for loop
		        for (int i = str.length() - 1; i >= 0; i--) {
		            reversed += str.charAt(i);
		        }

		        // Check if the string is a palindrome
		        if (str.equalsIgnoreCase(reversed)) {
		            System.out.println("The string is a palindrome.");
		        } else {
		            System.out.println("The string is not a palindrome.");
		        }

		        sc.close();
		    }
		
	}


