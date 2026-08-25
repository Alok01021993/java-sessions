package sdetprograms;

public class AlphaLetter {

	public static void main(String[] args) {
		String s="a2b2c5d2";
		char c[]=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i< c.length;i++)
		{
			if(Character.isLetter(c[i]))
			{
				char Letter=c[i];
				int num=Character.getNumericValue(c[i+1]);
				for(int j=0;j<num;j++)
				{
					sb.append(Letter);
				}
			}
		}
		System.out.println("output:"+sb);
		
	}

}
