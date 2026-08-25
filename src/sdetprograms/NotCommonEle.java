package sdetprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NotCommonEle {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("Java","Ruby","Python","Java");
		List<String> list2=Arrays.asList("Java","Ruby");
		List<String> list3=new ArrayList<>();
		for(String s:list1)
		{
			if(!list2.contains(s)&& !list3.contains(s))
			{
				list3.add(s);			//add only if it is not present in list2
			}
		}
		System.out.println("Different elements(list3);"+list3);
		
	}

}
