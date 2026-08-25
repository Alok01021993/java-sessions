package sdetprograms;

public class ReplaceCharByChar {
	public static void main(String[]args) {
		String str="amit kumar singh";
		char c[]=str.toCharArray();
		String result="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a')
			{
				result =result+'k';
			}else
			{
				result=result+c[i];
			}
		}
		System.out.println(result);
		
	}

}
