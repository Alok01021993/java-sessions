package sdetprograms;

import java.util.LinkedHashSet;

public class DuplicateCharWord {
	
		public static void main(String[] args) {
			String str[]= {"Java","Ruby","Python","java"};
			StringBuilder sb=new StringBuilder();
			for(String s:str)
			{
				sb.append(s);
			}
			String all=sb.toString().toLowerCase();
			LinkedHashSet<Character> seen=new LinkedHashSet<>();
			LinkedHashSet<Character> duplicates=new LinkedHashSet<>();
			for(char ch:all.toCharArray())
			{
				if(!seen.add(ch))
				{
					duplicates.add(ch);
				}
				
			}
			System.out.println("Duplicates characters:"+duplicates);
			
		}

}
