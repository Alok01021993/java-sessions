package sdetprograms;

public class RemoveSpacesWithoutUsingStringMethod {
	public static void main(String[] args) {
		String str="Mu name is Yashashwi Alok";
		StringBuilder sb=new StringBuilder();
		char c[]=str.toCharArray();
		for(char ch:c)
		{
			if(ch!=' ')
				sb.append(ch);
		}
		System.out.println("Remove spaces:"+sb.toString());
	}

}
