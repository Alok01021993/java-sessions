package sdetprograms;
import java.util.Scanner;

public class ReverseString {

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

		        // Display the reversed string
		        System.out.println("Reversed string: " + reversed);

		        sc.close();
		    }
		

	}


