package sdetprograms;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str[]= {"Java","Python","Java"};
		LinkedHashSet<String> Set=new LinkedHashSet<>();
		for(String s:str)
		{
			Set.add(s);
		}
		System.out.println("Remove Duplicate:"+Set);
		

	}

}
