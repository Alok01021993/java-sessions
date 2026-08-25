package sdetprograms;

public class ShortForm {

	public static void main(String[] args) {
		String str="Yashashwi alok singh";
		String words[]=str.split("");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<words.length;i++)
		{
			if(i<words.length-1)
			{
				sb.append(words[i].charAt(0)).append("");
			}else
			{
				sb.append(words[i]);
			}
		}
		System.out.println(sb.toString());
	}

}
