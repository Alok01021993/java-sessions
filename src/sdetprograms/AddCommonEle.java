package sdetprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddCommonEle {
	public static void main(String[]args) {
		List<String> list1= Arrays.asList("Java","Ruby","Python","Java");
		List<String> list2= Arrays.asList("Java","Python","Java");
		List<String> list3=new ArrayList<>();
		for(String s:list1)
		{
			if(list2.contains(s)&&!list3.contains(s))
			{
				list3.add(s);        		//add only if common list not already added
			}
		}
		System.out.println("common elements list3:"+list3);
		
	}

}
