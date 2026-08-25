package sdetprograms;

public class AlphaNum {
	public static void main(String[]args) {
		String str="aabbcccdd";
		StringBuilder sb=new StringBuilder();
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				count++;
			}
			else
			{
				sb.append(str.charAt(i)).append(count);//append char and count
				count=1;//reset for next char
			}
		}//append last character and it's count
		sb.append(str.charAt(str.length()-1)).append(count);
		System.out.println("output:"+sb.toString());
	}

}
