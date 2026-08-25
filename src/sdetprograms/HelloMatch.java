package sdetprograms;

import java.util.Scanner;

public class HelloMatch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		String org_str="hello";
		boolean isMatch=org_str.equals(str);
		System.out.println((isMatch));
		
		sc.close();

	}

}
