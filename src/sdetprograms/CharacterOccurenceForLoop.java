package sdetprograms;

import java.util.Scanner;

public class CharacterOccurenceForLoop {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str="Java is a programming language";
		System.out.println("The original string is:"+str);
		System.out.println("Enter the character to count:");
		char targetChar = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==targetChar) {
				count++;
			}
		}
		System.out.println("The count of occurence of the character'"+targetChar+"':"+count);
		
		sc.close();

	}

}
