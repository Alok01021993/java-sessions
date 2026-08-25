package sdetprograms;

import java.util.Scanner;

public class CharacterFrequencyEachCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("\n Character Frequencies in:\""+str+"\"");
		System.out.println("-----------------");
		for(int i=0;i<str.length();i++)
		{
			char currentChar=str.charAt(i);
			if (currentChar== ' ') {
				continue;
			}
			boolean alreadyCounted=false;
			for(int j=0;j<i;j++)
			{
				if(str.charAt(j)==currentChar) {
					alreadyCounted=true;
					break;
				}
			}
			if(!alreadyCounted) {
				int count=0;
				for(int k=0;k<str.length();k++) {
					if(str.charAt(k)==currentChar){
						count++;
					}
				}
				System.out.println(""+currentChar+"'->"+count);
			}
		}
		sc.close();
		

	}

}
