package sdetprograms;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		HashMap<Character,Integer> freqMap=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char currentChar=str.charAt(i);
			if(currentChar==' ') {
				continue;
			}
			if(freqMap.containsKey(currentChar)) {
				freqMap.put(currentChar,freqMap.get(currentChar)+1);
				
			}else
			{
				freqMap.put(currentChar,1);
			}
			
		}
		System.out.println("\n Character Frequencies in:\""+str+"\"");
		System.out.println("------------");
		for(Map.Entry<Character,Integer>entry:freqMap.entrySet()) {
			System.out.println(""+entry.getKey()+"'->"+entry.getValue());
			
		}
		sc.close();
			
		
		
	}

}
